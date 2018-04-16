
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuariosFromPageForFirma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuariosFromPageForFirma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idPagina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuariosFromPageForFirma", propOrder = {
    "idAgencia",
    "idPagina"
})
public class GetUsuariosFromPageForFirma {

    @XmlElement(required = true)
    protected String idAgencia;
    @XmlElement(required = true)
    protected String idPagina;

    /**
     * Obtiene el valor de la propiedad idAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAgencia() {
        return idAgencia;
    }

    /**
     * Define el valor de la propiedad idAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAgencia(String value) {
        this.idAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idPagina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPagina() {
        return idPagina;
    }

    /**
     * Define el valor de la propiedad idPagina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPagina(String value) {
        this.idPagina = value;
    }

}
