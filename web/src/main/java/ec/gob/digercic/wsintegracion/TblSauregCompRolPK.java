
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregCompRolPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregCompRolPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEstrucSist" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idPermiso" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idRol" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregCompRolPK", propOrder = {
    "idEstrucSist",
    "idPermiso",
    "idRol"
})
public class TblSauregCompRolPK {

    protected long idEstrucSist;
    protected long idPermiso;
    protected long idRol;

    /**
     * Obtiene el valor de la propiedad idEstrucSist.
     * 
     */
    public long getIdEstrucSist() {
        return idEstrucSist;
    }

    /**
     * Define el valor de la propiedad idEstrucSist.
     * 
     */
    public void setIdEstrucSist(long value) {
        this.idEstrucSist = value;
    }

    /**
     * Obtiene el valor de la propiedad idPermiso.
     * 
     */
    public long getIdPermiso() {
        return idPermiso;
    }

    /**
     * Define el valor de la propiedad idPermiso.
     * 
     */
    public void setIdPermiso(long value) {
        this.idPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public long getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(long value) {
        this.idRol = value;
    }

}
