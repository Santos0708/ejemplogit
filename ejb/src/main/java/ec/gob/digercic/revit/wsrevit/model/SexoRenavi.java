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
@Table(name = "SEXO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "SexoRenavi.findAll", query = "SELECT s FROM SexoRenavi s"),
		@NamedQuery(name = "SexoRenavi.findByIdSexo", query = "SELECT s FROM SexoRenavi s WHERE s.idSexo = :idSexo"),
		@NamedQuery(name = "SexoRenavi.findByDescrSexo", query = "SELECT s FROM SexoRenavi s WHERE s.descrSexo = :descrSexo") })
public class SexoRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_SEXO")
	private BigDecimal idSexo;
	@Size(max = 12)
	@Column(name = "DESCR_SEXO")
	private String descrSexo;
	@OneToMany(mappedBy = "fkIdSexoNv")
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public SexoRenavi() {
	}

	public SexoRenavi(BigDecimal idSexo) {
		this.idSexo = idSexo;
	}

	public BigDecimal getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(BigDecimal idSexo) {
		this.idSexo = idSexo;
	}

	public String getDescrSexo() {
		return descrSexo;
	}

	public void setDescrSexo(String descrSexo) {
		this.descrSexo = descrSexo;
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
		hash += (idSexo != null ? idSexo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SexoRenavi)) {
			return false;
		}
		SexoRenavi other = (SexoRenavi) object;
		if ((this.idSexo == null && other.idSexo != null)
				|| (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.SexoRenavi[ idSexo=" + idSexo + " ]";
	}

}
