package ec.gob.digercic.revit.wsrevit.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ec.gob.digercic.revit.wsrevit.dao.PadreRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.PadreRenavi;
import ec.gob.digercic.revit.wsrevit.service.PadreRenaviService;

@Stateless(name = "padreRenaviService")
public class PadreRenaviServiceImpl implements PadreRenaviService {
	@EJB
	private PadreRenaviDao padreRenaviDao;

	@Override
	public PadreRenavi buscarPorCedula(List<ParametroConsulta> listaParametros) {
		PadreRenavi padreResult = null;
		try {
			padreResult = padreRenaviDao.findByCedula(listaParametros);
		} catch (NoResultException e) {
			System.out.println("La búsqueda no generó resultados.");
			e.printStackTrace();
		} catch (NonUniqueResultException e) {
			System.out.println("La búsqueda generó más de un resultado.");
			e.printStackTrace();
		} catch (EntidadException e) {
			System.out.println("Error al consultar el padre.");
			e.printStackTrace();
		}

		return padreResult;

	}

	@Override
	public boolean crearPadre(PadreRenavi padreAdd) {
		boolean result = false;
		
		try {
			padreRenaviDao.createPadre(padreAdd);
			result = true;
		} catch (EntidadException e) {
			System.out.println("Error al insertar el padre");
			e.printStackTrace();
		}
		return result;
		
	}

}
