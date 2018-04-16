
package ec.gob.digercic.wsintegracion;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregEstrucSist complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregEstrucSist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEsctructSist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEstructura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEstrucSist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPermiso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordenEstruct" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoSistEstruct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregEstrucSist", propOrder = {
    "codEsctructSist",
    "codEstructura",
    "descripcion",
    "idEstrucSist",
    "idPermiso",
    "idSistema",
    "imagen",
    "ordenEstruct",
    "paginas",
    "status",
    "tipoSistEstruct"
})
public class TblSauregEstrucSist {

    protected String codEsctructSist;
    protected Long codEstructura;
    protected String descripcion;
    protected Long idEstrucSist;
    protected Long idPermiso;
    protected Long idSistema;
    protected String imagen;
    protected BigInteger ordenEstruct;
    protected String paginas;
    protected String status;
    protected String tipoSistEstruct;

    /**
     * Obtiene el valor de la propiedad codEsctructSist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsctructSist() {
        return codEsctructSist;
    }

    /**
     * Define el valor de la propiedad codEsctructSist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsctructSist(String value) {
        this.codEsctructSist = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstructura.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodEstructura() {
        return codEstructura;
    }

    /**
     * Define el valor de la propiedad codEstructura.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodEstructura(Long value) {
        this.codEstructura = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstrucSist.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEstrucSist() {
        return idEstrucSist;
    }

    /**
     * Define el valor de la propiedad idEstrucSist.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEstrucSist(Long value) {
        this.idEstrucSist = value;
    }

    /**
     * Obtiene el valor de la propiedad idPermiso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPermiso() {
        return idPermiso;
    }

    /**
     * Define el valor de la propiedad idPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPermiso(Long value) {
        this.idPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad idSistema.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSistema(Long value) {
        this.idSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenEstruct.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdenEstruct() {
        return ordenEstruct;
    }

    /**
     * Define el valor de la propiedad ordenEstruct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdenEstruct(BigInteger value) {
        this.ordenEstruct = value;
    }

    /**
     * Obtiene el valor de la propiedad paginas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaginas() {
        return paginas;
    }

    /**
     * Define el valor de la propiedad paginas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaginas(String value) {
        this.paginas = value;
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

    /**
     * Obtiene el valor de la propiedad tipoSistEstruct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSistEstruct() {
        return tipoSistEstruct;
    }

    /**
     * Define el valor de la propiedad tipoSistEstruct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSistEstruct(String value) {
        this.tipoSistEstruct = value;
    }

}
