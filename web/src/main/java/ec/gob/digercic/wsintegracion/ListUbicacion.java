
package ec.gob.digercic.wsintegracion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listUbicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listUbicacion" type="{http://service.registrocivil.gob.ec/}tblSauregUbicacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listUbicacion", propOrder = {
    "codError",
    "desError",
    "estError",
    "listUbicacion"
})
public class ListUbicacion {

    protected String codError;
    protected String desError;
    protected String estError;
    @XmlElement(nillable = true)
    protected List<TblSauregUbicacion> listUbicacion;

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
     * Gets the value of the listUbicacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUbicacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUbicacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TblSauregUbicacion }
     * 
     * 
     */
    public List<TblSauregUbicacion> getListUbicacion() {
        if (listUbicacion == null) {
            listUbicacion = new ArrayList<TblSauregUbicacion>();
        }
        return this.listUbicacion;
    }

}