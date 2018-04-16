
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuarioByUsernameAndMailResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuarioByUsernameAndMailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TblSauregUsuario" type="{http://service.registrocivil.gob.ec/}tblSauregUsuario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuarioByUsernameAndMailResponse", propOrder = {
    "tblSauregUsuario"
})
public class GetUsuarioByUsernameAndMailResponse {

    @XmlElement(name = "TblSauregUsuario")
    protected TblSauregUsuario tblSauregUsuario;

    /**
     * Obtiene el valor de la propiedad tblSauregUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUsuario }
     *     
     */
    public TblSauregUsuario getTblSauregUsuario() {
        return tblSauregUsuario;
    }

    /**
     * Define el valor de la propiedad tblSauregUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUsuario }
     *     
     */
    public void setTblSauregUsuario(TblSauregUsuario value) {
        this.tblSauregUsuario = value;
    }

}
