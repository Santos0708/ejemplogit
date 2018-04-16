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
@Table(name = "TIPO_AREA_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoAreaRenavi.findAll", query = "SELECT t FROM TipoAreaRenavi t"),
		@NamedQuery(name = "TipoAreaRenavi.findByIdTipArea", query = "SELECT t FROM TipoAreaRenavi t WHERE t.idTipArea = :idTipArea"),
		@NamedQuery(name = "TipoAreaRenavi.findByDescTipArea", query = "SELECT t FROM TipoAreaRenavi t WHERE t.descTipArea = :descTipArea") })
public class TipoAreaRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_TIP_AREA")
	private BigDecimal idTipArea;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "DESC_TIP_AREA")
	private String descTipArea;
	// @OneToMany(mappedBy = "fkIdTipoAreaMad", fetch = FetchType.LAZY)
	// private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public TipoAreaRenavi() {
	}

	public TipoAreaRenavi(BigDecimal idTipArea) {
		this.idTipArea = idTipArea;
	}

	public TipoAreaRenavi(BigDecimal idTipArea, String descTipArea) {
		this.idTipArea = idTipArea;
		this.descTipArea = descTipArea;
	}

	public BigDecimal getIdTipArea() {
		return idTipArea;
	}

	public void setIdTipArea(BigDecimal idTipArea) {
		this.idTipArea = idTipArea;
	}

	public String getDescTipArea() {
		return descTipArea;
	}

	public void setDescTipArea(String descTipArea) {
		this.descTipArea = descTipArea;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipArea != null ? idTipArea.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TipoAreaRenavi)) {
			return false;
		}
		TipoAreaRenavi other = (TipoAreaRenavi) object;
		if ((this.idTipArea == null && other.idTipArea != null)
				|| (this.idTipArea != null && !this.idTipArea.equals(other.idTipArea))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.TipoAreaRenavi[ idTipArea=" + idTipArea + " ]";
	}

}
