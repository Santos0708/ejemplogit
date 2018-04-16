
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tblSauregCompRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tblSauregCompRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tblSauregCompRolPK" type="{http://service.registrocivil.gob.ec/}tblSauregCompRolPK" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregEstrucSist" type="{http://service.registrocivil.gob.ec/}tblSauregEstrucSist" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregPermiso" type="{http://service.registrocivil.gob.ec/}tblSauregPermiso" minOccurs="0"/&gt;
 *         &lt;element name="tblSauregRol" type="{http://service.registrocivil.gob.ec/}tblSauregRol" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tblSauregCompRol", propOrder = {
    "tblSauregCompRolPK",
    "tblSauregEstrucSist",
    "tblSauregPermiso",
    "tblSauregRol"
})
public class TblSauregCompRol {

    protected TblSauregCompRolPK tblSauregCompRolPK;
    protected TblSauregEstrucSist tblSauregEstrucSist;
    protected TblSauregPermiso tblSauregPermiso;
    protected TblSauregRol tblSauregRol;

    /**
     * Obtiene el valor de la propiedad tblSauregCompRolPK.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregCompRolPK }
     *     
     */
    public TblSauregCompRolPK getTblSauregCompRolPK() {
        return tblSauregCompRolPK;
    }

    /**
     * Define el valor de la propiedad tblSauregCompRolPK.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregCompRolPK }
     *     
     */
    public void setTblSauregCompRolPK(TblSauregCompRolPK value) {
        this.tblSauregCompRolPK = value;
    }

    /**
     * Obtiene el valor de la propiedad tblSauregEstrucSist.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregEstrucSist }
     *     
     */
    public TblSauregEstrucSist getTblSauregEstrucSist() {
        return tblSauregEstrucSist;
    }

    /**
     * Define el valor de la propiedad tblSauregEstrucSist.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregEstrucSist }
     *     
     */
    public void setTblSauregEstrucSist(TblSauregEstrucSist value) {
        this.tblSauregEstrucSist = value;
    }

    /**
     * Obtiene el valor de la propiedad tblSauregPermiso.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregPermiso }
     *     
     */
    public TblSauregPermiso getTblSauregPermiso() {
        return tblSauregPermiso;
    }

    /**
     * Define el valor de la propiedad tblSauregPermiso.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregPermiso }
     *     
     */
    public void setTblSauregPermiso(TblSauregPermiso value) {
        this.tblSauregPermiso = value;
    }

    /**
     * Obtiene el valor de la propiedad tblSauregRol.
     * 
     * @return
     *     possible object is
     *     {@link TblSauregRol }
     *     
     */
    public TblSauregRol getTblSauregRol() {
        return tblSauregRol;
    }

    /**
     * Define el valor de la propiedad tblSauregRol.
     * 
     * @param value
     *     allowed object is
     *     {@link TblSauregRol }
     *     
     */
    public void setTblSauregRol(TblSauregRol value) {
        this.tblSauregRol = value;
    }

}
