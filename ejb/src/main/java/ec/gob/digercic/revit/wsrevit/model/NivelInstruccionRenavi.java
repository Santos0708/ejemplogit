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
@Table(name = "NIVEL_INSTRUCCION_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "NivelInstruccionRenavi.findAll", query = "SELECT n FROM NivelInstruccionRenavi n"),
		@NamedQuery(name = "NivelInstruccionRenavi.findByIdNivIns", query = "SELECT n FROM NivelInstruccionRenavi n WHERE n.idNivIns = :idNivIns"),
		@NamedQuery(name = "NivelInstruccionRenavi.findByDescrNivInst", query = "SELECT n FROM NivelInstruccionRenavi n WHERE n.descrNivInst = :descrNivInst") })
public class NivelInstruccionRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_NIV_INS")
	private BigDecimal idNivIns;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "DESCR_NIV_INST")
	private String descrNivInst;
	@OneToMany(mappedBy = "fkIdNivelInstr", fetch = FetchType.LAZY)
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public NivelInstruccionRenavi() {
	}

	public NivelInstruccionRenavi(BigDecimal idNivIns) {
		this.idNivIns = idNivIns;
	}

	public NivelInstruccionRenavi(BigDecimal idNivIns, String descrNivInst) {
		this.idNivIns = idNivIns;
		this.descrNivInst = descrNivInst;
	}

	public BigDecimal getIdNivIns() {
		return idNivIns;
	}

	public void setIdNivIns(BigDecimal idNivIns) {
		this.idNivIns = idNivIns;
	}

	public String getDescrNivInst() {
		return descrNivInst;
	}

	public void setDescrNivInst(String descrNivInst) {
		this.descrNivInst = descrNivInst;
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
		hash += (idNivIns != null ? idNivIns.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof NivelInstruccionRenavi)) {
			return false;
		}
		NivelInstruccionRenavi other = (NivelInstruccionRenavi) object;
		if ((this.idNivIns == null && other.idNivIns != null)
				|| (this.idNivIns != null && !this.idNivIns.equals(other.idNivIns))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.NivelInstruccionRenavi[ idNivIns=" + idNivIns + " ]";
	}

}
