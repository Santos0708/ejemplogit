package ec.gob.digercic.revit.wsrevit;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ec.gob.digercic.revit.wsrevit.generics.ws.Devolucion;
import ec.gob.digercic.revit.wsrevit.generics.ws.MadreRenaviVO;
import ec.gob.digercic.revit.wsrevit.generics.ws.NacidoVivoVO;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.EstadoRegistroRenavi;
import ec.gob.digercic.revit.wsrevit.model.NacidoVivoRenavi;
import ec.gob.digercic.revit.wsrevit.model.PadreRenavi;
import ec.gob.digercic.revit.wsrevit.service.EstadoRegistroService;
import ec.gob.digercic.revit.wsrevit.service.MadreRenaviService;
import ec.gob.digercic.revit.wsrevit.service.NacidoVivoRenaviService;
import ec.gob.digercic.revit.wsrevit.service.PadreRenaviService;
import ec.gob.digercic.revit.wsrevit.service.VariableRenaviService;
import ec.gob.digercic.revit.wsrevit.utils.JSFUtil;
import ec.gob.digercic.revit.wsrevit.wsinit.WSInits;
import ec.gob.digercic.wsintegracion.ListUbicacion;
import ec.gob.digercic.wsintegracion.TblSauregRol;
import ec.gob.digercic.wsintegracion.TblSauregUsuario;


/**
 * 
 * @author christian.benalcazar
 *
 */
@WebService(serviceName = "DatosRevit")
public class DatosRevit {

	@EJB
	private MadreRenaviService madreRenaviService;
	@EJB
	private NacidoVivoRenaviService nacidoVivoService;
	@EJB
	private PadreRenaviService padreRenaviService;
	@EJB
	private EstadoRegistroService estadoRegistroService;
	@EJB
	private VariableRenaviService variableService;

	@EJB
	private WSInits wsInits;

	private Devolucion resultadoWS;
	private boolean rolConsulta;
	private boolean rolInscripcion;
	private boolean continuaValidacion;
	private static Log logger = LogFactory.getLog(DatosRevit.class);

	/**
	 * Permite realizar la consulta de los registros de un nacido vivo en base a la identificación
	 * de cedula de la madre
	 * Para los partos en casa valida que la institución que requiere inscribir el registros 
	 * tenga los permisos necesarios y este en el mismo zonal
	 * @param userSaureg
	 * @param passwordSaureg
	 * @param cedulaMadre
	 * @param codigoAgencia
	 * @return
	 */
	@WebMethod(operationName = "cedulaMadre")
	public Devolucion cedulaMadre(@WebParam(name = "user") String userSaureg,
			@WebParam(name = "password") String passwordSaureg, 
			@WebParam(name = "cedulaMadre") String cedulaMadre,
			@WebParam(name = "codigoAgencia") String codigoAgencia ) {

		resultadoWS = new Devolucion();
		continuaValidacion = false;
		TblSauregUsuario tblAgenciaSaureg = new TblSauregUsuario();

		// Compruebo si la madre está en la base del esquema revit.
		try {
			if (wsInits.getPortWSIntegracion() ==null) {
				logger.error("NULL Port WSIntegracion");
			}
			
			TblSauregUsuario tblSauregUser = wsInits.getPortWSIntegracion().getUsuario(
					userSaureg, passwordSaureg, getIdWSRevit());
			
			if (tblSauregUser == null) {
				logger.error("NULL usuario Saureg");
			}
						
			if (tblSauregUser.getCodError().equals("001")) {
				resultadoWS.setCodigoError("002");
				resultadoWS.setDescripcionError("No hay datos del usuario. Credenciales incorrectas.");
			} else if (tblSauregUser.getCodError().equals("004")) {
				resultadoWS.setCodigoError("012");
				resultadoWS.setDescripcionError("Acceso denegado por falta de privilegios.");
			} else if(codigoAgencia.equals("-1")){
				resultadoWS.setCodigoError("017");
				resultadoWS.setDescripcionError("REVIT: Agencia no puede inscribir partos en casa.");
			}else if(codigoAgencia.trim().isEmpty()){
				resultadoWS.setCodigoError("019");
				resultadoWS.setDescripcionError("REVIT: Código Agencia es requerido.");
			} 
			else {
				// valido el rol CONSULTA
				rolConsulta = false;
				for (TblSauregRol rolTmp : tblSauregUser.getTblSauregRolList()) {
					if (rolTmp.getDescripcion().equals("CONSULTA")) {
						rolConsulta = true;
						break;
					}
				}

				if (rolConsulta) {
					MadreRenaviVO madreVO = madreRenaviService.buscarMadrePorCedula(cedulaMadre);
					if (madreVO == null) {
						resultadoWS.setCodigoError("005");
						resultadoWS.setDescripcionError("REVIT: La madre no está registrada en el sistema.");
					} else {
						List<NacidoVivoVO> listNacidoVivoV0 = new ArrayList<>();

						List<ParametroConsulta> listaParametros = new ArrayList<>();
						listaParametros.add(new ParametroConsulta("cedulMad", cedulaMadre));
						listaParametros.add(new ParametroConsulta("statusM", JSFUtil.ESTADO_REG_ACTIVO));
						listaParametros.add(new ParametroConsulta("statusNV", JSFUtil.ESTADO_REG_ACTIVO));

						// agrego el estado de la firma
						List<Integer> listFirmaEstado = new ArrayList<>();
						listFirmaEstado.add(JSFUtil.STAT_FIR_CON);
						listFirmaEstado.add(JSFUtil.STAT_FIR_SIN);
						listaParametros.add(new ParametroConsulta("estFirma", listFirmaEstado));

						// se agrega el estado del registro
						List<Integer> listRegistroEstado = new ArrayList<>();
						listRegistroEstado.add(JSFUtil.STAT_DAT_MADRE);	//2
						listRegistroEstado.add(JSFUtil.STAT_DAT_NACVIVO);	//3
						listRegistroEstado.add(JSFUtil.STAT_DAT_DOCTOR);	//4
						listRegistroEstado.add(JSFUtil.STAT_DAT_LISTOEDITARANULADO);	//7
						listRegistroEstado.add(JSFUtil.STAT_DAT_EDITDOCTORANULADO);	//8
						listRegistroEstado.add(JSFUtil.ESTADO_BLOQUEO_POR_INSCRIPCION);//13
						listaParametros.add(new ParametroConsulta("estRegistro", listRegistroEstado));

						List<NacidoVivoRenavi> listRegistrosNV = nacidoVivoService.buscarPorCedulaMad(listaParametros); 


						if(listRegistrosNV.isEmpty()) {
							resultadoWS.setCodigoError("016");
							resultadoWS.setDescripcionError("REVIT: La madre no tiene registros de hijos para realizar la inscripción.");

						} else {
							NacidoVivoRenavi nacidoVivoTmp = listRegistrosNV.get(0);

							List<NacidoVivoRenavi> listRegistrosNVPartoCasa = new ArrayList<NacidoVivoRenavi>();
							List<NacidoVivoRenavi> listRegistrosNVNacimiento = new ArrayList<NacidoVivoRenavi>();
							List<NacidoVivoRenavi> listRegistrosResultados = new ArrayList<NacidoVivoRenavi>();
							Boolean existeEnOtraAgencia = false;

							for (NacidoVivoRenavi nacidoVivoRenaviTmp : listRegistrosNV) {
								if(nacidoVivoRenaviTmp.getPartoEnCasa() != null && nacidoVivoRenaviTmp.getPartoEnCasa().equals("1")) {
									if (nacidoVivoRenaviTmp.getFkAgenciaSaureg().equals(codigoAgencia)) {
										listRegistrosNVPartoCasa.add(nacidoVivoRenaviTmp);
									}else {
										existeEnOtraAgencia = true;
									}

								}else if (nacidoVivoRenaviTmp.getPartoEnCasa() == null) {
									listRegistrosNVNacimiento.add(nacidoVivoRenaviTmp);
								}
							}

							//CONSULTA: SI EXISTEENOTROAGENCIA = TRUE Y EXISTE UN REGISTRO PC VALIDO EN AGENCIA
							//DEVUELVE EL  REGISTRO ENCONTRADO 
							//O
							//DEVUELVE EL ERROR 018
							//CONSULTA: SI EXISTEENOTRAAGENCIA = TRUE Y EXISTE REGISTRO NACIMIENTO 
							//

							if (listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty() && existeEnOtraAgencia) {
								resultadoWS.setCodigoError("018");
								resultadoWS.setDescripcionError("REVIT: No puede registrar partos en casa, verifique la agencia de registro con la agencia de inscripción");
								continuaValidacion = false;
							}else if (!listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty()) {
								listRegistrosResultados.addAll(listRegistrosNVPartoCasa);
							}else if (listRegistrosNVPartoCasa.isEmpty() && !listRegistrosNVNacimiento.isEmpty()) {
								listRegistrosResultados.addAll(listRegistrosNVNacimiento);
							}else if(!listRegistrosNVPartoCasa.isEmpty() && !listRegistrosNVNacimiento.isEmpty()) {
								listRegistrosResultados.addAll(listRegistrosNVPartoCasa);
								listRegistrosResultados.addAll(listRegistrosNVNacimiento);
							}else if(listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty()) {
								resultadoWS.setCodigoError("016");
								resultadoWS.setDescripcionError("REVIT: La madre no tiene registros de hijos para realizar la inscripción.");
								continuaValidacion = false;
							}




							if (!listRegistrosResultados.isEmpty()) {
								listRegistrosNV.clear();
								listRegistrosNV.addAll(listRegistrosResultados);
								continuaValidacion = true;
							}

							if (continuaValidacion) {
								madreVO = new MadreRenaviVO();
								SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");

								madreVO.setCedula(nacidoVivoTmp.getFkCedulMad().getCedulMad());
								madreVO.setDescripcionCondicionCedulado(nacidoVivoTmp.getCondicCedMad());
								madreVO.setIdEstadoCivil(nacidoVivoTmp.getFkIdEstCivMad().getIdEstCiv().toString());
								madreVO.setDescripcionEstadoCivil(
										nacidoVivoTmp.getFkIdEstCivMad().getDescEstCiv().replaceAll("A/O", "O"));
								madreVO.setDescripcionNacionalidad(nacidoVivoTmp.getFkIdNacMad().getDescNac());
								madreVO.setDescripcionSexo(nacidoVivoTmp.getSexoMad());
								madreVO.setFechaNacimiento(
										dateFormat.format(nacidoVivoTmp.getFkCedulMad().getFechaNacimMad()));
								madreVO.setNombre(nacidoVivoTmp.getFkCedulMad().getNombrMad());
								madreVO.setNombreMadre(nacidoVivoTmp.getFkCedulMad().getNomMadreMad());
								madreVO.setNombrePadre(nacidoVivoTmp.getFkCedulMad().getNomPadreMad());

								// evaluacion de cada registroNV
								for (NacidoVivoRenavi nacidoVivoRenaviTmp : listRegistrosNV) {
									if(nacidoVivoRenaviTmp.getPartoEnCasa()!= null) {
										tblAgenciaSaureg = wsInits.getPortWSIntegracion()
												.getUsuarioByUserAndAgencia(nacidoVivoRenaviTmp.getFkUsuSaureg(),
														nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString());
									}else {
										tblAgenciaSaureg = wsInits.getPortWSIntegracion()
												.getUsuarioByUserAndAgenciaMsp(nacidoVivoRenaviTmp.getFkUsuSaureg(),
														nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString());
									}

									if (tblAgenciaSaureg.getCodError().equals("003")) {
										resultadoWS.setCodigoError("003");
										resultadoWS.setDescripcionError("Existe error en el código de establecimiento de salud, "
												+ "por favor contactarse a " + getEmail() + ".");
									} 
									else {


										if (nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString()
												.equals(tblAgenciaSaureg.getAgenciaInUser().getCodMsp())
												|| nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString()
												.equals(tblAgenciaSaureg.getAgenciaInUser().getIdAgencia().toString())) {
											NacidoVivoVO nacidoVivoVO = new NacidoVivoVO();
											nacidoVivoVO.setApellidos(nacidoVivoRenaviTmp.getApellNacViv());
											nacidoVivoVO.setCedula(nacidoVivoRenaviTmp.getCedulNacViv());
											nacidoVivoVO.setNombres(nacidoVivoRenaviTmp.getNombrNacViv());
											nacidoVivoVO.setPdf(nacidoVivoRenaviTmp.getPdfConFirmaNacViv());
											nacidoVivoVO.setEsPartoCasa(nacidoVivoRenaviTmp.getPartoEnCasa());
											nacidoVivoVO.setIdNacVivo(nacidoVivoRenaviTmp.getIdNacViv());
											if(nacidoVivoRenaviTmp.getPartoEnCasa()!= null)
												nacidoVivoVO.setEsPartoCasa(nacidoVivoRenaviTmp.getPartoEnCasa());
											else
												nacidoVivoVO.setEsPartoCasa("0");

											// asignacion valores del ws-saureg
											//nacidoVivoVO.setApellidosProfesional(tblAgenciaSaureg.getApellido());
											nacidoVivoVO.setNombresProfesional(tblAgenciaSaureg.getNombre() 
													+ " " + tblAgenciaSaureg.getApellido());
											nacidoVivoVO.setCedulaProfesional(tblAgenciaSaureg.getNomUsuario());
											nacidoVivoVO.setDescripcionAgencia(
													tblAgenciaSaureg.getAgenciaInUser().getNomAgencia());
											nacidoVivoVO.setDescripcionInstitucion(
													tblAgenciaSaureg.getAgenciaInUser().getIdInstituc().getNomInstituc());
											nacidoVivoVO.setCodigoProvincia(
													tblAgenciaSaureg.getAgenciaInUser().getIdProvincia().getCodExterno2());
											nacidoVivoVO.setDescripcionProvincia(
													tblAgenciaSaureg.getAgenciaInUser().getIdProvincia().getDerscripcion());
											nacidoVivoVO.setCodigoCanton(
													tblAgenciaSaureg.getAgenciaInUser().getIdCanton().getCodExterno2());
											nacidoVivoVO.setDescripcionCanton(
													tblAgenciaSaureg.getAgenciaInUser().getIdCanton().getDerscripcion());
											nacidoVivoVO.setCodigoParroquia(
													tblAgenciaSaureg.getAgenciaInUser().getIdParroquia().getCodExterno2());
											nacidoVivoVO.setDescripcionParroquia(
													tblAgenciaSaureg.getAgenciaInUser().getIdParroquia().getDerscripcion());

											if (nacidoVivoRenaviTmp.getFkIdSexoNv() != null) {
												nacidoVivoVO.setCodigoSexo(
														nacidoVivoRenaviTmp.getFkIdSexoNv().getIdSexo().toString());
												nacidoVivoVO.setDescripcionSexo(
														nacidoVivoRenaviTmp.getFkIdSexoNv().getDescrSexo());
											}
											if (nacidoVivoRenaviTmp.getFechaNacimNacViv() != null) {
												nacidoVivoVO.setFechaNacimiento(
														dateFormat.format(nacidoVivoRenaviTmp.getFechaNacimNacViv()));
											}
											if (nacidoVivoRenaviTmp.getFechaCreacionNacViv() != null) {
												nacidoVivoVO.setFechaCreacion(
														dateFormat.format(nacidoVivoRenaviTmp.getFechaCreacionNacViv()));
											}

											// evaluacion por estadoRegistro
											switch (nacidoVivoRenaviTmp.getFkIdEstReg().getIdEstReg()) {
											// registro datos madre incompleto
											case 2:
												//DATOS INCOMPLETOS DE LA MADRE
												nacidoVivoVO.setCodigoMensaje("nv01");
												nacidoVivoVO.setMensaje("REVIT: Registro incompleto, solo contiene datos de la madre. "
														+ "Por favor contactarse con el Establecimiento de Salud: "
														+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
												break;

												// registro incompleto
											case 3:
												// DATOS INCOMPLETOS NACIDO VIVO
												nacidoVivoVO.setCodigoMensaje("nv05");
												nacidoVivoVO.setMensaje("REVIT: Registro incompleto, por favor contactarse "
														+ "con el Establecimiento de Salud:"
														+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
												break;
											case 7:
												//REGISTRO INCOMPLETO ANULACION
												nacidoVivoVO.setCodigoMensaje("nv02");
												nacidoVivoVO.setMensaje("REVIT: Registro en proceso anulación, "
														+ "por favor contactarse con el Establecimiento de Salud: "
														+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
												break;

												// registro datos doctor completo
											case 4:
												//DATOS COMOPLETOS DOCTOR
												// registro firmado?
												if (nacidoVivoRenaviTmp.getFkIdEstFir().getIdEstFir() == 2) {
													// busqueda de registros firmados en proceso de anulacion
													List<NacidoVivoRenavi> listRegistrosAnulados = 
															nacidoVivoService.buscarAnuladoPorId(
																	nacidoVivoRenaviTmp.getIdNacViv());
													if(listRegistrosAnulados.size() > 0) {
														nacidoVivoVO.setCodigoMensaje("nv02");
														nacidoVivoVO.setMensaje("REVIT: Registro en proceso anulación, "
																+ "por favor contactarse con el Establecimiento de Salud: "
																+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
													} else {
														nacidoVivoVO.setCodigoMensaje("nv03");
														nacidoVivoVO.setMensaje("REVIT: Registro completo, listo para inscribir.");
													}

												} else {
													nacidoVivoVO.setCodigoMensaje("nv04");
													nacidoVivoVO.setMensaje("REVIT: Registro incompleto, " 
															+ "registro de nacido vivo sin firma electrónica.");
												}
												break;

												// registro anulado completo
											case 8:
												//REGISTRO ANULACION COMPLETO
												if(nacidoVivoRenaviTmp.getFkIdEstFir().getIdEstFir() == 2) {
													nacidoVivoVO.setCodigoMensaje("nv03");
													nacidoVivoVO.setMensaje("REVIT: Registro completo, listo para inscribir.");
												} else {
													nacidoVivoVO.setCodigoMensaje("nv04");
													nacidoVivoVO.setMensaje("REVIT: Registro incompleto, "
															+ "registro de nacido vivo sin firma electrónica.");
												}
												break;

												// registro anulado firmado por administrador
											case 11:
												//REGISTRO ANULADO  FIRMADO POR ADMINISTRADOR
												nacidoVivoVO.setCodigoMensaje("nv06");
												nacidoVivoVO.setMensaje("REVIT: Registro anulado firmado por el administrador.");
												break;
											
											case 13:
												//REGISTRO BLOQUEADO EN PROCESO DE INSCRIPCION PREVIO
												nacidoVivoVO.setCodigoMensaje("nv07");
												nacidoVivoVO.setMensaje("REVIT: La madre tiene registros en proceso de inscripción,por favor contactarse a " + getEmail() + ".");
												break;

											default:
												nacidoVivoVO.setCodigoMensaje("nv05");
												nacidoVivoVO.setMensaje("REVIT: Registro incompleto, por favor contactarse "
														+ "con el Establecimiento de Salud:"
														+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
												break;
											}

											// se agrega nacidoVivoVO
											listNacidoVivoV0.add(nacidoVivoVO);

										} else {
											resultadoWS.setCodigoError("003");
											resultadoWS.setDescripcionError("Existe error en el código de establecimiento de "
													+ "salud, por favor contactarse a " + getEmail() + ".");
										}
									}
								}
								if (!listNacidoVivoV0.isEmpty()) {
									madreVO.setHijos(listNacidoVivoV0);
									resultadoWS.setMadre(madreVO);
									resultadoWS.setCodigoError("000");
									resultadoWS.setDescripcionError("Datos encontrados.");
								}else {
									resultadoWS.setCodigoError("003");
									resultadoWS.setDescripcionError("Existe error en el código de establecimiento de "
											+ "salud, por favor contactarse a " + getEmail() + ".");
								}


							}
						}
					}

				} else {
					resultadoWS.setCodigoError("013");
					resultadoWS.setDescripcionError("Acceso denegado, no tiene el rol para realizar la consulta.");
				}
			}

		} catch (Exception e) {
			logger.info("Error metodo ws" + e.getCause() + " msg: " + e.getMessage());
			resultadoWS.setCodigoError("001");
			resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
		}

		return resultadoWS;
	}
	
	

	/**
	 * Permite reaalizar la consutla de los registros de un nacido vivo en base a un tipo de documento
	 * el mismo que puede ser:
	 *  C: codigo de registro emitido en el formulario de registro de los datos vitales del nacido vivo
	 *  P: número de pasaporte de la madre 
	 * @param userSaureg
	 * @param passwordSaureg
	 * @param numeroDoc
	 * @param tipoDoc
	 * @param codigoAgencia
	 * @return
	 */
	@WebMethod(operationName = "documentoMadre")
	public Devolucion documentoMadre(@WebParam(name = "user") String userSaureg,
			@WebParam(name = "password") String passwordSaureg, 
			@WebParam(name = "numeroDoc") String numeroDoc,
			@WebParam(name = "tipoDoc") String tipoDoc,
			@WebParam(name = "codigoAgencia") String codigoAgencia) {
		resultadoWS = new Devolucion();
		TblSauregUsuario tblAgenciaSaureg = new TblSauregUsuario();
		// Compruebo si la madre está en la base del esquema revit.
		try {
			
			if (wsInits.getPortWSIntegracion() ==null) {
				logger.error("NULL Port WSIntegracion");
			}
			
			TblSauregUsuario tblSauregUser = wsInits.getPortWSIntegracion().getUsuario(
					userSaureg, passwordSaureg, getIdWSRevit());
			if (tblSauregUser == null) {
				logger.error("NULL usuario Saureg");
			}
			if (tblSauregUser.getCodError().equals("001")) {
				resultadoWS.setCodigoError("002");
				resultadoWS.setDescripcionError("No hay datos del usuario. Credenciales incorrectas.");
			} else if (tblSauregUser.getCodError().equals("004")) {
				resultadoWS.setCodigoError("012");
				resultadoWS.setDescripcionError("Acceso denegado por falta de privilegios.");
			} else if(codigoAgencia.equals("-1")){
				resultadoWS.setCodigoError("017");
				resultadoWS.setDescripcionError("REVIT: Agencia no puede inscribir partos en casa.");
			}else if(codigoAgencia.trim().isEmpty()){
				resultadoWS.setCodigoError("019");
				resultadoWS.setDescripcionError("REVIT: Código Agencia es requerido.");
			} else {
				// valido el rol CONSULTA
				rolConsulta = false;
				for (TblSauregRol rolTmp : tblSauregUser.getTblSauregRolList()) {
					if (rolTmp.getDescripcion().equals("CONSULTA")) {
						rolConsulta = true;
						break;
					}
				}

				if (rolConsulta) {
					if(numeroDoc.equals("") || tipoDoc.equals("")) {
						resultadoWS.setCodigoError("004");
						resultadoWS.setDescripcionError("Por favor ingrese los parámetros para realizar la consulta.");
					} else {
						// Tipo de documento
						// C:codigo del registro de la madre
						// P:pasaporte de la madre
						MadreRenaviVO madreVO;
						if ("P".equalsIgnoreCase(tipoDoc)) {
							madreVO = madreRenaviService.buscarMadrePorPasaporte(numeroDoc);
						} else if ("C".equalsIgnoreCase(tipoDoc)) {
							try {
								@SuppressWarnings("unused")
								long l = Long.parseLong(numeroDoc);
								madreVO = madreRenaviService.buscarMadrePorId(numeroDoc);
							} catch (NumberFormatException nfe) {
								resultadoWS.setCodigoError("020");
								resultadoWS.setDescripcionError("El parámetro numeroDoc es incorrecto para el tipo de documento.");
								return resultadoWS;
							}


						} else {
							// salgo de la aplicacion - error tipoDoc
							resultadoWS.setCodigoError("014");
							resultadoWS.setDescripcionError("El parámetro tipoDoc es incorrecto.");
							return resultadoWS;
						}
						// evaluo resultado
						if (madreVO == null) {
							resultadoWS.setCodigoError("005");
							resultadoWS.setDescripcionError("REVIT: La madre no está registrada en el sistema.");
						} else {
							List<NacidoVivoVO> listNacidoVivoV0 = new ArrayList<>();

							List<ParametroConsulta> listaParametros = new ArrayList<>();
							if ("P".equalsIgnoreCase(tipoDoc)) {
								listaParametros.add(new ParametroConsulta("pasapMad", numeroDoc));
							} else if("C".equalsIgnoreCase(tipoDoc)) {
								listaParametros.add(new ParametroConsulta("idMad", new Long(numeroDoc)));
							} 
							listaParametros.add(new ParametroConsulta("statusNV", JSFUtil.ESTADO_REG_ACTIVO));

							// agrego el estado de la firma
							List<Integer> listFirmaEstado = new ArrayList<>();
							listFirmaEstado.add(JSFUtil.STAT_FIR_CON);
							listFirmaEstado.add(JSFUtil.STAT_FIR_SIN);
							listaParametros.add(new ParametroConsulta("estFirma", listFirmaEstado));

							// se agrega el estado del registro
							List<Integer> listRegistroEstado = new ArrayList<>();
							listRegistroEstado.add(JSFUtil.STAT_DAT_MADRE);	//2
							listRegistroEstado.add(JSFUtil.STAT_DAT_NACVIVO);	//3
							listRegistroEstado.add(JSFUtil.STAT_DAT_DOCTOR);	//4
							listRegistroEstado.add(JSFUtil.STAT_DAT_LISTOEDITARANULADO);	//7
							listRegistroEstado.add(JSFUtil.STAT_DAT_EDITDOCTORANULADO);	//8
							listRegistroEstado.add(JSFUtil.ESTADO_BLOQUEO_POR_INSCRIPCION);	//13
							listaParametros.add(new ParametroConsulta("estRegistro", listRegistroEstado));

							List<NacidoVivoRenavi> listRegistrosNV = new ArrayList<>();
							if ("P".equalsIgnoreCase(tipoDoc)) {
								listRegistrosNV = nacidoVivoService.buscarPorPasaporteMad(listaParametros);
							} else if("C".equalsIgnoreCase(tipoDoc)) {
								listRegistrosNV = nacidoVivoService.buscarPorIdMad(listaParametros);
							}

							if(listRegistrosNV.isEmpty()) {
								resultadoWS.setCodigoError("016");
								resultadoWS.setDescripcionError("REVIT: La madre no tiene registros de hijos para realizar la inscripción.");

							} else {
								NacidoVivoRenavi nacidoVivoTmp = listRegistrosNV.get(0);

								List<NacidoVivoRenavi> listRegistrosNVPartoCasa = new ArrayList<NacidoVivoRenavi>();;
								List<NacidoVivoRenavi> listRegistrosNVNacimiento = new ArrayList<NacidoVivoRenavi>();;
								List<NacidoVivoRenavi> listRegistrosResultados = new ArrayList<NacidoVivoRenavi>();;
								Boolean existeEnOtraAgencia = false;

								for (NacidoVivoRenavi nacidoVivoRenaviTmp : listRegistrosNV) {
									if(nacidoVivoRenaviTmp.getPartoEnCasa() != null && nacidoVivoRenaviTmp.getPartoEnCasa().equals("1")) {
										if (nacidoVivoRenaviTmp.getFkAgenciaSaureg().equals(codigoAgencia)) {
											listRegistrosNVPartoCasa.add(nacidoVivoRenaviTmp);
										}else {
											existeEnOtraAgencia = true;
										}

									}else if (nacidoVivoRenaviTmp.getPartoEnCasa() == null) {
										listRegistrosNVNacimiento.add(nacidoVivoRenaviTmp);
									}
								}

								//CONSULTA: SI EXISTEENOTROAGENCIA = TRUE Y EXISTE UN REGISTRO PC VALIDO EN AGENCIA
								//DEVUELVE EL  REGISTRO ENCONTRADO 
								//O
								//DEVUELVE EL ERROR 018
								//CONSULTA: SI EXISTEENOTRAAGENCIA = TRUE Y EXISTE REGISTRO NACIMIENTO 
								//

								if (listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty() && existeEnOtraAgencia) {
									resultadoWS.setCodigoError("018");
									resultadoWS.setDescripcionError("REVIT: No puede registrar partos en casa, verifique la agencia de registro con la agencia de inscripción");
									continuaValidacion = false;
								}else if (!listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty()) {
									listRegistrosResultados.addAll(listRegistrosNVPartoCasa);
								}else if (listRegistrosNVPartoCasa.isEmpty() && !listRegistrosNVNacimiento.isEmpty()) {
									listRegistrosResultados.addAll(listRegistrosNVNacimiento);
								}else if(!listRegistrosNVPartoCasa.isEmpty() && !listRegistrosNVNacimiento.isEmpty()) {
									listRegistrosResultados.addAll(listRegistrosNVPartoCasa);
									listRegistrosResultados.addAll(listRegistrosNVNacimiento);
								}else if(listRegistrosNVPartoCasa.isEmpty() && listRegistrosNVNacimiento.isEmpty()) {
									resultadoWS.setCodigoError("016");
									resultadoWS.setDescripcionError("REVIT: La madre no tiene registros de hijos para realizar la inscripción.");
									continuaValidacion = false;
								}




								if (!listRegistrosResultados.isEmpty()) {
									listRegistrosNV.clear();
									listRegistrosNV.addAll(listRegistrosResultados);
									continuaValidacion = true;
								}

								if (continuaValidacion) {
									madreVO = new MadreRenaviVO();
									SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");

									madreVO.setIdMadre(nacidoVivoTmp.getFkCedulMad().getIdMad().toString());
									madreVO.setPasaporte(nacidoVivoTmp.getFkCedulMad().getPasapMad());
									madreVO.setIdEstadoCivil(nacidoVivoTmp.getFkIdEstCivMad().getIdEstCiv().toString());
									madreVO.setDescripcionCondicionCedulado(nacidoVivoTmp.getCondicCedMad());
									madreVO.setDescripcionEstadoCivil(
											nacidoVivoTmp.getFkIdEstCivMad().getDescEstCiv().replaceAll("A/O", "O"));
									madreVO.setDescripcionNacionalidad(nacidoVivoTmp.getFkIdNacMad().getDescNac());
									madreVO.setDescripcionSexo(nacidoVivoTmp.getSexoMad());
									madreVO.setFechaNacimiento(
											dateFormat.format(nacidoVivoTmp.getFkCedulMad().getFechaNacimMad()));
									madreVO.setNombre(nacidoVivoTmp.getFkCedulMad().getNombrMad());
									madreVO.setNombreMadre(nacidoVivoTmp.getFkCedulMad().getNomMadreMad());
									madreVO.setNombrePadre(nacidoVivoTmp.getFkCedulMad().getNomPadreMad());

									// evaluacion de cada registroNV
									for (NacidoVivoRenavi nacidoVivoRenaviTmp : listRegistrosNV) {
										if(nacidoVivoRenaviTmp.getPartoEnCasa()!= null) {
											tblAgenciaSaureg = wsInits.getPortWSIntegracion()
													.getUsuarioByUserAndAgencia(nacidoVivoRenaviTmp.getFkUsuSaureg(),
															nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString());

										}else {

											tblAgenciaSaureg = wsInits.getPortWSIntegracion()
													.getUsuarioByUserAndAgenciaMsp(nacidoVivoRenaviTmp.getFkUsuSaureg(),
															nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString());
										}

										if (tblAgenciaSaureg.getCodError().equals("003")) {
											resultadoWS.setCodigoError("003");
											resultadoWS.setDescripcionError("Existe error en el código de establecimiento de salud, "
													+ "por favor contactarse a " + getEmail() + ".");
										} 
										else {
											if (nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString()
													.equals(tblAgenciaSaureg.getAgenciaInUser().getCodMsp()) 
													|| nacidoVivoRenaviTmp.getFkAgenciaSaureg().toString().
													equals(tblAgenciaSaureg.getAgenciaInUser().getIdAgencia().toString())) {
												NacidoVivoVO nacidoVivoVO = new NacidoVivoVO();
												nacidoVivoVO.setApellidos(nacidoVivoRenaviTmp.getApellNacViv());
												nacidoVivoVO.setNombres(nacidoVivoRenaviTmp.getNombrNacViv());
												nacidoVivoVO.setPdf(nacidoVivoRenaviTmp.getPdfConFirmaNacViv());
												nacidoVivoVO.setHistorialNacidoVivo(nacidoVivoRenaviTmp.getNumeroHistoriaNacViv());
												nacidoVivoVO.setIdNacVivo(nacidoVivoRenaviTmp.getIdNacViv());
												if(nacidoVivoRenaviTmp.getPartoEnCasa()!= null)
													nacidoVivoVO.setEsPartoCasa(nacidoVivoRenaviTmp.getPartoEnCasa());
												else
													nacidoVivoVO.setEsPartoCasa("0");

												if (nacidoVivoRenaviTmp.getFkIdSexoNv() != null) {
													nacidoVivoVO.setCodigoSexo(
															nacidoVivoRenaviTmp.getFkIdSexoNv().getIdSexo().toString());
													nacidoVivoVO.setDescripcionSexo(
															nacidoVivoRenaviTmp.getFkIdSexoNv().getDescrSexo());
												}
												if (nacidoVivoRenaviTmp.getFechaNacimNacViv() != null) {
													nacidoVivoVO.setFechaNacimiento(
															dateFormat.format(nacidoVivoRenaviTmp.getFechaNacimNacViv()));
												}
												if (nacidoVivoRenaviTmp.getFechaCreacionNacViv() != null) {
													nacidoVivoVO.setFechaCreacion(
															dateFormat.format(nacidoVivoRenaviTmp.getFechaCreacionNacViv()));
												}

												// asignacion valores del ws-saureg
												//nacidoVivoVO.setApellidosProfesional(tblAgenciaSaureg.getApellido());
												nacidoVivoVO.setNombresProfesional(tblAgenciaSaureg.getNombre() 
														+ " " + tblAgenciaSaureg.getApellido());
												nacidoVivoVO.setCedulaProfesional(tblAgenciaSaureg.getNomUsuario());
												nacidoVivoVO.setDescripcionAgencia(
														tblAgenciaSaureg.getAgenciaInUser().getNomAgencia());
												nacidoVivoVO.setDescripcionInstitucion(
														tblAgenciaSaureg.getAgenciaInUser().getIdInstituc().getNomInstituc());
												nacidoVivoVO.setCodigoProvincia(
														tblAgenciaSaureg.getAgenciaInUser().getIdProvincia().getCodExterno2());
												nacidoVivoVO.setDescripcionProvincia(
														tblAgenciaSaureg.getAgenciaInUser().getIdProvincia().getDerscripcion());
												nacidoVivoVO.setCodigoCanton(
														tblAgenciaSaureg.getAgenciaInUser().getIdCanton().getCodExterno2());
												nacidoVivoVO.setDescripcionCanton(
														tblAgenciaSaureg.getAgenciaInUser().getIdCanton().getDerscripcion());
												nacidoVivoVO.setCodigoParroquia(
														tblAgenciaSaureg.getAgenciaInUser().getIdParroquia().getCodExterno2());
												nacidoVivoVO.setDescripcionParroquia(
														tblAgenciaSaureg.getAgenciaInUser().getIdParroquia().getDerscripcion());

												// evaluacion por estadoRegistro
												switch (nacidoVivoRenaviTmp.getFkIdEstReg().getIdEstReg()) {
												// registro datos madre incompleto
												case 2:
													nacidoVivoVO.setCodigoMensaje("nv01");
													nacidoVivoVO.setMensaje("REVIT: Registro incompleto, solo contiene datos de la madre. "
															+ "Por favor contactarse con el Establecimiento de Salud: "
															+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
													break;

													// registro incompleto
												case 3:
													// registro incompleto anulado
												case 7:
													nacidoVivoVO.setCodigoMensaje("nv02");
													nacidoVivoVO.setMensaje("REVIT: Registro en proceso anulación, "
															+ "por favor contactarse con el Establecimiento de Salud: "
															+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
													break;

													// registro datos doctor completo
												case 4:
													// registro firmado?
													if (nacidoVivoRenaviTmp.getFkIdEstFir().getIdEstFir() == 2) {
														// busqueda de registros firmados en proceso de anulacion
														List<NacidoVivoRenavi> listRegistrosAnulados = 
																nacidoVivoService.buscarAnuladoPorId(
																		nacidoVivoRenaviTmp.getIdNacViv());
														if(listRegistrosAnulados.size() > 0) {
															nacidoVivoVO.setCodigoMensaje("nv02");
															nacidoVivoVO.setMensaje("REVIT: Registro en proceso anulación, "
																	+ "por favor contactarse con el Establecimiento de Salud: "
																	+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
														} else {
															nacidoVivoVO.setCodigoMensaje("nv03");
															nacidoVivoVO.setMensaje("REVIT: Registro completo: listo para inscribir.");
														}

													} else {
														nacidoVivoVO.setCodigoMensaje("nv04");
														nacidoVivoVO.setMensaje("REVIT: Registro incompleto, "
																+ "registro de nacido vivo sin firma electrónica.");
													}
													break;

													// registro anulado completo
												case 8:
													if(nacidoVivoRenaviTmp.getFkIdEstFir().getIdEstFir() == 2) {
														nacidoVivoVO.setCodigoMensaje("nv03");
														nacidoVivoVO.setMensaje("REVIT: Registro completo, listo para inscribir.");
													} else {
														nacidoVivoVO.setCodigoMensaje("nv04");
														nacidoVivoVO.setMensaje("REVIT: Registro incompleto, "
																+ "registro de nacido vivo sin firma electrónica.");
													}
													break;

													// registro anulado firmado por administrador
												case 11:
													nacidoVivoVO.setCodigoMensaje("nv06");
													nacidoVivoVO.setMensaje("REVIT: Registro anulado firmado por el administrador.");
													break;
													
												case 13:
													//REGISTRO BLOQUEADO EN PROCESO DE INSCRIPCION PREVIO
													nacidoVivoVO.setCodigoMensaje("nv07");
													nacidoVivoVO.setMensaje("REVIT: La madre tiene registros en proceso de inscripción,por favor contactarse a " + getEmail() + ".");
													break;

												default:
													nacidoVivoVO.setCodigoMensaje("nv05");
													nacidoVivoVO.setMensaje("REVIT: Registro incompleto, por favor contactarse "
															+ "con el Establecimiento de Salud:"
															+ tblAgenciaSaureg.getAgenciaInUser().getNomAgencia() + ".");
													break;
												}
												// se agrega nacidoVivoVO
												listNacidoVivoV0.add(nacidoVivoVO);

											} else {
												resultadoWS.setCodigoError("003");
												resultadoWS.setDescripcionError("Existe error en el código de establecimiento "
														+ "de salud, por favor contactarse a " + getEmail() + ".");
											}

										}//neuvo if
									}
									if (!listNacidoVivoV0.isEmpty()) {
										madreVO.setHijos(listNacidoVivoV0);
										resultadoWS.setMadre(madreVO);
										resultadoWS.setCodigoError("000");
										resultadoWS.setDescripcionError("Datos encontrados.");
									}else {
										resultadoWS.setCodigoError("003");
										resultadoWS.setDescripcionError("Existe error en el código de establecimiento "
												+ "de salud, por favor contactarse a " + getEmail() + ".");
									}

								}
							}

						}

					}
				} else {
					resultadoWS.setCodigoError("013");
					resultadoWS.setDescripcionError("Acceso denegado, no tiene el rol para realizar la consulta.");
				}
			}

		} catch (Exception e) {
			logger.info("Error metodo ws" + e.getCause() + " msg: " + e.getMessage());
			resultadoWS.setCodigoError("001");
			resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
		}

		return resultadoWS;
	}

	
	
	/**
	 * Permite registrar los datos de inscripción del nacido  vivo 
	 * @param userSaureg
	 * @param passwordSaureg
	 * @param tipoRegistro
	 * @param cedulaNacidoVivo
	 * @param fechaInscripcion
	 * @param codProvInscripcion
	 * @param desProvInscripcion
	 * @param codCantInscripcion
	 * @param desCantInscripcion
	 * @param codParrInscripcion
	 * @param desParrInscripcion
	 * @param actaInscripcion
	 * @param nombresInsc
	 * @param apellidosInsc
	 * @param cedulaPad
	 * @param nombresPad
	 * @param fechaNacimPad
	 * @param cedulaMad
	 * @param nombresMad
	 * @param fechaNacimMad
	 * @param pasaporteMad
	 * @param codigoInst
	 * @param nombreInst
	 * @param historialNacidoVivo
	 * @param idMadre
	 * @return
	 */
	@WebMethod(operationName = "actualizarInscripcion")
	public Devolucion actualizarInscripcion(@WebParam(name = "user") String userSaureg,
			@WebParam(name = "password") String passwordSaureg,
			@WebParam(name = "tipoRegistro") String tipoRegistro,
			@WebParam(name = "cedulaNacidoVivo") String cedulaNacidoVivo,
			@WebParam(name = "fechaInscripcion") String fechaInscripcion,
			@WebParam(name = "codProvInscripcion") String codProvInscripcion,
			@WebParam(name = "desProvInscripcion") String desProvInscripcion,
			@WebParam(name = "codCantInscripcion") String codCantInscripcion,
			@WebParam(name = "desCantInscripcion") String desCantInscripcion,
			@WebParam(name = "codParrInscripcion") String codParrInscripcion,
			@WebParam(name = "desParrInscripcion") String desParrInscripcion,
			@WebParam(name = "actaInscripcion") String actaInscripcion,
			@WebParam(name = "nombresInsc") String nombresInsc, 
			@WebParam(name = "apellidosInsc") String apellidosInsc,
			@WebParam(name = "cedulaPad") String cedulaPad, 
			@WebParam(name = "nombresPad") String nombresPad,
			@WebParam(name = "fechaNacimPad") String fechaNacimPad,
			// Campos para la inscripcion cuando la madre es indocumentada
			@WebParam(name = "cedulaMad") String cedulaMad, 
			@WebParam(name = "nombresMad") String nombresMad,
			@WebParam(name = "fechaNacimMad") String fechaNacimMad,
			@WebParam(name = "pasaporteMad") String pasaporteMad,
			// cambio para registro de institucion donde fue inscrito
			// nuevos campo para registro de la institucion donde se inscribe (codigoInst, nombreInst)
			@WebParam(name = "codigoInst") String codigoInst, 
			@WebParam(name = "nombreInst") String nombreInst,
			@WebParam(name = "historialNacidoVivo") String historialNacidoVivo,
			@WebParam(name = "idMadre") String idMadre) {
		resultadoWS = new Devolucion();
		// Compruebo si la madre está en la base del esquema revit.
		try {
			if (wsInits.getPortWSIntegracion() ==null) {
				logger.error("NULL Port WSIntegracion");
			}
			TblSauregUsuario tblSauregUser = wsInits.getPortWSIntegracion().getUsuario(
					userSaureg, passwordSaureg, getIdWSRevit());
			if (tblSauregUser == null) {
				logger.error("NULL usuario Saureg");
			}
			if (tblSauregUser.getCodError().equals("001")) {
				resultadoWS.setCodigoError("002");
				resultadoWS.setDescripcionError("No hay datos del usuario. Credenciales incorrectas.");
			} else if (tblSauregUser.getCodError().equals("004")) {
				resultadoWS.setCodigoError("012");
				resultadoWS.setDescripcionError("Acceso denegado por falta de privilegios.");
			} else {
				// valido rol INSCRIPCION
				rolInscripcion = false;
				for (TblSauregRol rolTmp : tblSauregUser.getTblSauregRolList()) {
					if (rolTmp.getDescripcion().equals("INSCRIPCION")) {
						rolInscripcion = true;
						break;
					}
				}

				if (rolInscripcion) {
					if (tipoRegistro.equals("") || cedulaNacidoVivo.equals("") || fechaInscripcion.equals("")
							|| codProvInscripcion.equals("") || desProvInscripcion.equals("")
							|| codCantInscripcion.equals("") || desCantInscripcion.equals("")
							|| codParrInscripcion.equals("") || desParrInscripcion.equals("") || actaInscripcion.equals("")
							|| nombresInsc.equals("") || apellidosInsc.equals("") || nombresMad.equals("")
							|| fechaNacimMad.equals("") || codigoInst.equals("") || nombreInst.equals("") ) {
						resultadoWS.setCodigoError("004");
						resultadoWS.setDescripcionError("Por favor ingrese los parámetros para realizar la consulta.");
					} else {
						// validacion del codigo de ubicacion
						StringBuilder codUbicacionQry = new StringBuilder();
						codUbicacionQry.append(codProvInscripcion).append(",").append(codCantInscripcion).append(",")
						.append(codParrInscripcion);
						ListUbicacion ubicacionListWS = wsInits.getPortWSIntegracion().getUbicacionByCodUbiMagnaWS(
								codUbicacionQry.toString());

						if (ubicacionListWS.getCodError().equals("003")) {
							resultadoWS.setCodigoError("008");
							resultadoWS.setDescripcionError("Los códigos de ubicación son incorrectos.");
						} else {
							List<ParametroConsulta> listaParametros = new ArrayList<>();
							if (tipoRegistro.equals("D")) {
								listaParametros.add(new ParametroConsulta("cedulNacViv", cedulaNacidoVivo));
							} else {
								listaParametros.add(new ParametroConsulta("numeroHistoriaNacViv", historialNacidoVivo));
							}
							listaParametros.add(new ParametroConsulta("status", JSFUtil.ESTADO_REG_ACTIVO));

							// se agrega el estado del registro
							List<Integer> listRegistroEstado = new ArrayList<>();
							listRegistroEstado.add(JSFUtil.STAT_DAT_DOCTOR); // 4
							listRegistroEstado.add(JSFUtil.STAT_DAT_EDITDOCTORANULADO); // 8
							listaParametros.add(new ParametroConsulta("estadoRegistro", listRegistroEstado));

							NacidoVivoRenavi resultNacidoVivo;
							if (tipoRegistro.equals("D")) {
								resultNacidoVivo = nacidoVivoService.buscarPorCedulaNac(listaParametros);
							} else {
								resultNacidoVivo = nacidoVivoService.buscarPorHistorialNac(listaParametros);
							}

							if (resultNacidoVivo == null) {
								// vuelvo a consultar con otro estado
								listRegistroEstado.clear();
								listRegistroEstado.add(JSFUtil.STAT_DAT_DIGERCIG); // 5
								listaParametros.add(new ParametroConsulta("estadoRegistro", listRegistroEstado));

								if (tipoRegistro.equals("D")) {
									resultNacidoVivo = nacidoVivoService.buscarPorCedulaNac(listaParametros);
								} else {
									resultNacidoVivo = nacidoVivoService.buscarPorHistorialNac(listaParametros);
								}
								if (resultNacidoVivo == null) {
									resultadoWS.setCodigoError("007");
									resultadoWS.setDescripcionError("REVIT: No se encontró datos del recién nacido.");

								} else {
									if (resultNacidoVivo.getFkIdEstReg().getIdEstReg() == 5) {
										resultadoWS.setCodigoError("006");
										resultadoWS.setDescripcionError("REVIT: El recién nacido se encuentra inscrito.");
									} else {
										resultadoWS.setCodigoError("007");
										resultadoWS.setDescripcionError("REVIT: No se encontró datos del recién nacido.");
									}
								}

							} else {
								// se busca por madre
								List<NacidoVivoRenavi> listNacidoPorMadre = new ArrayList<>();

								listaParametros.clear();
								listaParametros.add(new ParametroConsulta("statusM", JSFUtil.ESTADO_REG_ACTIVO));
								if (tipoRegistro.equals("D")) {
									listaParametros.add(new ParametroConsulta("cedulNacViv", cedulaNacidoVivo.trim()));
									listaParametros.add(new ParametroConsulta("ceduMad", cedulaMad.trim()));
									listNacidoPorMadre = nacidoVivoService.verificarPorCedulaMad(listaParametros);
								} else {
									listaParametros.add(new ParametroConsulta("numHisNacViv", historialNacidoVivo));
									listaParametros.add(new ParametroConsulta("idMad", new Long(idMadre.trim())));
									listNacidoPorMadre = nacidoVivoService.verificarPorIdMad(listaParametros);
								}

								// se valida los registros asociados a la madre
								if (listNacidoPorMadre.isEmpty()) {
									resultadoWS.setCodigoError("009");
									resultadoWS.setDescripcionError("REVIT: El registro no corresponde con la cédula de la madre.");

								} else {
									SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");

									// se valida datos del padre
									if (cedulaPad.equals("")) {
										cedulaPad = null;
									} else {
										// se busca padre en bdd
										List<ParametroConsulta> paramPadre = new ArrayList<>();
										paramPadre.add(new ParametroConsulta("cedulPad", cedulaPad.trim()));
										PadreRenavi padreResult = padreRenaviService.buscarPorCedula(paramPadre);

										if (padreResult == null) {
											// creo el padre con el numero de cedula dado
											padreResult = new PadreRenavi();
											padreResult.setCedulPad(cedulaPad);
											padreResult.setNombrPad(nombresPad);
											padreResult.setFechaNacimPad(dateFormat.parse(fechaNacimPad));
											// se evalua si se guarda padre en bdd
											if (padreRenaviService.crearPadre(padreResult)) {
												System.out.println("padre creado.");
												resultNacidoVivo.setFkCedulPad(padreResult);
											} else {
												System.out.println("error al crear el padre.");
												padreResult = null;
												resultNacidoVivo.setFkCedulPad(padreResult);
											}
										} else {
											// se asigna padre encontrado
											resultNacidoVivo.setFkCedulPad(padreResult);
										}

									}

									// continuo el proceso
									EstadoRegistroRenavi estadoRegistroInscrito = estadoRegistroService.buscarPorId(
											JSFUtil.STAT_DAT_DIGERCIG);
									if (estadoRegistroInscrito == null) {
										System.out.println("error al consultar el estado de registro");
										resultadoWS.setCodigoError("001");
										resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
									} else {
										resultNacidoVivo.setFkIdEstReg(estadoRegistroInscrito);
										resultNacidoVivo.setFechaInscrNacViv(dateFormat.parse(fechaInscripcion));

										resultNacidoVivo.setProviRcidNacViv(new BigInteger(codProvInscripcion));
										resultNacidoVivo.setProviRcdscNacViv(desProvInscripcion);
										resultNacidoVivo.setCantnRcidNacViv(new BigInteger(codCantInscripcion));
										resultNacidoVivo.setCantnRcdscNacViv(desCantInscripcion);
										resultNacidoVivo.setParrqRcidNacViv(new BigInteger(codParrInscripcion));
										resultNacidoVivo.setPaarqRcdscNacViv(desParrInscripcion);
										resultNacidoVivo.setActaInscrNacViv(actaInscripcion);

										resultNacidoVivo.setNombrInscNacViv(nombresInsc);
										resultNacidoVivo.setApellInscNacViv(apellidosInsc);
										resultNacidoVivo.setFechaActualizacionNacViv(new Date());

										resultNacidoVivo.setCodigoInst(new Integer(codigoInst));
										resultNacidoVivo.setNombreInst(nombreInst);

										//aqui guardo resultNacidoVivo.
										if (nacidoVivoService.editarNacido(resultNacidoVivo)) {
											System.out.println("Registro NacidoVivo actualizado.");
											resultadoWS.setCodigoError("010");
											resultadoWS.setDescripcionError("REVIT: Registro actualizado correctamente.");
										} else {
											System.out.println("Error al actualizar el registro NacidoVivo.");
											resultadoWS.setCodigoError("011");
											resultadoWS.setDescripcionError(
													"REVIT: Ocurrió un error al actualizar el registro nacido vivo. "
															+ resultNacidoVivo.getIdNacViv()
															+ ". Por favor contactarse a " + getEmail() + ".");
										}

									}

								}

							}

						}

					}

				} else {
					resultadoWS.setCodigoError("015");
					resultadoWS.setDescripcionError("Acceso denegado, no tiene el rol para realizar la inscripción.");
				}
			}

		} catch (Exception e) {
			logger.info("Error metodo ws" + e.getCause() + " msg: " + e.getMessage());
			resultadoWS.setCodigoError("001");
			resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
			e.printStackTrace();
		}

		return resultadoWS;
	}

	/**
	 * Permite realizar un cambio de estado del registro que va a ser inscrito
	 * el nuevo estado es 13 INCOMPLETO POR INSCRIBIR
	 * tipoOperacion B = Bloquear / L = Liberar registros
	 * @param userSaureg
	 * @param passwordSaureg
	 * @param idNacidoVivo
	 * @param tipoOperacion
	 * @return
	 */
	@WebMethod(operationName = "bloquearLiberarNacidoVivo")
	public Devolucion bloquearNacidoVivo(
			@WebParam(name = "user") String userSaureg,
			@WebParam(name = "password") String passwordSaureg,
			@WebParam(name = "idNacidoVivo") String idNacidoVivo,
			@WebParam(name = "tipoOperacion") String tipoOperacion){

		resultadoWS = new Devolucion();

		//Se consulta registro nacido vivo
		NacidoVivoRenavi nacidovivoTmp = null; 

		try {
			TblSauregUsuario tblSauregUser = wsInits.getPortWSIntegracion().getUsuario(
					userSaureg, passwordSaureg, getIdWSRevit());
			if (tblSauregUser.getCodError().equals("001")) {
				resultadoWS.setCodigoError("002");
				resultadoWS.setDescripcionError("No hay datos del usuario. Credenciales incorrectas.");
			}else if (tblSauregUser.getCodError().equals("004")) {
				resultadoWS.setCodigoError("012");
				resultadoWS.setDescripcionError("Acceso denegado por falta de privilegios.");
			}else if (tipoOperacion.trim().isEmpty()) {
				resultadoWS.setCodigoError("027");
				resultadoWS.setDescripcionError("Tipo de operación es vacia  o no es valida." );
			}else if (idNacidoVivo.trim().isEmpty()) {
				resultadoWS.setCodigoError("021");
				resultadoWS.setDescripcionError("Código del nacido vivo es requerido");
			}else {
				// valido rol INSCRIPCION
				rolInscripcion = false;
				for (TblSauregRol rolTmp : tblSauregUser.getTblSauregRolList()) {
					if (rolTmp.getDescripcion().equals("INSCRIPCION")) {
						rolInscripcion = true;
						break;
					}
				}

				if (rolInscripcion) {
					nacidovivoTmp = nacidoVivoService.buscarPorIdNacidoVivo(new Long(idNacidoVivo));

					if (nacidovivoTmp != null ){
						//Solo si esta firmado
						if (nacidovivoTmp.getFkIdEstFir().getIdEstFir().equals(JSFUtil.STAT_FIR_CON)) {
							switch (nacidovivoTmp.getFkIdEstReg().getIdEstReg()) {
							case 4:
								// busqueda de registros firmados en proceso de anulación
								List<NacidoVivoRenavi> listRegistrosAnulados = 
								nacidoVivoService.buscarAnuladoPorId(nacidovivoTmp.getIdNacViv());
								if(listRegistrosAnulados.size() > 0) {
									resultadoWS.setCodigoError("nv02");
									resultadoWS.setDescripcionError("REVIT: Registro en proceso anulación, "
											+ "por favor contactarse con el Establecimiento de Salud");
								} else {
									EstadoRegistroRenavi estadoRegistro = null;
																		
									if (tipoOperacion.toUpperCase().equalsIgnoreCase("B")) {
										estadoRegistro = estadoRegistroService.buscarPorId(JSFUtil.ESTADO_BLOQUEO_POR_INSCRIPCION);
										nacidovivoTmp.setFkIdEstReg(estadoRegistro);
										if (nacidoVivoService.editarNacido(nacidovivoTmp)) {
											resultadoWS.setCodigoError("022");
											resultadoWS.setDescripcionError("REVIT: Registro bloqueado correctamente para proceder con la inscripción.");
										} else {
											resultadoWS.setCodigoError("023");
											resultadoWS.setDescripcionError(
													"REVIT: Ocurrió un error al bloquear el registro nacido vivo. "
															+ nacidovivoTmp.getIdNacViv() + ". Por favor contactarse a " + getEmail() + ".");
										}
									}else if (tipoOperacion.toUpperCase().equalsIgnoreCase("L")) {
										resultadoWS.setCodigoError("028");
										resultadoWS.setDescripcionError("REVIT: Registro no se encuentra bloqueado, no es correcto liberar.");
									}else {
										resultadoWS.setCodigoError("027");
										resultadoWS.setDescripcionError("Tipo de operación es vacia  o no es valida." + tipoOperacion.toUpperCase());
									}
								}
								break;
							case 13:
								if (tipoOperacion.toUpperCase().equalsIgnoreCase("B")) {
									resultadoWS.setCodigoError("024");
									resultadoWS.setDescripcionError("REVIT: Registro ya se encuentra bloqueado para inscripción");
								}else if (tipoOperacion.toUpperCase().equalsIgnoreCase("L")) {
									EstadoRegistroRenavi estadoRegistro = null;
									estadoRegistro = estadoRegistroService.buscarPorId(JSFUtil.STAT_DAT_DOCTOR);
									nacidovivoTmp.setFkIdEstReg(estadoRegistro);
									if (nacidoVivoService.editarNacido(nacidovivoTmp)) {
										resultadoWS.setCodigoError("029");
										resultadoWS.setDescripcionError("REVIT: Registro liberado correctamente.");
									} else {
										resultadoWS.setCodigoError("023");
										resultadoWS.setDescripcionError(
												"REVIT: Ocurrió un error al bloquear el registro nacido vivo. "
														+ nacidovivoTmp.getIdNacViv() + ". Por favor contactarse a " + getEmail() + ".");
									}
								}else {
									resultadoWS.setCodigoError("027");
									resultadoWS.setDescripcionError("Tipo de operación es vacia  o no es valida." + tipoOperacion.toUpperCase());
								}
								
								break;

							default:
								resultadoWS.setCodigoError("025");
								resultadoWS.setDescripcionError("REVIT: El estado actual del registro  no permite realizar bloqueo/liberación para la inscripción");
								break;
							}
						}else {
							resultadoWS.setCodigoError("nv04");
							resultadoWS.setDescripcionError("REVIT: Registro incompleto, " 
									+ "registro de nacido vivo sin firma electrónica.");
						}

					}else {
						resultadoWS.setCodigoError("007");
						resultadoWS.setDescripcionError("REVIT: No se encontró datos del recién nacido.");
					}
				}
				else {
					resultadoWS.setCodigoError("015");
					resultadoWS.setDescripcionError("Acceso denegado, no tiene el rol para realizar la inscripción.");
				}

			}

		}catch (NumberFormatException e) {
			resultadoWS.setCodigoError("026");
			resultadoWS.setDescripcionError("Código del nacido vivo debe ser numérico.");
		}
		catch (Exception e) {
			System.out.println("error metodo ws");
			resultadoWS.setCodigoError("001");
			resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
			e.printStackTrace();
		}

		return  resultadoWS;
	}

	
	@WebMethod(operationName="")
	public Devolucion validarCedula(
			@WebParam(name = "user") String userSaureg,
			@WebParam(name = "password") String passwordSaureg,
			@WebParam(name = "cedulaNV") String cedulaNV) {
		
		resultadoWS = new Devolucion();

		//Se consulta registro nacido vivo
		NacidoVivoRenavi nacidovivoTmp = null; 

		try {
			TblSauregUsuario tblSauregUser = wsInits.getPortWSIntegracion().getUsuario(
					userSaureg, passwordSaureg, getIdWSRevit());
			if (tblSauregUser.getCodError().equals("001")) {
				resultadoWS.setCodigoError("002");
				resultadoWS.setDescripcionError("No hay datos del usuario. Credenciales incorrectas.");
			}else if (tblSauregUser.getCodError().equals("004")) {
				resultadoWS.setCodigoError("012");
				resultadoWS.setDescripcionError("Acceso denegado por falta de privilegios.");
			}else if (cedulaNV.trim().isEmpty()) {
				resultadoWS.setCodigoError("030");
				resultadoWS.setDescripcionError("Cédula del nacido vivo es requerida.");
			}else {
				// valido rol INSCRIPCION
				rolConsulta = false;
				for (TblSauregRol rolTmp : tblSauregUser.getTblSauregRolList()) {
					if (rolTmp.getDescripcion().equals("CONSULTA")) {
						rolConsulta = true;
						break;
					}
				}

				if (rolConsulta) {
					/*List<ParametroConsulta> parametros = new ArrayList<>();
	                parametros.add(new ParametroConsulta("cedulNacViv", cedulaNV));
	                parametros.add(new ParametroConsulta("status", "A"));*/
					nacidovivoTmp = nacidoVivoService.buscarPorCedulaNacSinEstado(cedulaNV);
					if (nacidovivoTmp != null ){
						resultadoWS.setCodigoError("001");
						resultadoWS.setDescripcionError("Datos encontrados del nacido vivo..");
					}else {
						resultadoWS.setCodigoError("000");
						resultadoWS.setDescripcionError("REVIT: No se encontró datos del nacido vivo.");
					}
				}else {
					resultadoWS.setCodigoError("015");
					resultadoWS.setDescripcionError("Acceso denegado, no tiene el rol para realizar la inscripción.");
				}
			}	
		}catch (Exception e) {
					System.out.println("error metodo ws");
					resultadoWS.setCodigoError("001");
					resultadoWS.setDescripcionError("Error en la ejecucion del web service.");
					e.printStackTrace();
				}
		return resultadoWS;
	}
	
	@WebMethod(operationName = "getPing")
	public String getPing() {
		return "wsrevit OK!";
	}
	
	
	

	/** metodos para traer parametros de BDD
	 ** metodo para traer direccion email**/
	private String getEmail() {
		// se consulta email en BDD
		String emailSoporTIC = variableService.buscarPorNombre("EMAIL_SOPORTIC");

		// se valida si se obtuvo valor de BDD
		if(emailSoporTIC.equals("")) {
			emailSoporTIC = "soportic@registrocivil.gob.ec";
		}
		return emailSoporTIC;
	}

	/** metodo para traer id de sistema WSRevit**/
	private String getIdWSRevit() {
		String idWSRevitSistema = null;
		try {
			idWSRevitSistema = variableService.buscarPorNombre("WSREVIT_ID_SIS");
			if(idWSRevitSistema.equals("") || idWSRevitSistema == null) {
				idWSRevitSistema = "262";
			}
		} catch (Exception e) {
			logger.error("REVIT: CONSULTAR VARIABLE WSREVIT_ID_SIS " , e.getCause());
			e.printStackTrace();
		}
		return idWSRevitSistema;
	}

}
