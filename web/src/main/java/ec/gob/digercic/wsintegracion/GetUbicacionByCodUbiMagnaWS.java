
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbicacionByCodUbiMagnaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbicacionByCodUbiMagnaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codUbiMagna" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbicacionByCodUbiMagnaWS", propOrder = {
    "codUbiMagna"
})
public class GetUbicacionByCodUbiMagnaWS {

    @XmlElement(required = true)
    protected String codUbiMagna;

    /**
     * Obtiene el valor de la propiedad codUbiMagna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUbiMagna() {
        return codUbiMagna;
    }

    /**
     * Define el valor de la propiedad codUbiMagna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUbiMagna(String value) {
        this.codUbiMagna = value;
    }

}
