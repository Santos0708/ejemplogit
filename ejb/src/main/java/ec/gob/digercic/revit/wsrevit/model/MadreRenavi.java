package ec.gob.digercic.revit.wsrevit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

@Entity
@Table(name = "MADRE_RENAVI")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "MadreRenavi.findByCedulMad", query = "SELECT m FROM MadreRenavi m WHERE m.cedulMad = :cedulMad"),
		@NamedQuery(name = "MadreRenavi.findByNombrMad", query = "SELECT m FROM MadreRenavi m WHERE m.nombrMad LIKE :nombrMad AND m.status = :status"),
		@NamedQuery(name = "MadreRenavi.findByMadId", query = "SELECT m FROM MadreRenavi m WHERE m.idMad = :idMad"),
		@NamedQuery(name = "MadreRenavi.findByMadPas", query = "SELECT m FROM MadreRenavi m WHERE m.pasapMad = :pasMad"), })
public class MadreRenavi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_MAD")
	private Long idMad;
	@Size(max = 12)
	@Column(name = "CEDUL_MAD")
	private String cedulMad;
	@Size(max = 120)
	@Column(name = "NOMBR_MAD")
	private String nombrMad;
	@Column(name = "FECHA_NACIM_MAD")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimMad;
	@Size(max = 20)
	@Column(name = "PASAP_MAD")
	private String pasapMad;
	@Column(name = "ANIO_NACIM_MAD")
	private Short anioNacimMad;
	@Column(name = "MES_NACIM_MAD")
	private Short mesNacimMad;
	@Column(name = "DIA_NACIM_MAD")
	private Short diaNacimMad;
	@Size(max = 120)
	@Column(name = "NOM_PADRE_MAD")
	private String nomPadreMad;
	@Size(max = 120)
	@Column(name = "NOM_MADRE_MAD")
	private String nomMadreMad;
	@Size(max = 1)
	@Column(name = "STATUS")
	private String status;
	@Size(max = 12)
	@Column(name = "CEDUL_INSCRIPCION_MAD")
	private String cedulInscripcionMad;
	@Size(max = 120)
	@Column(name = "NOMBR_INSCRIPCION_MAD")
	private String nombrInscripcionMad;
	@Column(name = "FECHA_INSCRIPCION_NACIM_MAD")
	@Temporal(TemporalType.DATE)
	private Date fechaInscripcionNacimMad;
	@Size(max = 20)
	@Column(name = "PASAP_INSCRIPCION_MAD")
	private String pasapInscripcionMad;
	@JoinColumn(name = "FK_ID_TIPO_IDENT", referencedColumnName = "ID_TIPO_IDENT")
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoIdentRenavi fkIdTipoIdent;
	@OneToMany(mappedBy = "fkCedulMad")
	private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public MadreRenavi() {
	}

	public MadreRenavi(Long idMad) {
		this.idMad = idMad;
	}

	public Long getIdMad() {
		return idMad;
	}

	public void setIdMad(Long idMad) {
		this.idMad = idMad;
	}

	public String getCedulMad() {
		return cedulMad;
	}

	public void setCedulMad(String cedulMad) {
		this.cedulMad = cedulMad;
	}

	public String getNombrMad() {
		return nombrMad;
	}

	public void setNombrMad(String nombrMad) {
		this.nombrMad = nombrMad;
	}

	public Date getFechaNacimMad() {
		return fechaNacimMad;
	}

	public void setFechaNacimMad(Date fechaNacimMad) {
		this.fechaNacimMad = fechaNacimMad;
	}

	public String getPasapMad() {
		return pasapMad;
	}

	public void setPasapMad(String pasapMad) {
		this.pasapMad = pasapMad;
	}

	public Short getAnioNacimMad() {
		return anioNacimMad;
	}

	public void setAnioNacimMad(Short anioNacimMad) {
		this.anioNacimMad = anioNacimMad;
	}

	public Short getMesNacimMad() {
		return mesNacimMad;
	}

	public void setMesNacimMad(Short mesNacimMad) {
		this.mesNacimMad = mesNacimMad;
	}

	public Short getDiaNacimMad() {
		return diaNacimMad;
	}

	public void setDiaNacimMad(Short diaNacimMad) {
		this.diaNacimMad = diaNacimMad;
	}

	public String getNomPadreMad() {
		return nomPadreMad;
	}

	public void setNomPadreMad(String nomPadreMad) {
		this.nomPadreMad = nomPadreMad;
	}

	public String getNomMadreMad() {
		return nomMadreMad;
	}

	public void setNomMadreMad(String nomMadreMad) {
		this.nomMadreMad = nomMadreMad;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TipoIdentRenavi getFkIdTipoIdent() {
		return fkIdTipoIdent;
	}

	public void setFkIdTipoIdent(TipoIdentRenavi fkIdTipoIdent) {
		this.fkIdTipoIdent = fkIdTipoIdent;
	}

	public String getCedulInscripcionMad() {
		return cedulInscripcionMad;
	}

	public void setCedulInscripcionMad(String cedulInscripcionMad) {
		this.cedulInscripcionMad = cedulInscripcionMad;
	}

	public String getNombrInscripcionMad() {
		return nombrInscripcionMad;
	}

	public void setNombrInscripcionMad(String nombrInscripcionMad) {
		this.nombrInscripcionMad = nombrInscripcionMad;
	}

	public Date getFechaInscripcionNacimMad() {
		return fechaInscripcionNacimMad;
	}

	public void setFechaInscripcionNacimMad(Date fechaInscripcionNacimMad) {
		this.fechaInscripcionNacimMad = fechaInscripcionNacimMad;
	}

	public String getPasapInscripcionMad() {
		return pasapInscripcionMad;
	}

	public void setPasapInscripcionMad(String pasapInscripcionMad) {
		this.pasapInscripcionMad = pasapInscripcionMad;
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
		hash += (idMad != null ? idMad.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof MadreRenavi)) {
			return false;
		}
		MadreRenavi other = (MadreRenavi) object;
		if ((this.idMad == null && other.idMad != null) || (this.idMad != null && !this.idMad.equals(other.idMad))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.wsrevit.entities.revit.MadreRenavi[ idMad=" + idMad + " ]";
	}

}
