package ec.gob.digercic.revit.wsrevit.service;

import java.util.List;

import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.PadreRenavi;

public interface PadreRenaviService {
	public PadreRenavi buscarPorCedula(List<ParametroConsulta> listaParametros);
	public boolean crearPadre(PadreRenavi padreAdd);

}
