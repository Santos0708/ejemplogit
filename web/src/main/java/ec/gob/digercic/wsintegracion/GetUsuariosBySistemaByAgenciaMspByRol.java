
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuariosBySistemaByAgenciaMspByRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuariosBySistemaByAgenciaMspByRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codMsp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idsRol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuariosBySistemaByAgenciaMspByRol", propOrder = {
    "codMsp",
    "idSistema",
    "idsRol"
})
public class GetUsuariosBySistemaByAgenciaMspByRol {

    @XmlElement(required = true)
    protected String codMsp;
    @XmlElement(required = true)
    protected String idSistema;
    @XmlElement(required = true)
    protected String idsRol;

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
     * Obtiene el valor de la propiedad idSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSistema(String value) {
        this.idSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad idsRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsRol() {
        return idsRol;
    }

    /**
     * Define el valor de la propiedad idsRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsRol(String value) {
        this.idsRol = value;
    }

}
