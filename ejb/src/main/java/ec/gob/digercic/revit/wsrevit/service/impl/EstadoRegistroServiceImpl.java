package ec.gob.digercic.revit.wsrevit.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.digercic.revit.wsrevit.dao.EstadoRegistroDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.model.EstadoRegistroRenavi;
import ec.gob.digercic.revit.wsrevit.service.EstadoRegistroService;

@Stateless(name = "estadoRegistroService")
public class EstadoRegistroServiceImpl implements EstadoRegistroService {
	@EJB
	private EstadoRegistroDao estadoRegistroDao;

	@Override
	public EstadoRegistroRenavi buscarPorId(Integer idEstado) {
		EstadoRegistroRenavi estadoResult = null;
		try {
			estadoResult = estadoRegistroDao.find(idEstado);
		} catch (EntidadException e) {
			System.out.println("error al consultar el estado registro");
			e.printStackTrace();
		}
		
		return estadoResult;
	}

}
