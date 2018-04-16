
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbicacionByCodAs400 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbicacionByCodAs400"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAs400" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbicacionByCodAs400", propOrder = {
    "codAs400"
})
public class GetUbicacionByCodAs400 {

    @XmlElement(required = true)
    protected String codAs400;

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

}
