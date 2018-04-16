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
@Table(name = "TIPO_INSCRIPCION_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoInscripcionRenavi.findAll", query = "SELECT t FROM TipoInscripcionRenavi t"),
		@NamedQuery(name = "TipoInscripcionRenavi.findByIdTipIns", query = "SELECT t FROM TipoInscripcionRenavi t WHERE t.idTipIns = :idTipIns"),
		@NamedQuery(name = "TipoInscripcionRenavi.findByDescrTipIns", query = "SELECT t FROM TipoInscripcionRenavi t WHERE t.descrTipIns = :descrTipIns") })
public class TipoInscripcionRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_TIP_INS")
	private BigDecimal idTipIns;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "DESCR_TIP_INS")
	private String descrTipIns;
	/*
	 * @OneToMany(mappedBy = "fkIdTipIns", fetch = FetchType.LAZY) private
	 * List<NacidoVivoRenavi> nacidoVivoRenaviList;
	 */

	public TipoInscripcionRenavi() {
	}

	public TipoInscripcionRenavi(BigDecimal idTipIns) {
		this.idTipIns = idTipIns;
	}

	public TipoInscripcionRenavi(BigDecimal idTipIns, String descrTipIns) {
		this.idTipIns = idTipIns;
		this.descrTipIns = descrTipIns;
	}

	public BigDecimal getIdTipIns() {
		return idTipIns;
	}

	public void setIdTipIns(BigDecimal idTipIns) {
		this.idTipIns = idTipIns;
	}

	public String getDescrTipIns() {
		return descrTipIns;
	}

	public void setDescrTipIns(String descrTipIns) {
		this.descrTipIns = descrTipIns;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipIns != null ? idTipIns.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TipoInscripcionRenavi)) {
			return false;
		}
		TipoInscripcionRenavi other = (TipoInscripcionRenavi) object;
		if ((this.idTipIns == null && other.idTipIns != null)
				|| (this.idTipIns != null && !this.idTipIns.equals(other.idTipIns))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.TipoInscripcionRenavi[ idTipIns=" + idTipIns + " ]";
	}

}
