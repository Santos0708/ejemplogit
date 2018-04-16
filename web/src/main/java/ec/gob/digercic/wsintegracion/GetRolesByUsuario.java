
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRolesByUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRolesByUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRolesByUsuario", propOrder = {
    "nomUsuario"
})
public class GetRolesByUsuario {

    @XmlElement(required = true)
    protected String nomUsuario;

    /**
     * Obtiene el valor de la propiedad nomUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Define el valor de la propiedad nomUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUsuario(String value) {
        this.nomUsuario = value;
    }

}
