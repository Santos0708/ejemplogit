
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarCodigoSmsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarCodigoSmsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultadoString" type="{http://service.registrocivil.gob.ec/}resultadoString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarCodigoSmsResponse", propOrder = {
    "resultadoString"
})
public class ValidarCodigoSmsResponse {

    @XmlElement(name = "ResultadoString")
    protected ResultadoString resultadoString;

    /**
     * Obtiene el valor de la propiedad resultadoString.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoString }
     *     
     */
    public ResultadoString getResultadoString() {
        return resultadoString;
    }

    /**
     * Define el valor de la propiedad resultadoString.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoString }
     *     
     */
    public void setResultadoString(ResultadoString value) {
        this.resultadoString = value;
    }

}
