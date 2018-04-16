package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@Table(name = "ESTADO_CIVIL_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EstadoCivilRenavi.findAll", query = "SELECT e FROM EstadoCivilRenavi e"),
		@NamedQuery(name = "EstadoCivilRenavi.findByIdEstCiv", query = "SELECT e FROM EstadoCivilRenavi e WHERE e.idEstCiv = :idEstCiv"),
		@NamedQuery(name = "EstadoCivilRenavi.findByDescEstCiv", query = "SELECT e FROM EstadoCivilRenavi e WHERE e.descEstCiv = :descEstCiv") })
public class EstadoCivilRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_EST_CIV")
	private BigDecimal idEstCiv;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "DESC_EST_CIV")
	private String descEstCiv;
	@OneToMany(mappedBy = "fkIdEstCivMad")
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public EstadoCivilRenavi() {
	}

	public EstadoCivilRenavi(BigDecimal idEstCiv) {
		this.idEstCiv = idEstCiv;
	}

	public EstadoCivilRenavi(BigDecimal idEstCiv, String descEstCiv) {
		this.idEstCiv = idEstCiv;
		this.descEstCiv = descEstCiv;
	}

	public BigDecimal getIdEstCiv() {
		return idEstCiv;
	}

	public void setIdEstCiv(BigDecimal idEstCiv) {
		this.idEstCiv = idEstCiv;
	}

	public String getDescEstCiv() {
		return descEstCiv;
	}

	public void setDescEstCiv(String descEstCiv) {
		this.descEstCiv = descEstCiv;
	}

	@XmlTransient
	public List<NacidoVivoRenavi> getNacidoVivoRenaviList() {
		return nacidoVivoRenaviList;
	}

	public void setNacidoVivoRenaviList(List<NacidoVivoRenavi> nacidoVivoRenaviList) {
		this.nacidoVivoRenaviList = nacidoVivoRenaviList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idEstCiv != null ? idEstCiv.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EstadoCivilRenavi)) {
			return false;
		}
		EstadoCivilRenavi other = (EstadoCivilRenavi) object;
		if ((this.idEstCiv == null && other.idEstCiv != null)
				|| (this.idEstCiv != null && !this.idEstCiv.equals(other.idEstCiv))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.EstadoCivilRenavi[ idEstCiv=" + idEstCiv + " ]";
	}

}
