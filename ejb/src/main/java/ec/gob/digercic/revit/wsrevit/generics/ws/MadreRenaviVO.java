package ec.gob.digercic.revit.wsrevit.generics.ws;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "cedula", "pasaporte", "idMadre", "nombre", "fechaNacimiento", "idEstadoCivil",
		"descripcionEstadoCivil", "descripcionNacionalidad", "descripcionSexo", "descripcionCondicionCedulado",
		"nombrePadre", "nombreMadre", "hijos" })
public class MadreRenaviVO {
	private String cedula;
    private String nombre;
    private String descripcionCondicionCedulado;
    private String nombrePadre;
    private String nombreMadre;
    private String fechaNacimiento;
    private String descripcionSexo;
    private String descripcionEstadoCivil;
    private String descripcionNacionalidad;
    private String pasaporte;
    private String idMadre;
    private String idEstadoCivil;
    private List<NacidoVivoVO> hijos;
	
	@XmlElement(name = "cedula")
    public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@XmlElement(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement(name = "descripcionCondicionCedulado")
	public String getDescripcionCondicionCedulado() {
		return descripcionCondicionCedulado;
	}
	public void setDescripcionCondicionCedulado(String descripcionCondicionCedulado) {
		this.descripcionCondicionCedulado = descripcionCondicionCedulado;
	}
	
	@XmlElement(name = "nombrePadre")
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	
	@XmlElement(name = "nombreMadre")
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	
	@XmlElement(name = "fechaNacimiento")
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@XmlElement(name = "descripcionSexo")
	public String getDescripcionSexo() {
		return descripcionSexo;
	}
	public void setDescripcionSexo(String descripcionSexo) {
		this.descripcionSexo = descripcionSexo;
	}
	
	@XmlElement(name = "descripcionEstadoCivil")
	public String getDescripcionEstadoCivil() {
		return descripcionEstadoCivil;
	}
	public void setDescripcionEstadoCivil(String descripcionEstadoCivil) {
		this.descripcionEstadoCivil = descripcionEstadoCivil;
	}
	
	@XmlElement(name = "descripcionNacionalidad")
	public String getDescripcionNacionalidad() {
		return descripcionNacionalidad;
	}
	public void setDescripcionNacionalidad(String descripcionNacionalidad) {
		this.descripcionNacionalidad = descripcionNacionalidad;
	}
	
	@XmlElement(name = "pasaporte")
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	@XmlElement(name = "idMadre")
	public String getIdMadre() {
		return idMadre;
	}
	public void setIdMadre(String idMadre) {
		this.idMadre = idMadre;
	}
	
	@XmlElement(name = "idEstadoCivil")
	public String getIdEstadoCivil() {
		return idEstadoCivil;
	}
	public void setIdEstadoCivil(String idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}
	
	@XmlElement(name = "hijos")
	public List<NacidoVivoVO> getHijos() {
		return hijos;
	}
	public void setHijos(List<NacidoVivoVO> hijos) {
		this.hijos = hijos;
	}
    
}
