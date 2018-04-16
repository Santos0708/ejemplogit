
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuAgenciaByIdRolStatusWSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuAgenciaByIdRolStatusWSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListUsuAgencia" type="{http://service.registrocivil.gob.ec/}listUsuAgencia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuAgenciaByIdRolStatusWSResponse", propOrder = {
    "listUsuAgencia"
})
public class GetUsuAgenciaByIdRolStatusWSResponse {

    @XmlElement(name = "ListUsuAgencia")
    protected ListUsuAgencia listUsuAgencia;

    /**
     * Obtiene el valor de la propiedad listUsuAgencia.
     * 
     * @return
     *     possible object is
     *     {@link ListUsuAgencia }
     *     
     */
    public ListUsuAgencia getListUsuAgencia() {
        return listUsuAgencia;
    }

    /**
     * Define el valor de la propiedad listUsuAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link ListUsuAgencia }
     *     
     */
    public void setListUsuAgencia(ListUsuAgencia value) {
        this.listUsuAgencia = value;
    }

}
