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
@Table(name = "IDENTIFICACION_ETNICA_RENAVI")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "IdentificacionEtnicaRenavi.findAll", query = "SELECT i FROM IdentificacionEtnicaRenavi i"),
		@NamedQuery(name = "IdentificacionEtnicaRenavi.findByIdIdeEtn", query = "SELECT i FROM IdentificacionEtnicaRenavi i WHERE i.idIdeEtn = :idIdeEtn"),
		@NamedQuery(name = "IdentificacionEtnicaRenavi.findByDescIdeEtn", query = "SELECT i FROM IdentificacionEtnicaRenavi i WHERE i.descIdeEtn = :descIdeEtn") })
public class IdentificacionEtnicaRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_IDE_ETN")
	private BigDecimal idIdeEtn;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "DESC_IDE_ETN")
	private String descIdeEtn;
	@OneToMany(mappedBy = "fkIdIdeEtnMad", fetch = FetchType.LAZY)
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public IdentificacionEtnicaRenavi() {
	}

	public IdentificacionEtnicaRenavi(BigDecimal idIdeEtn) {
		this.idIdeEtn = idIdeEtn;
	}

	public IdentificacionEtnicaRenavi(BigDecimal idIdeEtn, String descIdeEtn) {
		this.idIdeEtn = idIdeEtn;
		this.descIdeEtn = descIdeEtn;
	}

	public BigDecimal getIdIdeEtn() {
		return idIdeEtn;
	}

	public void setIdIdeEtn(BigDecimal idIdeEtn) {
		this.idIdeEtn = idIdeEtn;
	}

	public String getDescIdeEtn() {
		return descIdeEtn;
	}

	public void setDescIdeEtn(String descIdeEtn) {
		this.descIdeEtn = descIdeEtn;
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
		hash += (idIdeEtn != null ? idIdeEtn.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof IdentificacionEtnicaRenavi)) {
			return false;
		}
		IdentificacionEtnicaRenavi other = (IdentificacionEtnicaRenavi) object;
		if ((this.idIdeEtn == null && other.idIdeEtn != null)
				|| (this.idIdeEtn != null && !this.idIdeEtn.equals(other.idIdeEtn))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.IdentificacionEtnicaRenavi[ idIdeEtn=" + idIdeEtn + " ]";
	}

}
