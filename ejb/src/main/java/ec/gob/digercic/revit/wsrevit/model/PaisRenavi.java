package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "PAIS_RENAVI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaisRenavi.findAll", query = "SELECT p FROM PaisRenavi p"),
    @NamedQuery(name = "PaisRenavi.findByIdPais", query = "SELECT p FROM PaisRenavi p WHERE p.idPais = :idPais"),
    @NamedQuery(name = "PaisRenavi.findByDescPais", query = "SELECT p FROM PaisRenavi p WHERE p.descPais = :descPais"),
    @NamedQuery(name = "PaisRenavi.findByCodigPais", query = "SELECT p FROM PaisRenavi p WHERE p.codigPais = :codigPais")})
public class PaisRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PAIS")
    private BigDecimal idPais;
    @Size(max = 100)
    @Column(name = "DESC_PAIS")
    private String descPais;
    @Size(max = 2)
    @Column(name = "CODIG_PAIS")
    private String codigPais;

    public PaisRenavi() {
    }

    public PaisRenavi(BigDecimal idPais) {
        this.idPais = idPais;
    }

    public BigDecimal getIdPais() {
        return idPais;
    }

    public void setIdPais(BigDecimal idPais) {
        this.idPais = idPais;
    }

    public String getDescPais() {
        return descPais;
    }

    public void setDescPais(String descPais) {
        this.descPais = descPais;
    }

    public String getCodigPais() {
        return codigPais;
    }

    public void setCodigPais(String codigPais) {
        this.codigPais = codigPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PaisRenavi)) {
            return false;
        }
        PaisRenavi other = (PaisRenavi) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.gob.digercic.revit.wsrevit.model.PaisRenavi[ idPais=" + idPais + " ]";
    }

}
