
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregUsuAgencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregUsuAgencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregAgencia" type="{http://service.registrocivil.gob.ec/}tblSauregAgencia" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregUsuAgenciaPK" type="{http://service.registrocivil.gob.ec/}tblSauregUsuAgenciaPK" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregUsuario" type="{http://service.registrocivil.gob.ec/}tblSauregUsuario" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telfExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregUsuAgencia", propOrder = {
    "celular",
    "eMail",
    "status",
    "tblSauregAgencia",
    "tblSauregUsuAgenciaPK",
    "tblSauregUsuario",
    "telefono",
    "telfExtension"
})
public class TblSauregUsuAgencia {

    protected String celular;
    @XmlElement(name = "EMail")
    protected String eMail;
    protected String status;
    protected TblSauregAgencia tblSauregAgencia;
    protected TblSauregUsuAgenciaPK tblSauregUsuAgenciaPK;
    protected TblSauregUsuario tblSauregUsuario;
    protected String telefono;
    protected String telfExtension;

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
     * Obtiene el valor de la propiedad tblSauregAgencia.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregAgencia }
     *     
     */
    public TblSauregAgencia getTblSauregAgencia() {
        return tblSauregAgencia;
    }

    /**
     * Define el valor de la propiedad tblSauregAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregAgencia }
     *     
     */
    public void setTblSauregAgencia(TblSauregAgencia value) {
        this.tblSauregAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tblSauregUsuAgenciaPK.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUsuAgenciaPK }
     *     
     */
    public TblSauregUsuAgenciaPK getTblSauregUsuAgenciaPK() {
        return tblSauregUsuAgenciaPK;
    }

    /**
     * Define el valor de la propiedad tblSauregUsuAgenciaPK.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUsuAgenciaPK }
     *     
     */
    public void setTblSauregUsuAgenciaPK(TblSauregUsuAgenciaPK value) {
        this.tblSauregUsuAgenciaPK = value;
    }

    /**
     * Obtiene el valor de la propiedad tblSauregUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUsuario }
     *     
     */
    public TblSauregUsuario getTblSauregUsuario() {
        return tblSauregUsuario;
    }

    /**
     * Define el valor de la propiedad tblSauregUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUsuario }
     *     
     */
    public void setTblSauregUsuario(TblSauregUsuario value) {
        this.tblSauregUsuario = value;
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
     * Obtiene el valor de la propiedad telfExtension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfExtension() {
        return telfExtension;
    }

    /**
     * Define el valor de la propiedad telfExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfExtension(String value) {
        this.telfExtension = value;
    }

}
