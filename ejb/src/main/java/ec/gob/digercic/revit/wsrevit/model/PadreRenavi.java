package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "PADRE_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "PadreRenavi.findAll", query = "SELECT p FROM PadreRenavi p"),
		@NamedQuery(name = "PadreRenavi.findByIdPad", query = "SELECT p FROM PadreRenavi p WHERE p.idPad = :idPad"),
		@NamedQuery(name = "PadreRenavi.findByCedulPad", query = "SELECT p FROM PadreRenavi p WHERE p.cedulPad = :cedulPad"),
		@NamedQuery(name = "PadreRenavi.findByNombrPad", query = "SELECT p FROM PadreRenavi p WHERE p.nombrPad = :nombrPad"),
		@NamedQuery(name = "PadreRenavi.findByPasapPad", query = "SELECT p FROM PadreRenavi p WHERE p.pasapPad = :pasapPad") })
public class PadreRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "SEQ_RENAVI_PADRE", sequenceName = "SEQ_RENAVI_PADRE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RENAVI_PADRE")
	@NotNull
	@Column(name = "ID_PAD")
	private BigDecimal idPad;
	@Size(max = 10)
	@Column(name = "CEDUL_PAD")
	private String cedulPad;
	@Size(max = 100)
	@Column(name = "NOMBR_PAD")
	private String nombrPad;
	@Size(max = 13)
	@Column(name = "PASAP_PAD")
	private String pasapPad;
	@Column(name = "FECHA_NACIM_PAD")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimPad;
	@OneToMany(mappedBy = "fkCedulPad")
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public PadreRenavi() {
	}

	public PadreRenavi(BigDecimal idPad) {
		this.idPad = idPad;
	}

	public BigDecimal getIdPad() {
		return idPad;
	}

	public void setIdPad(BigDecimal idPad) {
		this.idPad = idPad;
	}

	public String getCedulPad() {
		return cedulPad;
	}

	public void setCedulPad(String cedulPad) {
		this.cedulPad = cedulPad;
	}

	public String getNombrPad() {
		return nombrPad;
	}

	public void setNombrPad(String nombrPad) {
		this.nombrPad = nombrPad;
	}

	public String getPasapPad() {
		return pasapPad;
	}

	public void setPasapPad(String pasapPad) {
		this.pasapPad = pasapPad;
	}

	public Date getFechaNacimPad() {
		return fechaNacimPad;
	}

	public void setFechaNacimPad(Date fechaNacimPad) {
		this.fechaNacimPad = fechaNacimPad;
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
		hash += (idPad != null ? idPad.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PadreRenavi)) {
			return false;
		}
		PadreRenavi other = (PadreRenavi) object;
		if ((this.idPad == null && other.idPad != null) || (this.idPad != null && !this.idPad.equals(other.idPad))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.PadreRenavi[ idPad=" + idPad + " ]";
	}

}
