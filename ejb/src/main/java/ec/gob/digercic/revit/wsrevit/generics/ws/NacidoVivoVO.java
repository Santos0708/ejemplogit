package ec.gob.digercic.revit.wsrevit.generics.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "cedula", "historialNacidoVivo", "nombres", "apellidos", "fechaNacimiento", "codigoSexo",
		"descripcionSexo","idNacVivo", "fechaCreacion", "codigoInst", "nombreInst", "descripcionInstitucion", "descripcionAgencia",
		"codigoProvincia", "descripcionProvincia", "codigoCanton", "descripcionCanton", "codigoParroquia",
		"descripcionParroquia", "cedulaProfesional", "nombresProfesional", /*"apellidosProfesional",*/ "codigoMensaje",
		"mensaje", "pdf","esPartoCasa" })
public class NacidoVivoVO {
	private String cedula;
    private String apellidos;
    private String nombres;
    private String fechaNacimiento;
    private String fechaCreacion;
    private String descripcionSexo;
    private String codigoSexo;
    private String descripcionInstitucion;
    private String descripcionAgencia;
    private String cedulaProfesional;
    private String nombresProfesional;
    //private String apellidosProfesional;
    private String codigoProvincia;
    private String descripcionProvincia;
    private String codigoCanton;
    private String descripcionCanton;
    private String codigoParroquia;
    private String descripcionParroquia;
    private String historialNacidoVivo;    
    private byte[] pdf;
    private String esPartoCasa;
    private Long idNacVivo;
    private String mensaje;
    private String codigoMensaje;
    private String codigoInst;
    private String nombreInst;
    
	@XmlElement(name = "cedula")
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@XmlElement(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@XmlElement(name = "nombres")
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	@XmlElement(name = "fechaNacimiento")
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@XmlElement(name = "fechaCreacion")
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@XmlElement(name = "descripcionSexo")
	public String getDescripcionSexo() {
		return descripcionSexo;
	}
	public void setDescripcionSexo(String descripcionSexo) {
		this.descripcionSexo = descripcionSexo;
	}
	
	@XmlElement(name = "codigoSexo")
	public String getCodigoSexo() {
		return codigoSexo;
	}
	public void setCodigoSexo(String codigoSexo) {
		this.codigoSexo = codigoSexo;
	}
	
	@XmlElement(name = "descripcionInstitucion")
	public String getDescripcionInstitucion() {
		return descripcionInstitucion;
	}
	public void setDescripcionInstitucion(String descripcionInstitucion) {
		this.descripcionInstitucion = descripcionInstitucion;
	}
	
	@XmlElement(name = "descripcionAgencia")
	public String getDescripcionAgencia() {
		return descripcionAgencia;
	}
	public void setDescripcionAgencia(String descripcionAgencia) {
		this.descripcionAgencia = descripcionAgencia;
	}
	
	@XmlElement(name = "cedulaProfesional")
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	
	@XmlElement(name = "nombresProfesional")
	public String getNombresProfesional() {
		return nombresProfesional;
	}
	public void setNombresProfesional(String nombresProfesional) {
		this.nombresProfesional = nombresProfesional;
	}
	/*
	@XmlElement(name = "apellidosProfesional")
	public String getApellidosProfesional() {
		return apellidosProfesional;
	}
	public void setApellidosProfesional(String apellidosProfesional) {
		this.apellidosProfesional = apellidosProfesional;
	}
	*/
	
	@XmlElement(name = "codigoProvincia")
	public String getCodigoProvincia() {
		return codigoProvincia;
	}
	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}
	
	@XmlElement(name = "descripcionProvincia")
	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}
	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}
	
	@XmlElement(name = "codigoCanton")
	public String getCodigoCanton() {
		return codigoCanton;
	}
	public void setCodigoCanton(String codigoCanton) {
		this.codigoCanton = codigoCanton;
	}
	
	@XmlElement(name = "descripcionCanton")
	public String getDescripcionCanton() {
		return descripcionCanton;
	}
	public void setDescripcionCanton(String descripcionCanton) {
		this.descripcionCanton = descripcionCanton;
	}
	
	@XmlElement(name = "codigoParroquia")
	public String getCodigoParroquia() {
		return codigoParroquia;
	}
	public void setCodigoParroquia(String codigoParroquia) {
		this.codigoParroquia = codigoParroquia;
	}
	
	@XmlElement(name = "descripcionParroquia")
	public String getDescripcionParroquia() {
		return descripcionParroquia;
	}
	public void setDescripcionParroquia(String descripcionParroquia) {
		this.descripcionParroquia = descripcionParroquia;
	}
	
	@XmlElement(name = "historialNacidoVivo")
	public String getHistorialNacidoVivo() {
		return historialNacidoVivo;
	}
	public void setHistorialNacidoVivo(String historialNacidoVivo) {
		this.historialNacidoVivo = historialNacidoVivo;
	}
	
	@XmlElement(name = "pdf")
	public byte[] getPdf() {
		return pdf;
	}
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	
	@XmlElement(name = "mensaje")
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@XmlElement(name = "codigoMensaje")
	public String getCodigoMensaje() {
		return codigoMensaje;
	}
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	@XmlElement(name = "codigoInst")
	public String getCodigoInst() {
		return codigoInst;
	}
	public void setCodigoInst(String codigoInst) {
		this.codigoInst = codigoInst;
	}
	
	@XmlElement(name = "nombreInst")
	public String getNombreInst() {
		return nombreInst;
	}
	public void setNombreInst(String nombreInst) {
		this.nombreInst = nombreInst;
	}
	
	@XmlElement(name = "esPartoCasa")
	public String getEsPartoCasa() {
		return esPartoCasa;
	}
	public void setEsPartoCasa(String esPartoCasa) {
		this.esPartoCasa = esPartoCasa;
	}
	public Long getIdNacVivo() {
		return idNacVivo;
	}
	public void setIdNacVivo(Long idNacVivo) {
		this.idNacVivo = idNacVivo;
	}
	
    
    
}
