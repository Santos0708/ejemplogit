package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "NACIDO_VIVO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "NacidoVivoRenavi.findAll", query = "SELECT n FROM NacidoVivoRenavi n"),
		@NamedQuery(name = "NacidoVivoRenavi.findByIdNacViv", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.idNacViv = :idNacViv"),
		@NamedQuery(name = "NacidoVivoRenavi.findByCedulNacViv", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.cedulNacViv = :cedulNacViv AND n.status = :status AND n.fkIdEstReg.idEstReg IN :estadoRegistro"),
		@NamedQuery(name = "NacidoVivoRenavi.findByNombrNacViv", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.nombrNacViv = :nombrNacViv"),
		@NamedQuery(name = "NacidoVivoRenavi.findByApellNacViv", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.apellNacViv = :apellNacViv"),
		// Por Fabricio cambio para busqueda por idMadre y pasaporteMadre
		// 27-01-2016
		@NamedQuery(name = "NacidoVivoRenavi.findByIdMad", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.idMad = :idMad AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByPasapMad", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.pasapMad = :pasapMad AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByNacVivHistorial", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.numeroHistoriaNacViv = :numeroHistoriaNacViv AND n.status = :status AND n.fkIdEstReg.idEstReg IN :estadoRegistro"),
		/// nueva consulta para validar si el recien nacido corresponde al
		/// codigo de la madre
		@NamedQuery(name = "NacidoVivoRenavi.verifyByIdMadre", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.idMad = :idMad AND n.numeroHistoriaNacViv = :numHisNacViv AND n.status = :statusM"),
		@NamedQuery(name = "NacidoVivoRenavi.verifyByCedulMadre", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.cedulMad = :ceduMad AND n.cedulNacViv = :cedulNacViv AND n.status = :statusM"),
		// Por Daniel
		@NamedQuery(name = "NacidoVivoRenavi.findByCedulMad", query = "SELECT n FROM NacidoVivoRenavi n JOIN FETCH n.fkIdEstCivMad JOIN FETCH n.fkIdNacMad JOIN FETCH n.fkIdSexoNv JOIN FETCH n.fkIdEstFir WHERE n.fkCedulMad.cedulMad = :cedulMad AND n.fkCedulMad.status = :statusM  AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByNumeroHistoriaNacViv", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.numeroHistoriaNacViv = :numeroHistoriaNacViv AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN (SELECT ef.idEstFir FROM EstadoFirmaRenavi ef WHERE ef.idEstFir IN :estFirma) AND n.fkIdEstReg.idEstReg IN (SELECT er.idEstReg FROM EstadoRegistroRenavi er WHERE er.idEstReg IN :estRegistro) ORDER BY n.fechaCreacionNacViv DESC"), 
		// SS busca por madre cedula, pasaporte, idmadre y agencia
		//19012018 1435
		@NamedQuery(name = "NacidoVivoRenavi.findByCedulMadIdAgencia", query = "SELECT n FROM NacidoVivoRenavi n JOIN FETCH n.fkIdEstCivMad JOIN FETCH n.fkIdNacMad JOIN FETCH n.fkIdSexoNv JOIN FETCH n.fkIdEstFir WHERE n.fkCedulMad.cedulMad = :cedulMad AND n.fkCedulMad.status = :statusM  AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro AND n.fkAgenciaSaureg  = :codigoAgencia ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByPasapMadIdAgencia", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.pasapMad = :pasapMad AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro AND n.fkAgenciaSaureg  = :codigoAgencia ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByIdMadIdAgencia", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.fkCedulMad.idMad = :idMad AND n.status = :statusNV AND n.fkIdEstFir.idEstFir IN :estFirma AND n.fkIdEstReg.idEstReg IN :estRegistro AND n.fkAgenciaSaureg  = :codigoAgencia ORDER BY n.fechaCreacionNacViv DESC"),
		@NamedQuery(name = "NacidoVivoRenavi.findByCedulNacVivSinEstado", query = "SELECT n FROM NacidoVivoRenavi n WHERE n.cedulNacViv = :cedulNacViv AND n.status = :status")
})
		
public class NacidoVivoRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "SEQ_RENAVI_NACIDO_VIVO", sequenceName = "SEQ_RENAVI_NACIDO_VIVO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RENAVI_NACIDO_VIVO")
	@Basic(optional = false)
	@NotNull(message = "ingrese ID_NAC_VIV")
	@Column(name = "ID_NAC_VIV")
	private Long idNacViv;
	@Size(max = 12)
	@Column(name = "CEDUL_NAC_VIV")
	private String cedulNacViv;
	@Size(max = 50)
	@Column(name = "NOMBR_NAC_VIV")
	private String nombrNacViv;
	@Size(max = 50)
	@Column(name = "APELL_NAC_VIV")
	private String apellNacViv;
	@Column(name = "FECHA_INSCR_NAC_VIV")
	@Temporal(TemporalType.DATE)
	private Date fechaInscrNacViv;
	@Column(name = "TALLA_NAC_VIV")
	private Short tallaNacViv;
	@Size(max = 50)
	@Column(name = "ACTA_INSCR_NAC_VIV")
	private String actaInscrNacViv;
	@Column(name = "PESO_NAC_VIV")
	private Short pesoNacViv;
	@Column(name = "SEMAN_GSTCN_NAC_VIV")
	private Short semanGstcnNacViv;
	@Column(name = "FECHA_NACIM_NAC_VIV")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimNacViv;
	@Size(max = 6)
	@Column(name = "CAMPO_INEC_RC_PCP_NAC_VIV")
	private String campoInecRcPcpNacViv;
	@Size(max = 2)
	@Column(name = "CAMPO_INEC_RC_OFI_NAC_VIV")
	private String campoInecRcOfiNacViv;
	@Size(max = 13)
	@Column(name = "PASAP_NAC_VIV")
	private String pasapNacViv;
	@Column(name = "NUMER_PARTO_NAC_VIV")
	private Short numerPartoNacViv;
	@Column(name = "CNTRL_PRNTL_NAC_VIV")
	private Short cntrlPrntlNacViv;
	@Column(name = "PROVI_RCID_NAC_VIV")
	private BigInteger proviRcidNacViv;
	@Size(max = 30)
	@Column(name = "PROVI_RCDSC_NAC_VIV")
	private String proviRcdscNacViv;
	@Column(name = "CANTN_RCID_NAC_VIV")
	private BigInteger cantnRcidNacViv;
	@Size(max = 30)
	@Column(name = "CANTN_RCDSC_NAC_VIV")
	private String cantnRcdscNacViv;
	@Column(name = "PARRQ_RCID_NAC_VIV")
	private BigInteger parrqRcidNacViv;
	@Size(max = 30)
	@Column(name = "PAARQ_RCDSC_NAC_VIV")
	private String paarqRcdscNacViv;
	@Size(max = 2000)
	@Column(name = "OBSRV_ATPRT_NAC_VIV")
	private String obsrvAtprtNacViv;
	@Column(name = "ANIO_INSCR_NAC_VIV")
	private Short anioInscrNacViv;
	@Column(name = "MES_INSCR_NAC_VIV")
	private Short mesInscrNacViv;
	@Column(name = "DIA_INSCR_NAC_VIV")
	private Short diaInscrNacViv;
	@Column(name = "ANIO_NACIM_NAC_VIV")
	private Short anioNacimNacViv;
	@Column(name = "MES_NACIM_NAC_VIV")
	private Short mesNacimNacViv;
	@Column(name = "DIA_NACIM_NAC_VIV")
	private Short diaNacimNacViv;
	@Size(max = 70)
	@Column(name = "LUG_NAC_ESPECIFIQUE")
	private String lugNacEspecifique;
	@Size(max = 70)
	@Column(name = "TIP_ASI_ESPECIFIQUE")
	private String tipAsiEspecifique;
	@Column(name = "EDAD_MAD")
	private Short edadMad;
	@Lob
	@Column(name = "FOTO_MAD")
	private byte[] fotoMad;
	@Size(max = 100)
	@Column(name = "CONDIC_CED_MAD")
	private String condicCedMad;
	@Size(max = 120)
	@Column(name = "CONYUGE_MAD")
	private String conyugeMad;
	@Size(max = 30)
	@Column(name = "FEC_FALLEC_MAD")
	private String fecFallecMad;
	@Column(name = "HIJOS_VIVSA_MAD")
	private Short hijosVivsaMad;
	@Column(name = "HIJOS_NVMRT_MAD")
	private Short hijosNvmrtMad;
	@Column(name = "HIJOS_NMRTS_MAD")
	private Short hijosNmrtsMad;
	@Size(max = 2)
	@Column(name = "RESIDN_PROVID_MAD")
	private String residnProvidMad;
	@Size(max = 50)
	@Column(name = "RESIDN_PROVDS_MAD")
	private String residnProvdsMad;
	@Size(max = 4)
	@Column(name = "RESIDN_CANTID_MAD")
	private String residnCantidMad;
	@Size(max = 50)
	@Column(name = "RESIDN_CANTDS_MAD")
	private String residnCantdsMad;
	@Size(max = 6)
	@Column(name = "RESIDN_PARRID_MAD")
	private String residnParridMad;
	@Size(max = 50)
	@Column(name = "RESIDN_PARRDS_MAD")
	private String residnParrdsMad;
	@Size(max = 50)
	@Column(name = "RESIDN_LOCAL_MAD")
	private String residnLocalMad;
	@Size(max = 50)
	@Column(name = "RESIDN_DIREC_MAD")
	private String residnDirecMad;
	@Size(max = 2)
	@Column(name = "CAMPO_INEC_COD_PAIS_MAD")
	private String campoInecCodPaisMad;
	@Size(max = 10)
	@Column(name = "CAMPO_INEC_AREA_MAD")
	private String campoInecAreaMad;
	@Basic(optional = false)
	@NotNull(message = "ingrese FECHA_CREACION_NAC_VIV")
	@Column(name = "FECHA_CREACION_NAC_VIV")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionNacViv;
	@Size(max = 500)
	@Column(name = "OBSRV_ESTADO_MAD")
	private String obsrvEstadoMad;
	@Size(max = 1)
	@Column(name = "STATUS")
	private String status;
	@Column(name = "NUMERO_PRODUCTO_NAC_VIV")
	private Short numeroProductoNacViv;
	@Size(max = 20)
	@Column(name = "SEXO_MAD")
	private String sexoMad;
	@Lob
	@Column(name = "PDF_SIN_FIRMA_NAC_VIV")
	private byte[] pdfSinFirmaNacViv;
	@Lob
	@Column(name = "PDF_CON_FIRMA_NAC_VIV")
	private byte[] pdfConFirmaNacViv;
	@Column(name = "NUM_PARTO_SISTEMA")
	private Short numPartoSistema;
	@Column(name = "HIJOS_NACIERVIV_SISTEMA")
	private Short hijosNaciervivSistema;
	@Column(name = "HIJOS_NACIERMUERT_SISTEMA")
	private Short hijosNaciermuertSistema;
	@Size(max = 15)
	@Column(name = "FK_USU_SAUREG")
	private String fkUsuSaureg;
	@Column(name = "FK_AGENCIA_SAUREG")
	private String fkAgenciaSaureg;
	@Size(max = 15)
	@Column(name = "FK_USU_FIRMA_SAUREG")
	private String fkUsuFirmaSaureg;
	@Column(name = "FK_AGENCIA_FIRMA_SAUREG")
	private Long fkAgenciaFirmaSaureg;
	@Column(name = "FECHA_FIRMA_NAC_VIV")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFirmaNacViv;
	@Column(name = "NUMERO_EMBARAZOS_MAD")
	private Short numeroEmbarazosMad;
	@Column(name = "APGAR1_NAC_VIV")
	private Short apgar1NacViv;
	@Column(name = "APGAR2_NAC_VIV")
	private Short apgar2NacViv;
	@Size(max = 50)
	@Column(name = "NOMBR_INSC_NAC_VIV")
	private String nombrInscNacViv;
	@Size(max = 50)
	@Column(name = "APELL_INSC_NAC_VIV")
	private String apellInscNacViv;
	@Column(name = "FECHA_ACTUALIZACION_NAC_VIV")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaActualizacionNacViv;
	@Size(max = 20)
	@Column(name = "NUMERO_HISTORIA_NAC_VIV")
	private String numeroHistoriaNacViv;
	@Size(max = 500)
	@Column(name = "OBSRV_NAC_VIV")
	private String obsrvNacViv;
	@Size(max = 20)
	@Column(name = "CODIGO_RC_NAC_VIV")
	private String codigoRcNacViv;
	@JoinColumn(name = "FK_ID_PAIS_RESIDN_MAD", referencedColumnName = "ID_PAIS")
	@ManyToOne(fetch = FetchType.LAZY)
	private PaisRenavi fkIdPaisResidnMad;
	@OneToMany(mappedBy = "fkCedNacViv", fetch = FetchType.LAZY)
	private List<Anulacion> anulacionList;
	@JoinColumn(name = "FK_ID_TIP_PAR", referencedColumnName = "ID_TIP_PAR")
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoPartoRenavi fkIdTipPar;
	@JoinColumn(name = "FK_ID_TIP_INS", referencedColumnName = "ID_TIP_INS")
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoInscripcionRenavi fkIdTipIns;
	@JoinColumn(name = "FK_ID_TIPO_AREA_MAD", referencedColumnName = "ID_TIP_AREA")
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoAreaRenavi fkIdTipoAreaMad;
	@JoinColumn(name = "FK_ID_SABE_LEER_MAD", referencedColumnName = "ID_ALFB")
	@ManyToOne(fetch = FetchType.LAZY)
	private AlfabetismoRenavi fkIdSabeLeerMad;
	@JoinColumn(name = "FK_ID_EST_CIV_MAD", referencedColumnName = "ID_EST_CIV")
	@ManyToOne(fetch = FetchType.LAZY)
	private EstadoCivilRenavi fkIdEstCivMad;
	@JoinColumn(name = "FK_ID_EST_FIR", referencedColumnName = "ID_EST_FIR")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private EstadoFirmaRenavi fkIdEstFir;
	@JoinColumn(name = "FK_ID_EST_REG", referencedColumnName = "ID_EST_REG")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private EstadoRegistroRenavi fkIdEstReg;
	@JoinColumn(name = "FK_ID_IDE_ETN_MAD", referencedColumnName = "ID_IDE_ETN")
	@ManyToOne(fetch = FetchType.LAZY)
	private IdentificacionEtnicaRenavi fkIdIdeEtnMad;
	@JoinColumn(name = "FK_CEDUL_MAD", referencedColumnName = "ID_MAD")
	@ManyToOne(fetch = FetchType.LAZY)
	private MadreRenavi fkCedulMad;
	@JoinColumn(name = "FK_ID_NAC_MAD", referencedColumnName = "ID_NAC")
	@ManyToOne(fetch = FetchType.LAZY)
	private NacionalidadRenavi fkIdNacMad;
	@JoinColumn(name = "FK_ID_NIVEL_INSTR", referencedColumnName = "ID_NIV_INS")
	@ManyToOne(fetch = FetchType.LAZY)
	private NivelInstruccionRenavi fkIdNivelInstr;
	@JoinColumn(name = "FK_CEDUL_PAD", referencedColumnName = "ID_PAD")
	@ManyToOne(fetch = FetchType.LAZY)
	private PadreRenavi fkCedulPad;
	@JoinColumn(name = "FK_ID_PAIS_MAD", referencedColumnName = "ID_PAIS")
	@ManyToOne(fetch = FetchType.LAZY)
	private PaisRenavi fkIdPaisMad;
	@JoinColumn(name = "FK_ID_PRO_EMB", referencedColumnName = "ID_PRO_EMB")
	@ManyToOne(fetch = FetchType.LAZY)
	private ProductoEmbarazoRenavi fkIdProEmb;
	@JoinColumn(name = "FK_ID_SEXO_NV", referencedColumnName = "ID_SEXO")
	@ManyToOne(fetch = FetchType.LAZY)
	private SexoRenavi fkIdSexoNv;
	/*
	 * cambio para registro de institucion donde fue inscrito FWTM 01-02-2016
	 * nuevos campo para registro de la institucion donde se inscribe
	 * (codigoInst, nombreInst)
	 */
	@Column(name = "CODIGO_INST")
	private Integer codigoInst;
	@Size(max = 50)
	@Column(name = "NOMBRE_INST")
	private String nombreInst;
	@Column(name = "MALFOMACIONES_NAC_VIV")
	private String malformacionesConge;
	
	@Column(name = "PARTO_CASA")
    private String partoEnCasa;

	
	public NacidoVivoRenavi() {
	}

	/*
	 * cambio para registro de institucion donde fue inscrito FWTM 01-02-2016
	 * nuevos campos para registro de la institucion donde se inscribe
	 * (codigoInst, nombreInst)
	 */
	public void setCodigoInst(Integer codigoInst) {
		this.codigoInst = codigoInst;
	}

	public Integer getCodigoInst() {
		return codigoInst;
	}

	public void setNombreInst(String nombreInst) {
		this.nombreInst = nombreInst;
	}

	public String getNombreInst() {
		return nombreInst;
	}
	////

	public NacidoVivoRenavi(Long idNacViv) {
		this.idNacViv = idNacViv;
	}

	public NacidoVivoRenavi(Long idNacViv, Date fechaCreacionNacViv) {
		this.idNacViv = idNacViv;
		this.fechaCreacionNacViv = fechaCreacionNacViv;
	}

	public Long getIdNacViv() {
		return idNacViv;
	}

	public void setIdNacViv(Long idNacViv) {
		this.idNacViv = idNacViv;
	}

	public String getCedulNacViv() {
		return cedulNacViv;
	}

	public void setCedulNacViv(String cedulNacViv) {
		this.cedulNacViv = cedulNacViv;
	}

	public String getNombrNacViv() {
		return nombrNacViv;
	}

	public void setNombrNacViv(String nombrNacViv) {
		this.nombrNacViv = nombrNacViv;
	}

	public String getApellNacViv() {
		return apellNacViv;
	}

	public void setApellNacViv(String apellNacViv) {
		this.apellNacViv = apellNacViv;
	}

	public Date getFechaInscrNacViv() {
		return fechaInscrNacViv;
	}

	public void setFechaInscrNacViv(Date fechaInscrNacViv) {
		this.fechaInscrNacViv = fechaInscrNacViv;
	}

	public Short getTallaNacViv() {
		return tallaNacViv;
	}

	public void setTallaNacViv(Short tallaNacViv) {
		this.tallaNacViv = tallaNacViv;
	}

	public String getActaInscrNacViv() {
		return actaInscrNacViv;
	}

	public void setActaInscrNacViv(String actaInscrNacViv) {
		this.actaInscrNacViv = actaInscrNacViv;
	}

	public Short getPesoNacViv() {
		return pesoNacViv;
	}

	public void setPesoNacViv(Short pesoNacViv) {
		this.pesoNacViv = pesoNacViv;
	}

	public Short getSemanGstcnNacViv() {
		return semanGstcnNacViv;
	}

	public void setSemanGstcnNacViv(Short semanGstcnNacViv) {
		this.semanGstcnNacViv = semanGstcnNacViv;
	}

	public Date getFechaNacimNacViv() {
		return fechaNacimNacViv;
	}

	public void setFechaNacimNacViv(Date fechaNacimNacViv) {
		this.fechaNacimNacViv = fechaNacimNacViv;
	}

	public String getCampoInecRcPcpNacViv() {
		return campoInecRcPcpNacViv;
	}

	public void setCampoInecRcPcpNacViv(String campoInecRcPcpNacViv) {
		this.campoInecRcPcpNacViv = campoInecRcPcpNacViv;
	}

	public String getCampoInecRcOfiNacViv() {
		return campoInecRcOfiNacViv;
	}

	public void setCampoInecRcOfiNacViv(String campoInecRcOfiNacViv) {
		this.campoInecRcOfiNacViv = campoInecRcOfiNacViv;
	}

	public String getPasapNacViv() {
		return pasapNacViv;
	}

	public void setPasapNacViv(String pasapNacViv) {
		this.pasapNacViv = pasapNacViv;
	}

	public Short getNumerPartoNacViv() {
		return numerPartoNacViv;
	}

	public void setNumerPartoNacViv(Short numerPartoNacViv) {
		this.numerPartoNacViv = numerPartoNacViv;
	}

	public Short getCntrlPrntlNacViv() {
		return cntrlPrntlNacViv;
	}

	public void setCntrlPrntlNacViv(Short cntrlPrntlNacViv) {
		this.cntrlPrntlNacViv = cntrlPrntlNacViv;
	}

	public BigInteger getProviRcidNacViv() {
		return proviRcidNacViv;
	}

	public void setProviRcidNacViv(BigInteger proviRcidNacViv) {
		this.proviRcidNacViv = proviRcidNacViv;
	}

	public String getProviRcdscNacViv() {
		return proviRcdscNacViv;
	}

	public void setProviRcdscNacViv(String proviRcdscNacViv) {
		this.proviRcdscNacViv = proviRcdscNacViv;
	}

	public BigInteger getCantnRcidNacViv() {
		return cantnRcidNacViv;
	}

	public void setCantnRcidNacViv(BigInteger cantnRcidNacViv) {
		this.cantnRcidNacViv = cantnRcidNacViv;
	}

	public String getCantnRcdscNacViv() {
		return cantnRcdscNacViv;
	}

	public void setCantnRcdscNacViv(String cantnRcdscNacViv) {
		this.cantnRcdscNacViv = cantnRcdscNacViv;
	}

	public BigInteger getParrqRcidNacViv() {
		return parrqRcidNacViv;
	}

	public void setParrqRcidNacViv(BigInteger parrqRcidNacViv) {
		this.parrqRcidNacViv = parrqRcidNacViv;
	}

	public String getPaarqRcdscNacViv() {
		return paarqRcdscNacViv;
	}

	public void setPaarqRcdscNacViv(String paarqRcdscNacViv) {
		this.paarqRcdscNacViv = paarqRcdscNacViv;
	}

	public String getObsrvAtprtNacViv() {
		return obsrvAtprtNacViv;
	}

	public void setObsrvAtprtNacViv(String obsrvAtprtNacViv) {
		this.obsrvAtprtNacViv = obsrvAtprtNacViv;
	}

	public Short getAnioInscrNacViv() {
		return anioInscrNacViv;
	}

	public void setAnioInscrNacViv(Short anioInscrNacViv) {
		this.anioInscrNacViv = anioInscrNacViv;
	}

	public Short getMesInscrNacViv() {
		return mesInscrNacViv;
	}

	public void setMesInscrNacViv(Short mesInscrNacViv) {
		this.mesInscrNacViv = mesInscrNacViv;
	}

	public Short getDiaInscrNacViv() {
		return diaInscrNacViv;
	}

	public void setDiaInscrNacViv(Short diaInscrNacViv) {
		this.diaInscrNacViv = diaInscrNacViv;
	}

	public Short getAnioNacimNacViv() {
		return anioNacimNacViv;
	}

	public void setAnioNacimNacViv(Short anioNacimNacViv) {
		this.anioNacimNacViv = anioNacimNacViv;
	}

	public Short getMesNacimNacViv() {
		return mesNacimNacViv;
	}

	public void setMesNacimNacViv(Short mesNacimNacViv) {
		this.mesNacimNacViv = mesNacimNacViv;
	}

	public Short getDiaNacimNacViv() {
		return diaNacimNacViv;
	}

	public void setDiaNacimNacViv(Short diaNacimNacViv) {
		this.diaNacimNacViv = diaNacimNacViv;
	}

	public String getLugNacEspecifique() {
		return lugNacEspecifique;
	}

	public void setLugNacEspecifique(String lugNacEspecifique) {
		this.lugNacEspecifique = lugNacEspecifique;
	}

	public String getTipAsiEspecifique() {
		return tipAsiEspecifique;
	}

	public void setTipAsiEspecifique(String tipAsiEspecifique) {
		this.tipAsiEspecifique = tipAsiEspecifique;
	}

	public Short getEdadMad() {
		return edadMad;
	}

	public void setEdadMad(Short edadMad) {
		this.edadMad = edadMad;
	}

	public byte[] getFotoMad() {
		return fotoMad;
	}

	public void setFotoMad(byte[] fotoMad) {
		this.fotoMad = fotoMad;
	}

	public String getCondicCedMad() {
		return condicCedMad;
	}

	public void setCondicCedMad(String condicCedMad) {
		this.condicCedMad = condicCedMad;
	}

	public String getConyugeMad() {
		return conyugeMad;
	}

	public void setConyugeMad(String conyugeMad) {
		this.conyugeMad = conyugeMad;
	}

	public String getFecFallecMad() {
		return fecFallecMad;
	}

	public void setFecFallecMad(String fecFallecMad) {
		this.fecFallecMad = fecFallecMad;
	}

	public Short getHijosVivsaMad() {
		return hijosVivsaMad;
	}

	public void setHijosVivsaMad(Short hijosVivsaMad) {
		this.hijosVivsaMad = hijosVivsaMad;
	}

	public Short getHijosNvmrtMad() {
		return hijosNvmrtMad;
	}

	public void setHijosNvmrtMad(Short hijosNvmrtMad) {
		this.hijosNvmrtMad = hijosNvmrtMad;
	}

	public Short getHijosNmrtsMad() {
		return hijosNmrtsMad;
	}

	public void setHijosNmrtsMad(Short hijosNmrtsMad) {
		this.hijosNmrtsMad = hijosNmrtsMad;
	}

	public String getResidnProvidMad() {
		return residnProvidMad;
	}

	public void setResidnProvidMad(String residnProvidMad) {
		this.residnProvidMad = residnProvidMad;
	}

	public String getResidnProvdsMad() {
		return residnProvdsMad;
	}

	public void setResidnProvdsMad(String residnProvdsMad) {
		this.residnProvdsMad = residnProvdsMad;
	}

	public String getResidnCantidMad() {
		return residnCantidMad;
	}

	public void setResidnCantidMad(String residnCantidMad) {
		this.residnCantidMad = residnCantidMad;
	}

	public String getResidnCantdsMad() {
		return residnCantdsMad;
	}

	public void setResidnCantdsMad(String residnCantdsMad) {
		this.residnCantdsMad = residnCantdsMad;
	}

	public String getResidnParridMad() {
		return residnParridMad;
	}

	public void setResidnParridMad(String residnParridMad) {
		this.residnParridMad = residnParridMad;
	}

	public String getResidnParrdsMad() {
		return residnParrdsMad;
	}

	public void setResidnParrdsMad(String residnParrdsMad) {
		this.residnParrdsMad = residnParrdsMad;
	}

	public String getResidnLocalMad() {
		return residnLocalMad;
	}

	public void setResidnLocalMad(String residnLocalMad) {
		this.residnLocalMad = residnLocalMad;
	}

	public String getResidnDirecMad() {
		return residnDirecMad;
	}

	public void setResidnDirecMad(String residnDirecMad) {
		this.residnDirecMad = residnDirecMad;
	}

	public String getCampoInecCodPaisMad() {
		return campoInecCodPaisMad;
	}

	public void setCampoInecCodPaisMad(String campoInecCodPaisMad) {
		this.campoInecCodPaisMad = campoInecCodPaisMad;
	}

	public String getCampoInecAreaMad() {
		return campoInecAreaMad;
	}

	public void setCampoInecAreaMad(String campoInecAreaMad) {
		this.campoInecAreaMad = campoInecAreaMad;
	}

	public Date getFechaCreacionNacViv() {
		return fechaCreacionNacViv;
	}

	public void setFechaCreacionNacViv(Date fechaCreacionNacViv) {
		this.fechaCreacionNacViv = fechaCreacionNacViv;
	}

	public String getObsrvEstadoMad() {
		return obsrvEstadoMad;
	}

	public void setObsrvEstadoMad(String obsrvEstadoMad) {
		this.obsrvEstadoMad = obsrvEstadoMad;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Short getNumeroProductoNacViv() {
		return numeroProductoNacViv;
	}

	public void setNumeroProductoNacViv(Short numeroProductoNacViv) {
		this.numeroProductoNacViv = numeroProductoNacViv;
	}

	public String getSexoMad() {
		return sexoMad;
	}

	public void setSexoMad(String sexoMad) {
		this.sexoMad = sexoMad;
	}

	public byte[] getPdfSinFirmaNacViv() {
		return pdfSinFirmaNacViv;
	}

	public void setPdfSinFirmaNacViv(byte[] pdfSinFirmaNacViv) {
		this.pdfSinFirmaNacViv = pdfSinFirmaNacViv;
	}

	public byte[] getPdfConFirmaNacViv() {
		return pdfConFirmaNacViv;
	}

	public void setPdfConFirmaNacViv(byte[] pdfConFirmaNacViv) {
		this.pdfConFirmaNacViv = pdfConFirmaNacViv;
	}

	public Short getNumPartoSistema() {
		return numPartoSistema;
	}

	public void setNumPartoSistema(Short numPartoSistema) {
		this.numPartoSistema = numPartoSistema;
	}

	public Short getHijosNaciervivSistema() {
		return hijosNaciervivSistema;
	}

	public void setHijosNaciervivSistema(Short hijosNaciervivSistema) {
		this.hijosNaciervivSistema = hijosNaciervivSistema;
	}

	public Short getHijosNaciermuertSistema() {
		return hijosNaciermuertSistema;
	}

	public void setHijosNaciermuertSistema(Short hijosNaciermuertSistema) {
		this.hijosNaciermuertSistema = hijosNaciermuertSistema;
	}

	public String getFkUsuSaureg() {
		return fkUsuSaureg;
	}

	public void setFkUsuSaureg(String fkUsuSaureg) {
		this.fkUsuSaureg = fkUsuSaureg;
	}

	public String getFkAgenciaSaureg() {
		return fkAgenciaSaureg;
	}

	public void setFkAgenciaSaureg(String fkAgenciaSaureg) {
		this.fkAgenciaSaureg = fkAgenciaSaureg;
	}

	public String getFkUsuFirmaSaureg() {
		return fkUsuFirmaSaureg;
	}

	public void setFkUsuFirmaSaureg(String fkUsuFirmaSaureg) {
		this.fkUsuFirmaSaureg = fkUsuFirmaSaureg;
	}

	public Long getFkAgenciaFirmaSaureg() {
		return fkAgenciaFirmaSaureg;
	}

	public void setFkAgenciaFirmaSaureg(Long fkAgenciaFirmaSaureg) {
		this.fkAgenciaFirmaSaureg = fkAgenciaFirmaSaureg;
	}

	public Date getFechaFirmaNacViv() {
		return fechaFirmaNacViv;
	}

	public void setFechaFirmaNacViv(Date fechaFirmaNacViv) {
		this.fechaFirmaNacViv = fechaFirmaNacViv;
	}

	public Short getNumeroEmbarazosMad() {
		return numeroEmbarazosMad;
	}

	public void setNumeroEmbarazosMad(Short numeroEmbarazosMad) {
		this.numeroEmbarazosMad = numeroEmbarazosMad;
	}

	public Short getApgar1NacViv() {
		return apgar1NacViv;
	}

	public void setApgar1NacViv(Short apgar1NacViv) {
		this.apgar1NacViv = apgar1NacViv;
	}

	public Short getApgar2NacViv() {
		return apgar2NacViv;
	}

	public void setApgar2NacViv(Short apgar2NacViv) {
		this.apgar2NacViv = apgar2NacViv;
	}

	public String getNombrInscNacViv() {
		return nombrInscNacViv;
	}

	public void setNombrInscNacViv(String nombrInscNacViv) {
		this.nombrInscNacViv = nombrInscNacViv;
	}

	public String getApellInscNacViv() {
		return apellInscNacViv;
	}

	public void setApellInscNacViv(String apellInscNacViv) {
		this.apellInscNacViv = apellInscNacViv;
	}

	public Date getFechaActualizacionNacViv() {
		return fechaActualizacionNacViv;
	}

	public void setFechaActualizacionNacViv(Date fechaActualizacionNacViv) {
		this.fechaActualizacionNacViv = fechaActualizacionNacViv;
	}

	@XmlTransient
	public List<Anulacion> getAnulacionList() {
		return anulacionList;
	}

	public void setAnulacionList(List<Anulacion> anulacionList) {
		this.anulacionList = anulacionList;
	}

	public TipoPartoRenavi getFkIdTipPar() {
		return fkIdTipPar;
	}

	public void setFkIdTipPar(TipoPartoRenavi fkIdTipPar) {
		this.fkIdTipPar = fkIdTipPar;
	}

	public TipoInscripcionRenavi getFkIdTipIns() {
		return fkIdTipIns;
	}

	public void setFkIdTipIns(TipoInscripcionRenavi fkIdTipIns) {
		this.fkIdTipIns = fkIdTipIns;
	}

	public TipoAreaRenavi getFkIdTipoAreaMad() {
		return fkIdTipoAreaMad;
	}

	public void setFkIdTipoAreaMad(TipoAreaRenavi fkIdTipoAreaMad) {
		this.fkIdTipoAreaMad = fkIdTipoAreaMad;
	}

	public AlfabetismoRenavi getFkIdSabeLeerMad() {
		return fkIdSabeLeerMad;
	}

	public void setFkIdSabeLeerMad(AlfabetismoRenavi fkIdSabeLeerMad) {
		this.fkIdSabeLeerMad = fkIdSabeLeerMad;
	}

	public EstadoCivilRenavi getFkIdEstCivMad() {
		return fkIdEstCivMad;
	}

	public void setFkIdEstCivMad(EstadoCivilRenavi fkIdEstCivMad) {
		this.fkIdEstCivMad = fkIdEstCivMad;
	}

	public EstadoFirmaRenavi getFkIdEstFir() {
		return fkIdEstFir;
	}

	public void setFkIdEstFir(EstadoFirmaRenavi fkIdEstFir) {
		this.fkIdEstFir = fkIdEstFir;
	}

	public EstadoRegistroRenavi getFkIdEstReg() {
		return fkIdEstReg;
	}

	public void setFkIdEstReg(EstadoRegistroRenavi fkIdEstReg) {
		this.fkIdEstReg = fkIdEstReg;
	}

	public IdentificacionEtnicaRenavi getFkIdIdeEtnMad() {
		return fkIdIdeEtnMad;
	}

	public void setFkIdIdeEtnMad(IdentificacionEtnicaRenavi fkIdIdeEtnMad) {
		this.fkIdIdeEtnMad = fkIdIdeEtnMad;
	}

	public MadreRenavi getFkCedulMad() {
		return fkCedulMad;
	}

	public void setFkCedulMad(MadreRenavi fkCedulMad) {
		this.fkCedulMad = fkCedulMad;
	}

	public NacionalidadRenavi getFkIdNacMad() {
		return fkIdNacMad;
	}

	public void setFkIdNacMad(NacionalidadRenavi fkIdNacMad) {
		this.fkIdNacMad = fkIdNacMad;
	}

	public NivelInstruccionRenavi getFkIdNivelInstr() {
		return fkIdNivelInstr;
	}

	public void setFkIdNivelInstr(NivelInstruccionRenavi fkIdNivelInstr) {
		this.fkIdNivelInstr = fkIdNivelInstr;
	}

	public PadreRenavi getFkCedulPad() {
		return fkCedulPad;
	}

	public void setFkCedulPad(PadreRenavi fkCedulPad) {
		this.fkCedulPad = fkCedulPad;
	}

	public PaisRenavi getFkIdPaisMad() {
		return fkIdPaisMad;
	}

	public void setFkIdPaisMad(PaisRenavi fkIdPaisMad) {
		this.fkIdPaisMad = fkIdPaisMad;
	}

	public ProductoEmbarazoRenavi getFkIdProEmb() {
		return fkIdProEmb;
	}

	public void setFkIdProEmb(ProductoEmbarazoRenavi fkIdProEmb) {
		this.fkIdProEmb = fkIdProEmb;
	}

	public SexoRenavi getFkIdSexoNv() {
		return fkIdSexoNv;
	}

	public void setFkIdSexoNv(SexoRenavi fkIdSexoNv) {
		this.fkIdSexoNv = fkIdSexoNv;
	}

	public void setNumeroHistoriaNacViv(String numeroHistoriaNacViv) {
		this.numeroHistoriaNacViv = numeroHistoriaNacViv;
	}

	public String getNumeroHistoriaNacViv() {
		return numeroHistoriaNacViv;
	}

	public String getObsrvNacViv() {
		return obsrvNacViv;
	}

	public void setObsrvNacViv(String obsrvNacViv) {
		this.obsrvNacViv = obsrvNacViv;
	}

	public String getCodigoRcNacViv() {
		return codigoRcNacViv;
	}

	public void setCodigoRcNacViv(String codigoRcNacViv) {
		this.codigoRcNacViv = codigoRcNacViv;
	}

	public PaisRenavi getFkIdPaisResidnMad() {
		return fkIdPaisResidnMad;
	}

	public void setFkIdPaisResidnMad(PaisRenavi fkIdPaisResidnMad) {
		this.fkIdPaisResidnMad = fkIdPaisResidnMad;
	}

	public String getMalformacionesConge() {
		return malformacionesConge;
	}

	public void setMalformacionesConge(String malformacionesConge) {
		this.malformacionesConge = malformacionesConge;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idNacViv != null ? idNacViv.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof NacidoVivoRenavi)) {
			return false;
		}
		NacidoVivoRenavi other = (NacidoVivoRenavi) object;
		if ((this.idNacViv == null && other.idNacViv != null)
				|| (this.idNacViv != null && !this.idNacViv.equals(other.idNacViv))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return apellNacViv;
	}

	public String getPartoEnCasa() {
		return partoEnCasa;
	}

	public void setPartoEnCasa(String partoEnCasa) {
		this.partoEnCasa = partoEnCasa;
	}

}
