package ec.gob.digercic.revit.wsrevit.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.digercic.revit.wsrevit.dao.NacidoVivoRenaviDao;
import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.NacidoVivoRenavi;
import ec.gob.digercic.revit.wsrevit.service.NacidoVivoRenaviService;

@Stateless(name = "nacidoVivoService")
public class NacidoVivoRenaviServiceImpl implements NacidoVivoRenaviService {
	@EJB
	private NacidoVivoRenaviDao nacidoVivoDao;

	@Override
	public List<NacidoVivoRenavi> buscarPorIdMadIdAgencia(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByIdMadIdAgencia(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> buscarPorPasaporteMadIdAgencia(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByPassMadIdAgencia(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> buscarPorCedulaMadIdAgencia(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByCedulMadIdAgencia(listaParametros);
		} catch (EntidadException e) {
			// TODO: por revisar respuesta
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> buscarPorCedulaMad(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByCedulMad(listaParametros);
		} catch (EntidadException e) {
			// TODO: por revisar respuesta
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	
	@Override
	public List<NacidoVivoRenavi> buscarPorIdYMadre(String cedulaMadre, Long idNacidoVivo) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByAnuladoAndMadre(cedulaMadre, idNacidoVivo);
		}catch (Exception e) {
			System.out.println("Error al consultar registros anulados por id y madre");
			e.printStackTrace();
		}
		
		return listResult;
	}
	
	
	@Override
	public List<NacidoVivoRenavi> buscarAnuladoPorId(Long idNacidoVivo) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByIdAnulado(idNacidoVivo);
		}catch (Exception e) {
			System.out.println("Error al consultar registros anulados por id");
			e.printStackTrace();
		}
		
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> buscarPorIdMad(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByIdMad(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	@Override
	public List<NacidoVivoRenavi> buscarPorPasaporteMad(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.findByPassMad(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}
	
	@Override
	public NacidoVivoRenavi buscarPorCedulaNac(List<ParametroConsulta> listaParametros) {
		NacidoVivoRenavi nacidoVivoResult = null;
		try {
			nacidoVivoResult = nacidoVivoDao.findByCedulaNac(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return nacidoVivoResult;
	}
	
	@Override
	public NacidoVivoRenavi buscarPorCedulaNacSinEstado(String cedulaNV) throws EntidadException {
		NacidoVivoRenavi nacidoVivoResult = null;
		try {
			nacidoVivoResult = nacidoVivoDao.findByCedulaNacSinEstado(cedulaNV);
		} catch (EntidadException e) {
			System.out.println("Error al consultar cédula de nacido vivo");
			//throw new EntidadException("Error al consultar cédula de nacido vivo", e.getCause());
			e.printStackTrace();
		}
		return nacidoVivoResult;
	}
	
	@Override
	public NacidoVivoRenavi buscarPorHistorialNac(List<ParametroConsulta> listaParametros) {
		NacidoVivoRenavi nacidoVivoResult = null;
		try {
			nacidoVivoResult = nacidoVivoDao.findByHistorialNac(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return nacidoVivoResult;
	}


	@Override
	public List<NacidoVivoRenavi> verificarPorCedulaMad(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.verifyByCedulMad(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}


	@Override
	public List<NacidoVivoRenavi> verificarPorIdMad(List<ParametroConsulta> listaParametros) {
		List<NacidoVivoRenavi> listResult = new ArrayList<>();
		try {
			listResult = nacidoVivoDao.verifyByIdMad(listaParametros);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return listResult;
	}


	@Override
	public boolean editarNacido(NacidoVivoRenavi nacidoVivo) {
		boolean resultado = false;
		
		try {
			nacidoVivoDao.editNacidoVivo(nacidoVivo);
			resultado = true;
		} catch (EntidadException e) {
			System.out.println("Error al actualizar el registro NacidoVivo.");
			e.printStackTrace();
		}
		
		return resultado;
	}

	@Override
	public NacidoVivoRenavi buscarPorIdNacidoVivo(Long idNV) {
		NacidoVivoRenavi nacidoVivoResult = null;
		try {
			nacidoVivoResult = nacidoVivoDao.find(idNV);
		} catch (EntidadException e) {
			System.out.println("Error al consultar los nacidos vivos");
			e.printStackTrace();
		}
		return nacidoVivoResult;
	}
	
}
