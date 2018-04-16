package ec.gob.digercic.revit.wsrevit.generics.ws;

import java.io.Serializable;

public class ParametroConsulta implements Serializable {
	
	private static final long serialVersionUID = 3823440874951355517L;
	private String nombreParametro;
	private Object valorParametro;
    
	public ParametroConsulta() {
		
	}
    
	public ParametroConsulta(String nombreParametro, Object valorParametro) {
		super();
		this.nombreParametro = nombreParametro;
		this.valorParametro = valorParametro;
	}

	public String getNombreParametro() {
		return nombreParametro;
	}

	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}

	public Object getValorParametro() {
		return valorParametro;
	}

	public void setValorParametro(Object valorParametro) {
		this.valorParametro = valorParametro;
	}
	
	

}
