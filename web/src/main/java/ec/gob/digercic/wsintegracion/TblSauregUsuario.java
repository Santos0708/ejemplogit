
package ec.gob.digercic.wsintegracion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tblSauregUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agenciaInUser" type="{http://service.registrocivil.gob.ec/}tblSauregAgencia" minOccurs="0"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contrasenia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estructSistList" type="{http://service.registrocivil.gob.ec/}tblSauregEstrucSist" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fechaCambio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEstados" type="{http://service.registrocivil.gob.ec/}tblSauregEstados" minOccurs="0"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregAgenciaList" type="{http://service.registrocivil.gob.ec/}tblSauregAgencia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregRolList" type="{http://service.registrocivil.gob.ec/}tblSauregRol" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telfext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuDominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuarioCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregUsuario", propOrder = {
    "agenciaInUser",
    "apellido",
    "celular",
    "codError",
    "codLogin",
    "contrasenia",
    "desError",
    "desLogin",
    "estError",
    "estructSistList",
    "fechaCambio",
    "idEstado",
    "idEstados",
    "idUsuario",
    "ip",
    "nomUsuario",
    "nombre",
    "observacion",
    "status",
    "tblSauregAgenciaList",
    "tblSauregRolList",
    "telefono",
    "telfext",
    "tipDocumento",
    "usuDominio",
    "usuarioCambio",
    "eMail"
})
public class TblSauregUsuario {

    protected TblSauregAgencia agenciaInUser;
    protected String apellido;
    protected String celular;
    protected String codError;
    protected String codLogin;
    protected String contrasenia;
    protected String desError;
    protected String desLogin;
    protected String estError;
    @XmlElement(nillable = true)
    protected List<TblSauregEstrucSist> estructSistList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCambio;
    protected String idEstado;
    protected TblSauregEstados idEstados;
    protected BigInteger idUsuario;
    protected String ip;
    protected String nomUsuario;
    protected String nombre;
    protected String observacion;
    protected String status;
    @XmlElement(nillable = true)
    protected List<TblSauregAgencia> tblSauregAgenciaList;
    @XmlElement(nillable = true)
    protected List<TblSauregRol> tblSauregRolList;
    protected String telefono;
    protected String telfext;
    protected String tipDocumento;
    protected String usuDominio;
    protected String usuarioCambio;
    protected String eMail;

    /**
     * Obtiene el valor de la propiedad agenciaInUser.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregAgencia }
     *     
     */
    public TblSauregAgencia getAgenciaInUser() {
        return agenciaInUser;
    }

    /**
     * Define el valor de la propiedad agenciaInUser.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregAgencia }
     *     
     */
    public void setAgenciaInUser(TblSauregAgencia value) {
        this.agenciaInUser = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad codLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLogin() {
        return codLogin;
    }

    /**
     * Define el valor de la propiedad codLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLogin(String value) {
        this.codLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Define el valor de la propiedad contrasenia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenia(String value) {
        this.contrasenia = value;
    }

    /**
     * Obtiene el valor de la propiedad desError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesError() {
        return desError;
    }

    /**
     * Define el valor de la propiedad desError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesError(String value) {
        this.desError = value;
    }

    /**
     * Obtiene el valor de la propiedad desLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesLogin() {
        return desLogin;
    }

    /**
     * Define el valor de la propiedad desLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesLogin(String value) {
        this.desLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad estError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstError() {
        return estError;
    }

    /**
     * Define el valor de la propiedad estError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstError(String value) {
        this.estError = value;
    }

    /**
     * Gets the value of the estructSistList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estructSistList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstructSistList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregEstrucSist }
     * 
     * 
     */
    public List<TblSauregEstrucSist> getEstructSistList() {
        if (estructSistList == null) {
            estructSistList = new ArrayList<TblSauregEstrucSist>();
        }
        return this.estructSistList;
    }

    /**
     * Obtiene el valor de la propiedad fechaCambio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCambio() {
        return fechaCambio;
    }

    /**
     * Define el valor de la propiedad fechaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCambio(XMLGregorianCalendar value) {
        this.fechaCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEstado() {
        return idEstado;
    }

    /**
     * Define el valor de la propiedad idEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEstado(String value) {
        this.idEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstados.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregEstados }
     *     
     */
    public TblSauregEstados getIdEstados() {
        return idEstados;
    }

    /**
     * Define el valor de la propiedad idEstados.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregEstados }
     *     
     */
    public void setIdEstados(TblSauregEstados value) {
        this.idEstados = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdUsuario(BigInteger value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad nomUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Define el valor de la propiedad nomUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUsuario(String value) {
        this.nomUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tblSauregAgenciaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tblSauregAgenciaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTblSauregAgenciaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregAgencia }
     * 
     * 
     */
    public List<TblSauregAgencia> getTblSauregAgenciaList() {
        if (tblSauregAgenciaList == null) {
            tblSauregAgenciaList = new ArrayList<TblSauregAgencia>();
        }
        return this.tblSauregAgenciaList;
    }

    /**
     * Gets the value of the tblSauregRolList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tblSauregRolList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTblSauregRolList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregRol }
     * 
     * 
     */
    public List<TblSauregRol> getTblSauregRolList() {
        if (tblSauregRolList == null) {
            tblSauregRolList = new ArrayList<TblSauregRol>();
        }
        return this.tblSauregRolList;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad telfext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfext() {
        return telfext;
    }

    /**
     * Define el valor de la propiedad telfext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfext(String value) {
        this.telfext = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDocumento() {
        return tipDocumento;
    }

    /**
     * Define el valor de la propiedad tipDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDocumento(String value) {
        this.tipDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad usuDominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuDominio() {
        return usuDominio;
    }

    /**
     * Define el valor de la propiedad usuDominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuDominio(String value) {
        this.usuDominio = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCambio() {
        return usuarioCambio;
    }

    /**
     * Define el valor de la propiedad usuarioCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCambio(String value) {
        this.usuarioCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Define el valor de la propiedad eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
