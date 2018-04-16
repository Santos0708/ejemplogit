package ec.gob.digercic.revit.wsrevit.dao;

import java.util.List;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.AbstractFacadeLocal;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;
import ec.gob.digercic.revit.wsrevit.model.NacidoVivoRenavi;

public interface NacidoVivoRenaviDao extends AbstractFacadeLocal<NacidoVivoRenavi> {
	public List<NacidoVivoRenavi> findByIdMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> findByPassMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> findByCedulMadIdAgencia(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> findByCedulMad(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> findByAnuladoAndMadre(String cedulMad, Long idNacViv) throws Exception;
	public List<NacidoVivoRenavi> findByIdAnulado(Long idNacViv) throws Exception;
	public List<NacidoVivoRenavi> findByIdMad(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> findByPassMad(List<ParametroConsulta> listParameters) throws EntidadException;
	public NacidoVivoRenavi findByCedulaNac(List<ParametroConsulta> listParameters) throws EntidadException;
	public NacidoVivoRenavi findByCedulaNacSinEstado(String cedulaNV) throws EntidadException;
	public NacidoVivoRenavi findByHistorialNac(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> verifyByCedulMad(List<ParametroConsulta> listParameters) throws EntidadException;
	public List<NacidoVivoRenavi> verifyByIdMad(List<ParametroConsulta> listParameters) throws EntidadException;
	public void editNacidoVivo(NacidoVivoRenavi nacidoVivoSave) throws EntidadException;
	
	

}
