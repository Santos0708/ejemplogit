package ec.gob.digercic.revit.wsrevit.dao;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.AbstractFacadeLocal;
import ec.gob.digercic.revit.wsrevit.model.EstadoRegistroRenavi;

public interface EstadoRegistroDao extends AbstractFacadeLocal<EstadoRegistroRenavi> {
	public EstadoRegistroRenavi findById(Integer idEstadoReg) throws EntidadException;

}
