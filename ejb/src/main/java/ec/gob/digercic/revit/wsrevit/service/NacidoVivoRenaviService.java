package ec.gob.digercic.revit.wsrevit.service;

import java.util.List;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.NacidoVivoRenavi;

public interface NacidoVivoRenaviService {
	public List<NacidoVivoRenavi> buscarPorIdMadIdAgencia(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> buscarPorPasaporteMadIdAgencia(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> buscarPorCedulaMadIdAgencia(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> buscarPorCedulaMad(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> buscarPorIdYMadre(String cedulaMadre, Long idNacidoVivo);
	public List<NacidoVivoRenavi> buscarAnuladoPorId(Long idNacidoVivo);
	public List<NacidoVivoRenavi> buscarPorIdMad(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> buscarPorPasaporteMad(List<ParametroConsulta> listaParametros);
	public NacidoVivoRenavi buscarPorCedulaNac(List<ParametroConsulta> listaParametros);
	public NacidoVivoRenavi buscarPorCedulaNacSinEstado(String cedulaNV) throws EntidadException;
	public NacidoVivoRenavi buscarPorHistorialNac(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> verificarPorCedulaMad(List<ParametroConsulta> listaParametros);
	public List<NacidoVivoRenavi> verificarPorIdMad(List<ParametroConsulta> listaParametros);
	public boolean editarNacido(NacidoVivoRenavi nacidoVivo);
	public NacidoVivoRenavi buscarPorIdNacidoVivo(Long idNV);
	

}
