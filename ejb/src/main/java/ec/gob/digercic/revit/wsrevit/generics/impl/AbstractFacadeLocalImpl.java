package ec.gob.digercic.revit.wsrevit.generics.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.logging.Logger;

import ec.gob.digercic.revit.wsrevit.exceptions.EntidadException;
import ec.gob.digercic.revit.wsrevit.generics.AbstractFacadeLocal;
import ec.gob.digercic.revit.wsrevit.generics.ws.ParametroConsulta;

public abstract class AbstractFacadeLocalImpl<T> implements AbstractFacadeLocal<T> {
	@PersistenceContext(unitName = "revitDS")
	protected EntityManager em;
	
    protected Class<T> entityClass;
    
    private static final Logger log = Logger.getLogger(AbstractFacadeLocalImpl.class.getName());

	public AbstractFacadeLocalImpl() {
		Class<T> tipoNuevo = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		this.entityClass = tipoNuevo;
	}
    
    public AbstractFacadeLocalImpl(EntityManager em, Class<T> entityClass) {
		this.em = em;
        this.entityClass = entityClass;
	}
    
    @Override
	public EntityManager getEntityManager() {
		return em;
	}

	@Override
	public void create(T entity) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> create()");
			getEntityManager().persist(entity);
			sincronizar();
		} catch (Exception e) {
			log.error("Error al crear: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException(entity.getClass().getSimpleName() 
					+ ": error al guardar.", e.getCause());
		}
	}

	@Override
	public void edit(T entity) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> edit()");
			getEntityManager().merge(entity);
			sincronizar();
		} catch (Exception e) {
			log.error("Error al editar: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException(entity.getClass().getSimpleName() + ": error al editar." 
					+ e.getMessage() + " --", e.getCause());
		}
	}

	@Override
	public void remove(T entity) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> remove()");
			getEntityManager().remove(getEntityManager().merge(entity));
			sincronizar();
		} catch (Exception e) {
			log.error("Error al eliminar: " + e.getClass());
			log.error(e.getMessage());
			throw new EntidadException(entity.getClass().getSimpleName() 
					+ ": error al eliminar.", e.getCause());
		}
	}

	@Override
	public T find(Object id) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> find()");
			return getEntityManager().find(entityClass, id);
		} catch (IllegalArgumentException iae) {
			log.error("Error al consultar: " + iae.getClass());
			log.error(iae.getMessage());
			iae.printStackTrace();
			throw new EntidadException("Error al consultar " + "la entidad, verifique los parámetros de consulta.",
					iae.getCause());
		} catch (NoResultException nre) {
			log.error("Error al consultar: " + nre.getClass());
			log.error(nre.getMessage());
			throw new EntidadException("No hay datos para la búsqueda realizada.", nre.getCause());
		} catch (Exception e) {
			log.error("Error al consultar: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException("Error al consultar la entidad.", e.getCause());
		}
	}

	@Override
	public List<T> findAll() throws EntidadException {
		try {
			log.debug("Conectando BDD>>> findAll()");
			CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
            cq.select(cq.from(entityClass));
            return getEntityManager().createQuery(cq).getResultList();
        } catch (NoResultException nre) {
        	log.error("Error al consultar: " + nre.getClass());
			log.error(nre.getMessage());
        	throw new EntidadException("Error, no hay datos para la búsqueda realizada.", nre.getCause());
        } catch (Exception e) {
        	log.error("Error al consultar: " + e.getClass());
			log.error(e.getMessage());
        	throw new EntidadException("Error al consultar la entidad.", e.getCause());
        }
	}

	@Override
	public List<T> findRange(int[] range) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> findRange()");
			CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
			cq.select(cq.from(entityClass));
			Query q = getEntityManager().createQuery(cq);
			q.setMaxResults(range[1] - range[0]);
			q.setFirstResult(range[0]);
			return q.getResultList();
		} catch (Exception e) {
			log.error("Error al consultar: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException("Error al consultar la entidad.", e.getCause());
		}
	}

	@Override
	public int count() throws EntidadException {
		try {
			log.debug("Conectando BDD>>> findRange()");
			CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
			Root<T> rt = cq.from(entityClass);
			cq.select(getEntityManager().getCriteriaBuilder().count(rt));
			Query q = getEntityManager().createQuery(cq);
			return ((Long) q.getSingleResult()).intValue();
		} catch (Exception e) {
			log.error("Error al consultar: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException("Error al consultar la entidad.", e.getCause());
		}
	}

	@Override
	public void sincronizar() throws EntidadException {
		try {
			log.debug("Conectando BDD>>> sincronizar()");
			em.flush();
		} catch (Exception e) {
			log.error("Error al sincronizar: " + e.getClass());
			log.error(e.getMessage());
			e.printStackTrace();
			throw new EntidadException("Error en la base de datos. Es posible que el registro este "
					+ "duplicado o siendo utilizado en otro proceso", e.getCause());
		}
	}

	@Override
	public Query generarConsultaDinamica(String consulta, List<ParametroConsulta> parametros) {
		try {
			log.debug("Conectando BDD>>> generarConsultaDinamica()");
			Query query = getEntityManager().createNamedQuery(consulta);
            for (ParametroConsulta parametro : parametros) {
                query.setParameter(parametro.getNombreParametro(), parametro.getValorParametro());
            }
            return query;
        } catch (IllegalArgumentException iae) {
        	log.error("Error generarConsultaDinamica: " + iae.getClass());
			log.error(iae.getMessage());
        	System.out.println("Error en los parámetros de entrada al generar la consulta dinámica: "
                    + iae.getMessage());
            return null;
        } catch (Exception e) {
        	log.error("Error generarConsultaDinamica: " + e.getClass());
			log.error(e.getMessage());
        	System.out.println("Error al generar la consulta dinámica " + e.getMessage());
            return null;
        }
	}

	@Override
	public Object findByNamedQuerySingleResult(String consultaSql) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> findByNamedQuerySingleResult()");
			Query query = getEntityManager().createNamedQuery(consultaSql);
			return query.getSingleResult();
		} catch (IllegalArgumentException iae) {
			log.error("Error findByNamedQuerySingleResult: " + iae.getClass());
			log.error(iae.getMessage());
			throw new EntidadException("Error, no existe la consulta.", iae.getCause());
		} catch (NoResultException nre) {
			log.error("Error findByNamedQuerySingleResult: " + nre.getClass());
			log.error(nre.getMessage());
			throw new EntidadException("No hay datos para la búsqueda realizada.", nre.getCause());
		} catch (NonUniqueResultException nure) {
			log.error("Error findByNamedQuerySingleResult: " + nure.getClass());
			log.error(nure.getMessage());
			throw new EntidadException("Hay más de un resultado para la consulta realizada.", nure.getCause());
		} catch (Exception e) {
			log.error("Error findByNamedQuerySingleResult: " + e.getClass());
			log.error(e.getMessage());
			throw new EntidadException("Error al consultar la entidad", e.getCause());
		}
	}

	@Override
	public Object consultarTablaSingleResult(String query, List<ParametroConsulta> parametros) throws EntidadException {
		try {
            return generarConsultaDinamica(query, parametros).getSingleResult();
        } catch (IllegalArgumentException iae) {
            throw new EntidadException("Error al consultar la tabla, verifique los parámetros ingresados.",
                    iae.getCause());
        } catch (NoResultException nre) {
            throw new EntidadException("No hay datos para la búsqueda realizada.", nre.getCause());
        } catch (NonUniqueResultException nure) {
            throw new EntidadException("Hay más de un resultado para la consulta realizada.", nure.getCause());
        } catch (Exception e) {
            throw new EntidadException("Error al consultar la tabla.", e.getCause());
        }
	}

	@Override
	public Object consultarTablaSingleResult(String query, String nombre, Object objeto) throws EntidadException {
		try {
			List<ParametroConsulta> parametros = new ArrayList<ParametroConsulta>();
			parametros.add(new ParametroConsulta(nombre, objeto));
			return generarConsultaDinamica(query, parametros).getSingleResult();
		} catch (IllegalArgumentException iae) {
			throw new EntidadException("Error al consultar la tabla, verifique los parámetros ingresados.",
					iae.getCause());
		} catch (NoResultException nre) {
			throw new EntidadException("No hay datos para la búsqueda realizada.", nre.getCause());
		} catch (NonUniqueResultException nure) {
			throw new EntidadException("Hay más de un resultado para la consulta realizada.", nure.getCause());
		} catch (Exception e) {
			throw new EntidadException("Error al consultar la tabla", e.getCause());
		}
	}

	@Override
	public List<T> findByNamedQueryResultList(String query) throws EntidadException {
		try {
			log.debug("Conectando BDD>>> findByNamedQueryResultList()");
			Query consulta = getEntityManager().createNamedQuery(query);
            return consulta.getResultList();
        } catch (IllegalArgumentException iae) {
        	log.error("Error findByNamedQueryResultList: " + iae.getClass());
			log.error(iae.getMessage());
        	throw new EntidadException("Error, no existe la consulta realizada.", iae.getCause());
        } catch (Exception e) {
        	log.error("Error findByNamedQueryResultList: " + e.getClass());
			log.error(e.getMessage());
        	throw new EntidadException("Error al consultar la entidad", e.getCause());
        }
	}

	@Override
	public List<T> consultarTablaResultList(String query, List<ParametroConsulta> parametros) throws EntidadException {
		try {
			return generarConsultaDinamica(query, parametros).getResultList();
		} catch (IllegalArgumentException iae) {
			throw new EntidadException("Error al consultar la tabla, verifique los parámetros ingresados.",
					iae.getCause());
		} catch (Exception e) {
			throw new EntidadException("Error al consultar la tabla.", e.getCause());
		}
	}

	@Override
	public List<T> consultarTablaResultList(String query, String nombre, Object objeto) throws EntidadException {
		try {
            List<ParametroConsulta> parametros = new ArrayList<ParametroConsulta>();
            parametros.add(new ParametroConsulta(nombre, objeto));
            return generarConsultaDinamica(query, parametros).getResultList();
        } catch (IllegalArgumentException iae) {
            throw new EntidadException("Error al consultar la tabla, verifique los parámetros ingresados.",
                    iae.getCause());
        } catch (Exception e) {
            throw new EntidadException("Error al consultar la tabla.", e.getCause());
        }
	}

	@Override
	public int executeQueryBoleanResult(String query, List<ParametroConsulta> parametros) throws EntidadException {
		try {
			return this.generarConsultaDinamica(query, parametros).executeUpdate();
		} catch (Exception e) {
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	@Override
	public int executeQueryBoleanResult(String query, String nombre, Object objeto) throws EntidadException {
		try {
			List<ParametroConsulta> parametros = new ArrayList<ParametroConsulta>();
			parametros.add(new ParametroConsulta(nombre, objeto));
			return this.generarConsultaDinamica(query, parametros).executeUpdate();
		} catch (Exception e) {
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	@Override
	public boolean executeNativeQueryBoleanResult(String query) throws EntidadException {
		try {
			Query consulta = em.createNativeQuery(query);
			return (Boolean) consulta.getSingleResult();
		} catch (Exception e) {
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	@Override
	public List<T> executeQueryListResult(String query) throws EntidadException {
		try {
			Query consulta = em.createQuery(query);
			return consulta.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	@Override
	public List<Object[]> executeNativeQueryListResult(String query) throws EntidadException {
		try {
			Query consulta = em.createNativeQuery(query);
			return (List<Object[]>) consulta.getResultList();
		} catch (Exception e) {
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	@Override
	public List<T> executeNativeQueryListResultGenerico(String sqlString, Class resultClass) throws EntidadException {
		try {
			List<T> resultado;
			Query consulta = em.createNativeQuery(sqlString, resultClass);
			resultado = consulta.getResultList();
			return resultado;
		} catch (Exception e) {
			throw new EntidadException("Error al ejecutar la cunsulta.", e.getCause());
		}
	}

	

}
