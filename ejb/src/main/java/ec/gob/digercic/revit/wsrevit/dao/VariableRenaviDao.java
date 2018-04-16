package ec.gob.digercic.revit.wsrevit.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.AbstractFacadeLocal;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.VariableRenavi;

public interface VariableRenaviDao extends AbstractFacadeLocal<VariableRenavi> {
	public VariableRenavi findByName(List<ParametroConsulta> listParams) throws EntidadException, NoResultException, NonUniqueResultException;

}
