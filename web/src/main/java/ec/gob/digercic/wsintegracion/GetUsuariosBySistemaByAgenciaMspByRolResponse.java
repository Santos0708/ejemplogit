
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuariosBySistemaByAgenciaMspByRolResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuariosBySistemaByAgenciaMspByRolResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListUsuario" type="{http://service.registrocivil.gob.ec/}listUsuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuariosBySistemaByAgenciaMspByRolResponse", propOrder = {
    "listUsuario"
})
public class GetUsuariosBySistemaByAgenciaMspByRolResponse {

    @XmlElement(name = "ListUsuario")
    protected ListUsuario listUsuario;

    /**
     * Obtiene el valor de la propiedad listUsuario.
     * 
     * @return
     *     possible object is
     *     {@link ListUsuario }
     *     
     */
    public ListUsuario getListUsuario() {
        return listUsuario;
    }

    /**
     * Define el valor de la propiedad listUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link ListUsuario }
     *     
     */
    public void setListUsuario(ListUsuario value) {
        this.listUsuario = value;
    }

}
