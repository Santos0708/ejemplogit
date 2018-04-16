
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregInstitucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregInstitucion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codRevit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idInstituc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idInstitucPadre" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomCorto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomInstituc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paginaWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregInstitucion", propOrder = {
    "codRevit",
    "eMail",
    "idInstituc",
    "idInstitucPadre",
    "nomCorto",
    "nomInstituc",
    "paginaWeb",
    "status",
    "telefono"
})
public class TblSauregInstitucion {

    protected String codRevit;
    @XmlElement(name = "EMail")
    protected String eMail;
    protected Long idInstituc;
    protected Long idInstitucPadre;
    protected String nomCorto;
    protected String nomInstituc;
    protected String paginaWeb;
    protected String status;
    protected Long telefono;

    /**
     * Obtiene el valor de la propiedad codRevit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRevit() {
        return codRevit;
    }

    /**
     * Define el valor de la propiedad codRevit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRevit(String value) {
        this.codRevit = value;
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
     * Obtiene el valor de la propiedad idInstituc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInstituc() {
        return idInstituc;
    }

    /**
     * Define el valor de la propiedad idInstituc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInstituc(Long value) {
        this.idInstituc = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstitucPadre.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInstitucPadre() {
        return idInstitucPadre;
    }

    /**
     * Define el valor de la propiedad idInstitucPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInstitucPadre(Long value) {
        this.idInstitucPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCorto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCorto() {
        return nomCorto;
    }

    /**
     * Define el valor de la propiedad nomCorto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCorto(String value) {
        this.nomCorto = value;
    }

    /**
     * Obtiene el valor de la propiedad nomInstituc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomInstituc() {
        return nomInstituc;
    }

    /**
     * Define el valor de la propiedad nomInstituc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomInstituc(String value) {
        this.nomInstituc = value;
    }

    /**
     * Obtiene el valor de la propiedad paginaWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Define el valor de la propiedad paginaWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginaWeb(String value) {
        this.paginaWeb = value;
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
     *     {@link Long }
     *     
     */
    public Long getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelefono(Long value) {
        this.telefono = value;
    }

}
