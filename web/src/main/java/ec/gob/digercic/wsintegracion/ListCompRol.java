
package ec.gob.digercic.wsintegracion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listCompRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listCompRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listCompRol" type="{http://service.registrocivil.gob.ec/}tblSauregCompRol" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCompRol", propOrder = {
    "codError",
    "desError",
    "estError",
    "listCompRol"
})
public class ListCompRol {

    protected String codError;
    protected String desError;
    protected String estError;
    @XmlElement(nillable = true)
    protected List<TblSauregCompRol> listCompRol;

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad desError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesError() {
        return desError;
    }

    /**
     * Define el valor de la propiedad desError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesError(String value) {
        this.desError = value;
    }

    /**
     * Obtiene el valor de la propiedad estError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstError() {
        return estError;
    }

    /**
     * Define el valor de la propiedad estError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstError(String value) {
        this.estError = value;
    }

    /**
     * Gets the value of the listCompRol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCompRol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCompRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregCompRol }
     * 
     * 
     */
    public List<TblSauregCompRol> getListCompRol() {
        if (listCompRol == null) {
            listCompRol = new ArrayList<TblSauregCompRol>();
        }
        return this.listCompRol;
    }

}
