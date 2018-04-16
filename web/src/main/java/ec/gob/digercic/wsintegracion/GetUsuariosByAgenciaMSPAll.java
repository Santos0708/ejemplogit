
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuariosByAgenciaMSPAll complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuariosByAgenciaMSPAll"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codMsp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuariosByAgenciaMSPAll", propOrder = {
    "codMsp"
})
public class GetUsuariosByAgenciaMSPAll {

    @XmlElement(required = true)
    protected String codMsp;

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

}
