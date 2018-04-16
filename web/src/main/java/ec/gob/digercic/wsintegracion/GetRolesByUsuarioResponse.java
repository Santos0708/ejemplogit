
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRolesByUsuarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRolesByUsuarioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListRol" type="{http://service.registrocivil.gob.ec/}listRol" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRolesByUsuarioResponse", propOrder = {
    "listRol"
})
public class GetRolesByUsuarioResponse {

    @XmlElement(name = "ListRol")
    protected ListRol listRol;

    /**
     * Obtiene el valor de la propiedad listRol.
     * 
     * @return
     *     possible object is
     *     {@link ListRol }
     *     
     */
    public ListRol getListRol() {
        return listRol;
    }

    /**
     * Define el valor de la propiedad listRol.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRol }
     *     
     */
    public void setListRol(ListRol value) {
        this.listRol = value;
    }

}
