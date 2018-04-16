
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbicacionByIdUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbicacionByIdUbicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUbicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbicacionByIdUbicacion", propOrder = {
    "idUbicacion"
})
public class GetUbicacionByIdUbicacion {

    @XmlElement(required = true)
    protected String idUbicacion;

    /**
     * Obtiene el valor de la propiedad idUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUbicacion() {
        return idUbicacion;
    }

    /**
     * Define el valor de la propiedad idUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUbicacion(String value) {
        this.idUbicacion = value;
    }

}
