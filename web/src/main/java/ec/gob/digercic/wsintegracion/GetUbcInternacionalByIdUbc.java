
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbcInternacionalByIdUbc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbcInternacionalByIdUbc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUbcInternacional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbcInternacionalByIdUbc", propOrder = {
    "idUbcInternacional"
})
public class GetUbcInternacionalByIdUbc {

    @XmlElement(required = true)
    protected String idUbcInternacional;

    /**
     * Obtiene el valor de la propiedad idUbcInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUbcInternacional() {
        return idUbcInternacional;
    }

    /**
     * Define el valor de la propiedad idUbcInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUbcInternacional(String value) {
        this.idUbcInternacional = value;
    }

}
