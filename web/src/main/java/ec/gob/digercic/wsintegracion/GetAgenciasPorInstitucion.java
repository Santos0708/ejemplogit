
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAgenciasPorInstitucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgenciasPorInstitucion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idInstitucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAgenciasPorInstitucion", propOrder = {
    "idInstitucion"
})
public class GetAgenciasPorInstitucion {

    @XmlElement(required = true)
    protected String idInstitucion;

    /**
     * Obtiene el valor de la propiedad idInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInstitucion() {
        return idInstitucion;
    }

    /**
     * Define el valor de la propiedad idInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInstitucion(String value) {
        this.idInstitucion = value;
    }

}
