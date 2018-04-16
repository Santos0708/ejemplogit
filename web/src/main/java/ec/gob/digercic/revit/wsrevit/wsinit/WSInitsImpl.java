package ec.gob.digercic.revit.wsrevit.wsinit;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import ec.gob.digercic.revit.wsrevit.service.VariableRenaviService;
import ec.gob.digercic.wsintegracion.WSAutenticacion;

@Singleton(name = "wsInits")
public class WSInitsImpl implements WSInits {
	private WSAutenticacion servicioWSAutenticacionPort;
	private int attempConn = 0;
	
	@EJB
	private VariableRenaviService variableService;

	@Override
	public WSAutenticacion getPortWSIntegracion() {
		if (servicioWSAutenticacionPort != null) {
			attempConn = 0;
			return servicioWSAutenticacionPort;
		} else if (attempConn < 5) {
			attempConn++;
			createPortWSAutenticacion();
			return getPortWSIntegracion();
		} else {
			return null;
		}
	}
	
	@PostConstruct
	public void init() {
		createPortWSAutenticacion();
	}
	
	public void createPortWSAutenticacion() {
		try {
			String urlWSAutenticacion = variableService.buscarPorNombre("WS_SAUREG");
			
			if (urlWSAutenticacion.equals("")) {
				System.out.println("Error al consultar URL del web service en BDD.");
			} else {
				JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
				factory.setServiceClass(WSAutenticacion.class);
				factory.setAddress(urlWSAutenticacion);

				servicioWSAutenticacionPort = (WSAutenticacion) factory.create();
				Client client = ClientProxy.getClient(servicioWSAutenticacionPort);

				if (client != null) {
					//long timeout = Long.parseLong("120"/*(parametrosServicio.getParametroPorNombre("wsFacturacionTiempoEsperaSegundos"))*/) * 1000;
					long timeout = Long.parseLong("120") * 1000;
					HTTPConduit conduit = (HTTPConduit) client.getConduit();
					HTTPClientPolicy policy = new HTTPClientPolicy();
					policy.setAllowChunking(false);
					policy.setConnectionTimeout(timeout);
					policy.setReceiveTimeout(timeout);
					conduit.setClient(policy);
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error al crear puerto de WSAutenticacion");
			e.printStackTrace();
			servicioWSAutenticacionPort = null;
		}
	}
}
