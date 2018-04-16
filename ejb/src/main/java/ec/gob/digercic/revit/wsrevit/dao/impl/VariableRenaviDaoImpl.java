package ec.gob.digercic.revit.wsrevit.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ec.gob.digercic.revit.wsrevit.dao.VariableRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.impl.AbstractFacadeLocalImpl;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.VariableRenavi;

@Stateless
public class VariableRenaviDaoImpl extends AbstractFacadeLocalImpl<VariableRenavi> implements VariableRenaviDao {

	@Override
	public VariableRenavi findByName(List<ParametroConsulta> listParams)
			throws EntidadException, NoResultException, NonUniqueResultException {
		VariableRenavi resultVar = (VariableRenavi) consultarTablaSingleResult(
				"VariableRenavi.findByVarNombre", listParams);
		
		return resultVar;
	}

}
