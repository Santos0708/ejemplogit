
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUbcListByIdGrupStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUbcListByIdGrupStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idGrupo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusList" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUbcListByIdGrupStatus", propOrder = {
    "idGrupo",
    "statusList"
})
public class GetUbcListByIdGrupStatus {

    @XmlElement(required = true)
    protected String idGrupo;
    @XmlElement(required = true)
    protected String statusList;

    /**
     * Obtiene el valor de la propiedad idGrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdGrupo() {
        return idGrupo;
    }

    /**
     * Define el valor de la propiedad idGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdGrupo(String value) {
        this.idGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad statusList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusList() {
        return statusList;
    }

    /**
     * Define el valor de la propiedad statusList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusList(String value) {
        this.statusList = value;
    }

}
