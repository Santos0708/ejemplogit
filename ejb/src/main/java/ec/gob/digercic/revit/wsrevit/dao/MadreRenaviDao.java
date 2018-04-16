package ec.gob.digercic.revit.wsrevit.dao;

import java.util.List;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.AbstractFacadeLocal;
import ec.gob.digercic.revit.wsrevit.model.MadreRenavi;

//@Local
public interface MadreRenaviDao extends AbstractFacadeLocal<MadreRenavi> {
	public List<MadreRenavi> findMadreByCedulMad(String cedulaMadre) throws EntidadException;
	public List<MadreRenavi> findMadreById(Long idMadre) throws EntidadException;
	public List<MadreRenavi> findMadreByPassport(String passMadre) throws EntidadException;

}
