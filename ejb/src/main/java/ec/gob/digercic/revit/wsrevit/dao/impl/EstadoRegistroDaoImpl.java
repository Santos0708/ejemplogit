package ec.gob.digercic.revit.wsrevit.dao.impl;

import javax.ejb.Stateless;

import ec.gob.digercic.revit.wsrevit.dao.EstadoRegistroDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.impl.AbstractFacadeLocalImpl;
import ec.gob.digercic.revit.wsrevit.model.EstadoRegistroRenavi;

@Stateless
public class EstadoRegistroDaoImpl extends AbstractFacadeLocalImpl<EstadoRegistroRenavi> implements EstadoRegistroDao {

	@Override
	public EstadoRegistroRenavi findById(Integer idEstadoReg) throws EntidadException {
		EstadoRegistroRenavi estadoResult = find(idEstadoReg);
		return estadoResult;
	}

}
