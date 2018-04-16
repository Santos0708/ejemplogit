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
@Table(name = "PRODUCTO_EMBARAZO_RENAVI")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "ProductoEmbarazoRenavi.findAll", query = "SELECT p FROM ProductoEmbarazoRenavi p"),
		@NamedQuery(name = "ProductoEmbarazoRenavi.findByIdProEmb", query = "SELECT p FROM ProductoEmbarazoRenavi p WHERE p.idProEmb = :idProEmb"),
		@NamedQuery(name = "ProductoEmbarazoRenavi.findByDescrProEmb", query = "SELECT p FROM ProductoEmbarazoRenavi p WHERE p.descrProEmb = :descrProEmb") })
public class ProductoEmbarazoRenavi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_PRO_EMB")
	private BigDecimal idProEmb;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "DESCR_PRO_EMB")
	private String descrProEmb;
	// @OneToMany(mappedBy = "fkIdProEmb", fetch = FetchType.LAZY)
	// private List<NacidoVivoRenavi> nacidoVivoRenaviList;

	public ProductoEmbarazoRenavi() {
	}

	public ProductoEmbarazoRenavi(BigDecimal idProEmb) {
		this.idProEmb = idProEmb;
	}

	public ProductoEmbarazoRenavi(BigDecimal idProEmb, String descrProEmb) {
		this.idProEmb = idProEmb;
		this.descrProEmb = descrProEmb;
	}

	public BigDecimal getIdProEmb() {
		return idProEmb;
	}

	public void setIdProEmb(BigDecimal idProEmb) {
		this.idProEmb = idProEmb;
	}

	public String getDescrProEmb() {
		return descrProEmb;
	}

	public void setDescrProEmb(String descrProEmb) {
		this.descrProEmb = descrProEmb;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idProEmb != null ? idProEmb.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ProductoEmbarazoRenavi)) {
			return false;
		}
		ProductoEmbarazoRenavi other = (ProductoEmbarazoRenavi) object;
		if ((this.idProEmb == null && other.idProEmb != null)
				|| (this.idProEmb != null && !this.idProEmb.equals(other.idProEmb))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ec.gob.digercic.revit.wsrevit.model.ProductoEmbarazoRenavi[ idProEmb=" + idProEmb + " ]";
	}

}
