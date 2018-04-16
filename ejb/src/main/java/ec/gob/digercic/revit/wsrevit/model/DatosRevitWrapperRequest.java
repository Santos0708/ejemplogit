package ec.gob.digercic.revit.wsrevit.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"user","password","cedulaMadre","codigoAgencia"})
@XmlAccessorType(XmlAccessType.FIELD)
public class DatosRevitWrapperRequest {
	@XmlElement(name="user", required=true)
	public String user;
	
	@XmlElement(name="password", required=true)
	public String password;
	
	@XmlElement(name="cedulaMadre", required=true)
	public String cedulaMadre;
	
	@XmlElement(name="codigoAgencia", required=true)
	public String codigoAgencia;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCedulaMadre() {
		return cedulaMadre;
	}

	public void setCedulaMadre(String cedulaMadre) {
		this.cedulaMadre = cedulaMadre;
	}

	public String getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}

	
}
