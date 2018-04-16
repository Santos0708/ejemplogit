
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAgenciaByIdAgenciaWSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgenciaByIdAgenciaWSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TblSauregAgencia" type="{http://service.registrocivil.gob.ec/}tblSauregAgencia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAgenciaByIdAgenciaWSResponse", propOrder = {
    "tblSauregAgencia"
})
public class GetAgenciaByIdAgenciaWSResponse {

    @XmlElement(name = "TblSauregAgencia")
    protected TblSauregAgencia tblSauregAgencia;

    /**
     * Obtiene el valor de la propiedad tblSauregAgencia.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregAgencia }
     *     
     */
    public TblSauregAgencia getTblSauregAgencia() {
        return tblSauregAgencia;
    }

    /**
     * Define el valor de la propiedad tblSauregAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregAgencia }
     *     
     */
    public void setTblSauregAgencia(TblSauregAgencia value) {
        this.tblSauregAgencia = value;
    }

}
