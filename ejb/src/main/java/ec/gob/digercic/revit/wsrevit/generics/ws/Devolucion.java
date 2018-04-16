package ec.gob.digercic.revit.wsrevit.generics.ws;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "codigoError", "descripcionError", "madre", "listMadres" })
public class Devolucion {
	private MadreRenaviVO madre;
    private List<MadreRenaviVO> listMadres;
    private String descripcionError;
    private String codigoError;
	
    @XmlElement(name = "madre")
    public MadreRenaviVO getMadre() {
		return madre;
	}
	public void setMadre(MadreRenaviVO madre) {
		this.madre = madre;
	}
	
	@XmlElement(name = "listMadres")
	public List<MadreRenaviVO> getListMadres() {
		return listMadres;
	}
	public void setListMadres(List<MadreRenaviVO> listMadres) {
		this.listMadres = listMadres;
	}
	
	@XmlElement(name = "descripcionError")
	public String getDescripcionError() {
		return descripcionError;
	}
	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}
	
	@XmlElement(name = "codigoError")
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
    
    

}
