
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAgenciasByIdUbiacionStatusWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgenciasByIdUbiacionStatusWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUbicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAgenciasByIdUbiacionStatusWS", propOrder = {
    "idUbicacion",
    "idSistema",
    "tipoAgencia",
    "status"
})
public class GetAgenciasByIdUbiacionStatusWS {

    @XmlElement(required = true)
    protected String idUbicacion;
    @XmlElement(required = true)
    protected String idSistema;
    @XmlElement(required = true)
    protected String tipoAgencia;
    @XmlElement(required = true)
    protected String status;

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

    /**
     * Obtiene el valor de la propiedad idSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSistema(String value) {
        this.idSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAgencia() {
        return tipoAgencia;
    }

    /**
     * Define el valor de la propiedad tipoAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAgencia(String value) {
        this.tipoAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
