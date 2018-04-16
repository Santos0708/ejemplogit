
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiarContraseniaUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiarContraseniaUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claveAnterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claveNueva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiarContraseniaUsuario", propOrder = {
    "nomUsuario",
    "claveAnterior",
    "claveNueva"
})
public class CambiarContraseniaUsuario {

    @XmlElement(required = true)
    protected String nomUsuario;
    @XmlElement(required = true)
    protected String claveAnterior;
    @XmlElement(required = true)
    protected String claveNueva;

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
     * Obtiene el valor de la propiedad claveAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveAnterior() {
        return claveAnterior;
    }

    /**
     * Define el valor de la propiedad claveAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveAnterior(String value) {
        this.claveAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad claveNueva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveNueva() {
        return claveNueva;
    }

    /**
     * Define el valor de la propiedad claveNueva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveNueva(String value) {
        this.claveNueva = value;
    }

}
