package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "TIPO_IDENT_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoIdentRenavi.findAll", query = "SELECT t FROM TipoIdentRenavi t"),
		@NamedQuery(name = "TipoIdentRenavi.findByIdTipIdent", query = "SELECT t FROM TipoIdentRenavi t WHERE t.idTipoIdent = :idTipoIdent"),
		@NamedQuery(name = "TipoIdentRenavi.findByDescripcion", query = "SELECT t FROM TipoIdentRenavi t WHERE t.descripcion = :descripcion") })
public class TipoIdentRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_RENAVI_TIPO_IDENTIFICACION", sequenceName = "SEQ_RENAVI_TIPO_IDENTIFICACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RENAVI_TIPO_IDENTIFICACION")
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_TIPO_IDENT")
	private BigDecimal idTipoIdent;
	@Size(max = 120)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@OneToMany(mappedBy = "fkIdTipoIdent", fetch = FetchType.LAZY)
	private List<MadreRenavi> madreRenaviList;

	public TipoIdentRenavi() {
	}

	public TipoIdentRenavi(BigDecimal idTipoIdent) {
		this.idTipoIdent = idTipoIdent;
	}

	public BigDecimal getIdTipoIdent() {
		return idTipoIdent;
	}

	public void setIdTipoIdent(BigDecimal idTipoIdent) {
		this.idTipoIdent = idTipoIdent;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlTransient
	public List<MadreRenavi> getMadreRenaviList() {
		return madreRenaviList;
	}

	public void setMadreRenaviList(List<MadreRenavi> madreRenaviList) {
		this.madreRenaviList = madreRenaviList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idTipoIdent != null ? idTipoIdent.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof TipoIdentRenavi)) {
			return false;
		}
		TipoIdentRenavi other = (TipoIdentRenavi) object;
		if ((this.idTipoIdent == null && other.idTipoIdent != null)
				|| (this.idTipoIdent != null && !this.idTipoIdent.equals(other.idTipoIdent))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.TipoIdentRenavi[ idTipoIdent=" + idTipoIdent + " ]";
	}

}
