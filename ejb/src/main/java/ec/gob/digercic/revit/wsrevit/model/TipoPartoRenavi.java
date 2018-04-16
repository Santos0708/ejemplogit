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
@Table(name = "TIPO_PARTO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoPartoRenavi.findAll", query = "SELECT t FROM TipoPartoRenavi t"),
		@NamedQuery(name = "TipoPartoRenavi.findByIdTipPar", query = "SELECT t FROM TipoPartoRenavi t WHERE t.idTipPar = :idTipPar"),
		@NamedQuery(name = "TipoPartoRenavi.findByDescrTipPar", query = "SELECT t FROM TipoPartoRenavi t WHERE t.descrTipPar = :descrTipPar") })
public class TipoPartoRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_TIP_PAR")
	private BigDecimal idTipPar;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "DESCR_TIP_PAR")
	private String descrTipPar;
	/*
	 * @OneToMany(mappedBy = "fkIdTipPar", fetch = FetchType.LAZY) private
	 * List<NacidoVivoRenavi> nacidoVivoRenaviList;
	 */

	public TipoPartoRenavi() {
	}

	public TipoPartoRenavi(BigDecimal idTipPar) {
		this.idTipPar = idTipPar;
	}

	public TipoPartoRenavi(BigDecimal idTipPar, String descrTipPar) {
		this.idTipPar = idTipPar;
		this.descrTipPar = descrTipPar;
	}

	public BigDecimal getIdTipPar() {
		return idTipPar;
	}

	public void setIdTipPar(BigDecimal idTipPar) {
		this.idTipPar = idTipPar;
	}

	public String getDescrTipPar() {
		return descrTipPar;
	}

	public void setDescrTipPar(String descrTipPar) {
		this.descrTipPar = descrTipPar;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipPar != null ? idTipPar.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TipoPartoRenavi)) {
			return false;
		}
		TipoPartoRenavi other = (TipoPartoRenavi) object;
		if ((this.idTipPar == null && other.idTipPar != null)
				|| (this.idTipPar != null && !this.idTipPar.equals(other.idTipPar))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.TipoPartoRenavi[ idTipPar=" + idTipPar + " ]";
	}

}
