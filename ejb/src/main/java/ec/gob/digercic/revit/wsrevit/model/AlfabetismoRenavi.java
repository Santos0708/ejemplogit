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
@Table(name = "ALFABETISMO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "AlfabetismoRenavi.findAll", query = "SELECT a FROM AlfabetismoRenavi a"),
		@NamedQuery(name = "AlfabetismoRenavi.findByIdAlfb", query = "SELECT a FROM AlfabetismoRenavi a WHERE a.idAlfb = :idAlfb"),
		@NamedQuery(name = "AlfabetismoRenavi.findByDescAlfb", query = "SELECT a FROM AlfabetismoRenavi a WHERE a.descAlfb = :descAlfb") })
public class AlfabetismoRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_ALFB")
	private BigDecimal idAlfb;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2)
	@Column(name = "DESC_ALFB")
	private String descAlfb;
	// @OneToMany(mappedBy = "fkIdSabeLeerMad", fetch = FetchType.LAZY)
	// private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public AlfabetismoRenavi() {
	}

	public AlfabetismoRenavi(BigDecimal idAlfb) {
		this.idAlfb = idAlfb;
	}

	public AlfabetismoRenavi(BigDecimal idAlfb, String descAlfb) {
		this.idAlfb = idAlfb;
		this.descAlfb = descAlfb;
	}

	public BigDecimal getIdAlfb() {
		return idAlfb;
	}

	public void setIdAlfb(BigDecimal idAlfb) {
		this.idAlfb = idAlfb;
	}

	public String getDescAlfb() {
		return descAlfb;
	}

	public void setDescAlfb(String descAlfb) {
		this.descAlfb = descAlfb;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idAlfb != null ? idAlfb.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof AlfabetismoRenavi)) {
			return false;
		}
		AlfabetismoRenavi other = (AlfabetismoRenavi) object;
		if ((this.idAlfb == null && other.idAlfb != null)
				|| (this.idAlfb != null && !this.idAlfb.equals(other.idAlfb))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.AlfabetismoRenavi[ idAlfb=" + idAlfb + " ]";
	}

}
