
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAgenciasPorInstitucionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgenciasPorInstitucionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListAgencia" type="{http://service.registrocivil.gob.ec/}listAgencia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAgenciasPorInstitucionResponse", propOrder = {
    "listAgencia"
})
public class GetAgenciasPorInstitucionResponse {

    @XmlElement(name = "ListAgencia")
    protected ListAgencia listAgencia;

    /**
     * Obtiene el valor de la propiedad listAgencia.
     * 
     * @return
     *     possible object is
     *     {@link ListAgencia }
     *     
     */
    public ListAgencia getListAgencia() {
        return listAgencia;
    }

    /**
     * Define el valor de la propiedad listAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAgencia }
     *     
     */
    public void setListAgencia(ListAgencia value) {
        this.listAgencia = value;
    }

}
