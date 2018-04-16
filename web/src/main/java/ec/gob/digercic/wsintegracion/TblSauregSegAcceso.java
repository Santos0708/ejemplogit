
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregSegAcceso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregSegAcceso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAgencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codInstitucion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idRol" type="{http://service.registrocivil.gob.ec/}tblSauregRol" minOccurs="0"/&gt;
 *         &lt;element name="idSegAcceso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nomUsuario" type="{http://service.registrocivil.gob.ec/}tblSauregUsuario" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregSegAcceso", propOrder = {
    "codAgencia",
    "codInstitucion",
    "idRol",
    "idSegAcceso",
    "nomUsuario",
    "status"
})
public class TblSauregSegAcceso {

    protected Long codAgencia;
    protected Long codInstitucion;
    protected TblSauregRol idRol;
    protected Long idSegAcceso;
    protected TblSauregUsuario nomUsuario;
    protected String status;

    /**
     * Obtiene el valor de la propiedad codAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodAgencia() {
        return codAgencia;
    }

    /**
     * Define el valor de la propiedad codAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodAgencia(Long value) {
        this.codAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodInstitucion() {
        return codInstitucion;
    }

    /**
     * Define el valor de la propiedad codInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodInstitucion(Long value) {
        this.codInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregRol }
     *     
     */
    public TblSauregRol getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregRol }
     *     
     */
    public void setIdRol(TblSauregRol value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad idSegAcceso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSegAcceso() {
        return idSegAcceso;
    }

    /**
     * Define el valor de la propiedad idSegAcceso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSegAcceso(Long value) {
        this.idSegAcceso = value;
    }

    /**
     * Obtiene el valor de la propiedad nomUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregUsuario }
     *     
     */
    public TblSauregUsuario getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Define el valor de la propiedad nomUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregUsuario }
     *     
     */
    public void setNomUsuario(TblSauregUsuario value) {
        this.nomUsuario = value;
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
