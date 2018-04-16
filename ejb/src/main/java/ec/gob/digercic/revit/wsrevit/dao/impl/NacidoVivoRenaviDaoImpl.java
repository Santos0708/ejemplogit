package ec.gob.digercic.revit.wsrevit.dao.impl;

import java.util.List;
import java.util.logging.Level;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.gob.digercic.revit.wsrevit.dao.NacidoVivoRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.impl.AbstractFacadeLocalImpl;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.NacidoVivoRenavi;

@Stateless
public class NacidoVivoRenaviDaoImpl extends AbstractFacadeLocalImpl<NacidoVivoRenavi> implements NacidoVivoRenaviDao {

	private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(NacidoVivoRenavi.class.getName());
	
	@Override
	public List<NacidoVivoRenavi> findByIdMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByIdMadIdAgencia", listParameters);
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> findByPassMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByPasapMadIdAgencia", listParameters);
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> findByCedulMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByCedulMadIdAgencia", listParameters);

		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> findByCedulMad(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByCedulMad", listParameters);

		return listResult;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NacidoVivoRenavi> findByAnuladoAndMadre(String cedulMad, Long idNacViv)  {
		String estAnulNacViv = "3";
		String queryString = "SELECT n FROM NacidoVivoRenavi n JOIN FETCH n.fkCedulMad m JOIN FETCH n.anulacionList a"
				+ " WHERE a.estAnulNacViv NOT IN :estAnulNacViv"
				+ " AND n.idNacViv = :idNacViv AND m.cedulMad = :cedulMad";
		
		Query query = em.createQuery(queryString, NacidoVivoRenavi.class);
		query.setParameter("estAnulNacViv", estAnulNacViv);
		query.setParameter("idNacViv", idNacViv);
		query.setParameter("cedulMad", cedulMad);

		return query.getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NacidoVivoRenavi> findByIdAnulado(Long idNacViv) throws Exception {
		String estAnulNacViv = "3";
		String queryString = "SELECT n FROM NacidoVivoRenavi n JOIN FETCH n.fkCedulMad m JOIN FETCH n.anulacionList a"
				+ " WHERE a.estAnulNacViv NOT IN :estAnulNacViv"
				+ " AND n.idNacViv = :idNacViv ";
		
		Query query = em.createQuery(queryString, NacidoVivoRenavi.class);
		query.setParameter("estAnulNacViv", estAnulNacViv);
		query.setParameter("idNacViv", idNacViv);
		
		return query.getResultList();
		
	}
	
	@Override
	public List<NacidoVivoRenavi> findByIdMad(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByIdMad", listParameters);
		return listResult;
	}


	@Override
	public List<NacidoVivoRenavi> findByPassMad(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList("NacidoVivoRenavi.findByPasapMad", listParameters);
		return listResult;
	}
	
	@Override
	public NacidoVivoRenavi findByCedulaNac(List<ParametroConsulta> listParameters) throws EntidadException {
		NacidoVivoRenavi nacidoVivoResult = (NacidoVivoRenavi) consultarTablaSingleResult(
				"NacidoVivoRenavi.findByCedulNacViv", listParameters);
		return nacidoVivoResult;
	}
	
	@Override
	public NacidoVivoRenavi findByHistorialNac(List<ParametroConsulta> listParameters) throws EntidadException {
		NacidoVivoRenavi nacidoVivoResult = (NacidoVivoRenavi) consultarTablaSingleResult(
				"NacidoVivoRenavi.findByNacVivHistorial", listParameters);
		return nacidoVivoResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> verifyByCedulMad(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList(
				"NacidoVivoRenavi.verifyByCedulMadre", listParameters);
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> verifyByIdMad(List<ParametroConsulta> listParameters) throws EntidadException {
		List<NacidoVivoRenavi> listResult = consultarTablaResultList(
				"NacidoVivoRenavi.verifyByIdMadre", listParameters);
		return listResult;
	}


	@Override
	public void editNacidoVivo(NacidoVivoRenavi nacidoVivoSave) throws EntidadException {
		edit(nacidoVivoSave);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public NacidoVivoRenavi findByCedulaNacSinEstado(String cedulaNV) throws EntidadException {
		List<NacidoVivoRenavi> listaResult = null;
		NacidoVivoRenavi nacidoVivoResult = null;
		try {
			Query query;
			query = this.getEntityManager().createNamedQuery("NacidoVivoRenavi.findByCedulNacVivSinEstado");
			query.setParameter("cedulNacViv", cedulaNV);
			query.setParameter("status", "A");
			listaResult = query.getResultList();
			if (!listaResult.isEmpty()) {
				if (listaResult.size() > 0){
					nacidoVivoResult = listaResult.get(0);
				}
				else{
					LOGGER.log(Level.INFO ,"Existe mas de un registro asociado al codigo");
				}
			}
			else{
				LOGGER.log(Level.INFO ,"No se encontro informacion asociada al codigo");
			}
			
		}catch (Exception e) {
			LOGGER.log(Level.INFO ,"ERROR NO CONTROLADO" + e);
		}
				
		return nacidoVivoResult;
	}
	

}
