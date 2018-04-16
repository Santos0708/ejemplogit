
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbicacionByCodDpa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbicacionByCodDpa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codDpa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbicacionByCodDpa", propOrder = {
    "codDpa"
})
public class GetUbicacionByCodDpa {

    @XmlElement(required = true)
    protected String codDpa;

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

}
