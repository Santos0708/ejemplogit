
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tblSauregUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregUbicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAs400" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDpa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codExterno1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codExterno2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idGrupo" type="{http://service.registrocivil.gob.ec/}tblSauregUbicacion" minOccurs="0"/&gt;
 *         &lt;element name="idUbicacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregUbicacion", propOrder = {
    "codAs400",
    "codDpa",
    "codError",
    "codExterno1",
    "codExterno2",
    "derscripcion",
    "desError",
    "estError",
    "fechaCreacion",
    "idGrupo",
    "idUbicacion",
    "observacion",
    "status"
})
public class TblSauregUbicacion {

    protected String codAs400;
    protected String codDpa;
    protected String codError;
    protected String codExterno1;
    protected String codExterno2;
    protected String derscripcion;
    protected String desError;
    protected String estError;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected TblSauregUbicacion idGrupo;
    protected Long idUbicacion;
    protected String observacion;
    protected String status;

    /**
     * Obtiene el valor de la propiedad codAs400.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAs400() {
        return codAs400;
    }

    /**
     * Define el valor de la propiedad codAs400.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAs400(String value) {
        this.codAs400 = value;
    }

    /**
     * Obtiene el valor de la propiedad codDpa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDpa() {
        return codDpa;
    }

    /**
     * Define el valor de la propiedad codDpa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDpa(String value) {
        this.codDpa = value;
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
     * Obtiene el valor de la propiedad codExterno1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodExterno1() {
        return codExterno1;
    }

    /**
     * Define el valor de la propiedad codExterno1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodExterno1(String value) {
        this.codExterno1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codExterno2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodExterno2() {
        return codExterno2;
    }

    /**
     * Define el valor de la propiedad codExterno2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodExterno2(String value) {
        this.codExterno2 = value;
    }

    /**
     * Obtiene el valor de la propiedad derscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerscripcion() {
        return derscripcion;
    }

    /**
     * Define el valor de la propiedad derscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerscripcion(String value) {
        this.derscripcion = value;
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
     * Obtiene el valor de la propiedad idGrupo.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public TblSauregUbicacion getIdGrupo() {
        return idGrupo;
    }

    /**
     * Define el valor de la propiedad idGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUbicacion }
     *     
     */
    public void setIdGrupo(TblSauregUbicacion value) {
        this.idGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad idUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUbicacion() {
        return idUbicacion;
    }

    /**
     * Define el valor de la propiedad idUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUbicacion(Long value) {
        this.idUbicacion = value;
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

}
