package ec.gob.digercic.revit.wsrevit.service;

import ec.gob.digercic.revit.wsrevit.generics.ws.MadreRenaviVO;

public interface MadreRenaviService {
	public MadreRenaviVO buscarMadrePorCedula(String cedulaMadre);
	
	public MadreRenaviVO buscarMadrePorId(String idMadre);
	
	public MadreRenaviVO buscarMadrePorPasaporte(String passMadre);
	
}
