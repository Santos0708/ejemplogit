
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tblSauregAgencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregAgencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="celularUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConsulPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMsp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="generaDocElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAgencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idCanton" type="{http://service.registrocivil.gob.ec/}tblSauregUbicacion" minOccurs="0"/&gt;
 *         &lt;element name="idInstituc" type="{http://service.registrocivil.gob.ec/}tblSauregInstitucion" minOccurs="0"/&gt;
 *         &lt;element name="idParroquia" type="{http://service.registrocivil.gob.ec/}tblSauregUbicacion" minOccurs="0"/&gt;
 *         &lt;element name="idProvincia" type="{http://service.registrocivil.gob.ec/}tblSauregUbicacion" minOccurs="0"/&gt;
 *         &lt;element name="impressionSiteAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizacionOfi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinciaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rangoIpFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rangoIpInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telfExtensionUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ubcInternacionalCiudad" type="{http://service.registrocivil.gob.ec/}ubicacionInternacional" minOccurs="0"/&gt;
 *         &lt;element name="ubcInternacionalPais" type="{http://service.registrocivil.gob.ec/}ubicacionInternacional" minOccurs="0"/&gt;
 *         &lt;element name="eMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eMailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregAgencia", propOrder = {
    "celularUsuario",
    "codAgencia",
    "codConsulPais",
    "codError",
    "codMsp",
    "contacto",
    "desError",
    "direccion",
    "estError",
    "extencion",
    "fechaCreacion",
    "generaDocElectronico",
    "idAgencia",
    "idCanton",
    "idInstituc",
    "idParroquia",
    "idProvincia",
    "impressionSiteAgency",
    "localidad",
    "localizacionOfi",
    "nomAgencia",
    "provinciaId",
    "rangoIpFinal",
    "rangoIpInicial",
    "status",
    "telefono",
    "telefonoUsuario",
    "telfExtensionUsuario",
    "tipoAgencia",
    "ubcInternacionalCiudad",
    "ubcInternacionalPais",
    "eMail",
    "eMailUsuario"
})
public class TblSauregAgencia {

    protected String celularUsuario;
    protected String codAgencia;
    protected String codConsulPais;
    protected String codError;
    protected String codMsp;
    protected String contacto;
    protected String desError;
    protected String direccion;
    protected String estError;
    protected String extencion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected String generaDocElectronico;
    protected Long idAgencia;
    protected TblSauregUbicacion idCanton;
    protected TblSauregInstitucion idInstituc;
    protected TblSauregUbicacion idParroquia;
    protected TblSauregUbicacion idProvincia;
    protected String impressionSiteAgency;
    protected String localidad;
    protected Long localizacionOfi;
    protected String nomAgencia;
    protected Long provinciaId;
    protected String rangoIpFinal;
    protected String rangoIpInicial;
    protected String status;
    protected String telefono;
    protected String telefonoUsuario;
    protected String telfExtensionUsuario;
    protected String tipoAgencia;
    protected UbicacionInternacional ubcInternacionalCiudad;
    protected UbicacionInternacional ubcInternacionalPais;
    protected String eMail;
    protected String eMailUsuario;

    /**
     * Obtiene el valor de la propiedad celularUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelularUsuario() {
        return celularUsuario;
    }

    /**
     * Define el valor de la propiedad celularUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelularUsuario(String value) {
        this.celularUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad codAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAgencia() {
        return codAgencia;
    }

    /**
     * Define el valor de la propiedad codAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAgencia(String value) {
        this.codAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codConsulPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConsulPais() {
        return codConsulPais;
    }

    /**
     * Define el valor de la propiedad codConsulPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConsulPais(String value) {
        this.codConsulPais = value;
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
     * Obtiene el valor de la propiedad codMsp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMsp() {
        return codMsp;
    }

    /**
     * Define el valor de la propiedad codMsp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMsp(String value) {
        this.codMsp = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Define el valor de la propiedad contacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto(String value) {
        this.contacto = value;
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
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
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
     * Obtiene el valor de la propiedad extencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtencion() {
        return extencion;
    }

    /**
     * Define el valor de la propiedad extencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtencion(String value) {
        this.extencion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad generaDocElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneraDocElectronico() {
        return generaDocElectronico;
    }

    /**
     * Define el valor de la propiedad generaDocElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneraDocElectronico(String value) {
        this.generaDocElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad idAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAgencia() {
        return idAgencia;
    }

    /**
     * Define el valor de la propiedad idAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAgencia(Long value) {
        this.idAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanton.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public TblSauregUbicacion getIdCanton() {
        return idCanton;
    }

    /**
     * Define el valor de la propiedad idCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public void setIdCanton(TblSauregUbicacion value) {
        this.idCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstituc.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregInstitucion }
     *     
     */
    public TblSauregInstitucion getIdInstituc() {
        return idInstituc;
    }

    /**
     * Define el valor de la propiedad idInstituc.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregInstitucion }
     *     
     */
    public void setIdInstituc(TblSauregInstitucion value) {
        this.idInstituc = value;
    }

    /**
     * Obtiene el valor de la propiedad idParroquia.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public TblSauregUbicacion getIdParroquia() {
        return idParroquia;
    }

    /**
     * Define el valor de la propiedad idParroquia.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public void setIdParroquia(TblSauregUbicacion value) {
        this.idParroquia = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public TblSauregUbicacion getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public void setIdProvincia(TblSauregUbicacion value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad impressionSiteAgency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressionSiteAgency() {
        return impressionSiteAgency;
    }

    /**
     * Define el valor de la propiedad impressionSiteAgency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionSiteAgency(String value) {
        this.impressionSiteAgency = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad localizacionOfi.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocalizacionOfi() {
        return localizacionOfi;
    }

    /**
     * Define el valor de la propiedad localizacionOfi.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocalizacionOfi(Long value) {
        this.localizacionOfi = value;
    }

    /**
     * Obtiene el valor de la propiedad nomAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAgencia() {
        return nomAgencia;
    }

    /**
     * Define el valor de la propiedad nomAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAgencia(String value) {
        this.nomAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProvinciaId() {
        return provinciaId;
    }

    /**
     * Define el valor de la propiedad provinciaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProvinciaId(Long value) {
        this.provinciaId = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoIpFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangoIpFinal() {
        return rangoIpFinal;
    }

    /**
     * Define el valor de la propiedad rangoIpFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangoIpFinal(String value) {
        this.rangoIpFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoIpInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangoIpInicial() {
        return rangoIpInicial;
    }

    /**
     * Define el valor de la propiedad rangoIpInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangoIpInicial(String value) {
        this.rangoIpInicial = value;
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
     * Obtiene el valor de la propiedad telefonoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    /**
     * Define el valor de la propiedad telefonoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoUsuario(String value) {
        this.telefonoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad telfExtensionUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfExtensionUsuario() {
        return telfExtensionUsuario;
    }

    /**
     * Define el valor de la propiedad telfExtensionUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfExtensionUsuario(String value) {
        this.telfExtensionUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAgencia() {
        return tipoAgencia;
    }

    /**
     * Define el valor de la propiedad tipoAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAgencia(String value) {
        this.tipoAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ubcInternacionalCiudad.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionInternacional }
     *     
     */
    public UbicacionInternacional getUbcInternacionalCiudad() {
        return ubcInternacionalCiudad;
    }

    /**
     * Define el valor de la propiedad ubcInternacionalCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionInternacional }
     *     
     */
    public void setUbcInternacionalCiudad(UbicacionInternacional value) {
        this.ubcInternacionalCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad ubcInternacionalPais.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionInternacional }
     *     
     */
    public UbicacionInternacional getUbcInternacionalPais() {
        return ubcInternacionalPais;
    }

    /**
     * Define el valor de la propiedad ubcInternacionalPais.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionInternacional }
     *     
     */
    public void setUbcInternacionalPais(UbicacionInternacional value) {
        this.ubcInternacionalPais = value;
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

    /**
     * Obtiene el valor de la propiedad eMailUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailUsuario() {
        return eMailUsuario;
    }

    /**
     * Define el valor de la propiedad eMailUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailUsuario(String value) {
        this.eMailUsuario = value;
    }

}
