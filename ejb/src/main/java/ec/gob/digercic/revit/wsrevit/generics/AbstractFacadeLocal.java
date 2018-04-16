package ec.gob.digercic.revit.wsrevit.generics;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;

public interface AbstractFacadeLocal<T> {
	EntityManager getEntityManager();

    public void create(T entity) throws EntidadException;

    void edit(T entity) throws EntidadException;

    void remove(T entity) throws EntidadException;

    T find(Object id) throws EntidadException;

    List<T> findAll() throws EntidadException;

    List<T> findRange(int[] range) throws EntidadException;

    int count() throws EntidadException;

    void sincronizar() throws EntidadException;
    
    Query generarConsultaDinamica(String consultaSql, List<ParametroConsulta> parametros);
    
    Object findByNamedQuerySingleResult(String consultaSql) throws EntidadException ;
    
    Object consultarTablaSingleResult(String consultaSql, List<ParametroConsulta> parametros) throws EntidadException;
    
    Object consultarTablaSingleResult(String consultaSql, String nombre, Object objeto) throws EntidadException;
    
    List<T> findByNamedQueryResultList(String consultaSql) throws EntidadException;
    
    List<T> consultarTablaResultList(String consultaSql, List<ParametroConsulta> parametros) throws EntidadException;
    
    List<T> consultarTablaResultList(String consultaSql, String nombre, Object objeto) throws EntidadException;
    
    int executeQueryBoleanResult(String consultaSql, List<ParametroConsulta> parametros) throws EntidadException;
    
    int executeQueryBoleanResult(String consultaSql, String nombre, Object objeto) throws EntidadException;
    
    boolean executeNativeQueryBoleanResult(String consultaSql) throws EntidadException;
    
    List<T> executeQueryListResult(String consultaSql) throws EntidadException;
    
    List<Object[]> executeNativeQueryListResult(String consultaSql) throws EntidadException;
    
    List<T> executeNativeQueryListResultGenerico(String consultaSql, Class resultClass) throws EntidadException;

}
