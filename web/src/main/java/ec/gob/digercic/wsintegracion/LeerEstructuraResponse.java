
package ec.gob.digercic.wsintegracion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para leerEstructuraResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="leerEstructuraResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TblSauregEstrucSist" type="{http://service.registrocivil.gob.ec/}tblSauregEstrucSist" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leerEstructuraResponse", propOrder = {
    "tblSauregEstrucSist"
})
public class LeerEstructuraResponse {

    @XmlElement(name = "TblSauregEstrucSist")
    protected List<TblSauregEstrucSist> tblSauregEstrucSist;

    /**
     * Gets the value of the tblSauregEstrucSist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tblSauregEstrucSist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTblSauregEstrucSist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregEstrucSist }
     * 
     * 
     */
    public List<TblSauregEstrucSist> getTblSauregEstrucSist() {
        if (tblSauregEstrucSist == null) {
            tblSauregEstrucSist = new ArrayList<TblSauregEstrucSist>();
        }
        return this.tblSauregEstrucSist;
    }

}
