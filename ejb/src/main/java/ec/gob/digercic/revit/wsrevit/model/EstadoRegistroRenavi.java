package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "ESTADO_REGISTRO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EstadoRegistroRenavi.findAll", query = "SELECT e FROM EstadoRegistroRenavi e"),
		@NamedQuery(name = "EstadoRegistroRenavi.findByIdEstReg", query = "SELECT e FROM EstadoRegistroRenavi e WHERE e.idEstReg = :idEstReg"),
		@NamedQuery(name = "EstadoRegistroRenavi.findByDescEstReg", query = "SELECT e FROM EstadoRegistroRenavi e WHERE e.descEstReg = :descEstReg") })
public class EstadoRegistroRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_EST_REG")
	private Integer idEstReg;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "DESC_EST_REG")
	private String descEstReg;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEstReg")
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public EstadoRegistroRenavi() {
	}

	public EstadoRegistroRenavi(Integer idEstReg) {
		this.idEstReg = idEstReg;
	}

	public EstadoRegistroRenavi(Integer idEstReg, String descEstReg) {
		this.idEstReg = idEstReg;
		this.descEstReg = descEstReg;
	}

	public Integer getIdEstReg() {
		return idEstReg;
	}

	public void setIdEstReg(Integer idEstReg) {
		this.idEstReg = idEstReg;
	}

	public String getDescEstReg() {
		return descEstReg;
	}

	public void setDescEstReg(String descEstReg) {
		this.descEstReg = descEstReg;
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
		hash += (idEstReg != null ? idEstReg.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof EstadoRegistroRenavi)) {
			return false;
		}
		EstadoRegistroRenavi other = (EstadoRegistroRenavi) object;
		if ((this.idEstReg == null && other.idEstReg != null)
				|| (this.idEstReg != null && !this.idEstReg.equals(other.idEstReg))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.EstadoRegistroRenavi[ idEstReg=" + idEstReg + " ]";
	}

}
