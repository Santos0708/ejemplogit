package ec.gob.digercic.revit.wsrevit.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import ec.gob.digercic.revit.wsrevit.dao.PadreRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.impl.AbstractFacadeLocalImpl;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.PadreRenavi;

@Stateless
public class PadreRenaviDaoImpl extends AbstractFacadeLocalImpl<PadreRenavi> implements PadreRenaviDao {

	@Override
	public PadreRenavi findByCedula(List<ParametroConsulta> listParams)
			throws EntidadException, NoResultException, NonUniqueResultException {
		PadreRenavi padreResult = (PadreRenavi) consultarTablaSingleResult("PadreRenavi.findByCedulPad", listParams);
		return padreResult;
	}

	@Override
	public void createPadre(PadreRenavi padreAdd) throws EntidadException {
		create(padreAdd);
	}

}
