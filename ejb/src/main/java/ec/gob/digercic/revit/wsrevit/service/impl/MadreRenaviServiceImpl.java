package ec.gob.digercic.revit.wsrevit.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.digercic.revit.wsrevit.dao.MadreRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.MadreRenaviVO;
import ec.gob.digercic.revit.wsrevit.model.MadreRenavi;
import ec.gob.digercic.revit.wsrevit.service.MadreRenaviService;

@Stateless(name = "madreRenaviService")
public class MadreRenaviServiceImpl implements MadreRenaviService {
	@EJB
	private MadreRenaviDao madreRenaviDao;
	
	private MadreRenaviVO madreResult;

	@Override
	public MadreRenaviVO buscarMadrePorCedula(String cedulaMadre) {
		try {
			List<MadreRenavi> listResult = madreRenaviDao.findMadreByCedulMad(cedulaMadre);
			
			// valido si trajo resultados
			if (listResult.size() > 0) {
				madreResult = new MadreRenaviVO();
				madreResult.setCedula(listResult.get(0).getCedulMad());
				madreResult.setNombre(listResult.get(0).getNombrMad());
			} else {
				madreResult = null;
			}

		} catch (EntidadException e) {
			e.printStackTrace();
			madreResult = null;
		}

		return madreResult;
	}

	@Override
	public MadreRenaviVO buscarMadrePorId(String idMadre) {
		try {
			List<MadreRenavi> listResult = madreRenaviDao.findMadreById(new Long(idMadre));
			
			// valido si trajo resultados
			if (listResult.size() > 0) {
				madreResult = new MadreRenaviVO();
				madreResult.setCedula(listResult.get(0).getCedulMad());
				madreResult.setNombre(listResult.get(0).getNombrMad());
			} else {
				madreResult = null;
			}
		} catch (EntidadException e) {
			e.printStackTrace();
			madreResult = null;
		}
		return madreResult;
	}

	@Override
	public MadreRenaviVO buscarMadrePorPasaporte(String passMadre) {
		try {
			List<MadreRenavi> listResult = madreRenaviDao.findMadreByPassport(passMadre);
			
			// valido si trajo resultados
			if (listResult.size() > 0) {
				madreResult = new MadreRenaviVO();
				madreResult.setCedula(listResult.get(0).getCedulMad());
				madreResult.setNombre(listResult.get(0).getNombrMad());
			} else {
				madreResult = null;
			}
		} catch (EntidadException e) {
			e.printStackTrace();
			madreResult = null;
		}
		
		return madreResult;
	}
	
}
