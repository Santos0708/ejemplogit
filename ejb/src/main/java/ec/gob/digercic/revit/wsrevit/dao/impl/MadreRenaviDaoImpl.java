package ec.gob.digercic.revit.wsrevit.dao.impl;

import java.util.List;

import javax.ejb.Stateless;

import ec.gob.digercic.revit.wsrevit.dao.MadreRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.impl.AbstractFacadeLocalImpl;
import ec.gob.digercic.revit.wsrevit.model.MadreRenavi;

@Stateless
public class MadreRenaviDaoImpl extends AbstractFacadeLocalImpl<MadreRenavi> implements MadreRenaviDao {
	private List<MadreRenavi> listResult;

	@Override
	public List<MadreRenavi> findMadreByCedulMad(String cedulaMadre) throws EntidadException {
		String paramMad = "cedulMad";
		listResult = consultarTablaResultList("MadreRenavi.findByCedulMad", paramMad, cedulaMadre);
		return listResult;
	}
	
	@Override
	public List<MadreRenavi> findMadreById(Long idMadre) throws EntidadException {
		String paramMad = "idMad";
		listResult = consultarTablaResultList("MadreRenavi.findByMadId", paramMad, idMadre);
		return listResult;
	}

	@Override
	public List<MadreRenavi> findMadreByPassport(String passMadre) throws EntidadException {
		String paramMad = "pasMad";
		listResult = consultarTablaResultList("MadreRenavi.findByMadPas", paramMad, passMadre);
		return listResult;
	}
	
}
