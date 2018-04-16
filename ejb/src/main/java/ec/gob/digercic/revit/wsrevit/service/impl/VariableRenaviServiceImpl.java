package ec.gob.digercic.revit.wsrevit.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ec.gob.digercic.revit.wsrevit.dao.VariableRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.VariableRenavi;
import ec.gob.digercic.revit.wsrevit.service.VariableRenaviService;

@Stateless(name = "variableRenaviService")
public class VariableRenaviServiceImpl implements VariableRenaviService {
	@EJB
	private VariableRenaviDao variableRenaviDao;

	@Override
	public String buscarPorNombre(String nombreVar) {
		VariableRenavi resultVar = null;
		String resultQuery = "";
		List<ParametroConsulta> listParams = new ArrayList<>();
		listParams.add(new ParametroConsulta("varNombre", nombreVar));

		try {
			resultVar = variableRenaviDao.findByName(listParams);
		} catch (EntidadException e) {
			System.out.println("Error al consultar tabla VARIABLE_RENAVI");
		} catch (NoResultException e) {
			System.out.println("No existen datos en VARIABLE_RENAVI para el parametro");
		} catch (NonUniqueResultException e) {
			System.out.println("Existen varios resultados en la tabla VARIABLE_RENAVI para el parametro");
		}

		if (resultVar != null) {
			resultQuery = resultVar.getVarValor();
		}

		return resultQuery;
	}

}
