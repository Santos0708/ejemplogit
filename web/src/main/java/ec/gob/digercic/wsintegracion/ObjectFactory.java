
package ec.gob.digercic.wsintegracion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.digercic.wsintegracion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CambiarContraseniaUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "cambiarContraseniaUsuario");
    private final static QName _CambiarContraseniaUsuarioResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "cambiarContraseniaUsuarioResponse");
    private final static QName _ControlSession_QNAME = new QName("http://service.registrocivil.gob.ec/", "controlSession");
    private final static QName _ControlSessionResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "controlSessionResponse");
    private final static QName _GetAgenciaByIdAgenciaWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciaByIdAgenciaWS");
    private final static QName _GetAgenciaByIdAgenciaWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciaByIdAgenciaWSResponse");
    private final static QName _GetAgenciasByIdSistemaWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByIdSistemaWS");
    private final static QName _GetAgenciasByIdSistemaWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByIdSistemaWSResponse");
    private final static QName _GetAgenciasByIdUbiacionStatusWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByIdUbiacionStatusWS");
    private final static QName _GetAgenciasByIdUbiacionStatusWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByIdUbiacionStatusWSResponse");
    private final static QName _GetAgenciasByInstitucionBySistema_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByInstitucionBySistema");
    private final static QName _GetAgenciasByInstitucionBySistemaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasByInstitucionBySistemaResponse");
    private final static QName _GetAgenciasPorInstitucion_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasPorInstitucion");
    private final static QName _GetAgenciasPorInstitucionResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasPorInstitucionResponse");
    private final static QName _GetAgenciasPorInstitucionYUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasPorInstitucionYUsuario");
    private final static QName _GetAgenciasPorInstitucionYUsuarioResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getAgenciasPorInstitucionYUsuarioResponse");
    private final static QName _GetCompRolEstrucUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "getCompRolEstrucUsuario");
    private final static QName _GetCompRolEstrucUsuarioResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getCompRolEstrucUsuarioResponse");
    private final static QName _GetCredencialesFirma_QNAME = new QName("http://service.registrocivil.gob.ec/", "getCredencialesFirma");
    private final static QName _GetCredencialesFirmaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getCredencialesFirmaResponse");
    private final static QName _GetEstructuraSistema_QNAME = new QName("http://service.registrocivil.gob.ec/", "getEstructuraSistema");
    private final static QName _GetEstructuraSistemaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getEstructuraSistemaResponse");
    private final static QName _GetInstitucionesBySistema_QNAME = new QName("http://service.registrocivil.gob.ec/", "getInstitucionesBySistema");
    private final static QName _GetInstitucionesBySistemaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getInstitucionesBySistemaResponse");
    private final static QName _GetPermisos_QNAME = new QName("http://service.registrocivil.gob.ec/", "getPermisos");
    private final static QName _GetPermisosResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getPermisosResponse");
    private final static QName _GetRolesByUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "getRolesByUsuario");
    private final static QName _GetRolesByUsuarioByAgenciaBySistema_QNAME = new QName("http://service.registrocivil.gob.ec/", "getRolesByUsuarioByAgenciaBySistema");
    private final static QName _GetRolesByUsuarioByAgenciaBySistemaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getRolesByUsuarioByAgenciaBySistemaResponse");
    private final static QName _GetRolesByUsuarioResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getRolesByUsuarioResponse");
    private final static QName _GetSegAccesoByIdsRol_QNAME = new QName("http://service.registrocivil.gob.ec/", "getSegAccesoByIdsRol");
    private final static QName _GetSegAccesoByIdsRolResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getSegAccesoByIdsRolResponse");
    private final static QName _GetUbcInternacionalByIdUbc_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbcInternacionalByIdUbc");
    private final static QName _GetUbcInternacionalByIdUbcResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbcInternacionalByIdUbcResponse");
    private final static QName _GetUbcListByIdGrupStatus_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbcListByIdGrupStatus");
    private final static QName _GetUbcListByIdGrupStatusResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbcListByIdGrupStatusResponse");
    private final static QName _GetUbicacionByCodAs400_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodAs400");
    private final static QName _GetUbicacionByCodAs400Response_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodAs400Response");
    private final static QName _GetUbicacionByCodDpa_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodDpa");
    private final static QName _GetUbicacionByCodDpaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodDpaResponse");
    private final static QName _GetUbicacionByCodUbiMagnaWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodUbiMagnaWS");
    private final static QName _GetUbicacionByCodUbiMagnaWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByCodUbiMagnaWSResponse");
    private final static QName _GetUbicacionByIdUbicacion_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByIdUbicacion");
    private final static QName _GetUbicacionByIdUbicacionResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByIdUbicacionResponse");
    private final static QName _GetUbicacionByTipo_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByTipo");
    private final static QName _GetUbicacionByTipoResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionByTipoResponse");
    private final static QName _GetUbicacionesByIdGrupo_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionesByIdGrupo");
    private final static QName _GetUbicacionesByIdGrupoResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbicacionesByIdGrupoResponse");
    private final static QName _GetUbsInternacionalByIdGrupo_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbsInternacionalByIdGrupo");
    private final static QName _GetUbsInternacionalByIdGrupoResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUbsInternacionalByIdGrupoResponse");
    private final static QName _GetUsuAgenByIdRolUbicacionStatusWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenByIdRolUbicacionStatusWS");
    private final static QName _GetUsuAgenByIdRolUbicacionStatusWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenByIdRolUbicacionStatusWSResponse");
    private final static QName _GetUsuAgenciaByIdAgIdRolStatus_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdAgIdRolStatus");
    private final static QName _GetUsuAgenciaByIdAgIdRolStatusResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdAgIdRolStatusResponse");
    private final static QName _GetUsuAgenciaByIdProvIdRolStatus_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdProvIdRolStatus");
    private final static QName _GetUsuAgenciaByIdProvIdRolStatusResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdProvIdRolStatusResponse");
    private final static QName _GetUsuAgenciaByIdRolStatusWS_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdRolStatusWS");
    private final static QName _GetUsuAgenciaByIdRolStatusWSResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByIdRolStatusWSResponse");
    private final static QName _GetUsuAgenciaByUserAndAgencia_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByUserAndAgencia");
    private final static QName _GetUsuAgenciaByUserAndAgenciaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuAgenciaByUserAndAgenciaResponse");
    private final static QName _GetUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuario");
    private final static QName _GetUsuarioByUserAndAgencia_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUserAndAgencia");
    private final static QName _GetUsuarioByUserAndAgenciaMsp_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUserAndAgenciaMsp");
    private final static QName _GetUsuarioByUserAndAgenciaMspResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUserAndAgenciaMspResponse");
    private final static QName _GetUsuarioByUserAndAgenciaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUserAndAgenciaResponse");
    private final static QName _GetUsuarioByUsernameAndMail_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUsernameAndMail");
    private final static QName _GetUsuarioByUsernameAndMailResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioByUsernameAndMailResponse");
    private final static QName _GetUsuarioLogin_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioLogin");
    private final static QName _GetUsuarioLoginResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioLoginResponse");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuarioResponse");
    private final static QName _GetUsuariosByAgencia_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgencia");
    private final static QName _GetUsuariosByAgenciaBySistema_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaBySistema");
    private final static QName _GetUsuariosByAgenciaBySistemaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaBySistemaResponse");
    private final static QName _GetUsuariosByAgenciaMSPAll_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaMSPAll");
    private final static QName _GetUsuariosByAgenciaMSPAllResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaMSPAllResponse");
    private final static QName _GetUsuariosByAgenciaMsp_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaMsp");
    private final static QName _GetUsuariosByAgenciaMspResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaMspResponse");
    private final static QName _GetUsuariosByAgenciaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByAgenciaResponse");
    private final static QName _GetUsuariosByIdAgenciaIdRol_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByIdAgenciaIdRol");
    private final static QName _GetUsuariosByIdAgenciaIdRolResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosByIdAgenciaIdRolResponse");
    private final static QName _GetUsuariosBySistemaByAgenciaMspByRol_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosBySistemaByAgenciaMspByRol");
    private final static QName _GetUsuariosBySistemaByAgenciaMspByRolResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosBySistemaByAgenciaMspByRolResponse");
    private final static QName _GetUsuariosFromPageForFirma_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosFromPageForFirma");
    private final static QName _GetUsuariosFromPageForFirmaResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "getUsuariosFromPageForFirmaResponse");
    private final static QName _LeerEstructura_QNAME = new QName("http://service.registrocivil.gob.ec/", "leerEstructura");
    private final static QName _LeerEstructuraResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "leerEstructuraResponse");
    private final static QName _ResetearClaveEnvioMail_QNAME = new QName("http://service.registrocivil.gob.ec/", "resetearClaveEnvioMail");
    private final static QName _ResetearClaveEnvioMailResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "resetearClaveEnvioMailResponse");
    private final static QName _TblSauregAgencia_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregAgencia");
    private final static QName _TblSauregCompRol_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregCompRol");
    private final static QName _TblSauregEstados_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregEstados");
    private final static QName _TblSauregEstrucSist_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregEstrucSist");
    private final static QName _TblSauregInstitucion_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregInstitucion");
    private final static QName _TblSauregPermiso_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregPermiso");
    private final static QName _TblSauregRol_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregRol");
    private final static QName _TblSauregSegAcceso_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregSegAcceso");
    private final static QName _TblSauregUbicacion_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregUbicacion");
    private final static QName _TblSauregUsuAgencia_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregUsuAgencia");
    private final static QName _TblSauregUsuario_QNAME = new QName("http://service.registrocivil.gob.ec/", "tblSauregUsuario");
    private final static QName _UbicacionInternacional_QNAME = new QName("http://service.registrocivil.gob.ec/", "ubicacionInternacional");
    private final static QName _ValidarCodigoSms_QNAME = new QName("http://service.registrocivil.gob.ec/", "validarCodigoSms");
    private final static QName _ValidarCodigoSmsResponse_QNAME = new QName("http://service.registrocivil.gob.ec/", "validarCodigoSmsResponse");
    private final static QName _GetUsuarioLoginIdAgencia_QNAME = new QName("", "idAgencia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.digercic.wsintegracion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CambiarContraseniaUsuario }
     * 
     */
    public CambiarContraseniaUsuario createCambiarContraseniaUsuario() {
        return new CambiarContraseniaUsuario();
    }

    /**
     * Create an instance of {@link CambiarContraseniaUsuarioResponse }
     * 
     */
    public CambiarContraseniaUsuarioResponse createCambiarContraseniaUsuarioResponse() {
        return new CambiarContraseniaUsuarioResponse();
    }

    /**
     * Create an instance of {@link ControlSession }
     * 
     */
    public ControlSession createControlSession() {
        return new ControlSession();
    }

    /**
     * Create an instance of {@link ControlSessionResponse }
     * 
     */
    public ControlSessionResponse createControlSessionResponse() {
        return new ControlSessionResponse();
    }

    /**
     * Create an instance of {@link GetAgenciaByIdAgenciaWS }
     * 
     */
    public GetAgenciaByIdAgenciaWS createGetAgenciaByIdAgenciaWS() {
        return new GetAgenciaByIdAgenciaWS();
    }

    /**
     * Create an instance of {@link GetAgenciaByIdAgenciaWSResponse }
     * 
     */
    public GetAgenciaByIdAgenciaWSResponse createGetAgenciaByIdAgenciaWSResponse() {
        return new GetAgenciaByIdAgenciaWSResponse();
    }

    /**
     * Create an instance of {@link GetAgenciasByIdSistemaWS }
     * 
     */
    public GetAgenciasByIdSistemaWS createGetAgenciasByIdSistemaWS() {
        return new GetAgenciasByIdSistemaWS();
    }

    /**
     * Create an instance of {@link GetAgenciasByIdSistemaWSResponse }
     * 
     */
    public GetAgenciasByIdSistemaWSResponse createGetAgenciasByIdSistemaWSResponse() {
        return new GetAgenciasByIdSistemaWSResponse();
    }

    /**
     * Create an instance of {@link GetAgenciasByIdUbiacionStatusWS }
     * 
     */
    public GetAgenciasByIdUbiacionStatusWS createGetAgenciasByIdUbiacionStatusWS() {
        return new GetAgenciasByIdUbiacionStatusWS();
    }

    /**
     * Create an instance of {@link GetAgenciasByIdUbiacionStatusWSResponse }
     * 
     */
    public GetAgenciasByIdUbiacionStatusWSResponse createGetAgenciasByIdUbiacionStatusWSResponse() {
        return new GetAgenciasByIdUbiacionStatusWSResponse();
    }

    /**
     * Create an instance of {@link GetAgenciasByInstitucionBySistema }
     * 
     */
    public GetAgenciasByInstitucionBySistema createGetAgenciasByInstitucionBySistema() {
        return new GetAgenciasByInstitucionBySistema();
    }

    /**
     * Create an instance of {@link GetAgenciasByInstitucionBySistemaResponse }
     * 
     */
    public GetAgenciasByInstitucionBySistemaResponse createGetAgenciasByInstitucionBySistemaResponse() {
        return new GetAgenciasByInstitucionBySistemaResponse();
    }

    /**
     * Create an instance of {@link GetAgenciasPorInstitucion }
     * 
     */
    public GetAgenciasPorInstitucion createGetAgenciasPorInstitucion() {
        return new GetAgenciasPorInstitucion();
    }

    /**
     * Create an instance of {@link GetAgenciasPorInstitucionResponse }
     * 
     */
    public GetAgenciasPorInstitucionResponse createGetAgenciasPorInstitucionResponse() {
        return new GetAgenciasPorInstitucionResponse();
    }

    /**
     * Create an instance of {@link GetAgenciasPorInstitucionYUsuario }
     * 
     */
    public GetAgenciasPorInstitucionYUsuario createGetAgenciasPorInstitucionYUsuario() {
        return new GetAgenciasPorInstitucionYUsuario();
    }

    /**
     * Create an instance of {@link GetAgenciasPorInstitucionYUsuarioResponse }
     * 
     */
    public GetAgenciasPorInstitucionYUsuarioResponse createGetAgenciasPorInstitucionYUsuarioResponse() {
        return new GetAgenciasPorInstitucionYUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetCompRolEstrucUsuario }
     * 
     */
    public GetCompRolEstrucUsuario createGetCompRolEstrucUsuario() {
        return new GetCompRolEstrucUsuario();
    }

    /**
     * Create an instance of {@link GetCompRolEstrucUsuarioResponse }
     * 
     */
    public GetCompRolEstrucUsuarioResponse createGetCompRolEstrucUsuarioResponse() {
        return new GetCompRolEstrucUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetCredencialesFirma }
     * 
     */
    public GetCredencialesFirma createGetCredencialesFirma() {
        return new GetCredencialesFirma();
    }

    /**
     * Create an instance of {@link GetCredencialesFirmaResponse }
     * 
     */
    public GetCredencialesFirmaResponse createGetCredencialesFirmaResponse() {
        return new GetCredencialesFirmaResponse();
    }

    /**
     * Create an instance of {@link GetEstructuraSistema }
     * 
     */
    public GetEstructuraSistema createGetEstructuraSistema() {
        return new GetEstructuraSistema();
    }

    /**
     * Create an instance of {@link GetEstructuraSistemaResponse }
     * 
     */
    public GetEstructuraSistemaResponse createGetEstructuraSistemaResponse() {
        return new GetEstructuraSistemaResponse();
    }

    /**
     * Create an instance of {@link GetInstitucionesBySistema }
     * 
     */
    public GetInstitucionesBySistema createGetInstitucionesBySistema() {
        return new GetInstitucionesBySistema();
    }

    /**
     * Create an instance of {@link GetInstitucionesBySistemaResponse }
     * 
     */
    public GetInstitucionesBySistemaResponse createGetInstitucionesBySistemaResponse() {
        return new GetInstitucionesBySistemaResponse();
    }

    /**
     * Create an instance of {@link GetPermisos }
     * 
     */
    public GetPermisos createGetPermisos() {
        return new GetPermisos();
    }

    /**
     * Create an instance of {@link GetPermisosResponse }
     * 
     */
    public GetPermisosResponse createGetPermisosResponse() {
        return new GetPermisosResponse();
    }

    /**
     * Create an instance of {@link GetRolesByUsuario }
     * 
     */
    public GetRolesByUsuario createGetRolesByUsuario() {
        return new GetRolesByUsuario();
    }

    /**
     * Create an instance of {@link GetRolesByUsuarioByAgenciaBySistema }
     * 
     */
    public GetRolesByUsuarioByAgenciaBySistema createGetRolesByUsuarioByAgenciaBySistema() {
        return new GetRolesByUsuarioByAgenciaBySistema();
    }

    /**
     * Create an instance of {@link GetRolesByUsuarioByAgenciaBySistemaResponse }
     * 
     */
    public GetRolesByUsuarioByAgenciaBySistemaResponse createGetRolesByUsuarioByAgenciaBySistemaResponse() {
        return new GetRolesByUsuarioByAgenciaBySistemaResponse();
    }

    /**
     * Create an instance of {@link GetRolesByUsuarioResponse }
     * 
     */
    public GetRolesByUsuarioResponse createGetRolesByUsuarioResponse() {
        return new GetRolesByUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetSegAccesoByIdsRol }
     * 
     */
    public GetSegAccesoByIdsRol createGetSegAccesoByIdsRol() {
        return new GetSegAccesoByIdsRol();
    }

    /**
     * Create an instance of {@link GetSegAccesoByIdsRolResponse }
     * 
     */
    public GetSegAccesoByIdsRolResponse createGetSegAccesoByIdsRolResponse() {
        return new GetSegAccesoByIdsRolResponse();
    }

    /**
     * Create an instance of {@link GetUbcInternacionalByIdUbc }
     * 
     */
    public GetUbcInternacionalByIdUbc createGetUbcInternacionalByIdUbc() {
        return new GetUbcInternacionalByIdUbc();
    }

    /**
     * Create an instance of {@link GetUbcInternacionalByIdUbcResponse }
     * 
     */
    public GetUbcInternacionalByIdUbcResponse createGetUbcInternacionalByIdUbcResponse() {
        return new GetUbcInternacionalByIdUbcResponse();
    }

    /**
     * Create an instance of {@link GetUbcListByIdGrupStatus }
     * 
     */
    public GetUbcListByIdGrupStatus createGetUbcListByIdGrupStatus() {
        return new GetUbcListByIdGrupStatus();
    }

    /**
     * Create an instance of {@link GetUbcListByIdGrupStatusResponse }
     * 
     */
    public GetUbcListByIdGrupStatusResponse createGetUbcListByIdGrupStatusResponse() {
        return new GetUbcListByIdGrupStatusResponse();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodAs400 }
     * 
     */
    public GetUbicacionByCodAs400 createGetUbicacionByCodAs400() {
        return new GetUbicacionByCodAs400();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodAs400Response }
     * 
     */
    public GetUbicacionByCodAs400Response createGetUbicacionByCodAs400Response() {
        return new GetUbicacionByCodAs400Response();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodDpa }
     * 
     */
    public GetUbicacionByCodDpa createGetUbicacionByCodDpa() {
        return new GetUbicacionByCodDpa();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodDpaResponse }
     * 
     */
    public GetUbicacionByCodDpaResponse createGetUbicacionByCodDpaResponse() {
        return new GetUbicacionByCodDpaResponse();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodUbiMagnaWS }
     * 
     */
    public GetUbicacionByCodUbiMagnaWS createGetUbicacionByCodUbiMagnaWS() {
        return new GetUbicacionByCodUbiMagnaWS();
    }

    /**
     * Create an instance of {@link GetUbicacionByCodUbiMagnaWSResponse }
     * 
     */
    public GetUbicacionByCodUbiMagnaWSResponse createGetUbicacionByCodUbiMagnaWSResponse() {
        return new GetUbicacionByCodUbiMagnaWSResponse();
    }

    /**
     * Create an instance of {@link GetUbicacionByIdUbicacion }
     * 
     */
    public GetUbicacionByIdUbicacion createGetUbicacionByIdUbicacion() {
        return new GetUbicacionByIdUbicacion();
    }

    /**
     * Create an instance of {@link GetUbicacionByIdUbicacionResponse }
     * 
     */
    public GetUbicacionByIdUbicacionResponse createGetUbicacionByIdUbicacionResponse() {
        return new GetUbicacionByIdUbicacionResponse();
    }

    /**
     * Create an instance of {@link GetUbicacionByTipo }
     * 
     */
    public GetUbicacionByTipo createGetUbicacionByTipo() {
        return new GetUbicacionByTipo();
    }

    /**
     * Create an instance of {@link GetUbicacionByTipoResponse }
     * 
     */
    public GetUbicacionByTipoResponse createGetUbicacionByTipoResponse() {
        return new GetUbicacionByTipoResponse();
    }

    /**
     * Create an instance of {@link GetUbicacionesByIdGrupo }
     * 
     */
    public GetUbicacionesByIdGrupo createGetUbicacionesByIdGrupo() {
        return new GetUbicacionesByIdGrupo();
    }

    /**
     * Create an instance of {@link GetUbicacionesByIdGrupoResponse }
     * 
     */
    public GetUbicacionesByIdGrupoResponse createGetUbicacionesByIdGrupoResponse() {
        return new GetUbicacionesByIdGrupoResponse();
    }

    /**
     * Create an instance of {@link GetUbsInternacionalByIdGrupo }
     * 
     */
    public GetUbsInternacionalByIdGrupo createGetUbsInternacionalByIdGrupo() {
        return new GetUbsInternacionalByIdGrupo();
    }

    /**
     * Create an instance of {@link GetUbsInternacionalByIdGrupoResponse }
     * 
     */
    public GetUbsInternacionalByIdGrupoResponse createGetUbsInternacionalByIdGrupoResponse() {
        return new GetUbsInternacionalByIdGrupoResponse();
    }

    /**
     * Create an instance of {@link GetUsuAgenByIdRolUbicacionStatusWS }
     * 
     */
    public GetUsuAgenByIdRolUbicacionStatusWS createGetUsuAgenByIdRolUbicacionStatusWS() {
        return new GetUsuAgenByIdRolUbicacionStatusWS();
    }

    /**
     * Create an instance of {@link GetUsuAgenByIdRolUbicacionStatusWSResponse }
     * 
     */
    public GetUsuAgenByIdRolUbicacionStatusWSResponse createGetUsuAgenByIdRolUbicacionStatusWSResponse() {
        return new GetUsuAgenByIdRolUbicacionStatusWSResponse();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdAgIdRolStatus }
     * 
     */
    public GetUsuAgenciaByIdAgIdRolStatus createGetUsuAgenciaByIdAgIdRolStatus() {
        return new GetUsuAgenciaByIdAgIdRolStatus();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdAgIdRolStatusResponse }
     * 
     */
    public GetUsuAgenciaByIdAgIdRolStatusResponse createGetUsuAgenciaByIdAgIdRolStatusResponse() {
        return new GetUsuAgenciaByIdAgIdRolStatusResponse();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdProvIdRolStatus }
     * 
     */
    public GetUsuAgenciaByIdProvIdRolStatus createGetUsuAgenciaByIdProvIdRolStatus() {
        return new GetUsuAgenciaByIdProvIdRolStatus();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdProvIdRolStatusResponse }
     * 
     */
    public GetUsuAgenciaByIdProvIdRolStatusResponse createGetUsuAgenciaByIdProvIdRolStatusResponse() {
        return new GetUsuAgenciaByIdProvIdRolStatusResponse();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdRolStatusWS }
     * 
     */
    public GetUsuAgenciaByIdRolStatusWS createGetUsuAgenciaByIdRolStatusWS() {
        return new GetUsuAgenciaByIdRolStatusWS();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByIdRolStatusWSResponse }
     * 
     */
    public GetUsuAgenciaByIdRolStatusWSResponse createGetUsuAgenciaByIdRolStatusWSResponse() {
        return new GetUsuAgenciaByIdRolStatusWSResponse();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByUserAndAgencia }
     * 
     */
    public GetUsuAgenciaByUserAndAgencia createGetUsuAgenciaByUserAndAgencia() {
        return new GetUsuAgenciaByUserAndAgencia();
    }

    /**
     * Create an instance of {@link GetUsuAgenciaByUserAndAgenciaResponse }
     * 
     */
    public GetUsuAgenciaByUserAndAgenciaResponse createGetUsuAgenciaByUserAndAgenciaResponse() {
        return new GetUsuAgenciaByUserAndAgenciaResponse();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link GetUsuarioByUserAndAgencia }
     * 
     */
    public GetUsuarioByUserAndAgencia createGetUsuarioByUserAndAgencia() {
        return new GetUsuarioByUserAndAgencia();
    }

    /**
     * Create an instance of {@link GetUsuarioByUserAndAgenciaMsp }
     * 
     */
    public GetUsuarioByUserAndAgenciaMsp createGetUsuarioByUserAndAgenciaMsp() {
        return new GetUsuarioByUserAndAgenciaMsp();
    }

    /**
     * Create an instance of {@link GetUsuarioByUserAndAgenciaMspResponse }
     * 
     */
    public GetUsuarioByUserAndAgenciaMspResponse createGetUsuarioByUserAndAgenciaMspResponse() {
        return new GetUsuarioByUserAndAgenciaMspResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioByUserAndAgenciaResponse }
     * 
     */
    public GetUsuarioByUserAndAgenciaResponse createGetUsuarioByUserAndAgenciaResponse() {
        return new GetUsuarioByUserAndAgenciaResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioByUsernameAndMail }
     * 
     */
    public GetUsuarioByUsernameAndMail createGetUsuarioByUsernameAndMail() {
        return new GetUsuarioByUsernameAndMail();
    }

    /**
     * Create an instance of {@link GetUsuarioByUsernameAndMailResponse }
     * 
     */
    public GetUsuarioByUsernameAndMailResponse createGetUsuarioByUsernameAndMailResponse() {
        return new GetUsuarioByUsernameAndMailResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioLogin }
     * 
     */
    public GetUsuarioLogin createGetUsuarioLogin() {
        return new GetUsuarioLogin();
    }

    /**
     * Create an instance of {@link GetUsuarioLoginResponse }
     * 
     */
    public GetUsuarioLoginResponse createGetUsuarioLoginResponse() {
        return new GetUsuarioLoginResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgencia }
     * 
     */
    public GetUsuariosByAgencia createGetUsuariosByAgencia() {
        return new GetUsuariosByAgencia();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaBySistema }
     * 
     */
    public GetUsuariosByAgenciaBySistema createGetUsuariosByAgenciaBySistema() {
        return new GetUsuariosByAgenciaBySistema();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaBySistemaResponse }
     * 
     */
    public GetUsuariosByAgenciaBySistemaResponse createGetUsuariosByAgenciaBySistemaResponse() {
        return new GetUsuariosByAgenciaBySistemaResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaMSPAll }
     * 
     */
    public GetUsuariosByAgenciaMSPAll createGetUsuariosByAgenciaMSPAll() {
        return new GetUsuariosByAgenciaMSPAll();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaMSPAllResponse }
     * 
     */
    public GetUsuariosByAgenciaMSPAllResponse createGetUsuariosByAgenciaMSPAllResponse() {
        return new GetUsuariosByAgenciaMSPAllResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaMsp }
     * 
     */
    public GetUsuariosByAgenciaMsp createGetUsuariosByAgenciaMsp() {
        return new GetUsuariosByAgenciaMsp();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaMspResponse }
     * 
     */
    public GetUsuariosByAgenciaMspResponse createGetUsuariosByAgenciaMspResponse() {
        return new GetUsuariosByAgenciaMspResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByAgenciaResponse }
     * 
     */
    public GetUsuariosByAgenciaResponse createGetUsuariosByAgenciaResponse() {
        return new GetUsuariosByAgenciaResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosByIdAgenciaIdRol }
     * 
     */
    public GetUsuariosByIdAgenciaIdRol createGetUsuariosByIdAgenciaIdRol() {
        return new GetUsuariosByIdAgenciaIdRol();
    }

    /**
     * Create an instance of {@link GetUsuariosByIdAgenciaIdRolResponse }
     * 
     */
    public GetUsuariosByIdAgenciaIdRolResponse createGetUsuariosByIdAgenciaIdRolResponse() {
        return new GetUsuariosByIdAgenciaIdRolResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosBySistemaByAgenciaMspByRol }
     * 
     */
    public GetUsuariosBySistemaByAgenciaMspByRol createGetUsuariosBySistemaByAgenciaMspByRol() {
        return new GetUsuariosBySistemaByAgenciaMspByRol();
    }

    /**
     * Create an instance of {@link GetUsuariosBySistemaByAgenciaMspByRolResponse }
     * 
     */
    public GetUsuariosBySistemaByAgenciaMspByRolResponse createGetUsuariosBySistemaByAgenciaMspByRolResponse() {
        return new GetUsuariosBySistemaByAgenciaMspByRolResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosFromPageForFirma }
     * 
     */
    public GetUsuariosFromPageForFirma createGetUsuariosFromPageForFirma() {
        return new GetUsuariosFromPageForFirma();
    }

    /**
     * Create an instance of {@link GetUsuariosFromPageForFirmaResponse }
     * 
     */
    public GetUsuariosFromPageForFirmaResponse createGetUsuariosFromPageForFirmaResponse() {
        return new GetUsuariosFromPageForFirmaResponse();
    }

    /**
     * Create an instance of {@link LeerEstructura }
     * 
     */
    public LeerEstructura createLeerEstructura() {
        return new LeerEstructura();
    }

    /**
     * Create an instance of {@link LeerEstructuraResponse }
     * 
     */
    public LeerEstructuraResponse createLeerEstructuraResponse() {
        return new LeerEstructuraResponse();
    }

    /**
     * Create an instance of {@link ResetearClaveEnvioMail }
     * 
     */
    public ResetearClaveEnvioMail createResetearClaveEnvioMail() {
        return new ResetearClaveEnvioMail();
    }

    /**
     * Create an instance of {@link ResetearClaveEnvioMailResponse }
     * 
     */
    public ResetearClaveEnvioMailResponse createResetearClaveEnvioMailResponse() {
        return new ResetearClaveEnvioMailResponse();
    }

    /**
     * Create an instance of {@link TblSauregAgencia }
     * 
     */
    public TblSauregAgencia createTblSauregAgencia() {
        return new TblSauregAgencia();
    }

    /**
     * Create an instance of {@link TblSauregCompRol }
     * 
     */
    public TblSauregCompRol createTblSauregCompRol() {
        return new TblSauregCompRol();
    }

    /**
     * Create an instance of {@link TblSauregEstados }
     * 
     */
    public TblSauregEstados createTblSauregEstados() {
        return new TblSauregEstados();
    }

    /**
     * Create an instance of {@link TblSauregEstrucSist }
     * 
     */
    public TblSauregEstrucSist createTblSauregEstrucSist() {
        return new TblSauregEstrucSist();
    }

    /**
     * Create an instance of {@link TblSauregInstitucion }
     * 
     */
    public TblSauregInstitucion createTblSauregInstitucion() {
        return new TblSauregInstitucion();
    }

    /**
     * Create an instance of {@link TblSauregPermiso }
     * 
     */
    public TblSauregPermiso createTblSauregPermiso() {
        return new TblSauregPermiso();
    }

    /**
     * Create an instance of {@link TblSauregRol }
     * 
     */
    public TblSauregRol createTblSauregRol() {
        return new TblSauregRol();
    }

    /**
     * Create an instance of {@link TblSauregSegAcceso }
     * 
     */
    public TblSauregSegAcceso createTblSauregSegAcceso() {
        return new TblSauregSegAcceso();
    }

    /**
     * Create an instance of {@link TblSauregUbicacion }
     * 
     */
    public TblSauregUbicacion createTblSauregUbicacion() {
        return new TblSauregUbicacion();
    }

    /**
     * Create an instance of {@link TblSauregUsuAgencia }
     * 
     */
    public TblSauregUsuAgencia createTblSauregUsuAgencia() {
        return new TblSauregUsuAgencia();
    }

    /**
     * Create an instance of {@link TblSauregUsuario }
     * 
     */
    public TblSauregUsuario createTblSauregUsuario() {
        return new TblSauregUsuario();
    }

    /**
     * Create an instance of {@link UbicacionInternacional }
     * 
     */
    public UbicacionInternacional createUbicacionInternacional() {
        return new UbicacionInternacional();
    }

    /**
     * Create an instance of {@link ValidarCodigoSms }
     * 
     */
    public ValidarCodigoSms createValidarCodigoSms() {
        return new ValidarCodigoSms();
    }

    /**
     * Create an instance of {@link ValidarCodigoSmsResponse }
     * 
     */
    public ValidarCodigoSmsResponse createValidarCodigoSmsResponse() {
        return new ValidarCodigoSmsResponse();
    }

    /**
     * Create an instance of {@link ListRol }
     * 
     */
    public ListRol createListRol() {
        return new ListRol();
    }

    /**
     * Create an instance of {@link ListSegAcceso }
     * 
     */
    public ListSegAcceso createListSegAcceso() {
        return new ListSegAcceso();
    }

    /**
     * Create an instance of {@link ListEstrucSist }
     * 
     */
    public ListEstrucSist createListEstrucSist() {
        return new ListEstrucSist();
    }

    /**
     * Create an instance of {@link ListUsuario }
     * 
     */
    public ListUsuario createListUsuario() {
        return new ListUsuario();
    }

    /**
     * Create an instance of {@link ListAgencia }
     * 
     */
    public ListAgencia createListAgencia() {
        return new ListAgencia();
    }

    /**
     * Create an instance of {@link TblSauregUsuAgenciaPK }
     * 
     */
    public TblSauregUsuAgenciaPK createTblSauregUsuAgenciaPK() {
        return new TblSauregUsuAgenciaPK();
    }

    /**
     * Create an instance of {@link ResultadoString }
     * 
     */
    public ResultadoString createResultadoString() {
        return new ResultadoString();
    }

    /**
     * Create an instance of {@link ListUsuAgencia }
     * 
     */
    public ListUsuAgencia createListUsuAgencia() {
        return new ListUsuAgencia();
    }

    /**
     * Create an instance of {@link ListUbicacionInternacional }
     * 
     */
    public ListUbicacionInternacional createListUbicacionInternacional() {
        return new ListUbicacionInternacional();
    }

    /**
     * Create an instance of {@link ListUbicacion }
     * 
     */
    public ListUbicacion createListUbicacion() {
        return new ListUbicacion();
    }

    /**
     * Create an instance of {@link ListCompRol }
     * 
     */
    public ListCompRol createListCompRol() {
        return new ListCompRol();
    }

    /**
     * Create an instance of {@link TblSauregCompRolPK }
     * 
     */
    public TblSauregCompRolPK createTblSauregCompRolPK() {
        return new TblSauregCompRolPK();
    }

    /**
     * Create an instance of {@link ListInstitucion }
     * 
     */
    public ListInstitucion createListInstitucion() {
        return new ListInstitucion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarContraseniaUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "cambiarContraseniaUsuario")
    public JAXBElement<CambiarContraseniaUsuario> createCambiarContraseniaUsuario(CambiarContraseniaUsuario value) {
        return new JAXBElement<CambiarContraseniaUsuario>(_CambiarContraseniaUsuario_QNAME, CambiarContraseniaUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarContraseniaUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "cambiarContraseniaUsuarioResponse")
    public JAXBElement<CambiarContraseniaUsuarioResponse> createCambiarContraseniaUsuarioResponse(CambiarContraseniaUsuarioResponse value) {
        return new JAXBElement<CambiarContraseniaUsuarioResponse>(_CambiarContraseniaUsuarioResponse_QNAME, CambiarContraseniaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "controlSession")
    public JAXBElement<ControlSession> createControlSession(ControlSession value) {
        return new JAXBElement<ControlSession>(_ControlSession_QNAME, ControlSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "controlSessionResponse")
    public JAXBElement<ControlSessionResponse> createControlSessionResponse(ControlSessionResponse value) {
        return new JAXBElement<ControlSessionResponse>(_ControlSessionResponse_QNAME, ControlSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciaByIdAgenciaWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciaByIdAgenciaWS")
    public JAXBElement<GetAgenciaByIdAgenciaWS> createGetAgenciaByIdAgenciaWS(GetAgenciaByIdAgenciaWS value) {
        return new JAXBElement<GetAgenciaByIdAgenciaWS>(_GetAgenciaByIdAgenciaWS_QNAME, GetAgenciaByIdAgenciaWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciaByIdAgenciaWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciaByIdAgenciaWSResponse")
    public JAXBElement<GetAgenciaByIdAgenciaWSResponse> createGetAgenciaByIdAgenciaWSResponse(GetAgenciaByIdAgenciaWSResponse value) {
        return new JAXBElement<GetAgenciaByIdAgenciaWSResponse>(_GetAgenciaByIdAgenciaWSResponse_QNAME, GetAgenciaByIdAgenciaWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByIdSistemaWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByIdSistemaWS")
    public JAXBElement<GetAgenciasByIdSistemaWS> createGetAgenciasByIdSistemaWS(GetAgenciasByIdSistemaWS value) {
        return new JAXBElement<GetAgenciasByIdSistemaWS>(_GetAgenciasByIdSistemaWS_QNAME, GetAgenciasByIdSistemaWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByIdSistemaWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByIdSistemaWSResponse")
    public JAXBElement<GetAgenciasByIdSistemaWSResponse> createGetAgenciasByIdSistemaWSResponse(GetAgenciasByIdSistemaWSResponse value) {
        return new JAXBElement<GetAgenciasByIdSistemaWSResponse>(_GetAgenciasByIdSistemaWSResponse_QNAME, GetAgenciasByIdSistemaWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByIdUbiacionStatusWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByIdUbiacionStatusWS")
    public JAXBElement<GetAgenciasByIdUbiacionStatusWS> createGetAgenciasByIdUbiacionStatusWS(GetAgenciasByIdUbiacionStatusWS value) {
        return new JAXBElement<GetAgenciasByIdUbiacionStatusWS>(_GetAgenciasByIdUbiacionStatusWS_QNAME, GetAgenciasByIdUbiacionStatusWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByIdUbiacionStatusWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByIdUbiacionStatusWSResponse")
    public JAXBElement<GetAgenciasByIdUbiacionStatusWSResponse> createGetAgenciasByIdUbiacionStatusWSResponse(GetAgenciasByIdUbiacionStatusWSResponse value) {
        return new JAXBElement<GetAgenciasByIdUbiacionStatusWSResponse>(_GetAgenciasByIdUbiacionStatusWSResponse_QNAME, GetAgenciasByIdUbiacionStatusWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByInstitucionBySistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByInstitucionBySistema")
    public JAXBElement<GetAgenciasByInstitucionBySistema> createGetAgenciasByInstitucionBySistema(GetAgenciasByInstitucionBySistema value) {
        return new JAXBElement<GetAgenciasByInstitucionBySistema>(_GetAgenciasByInstitucionBySistema_QNAME, GetAgenciasByInstitucionBySistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasByInstitucionBySistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasByInstitucionBySistemaResponse")
    public JAXBElement<GetAgenciasByInstitucionBySistemaResponse> createGetAgenciasByInstitucionBySistemaResponse(GetAgenciasByInstitucionBySistemaResponse value) {
        return new JAXBElement<GetAgenciasByInstitucionBySistemaResponse>(_GetAgenciasByInstitucionBySistemaResponse_QNAME, GetAgenciasByInstitucionBySistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasPorInstitucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasPorInstitucion")
    public JAXBElement<GetAgenciasPorInstitucion> createGetAgenciasPorInstitucion(GetAgenciasPorInstitucion value) {
        return new JAXBElement<GetAgenciasPorInstitucion>(_GetAgenciasPorInstitucion_QNAME, GetAgenciasPorInstitucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasPorInstitucionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasPorInstitucionResponse")
    public JAXBElement<GetAgenciasPorInstitucionResponse> createGetAgenciasPorInstitucionResponse(GetAgenciasPorInstitucionResponse value) {
        return new JAXBElement<GetAgenciasPorInstitucionResponse>(_GetAgenciasPorInstitucionResponse_QNAME, GetAgenciasPorInstitucionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasPorInstitucionYUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasPorInstitucionYUsuario")
    public JAXBElement<GetAgenciasPorInstitucionYUsuario> createGetAgenciasPorInstitucionYUsuario(GetAgenciasPorInstitucionYUsuario value) {
        return new JAXBElement<GetAgenciasPorInstitucionYUsuario>(_GetAgenciasPorInstitucionYUsuario_QNAME, GetAgenciasPorInstitucionYUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenciasPorInstitucionYUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getAgenciasPorInstitucionYUsuarioResponse")
    public JAXBElement<GetAgenciasPorInstitucionYUsuarioResponse> createGetAgenciasPorInstitucionYUsuarioResponse(GetAgenciasPorInstitucionYUsuarioResponse value) {
        return new JAXBElement<GetAgenciasPorInstitucionYUsuarioResponse>(_GetAgenciasPorInstitucionYUsuarioResponse_QNAME, GetAgenciasPorInstitucionYUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompRolEstrucUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getCompRolEstrucUsuario")
    public JAXBElement<GetCompRolEstrucUsuario> createGetCompRolEstrucUsuario(GetCompRolEstrucUsuario value) {
        return new JAXBElement<GetCompRolEstrucUsuario>(_GetCompRolEstrucUsuario_QNAME, GetCompRolEstrucUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompRolEstrucUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getCompRolEstrucUsuarioResponse")
    public JAXBElement<GetCompRolEstrucUsuarioResponse> createGetCompRolEstrucUsuarioResponse(GetCompRolEstrucUsuarioResponse value) {
        return new JAXBElement<GetCompRolEstrucUsuarioResponse>(_GetCompRolEstrucUsuarioResponse_QNAME, GetCompRolEstrucUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCredencialesFirma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getCredencialesFirma")
    public JAXBElement<GetCredencialesFirma> createGetCredencialesFirma(GetCredencialesFirma value) {
        return new JAXBElement<GetCredencialesFirma>(_GetCredencialesFirma_QNAME, GetCredencialesFirma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCredencialesFirmaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getCredencialesFirmaResponse")
    public JAXBElement<GetCredencialesFirmaResponse> createGetCredencialesFirmaResponse(GetCredencialesFirmaResponse value) {
        return new JAXBElement<GetCredencialesFirmaResponse>(_GetCredencialesFirmaResponse_QNAME, GetCredencialesFirmaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstructuraSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getEstructuraSistema")
    public JAXBElement<GetEstructuraSistema> createGetEstructuraSistema(GetEstructuraSistema value) {
        return new JAXBElement<GetEstructuraSistema>(_GetEstructuraSistema_QNAME, GetEstructuraSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstructuraSistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getEstructuraSistemaResponse")
    public JAXBElement<GetEstructuraSistemaResponse> createGetEstructuraSistemaResponse(GetEstructuraSistemaResponse value) {
        return new JAXBElement<GetEstructuraSistemaResponse>(_GetEstructuraSistemaResponse_QNAME, GetEstructuraSistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstitucionesBySistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getInstitucionesBySistema")
    public JAXBElement<GetInstitucionesBySistema> createGetInstitucionesBySistema(GetInstitucionesBySistema value) {
        return new JAXBElement<GetInstitucionesBySistema>(_GetInstitucionesBySistema_QNAME, GetInstitucionesBySistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInstitucionesBySistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getInstitucionesBySistemaResponse")
    public JAXBElement<GetInstitucionesBySistemaResponse> createGetInstitucionesBySistemaResponse(GetInstitucionesBySistemaResponse value) {
        return new JAXBElement<GetInstitucionesBySistemaResponse>(_GetInstitucionesBySistemaResponse_QNAME, GetInstitucionesBySistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPermisos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getPermisos")
    public JAXBElement<GetPermisos> createGetPermisos(GetPermisos value) {
        return new JAXBElement<GetPermisos>(_GetPermisos_QNAME, GetPermisos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPermisosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getPermisosResponse")
    public JAXBElement<GetPermisosResponse> createGetPermisosResponse(GetPermisosResponse value) {
        return new JAXBElement<GetPermisosResponse>(_GetPermisosResponse_QNAME, GetPermisosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getRolesByUsuario")
    public JAXBElement<GetRolesByUsuario> createGetRolesByUsuario(GetRolesByUsuario value) {
        return new JAXBElement<GetRolesByUsuario>(_GetRolesByUsuario_QNAME, GetRolesByUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUsuarioByAgenciaBySistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getRolesByUsuarioByAgenciaBySistema")
    public JAXBElement<GetRolesByUsuarioByAgenciaBySistema> createGetRolesByUsuarioByAgenciaBySistema(GetRolesByUsuarioByAgenciaBySistema value) {
        return new JAXBElement<GetRolesByUsuarioByAgenciaBySistema>(_GetRolesByUsuarioByAgenciaBySistema_QNAME, GetRolesByUsuarioByAgenciaBySistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUsuarioByAgenciaBySistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getRolesByUsuarioByAgenciaBySistemaResponse")
    public JAXBElement<GetRolesByUsuarioByAgenciaBySistemaResponse> createGetRolesByUsuarioByAgenciaBySistemaResponse(GetRolesByUsuarioByAgenciaBySistemaResponse value) {
        return new JAXBElement<GetRolesByUsuarioByAgenciaBySistemaResponse>(_GetRolesByUsuarioByAgenciaBySistemaResponse_QNAME, GetRolesByUsuarioByAgenciaBySistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getRolesByUsuarioResponse")
    public JAXBElement<GetRolesByUsuarioResponse> createGetRolesByUsuarioResponse(GetRolesByUsuarioResponse value) {
        return new JAXBElement<GetRolesByUsuarioResponse>(_GetRolesByUsuarioResponse_QNAME, GetRolesByUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegAccesoByIdsRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getSegAccesoByIdsRol")
    public JAXBElement<GetSegAccesoByIdsRol> createGetSegAccesoByIdsRol(GetSegAccesoByIdsRol value) {
        return new JAXBElement<GetSegAccesoByIdsRol>(_GetSegAccesoByIdsRol_QNAME, GetSegAccesoByIdsRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegAccesoByIdsRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getSegAccesoByIdsRolResponse")
    public JAXBElement<GetSegAccesoByIdsRolResponse> createGetSegAccesoByIdsRolResponse(GetSegAccesoByIdsRolResponse value) {
        return new JAXBElement<GetSegAccesoByIdsRolResponse>(_GetSegAccesoByIdsRolResponse_QNAME, GetSegAccesoByIdsRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbcInternacionalByIdUbc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbcInternacionalByIdUbc")
    public JAXBElement<GetUbcInternacionalByIdUbc> createGetUbcInternacionalByIdUbc(GetUbcInternacionalByIdUbc value) {
        return new JAXBElement<GetUbcInternacionalByIdUbc>(_GetUbcInternacionalByIdUbc_QNAME, GetUbcInternacionalByIdUbc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbcInternacionalByIdUbcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbcInternacionalByIdUbcResponse")
    public JAXBElement<GetUbcInternacionalByIdUbcResponse> createGetUbcInternacionalByIdUbcResponse(GetUbcInternacionalByIdUbcResponse value) {
        return new JAXBElement<GetUbcInternacionalByIdUbcResponse>(_GetUbcInternacionalByIdUbcResponse_QNAME, GetUbcInternacionalByIdUbcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbcListByIdGrupStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbcListByIdGrupStatus")
    public JAXBElement<GetUbcListByIdGrupStatus> createGetUbcListByIdGrupStatus(GetUbcListByIdGrupStatus value) {
        return new JAXBElement<GetUbcListByIdGrupStatus>(_GetUbcListByIdGrupStatus_QNAME, GetUbcListByIdGrupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbcListByIdGrupStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbcListByIdGrupStatusResponse")
    public JAXBElement<GetUbcListByIdGrupStatusResponse> createGetUbcListByIdGrupStatusResponse(GetUbcListByIdGrupStatusResponse value) {
        return new JAXBElement<GetUbcListByIdGrupStatusResponse>(_GetUbcListByIdGrupStatusResponse_QNAME, GetUbcListByIdGrupStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodAs400 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodAs400")
    public JAXBElement<GetUbicacionByCodAs400> createGetUbicacionByCodAs400(GetUbicacionByCodAs400 value) {
        return new JAXBElement<GetUbicacionByCodAs400>(_GetUbicacionByCodAs400_QNAME, GetUbicacionByCodAs400 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodAs400Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodAs400Response")
    public JAXBElement<GetUbicacionByCodAs400Response> createGetUbicacionByCodAs400Response(GetUbicacionByCodAs400Response value) {
        return new JAXBElement<GetUbicacionByCodAs400Response>(_GetUbicacionByCodAs400Response_QNAME, GetUbicacionByCodAs400Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodDpa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodDpa")
    public JAXBElement<GetUbicacionByCodDpa> createGetUbicacionByCodDpa(GetUbicacionByCodDpa value) {
        return new JAXBElement<GetUbicacionByCodDpa>(_GetUbicacionByCodDpa_QNAME, GetUbicacionByCodDpa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodDpaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodDpaResponse")
    public JAXBElement<GetUbicacionByCodDpaResponse> createGetUbicacionByCodDpaResponse(GetUbicacionByCodDpaResponse value) {
        return new JAXBElement<GetUbicacionByCodDpaResponse>(_GetUbicacionByCodDpaResponse_QNAME, GetUbicacionByCodDpaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodUbiMagnaWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodUbiMagnaWS")
    public JAXBElement<GetUbicacionByCodUbiMagnaWS> createGetUbicacionByCodUbiMagnaWS(GetUbicacionByCodUbiMagnaWS value) {
        return new JAXBElement<GetUbicacionByCodUbiMagnaWS>(_GetUbicacionByCodUbiMagnaWS_QNAME, GetUbicacionByCodUbiMagnaWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByCodUbiMagnaWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByCodUbiMagnaWSResponse")
    public JAXBElement<GetUbicacionByCodUbiMagnaWSResponse> createGetUbicacionByCodUbiMagnaWSResponse(GetUbicacionByCodUbiMagnaWSResponse value) {
        return new JAXBElement<GetUbicacionByCodUbiMagnaWSResponse>(_GetUbicacionByCodUbiMagnaWSResponse_QNAME, GetUbicacionByCodUbiMagnaWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByIdUbicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByIdUbicacion")
    public JAXBElement<GetUbicacionByIdUbicacion> createGetUbicacionByIdUbicacion(GetUbicacionByIdUbicacion value) {
        return new JAXBElement<GetUbicacionByIdUbicacion>(_GetUbicacionByIdUbicacion_QNAME, GetUbicacionByIdUbicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByIdUbicacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByIdUbicacionResponse")
    public JAXBElement<GetUbicacionByIdUbicacionResponse> createGetUbicacionByIdUbicacionResponse(GetUbicacionByIdUbicacionResponse value) {
        return new JAXBElement<GetUbicacionByIdUbicacionResponse>(_GetUbicacionByIdUbicacionResponse_QNAME, GetUbicacionByIdUbicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByTipo")
    public JAXBElement<GetUbicacionByTipo> createGetUbicacionByTipo(GetUbicacionByTipo value) {
        return new JAXBElement<GetUbicacionByTipo>(_GetUbicacionByTipo_QNAME, GetUbicacionByTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionByTipoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionByTipoResponse")
    public JAXBElement<GetUbicacionByTipoResponse> createGetUbicacionByTipoResponse(GetUbicacionByTipoResponse value) {
        return new JAXBElement<GetUbicacionByTipoResponse>(_GetUbicacionByTipoResponse_QNAME, GetUbicacionByTipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionesByIdGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionesByIdGrupo")
    public JAXBElement<GetUbicacionesByIdGrupo> createGetUbicacionesByIdGrupo(GetUbicacionesByIdGrupo value) {
        return new JAXBElement<GetUbicacionesByIdGrupo>(_GetUbicacionesByIdGrupo_QNAME, GetUbicacionesByIdGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbicacionesByIdGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbicacionesByIdGrupoResponse")
    public JAXBElement<GetUbicacionesByIdGrupoResponse> createGetUbicacionesByIdGrupoResponse(GetUbicacionesByIdGrupoResponse value) {
        return new JAXBElement<GetUbicacionesByIdGrupoResponse>(_GetUbicacionesByIdGrupoResponse_QNAME, GetUbicacionesByIdGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbsInternacionalByIdGrupo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbsInternacionalByIdGrupo")
    public JAXBElement<GetUbsInternacionalByIdGrupo> createGetUbsInternacionalByIdGrupo(GetUbsInternacionalByIdGrupo value) {
        return new JAXBElement<GetUbsInternacionalByIdGrupo>(_GetUbsInternacionalByIdGrupo_QNAME, GetUbsInternacionalByIdGrupo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUbsInternacionalByIdGrupoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUbsInternacionalByIdGrupoResponse")
    public JAXBElement<GetUbsInternacionalByIdGrupoResponse> createGetUbsInternacionalByIdGrupoResponse(GetUbsInternacionalByIdGrupoResponse value) {
        return new JAXBElement<GetUbsInternacionalByIdGrupoResponse>(_GetUbsInternacionalByIdGrupoResponse_QNAME, GetUbsInternacionalByIdGrupoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenByIdRolUbicacionStatusWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenByIdRolUbicacionStatusWS")
    public JAXBElement<GetUsuAgenByIdRolUbicacionStatusWS> createGetUsuAgenByIdRolUbicacionStatusWS(GetUsuAgenByIdRolUbicacionStatusWS value) {
        return new JAXBElement<GetUsuAgenByIdRolUbicacionStatusWS>(_GetUsuAgenByIdRolUbicacionStatusWS_QNAME, GetUsuAgenByIdRolUbicacionStatusWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenByIdRolUbicacionStatusWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenByIdRolUbicacionStatusWSResponse")
    public JAXBElement<GetUsuAgenByIdRolUbicacionStatusWSResponse> createGetUsuAgenByIdRolUbicacionStatusWSResponse(GetUsuAgenByIdRolUbicacionStatusWSResponse value) {
        return new JAXBElement<GetUsuAgenByIdRolUbicacionStatusWSResponse>(_GetUsuAgenByIdRolUbicacionStatusWSResponse_QNAME, GetUsuAgenByIdRolUbicacionStatusWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdAgIdRolStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdAgIdRolStatus")
    public JAXBElement<GetUsuAgenciaByIdAgIdRolStatus> createGetUsuAgenciaByIdAgIdRolStatus(GetUsuAgenciaByIdAgIdRolStatus value) {
        return new JAXBElement<GetUsuAgenciaByIdAgIdRolStatus>(_GetUsuAgenciaByIdAgIdRolStatus_QNAME, GetUsuAgenciaByIdAgIdRolStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdAgIdRolStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdAgIdRolStatusResponse")
    public JAXBElement<GetUsuAgenciaByIdAgIdRolStatusResponse> createGetUsuAgenciaByIdAgIdRolStatusResponse(GetUsuAgenciaByIdAgIdRolStatusResponse value) {
        return new JAXBElement<GetUsuAgenciaByIdAgIdRolStatusResponse>(_GetUsuAgenciaByIdAgIdRolStatusResponse_QNAME, GetUsuAgenciaByIdAgIdRolStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdProvIdRolStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdProvIdRolStatus")
    public JAXBElement<GetUsuAgenciaByIdProvIdRolStatus> createGetUsuAgenciaByIdProvIdRolStatus(GetUsuAgenciaByIdProvIdRolStatus value) {
        return new JAXBElement<GetUsuAgenciaByIdProvIdRolStatus>(_GetUsuAgenciaByIdProvIdRolStatus_QNAME, GetUsuAgenciaByIdProvIdRolStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdProvIdRolStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdProvIdRolStatusResponse")
    public JAXBElement<GetUsuAgenciaByIdProvIdRolStatusResponse> createGetUsuAgenciaByIdProvIdRolStatusResponse(GetUsuAgenciaByIdProvIdRolStatusResponse value) {
        return new JAXBElement<GetUsuAgenciaByIdProvIdRolStatusResponse>(_GetUsuAgenciaByIdProvIdRolStatusResponse_QNAME, GetUsuAgenciaByIdProvIdRolStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdRolStatusWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdRolStatusWS")
    public JAXBElement<GetUsuAgenciaByIdRolStatusWS> createGetUsuAgenciaByIdRolStatusWS(GetUsuAgenciaByIdRolStatusWS value) {
        return new JAXBElement<GetUsuAgenciaByIdRolStatusWS>(_GetUsuAgenciaByIdRolStatusWS_QNAME, GetUsuAgenciaByIdRolStatusWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByIdRolStatusWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByIdRolStatusWSResponse")
    public JAXBElement<GetUsuAgenciaByIdRolStatusWSResponse> createGetUsuAgenciaByIdRolStatusWSResponse(GetUsuAgenciaByIdRolStatusWSResponse value) {
        return new JAXBElement<GetUsuAgenciaByIdRolStatusWSResponse>(_GetUsuAgenciaByIdRolStatusWSResponse_QNAME, GetUsuAgenciaByIdRolStatusWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByUserAndAgencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByUserAndAgencia")
    public JAXBElement<GetUsuAgenciaByUserAndAgencia> createGetUsuAgenciaByUserAndAgencia(GetUsuAgenciaByUserAndAgencia value) {
        return new JAXBElement<GetUsuAgenciaByUserAndAgencia>(_GetUsuAgenciaByUserAndAgencia_QNAME, GetUsuAgenciaByUserAndAgencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuAgenciaByUserAndAgenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuAgenciaByUserAndAgenciaResponse")
    public JAXBElement<GetUsuAgenciaByUserAndAgenciaResponse> createGetUsuAgenciaByUserAndAgenciaResponse(GetUsuAgenciaByUserAndAgenciaResponse value) {
        return new JAXBElement<GetUsuAgenciaByUserAndAgenciaResponse>(_GetUsuAgenciaByUserAndAgenciaResponse_QNAME, GetUsuAgenciaByUserAndAgenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUserAndAgencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUserAndAgencia")
    public JAXBElement<GetUsuarioByUserAndAgencia> createGetUsuarioByUserAndAgencia(GetUsuarioByUserAndAgencia value) {
        return new JAXBElement<GetUsuarioByUserAndAgencia>(_GetUsuarioByUserAndAgencia_QNAME, GetUsuarioByUserAndAgencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUserAndAgenciaMsp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUserAndAgenciaMsp")
    public JAXBElement<GetUsuarioByUserAndAgenciaMsp> createGetUsuarioByUserAndAgenciaMsp(GetUsuarioByUserAndAgenciaMsp value) {
        return new JAXBElement<GetUsuarioByUserAndAgenciaMsp>(_GetUsuarioByUserAndAgenciaMsp_QNAME, GetUsuarioByUserAndAgenciaMsp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUserAndAgenciaMspResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUserAndAgenciaMspResponse")
    public JAXBElement<GetUsuarioByUserAndAgenciaMspResponse> createGetUsuarioByUserAndAgenciaMspResponse(GetUsuarioByUserAndAgenciaMspResponse value) {
        return new JAXBElement<GetUsuarioByUserAndAgenciaMspResponse>(_GetUsuarioByUserAndAgenciaMspResponse_QNAME, GetUsuarioByUserAndAgenciaMspResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUserAndAgenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUserAndAgenciaResponse")
    public JAXBElement<GetUsuarioByUserAndAgenciaResponse> createGetUsuarioByUserAndAgenciaResponse(GetUsuarioByUserAndAgenciaResponse value) {
        return new JAXBElement<GetUsuarioByUserAndAgenciaResponse>(_GetUsuarioByUserAndAgenciaResponse_QNAME, GetUsuarioByUserAndAgenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUsernameAndMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUsernameAndMail")
    public JAXBElement<GetUsuarioByUsernameAndMail> createGetUsuarioByUsernameAndMail(GetUsuarioByUsernameAndMail value) {
        return new JAXBElement<GetUsuarioByUsernameAndMail>(_GetUsuarioByUsernameAndMail_QNAME, GetUsuarioByUsernameAndMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioByUsernameAndMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioByUsernameAndMailResponse")
    public JAXBElement<GetUsuarioByUsernameAndMailResponse> createGetUsuarioByUsernameAndMailResponse(GetUsuarioByUsernameAndMailResponse value) {
        return new JAXBElement<GetUsuarioByUsernameAndMailResponse>(_GetUsuarioByUsernameAndMailResponse_QNAME, GetUsuarioByUsernameAndMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioLogin")
    public JAXBElement<GetUsuarioLogin> createGetUsuarioLogin(GetUsuarioLogin value) {
        return new JAXBElement<GetUsuarioLogin>(_GetUsuarioLogin_QNAME, GetUsuarioLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioLoginResponse")
    public JAXBElement<GetUsuarioLoginResponse> createGetUsuarioLoginResponse(GetUsuarioLoginResponse value) {
        return new JAXBElement<GetUsuarioLoginResponse>(_GetUsuarioLoginResponse_QNAME, GetUsuarioLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgencia")
    public JAXBElement<GetUsuariosByAgencia> createGetUsuariosByAgencia(GetUsuariosByAgencia value) {
        return new JAXBElement<GetUsuariosByAgencia>(_GetUsuariosByAgencia_QNAME, GetUsuariosByAgencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaBySistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaBySistema")
    public JAXBElement<GetUsuariosByAgenciaBySistema> createGetUsuariosByAgenciaBySistema(GetUsuariosByAgenciaBySistema value) {
        return new JAXBElement<GetUsuariosByAgenciaBySistema>(_GetUsuariosByAgenciaBySistema_QNAME, GetUsuariosByAgenciaBySistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaBySistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaBySistemaResponse")
    public JAXBElement<GetUsuariosByAgenciaBySistemaResponse> createGetUsuariosByAgenciaBySistemaResponse(GetUsuariosByAgenciaBySistemaResponse value) {
        return new JAXBElement<GetUsuariosByAgenciaBySistemaResponse>(_GetUsuariosByAgenciaBySistemaResponse_QNAME, GetUsuariosByAgenciaBySistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaMSPAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaMSPAll")
    public JAXBElement<GetUsuariosByAgenciaMSPAll> createGetUsuariosByAgenciaMSPAll(GetUsuariosByAgenciaMSPAll value) {
        return new JAXBElement<GetUsuariosByAgenciaMSPAll>(_GetUsuariosByAgenciaMSPAll_QNAME, GetUsuariosByAgenciaMSPAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaMSPAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaMSPAllResponse")
    public JAXBElement<GetUsuariosByAgenciaMSPAllResponse> createGetUsuariosByAgenciaMSPAllResponse(GetUsuariosByAgenciaMSPAllResponse value) {
        return new JAXBElement<GetUsuariosByAgenciaMSPAllResponse>(_GetUsuariosByAgenciaMSPAllResponse_QNAME, GetUsuariosByAgenciaMSPAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaMsp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaMsp")
    public JAXBElement<GetUsuariosByAgenciaMsp> createGetUsuariosByAgenciaMsp(GetUsuariosByAgenciaMsp value) {
        return new JAXBElement<GetUsuariosByAgenciaMsp>(_GetUsuariosByAgenciaMsp_QNAME, GetUsuariosByAgenciaMsp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaMspResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaMspResponse")
    public JAXBElement<GetUsuariosByAgenciaMspResponse> createGetUsuariosByAgenciaMspResponse(GetUsuariosByAgenciaMspResponse value) {
        return new JAXBElement<GetUsuariosByAgenciaMspResponse>(_GetUsuariosByAgenciaMspResponse_QNAME, GetUsuariosByAgenciaMspResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByAgenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByAgenciaResponse")
    public JAXBElement<GetUsuariosByAgenciaResponse> createGetUsuariosByAgenciaResponse(GetUsuariosByAgenciaResponse value) {
        return new JAXBElement<GetUsuariosByAgenciaResponse>(_GetUsuariosByAgenciaResponse_QNAME, GetUsuariosByAgenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByIdAgenciaIdRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByIdAgenciaIdRol")
    public JAXBElement<GetUsuariosByIdAgenciaIdRol> createGetUsuariosByIdAgenciaIdRol(GetUsuariosByIdAgenciaIdRol value) {
        return new JAXBElement<GetUsuariosByIdAgenciaIdRol>(_GetUsuariosByIdAgenciaIdRol_QNAME, GetUsuariosByIdAgenciaIdRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosByIdAgenciaIdRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosByIdAgenciaIdRolResponse")
    public JAXBElement<GetUsuariosByIdAgenciaIdRolResponse> createGetUsuariosByIdAgenciaIdRolResponse(GetUsuariosByIdAgenciaIdRolResponse value) {
        return new JAXBElement<GetUsuariosByIdAgenciaIdRolResponse>(_GetUsuariosByIdAgenciaIdRolResponse_QNAME, GetUsuariosByIdAgenciaIdRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosBySistemaByAgenciaMspByRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosBySistemaByAgenciaMspByRol")
    public JAXBElement<GetUsuariosBySistemaByAgenciaMspByRol> createGetUsuariosBySistemaByAgenciaMspByRol(GetUsuariosBySistemaByAgenciaMspByRol value) {
        return new JAXBElement<GetUsuariosBySistemaByAgenciaMspByRol>(_GetUsuariosBySistemaByAgenciaMspByRol_QNAME, GetUsuariosBySistemaByAgenciaMspByRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosBySistemaByAgenciaMspByRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosBySistemaByAgenciaMspByRolResponse")
    public JAXBElement<GetUsuariosBySistemaByAgenciaMspByRolResponse> createGetUsuariosBySistemaByAgenciaMspByRolResponse(GetUsuariosBySistemaByAgenciaMspByRolResponse value) {
        return new JAXBElement<GetUsuariosBySistemaByAgenciaMspByRolResponse>(_GetUsuariosBySistemaByAgenciaMspByRolResponse_QNAME, GetUsuariosBySistemaByAgenciaMspByRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosFromPageForFirma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosFromPageForFirma")
    public JAXBElement<GetUsuariosFromPageForFirma> createGetUsuariosFromPageForFirma(GetUsuariosFromPageForFirma value) {
        return new JAXBElement<GetUsuariosFromPageForFirma>(_GetUsuariosFromPageForFirma_QNAME, GetUsuariosFromPageForFirma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosFromPageForFirmaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "getUsuariosFromPageForFirmaResponse")
    public JAXBElement<GetUsuariosFromPageForFirmaResponse> createGetUsuariosFromPageForFirmaResponse(GetUsuariosFromPageForFirmaResponse value) {
        return new JAXBElement<GetUsuariosFromPageForFirmaResponse>(_GetUsuariosFromPageForFirmaResponse_QNAME, GetUsuariosFromPageForFirmaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeerEstructura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "leerEstructura")
    public JAXBElement<LeerEstructura> createLeerEstructura(LeerEstructura value) {
        return new JAXBElement<LeerEstructura>(_LeerEstructura_QNAME, LeerEstructura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeerEstructuraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "leerEstructuraResponse")
    public JAXBElement<LeerEstructuraResponse> createLeerEstructuraResponse(LeerEstructuraResponse value) {
        return new JAXBElement<LeerEstructuraResponse>(_LeerEstructuraResponse_QNAME, LeerEstructuraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetearClaveEnvioMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "resetearClaveEnvioMail")
    public JAXBElement<ResetearClaveEnvioMail> createResetearClaveEnvioMail(ResetearClaveEnvioMail value) {
        return new JAXBElement<ResetearClaveEnvioMail>(_ResetearClaveEnvioMail_QNAME, ResetearClaveEnvioMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetearClaveEnvioMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "resetearClaveEnvioMailResponse")
    public JAXBElement<ResetearClaveEnvioMailResponse> createResetearClaveEnvioMailResponse(ResetearClaveEnvioMailResponse value) {
        return new JAXBElement<ResetearClaveEnvioMailResponse>(_ResetearClaveEnvioMailResponse_QNAME, ResetearClaveEnvioMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregAgencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregAgencia")
    public JAXBElement<TblSauregAgencia> createTblSauregAgencia(TblSauregAgencia value) {
        return new JAXBElement<TblSauregAgencia>(_TblSauregAgencia_QNAME, TblSauregAgencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregCompRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregCompRol")
    public JAXBElement<TblSauregCompRol> createTblSauregCompRol(TblSauregCompRol value) {
        return new JAXBElement<TblSauregCompRol>(_TblSauregCompRol_QNAME, TblSauregCompRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregEstados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregEstados")
    public JAXBElement<TblSauregEstados> createTblSauregEstados(TblSauregEstados value) {
        return new JAXBElement<TblSauregEstados>(_TblSauregEstados_QNAME, TblSauregEstados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregEstrucSist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregEstrucSist")
    public JAXBElement<TblSauregEstrucSist> createTblSauregEstrucSist(TblSauregEstrucSist value) {
        return new JAXBElement<TblSauregEstrucSist>(_TblSauregEstrucSist_QNAME, TblSauregEstrucSist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregInstitucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregInstitucion")
    public JAXBElement<TblSauregInstitucion> createTblSauregInstitucion(TblSauregInstitucion value) {
        return new JAXBElement<TblSauregInstitucion>(_TblSauregInstitucion_QNAME, TblSauregInstitucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregPermiso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregPermiso")
    public JAXBElement<TblSauregPermiso> createTblSauregPermiso(TblSauregPermiso value) {
        return new JAXBElement<TblSauregPermiso>(_TblSauregPermiso_QNAME, TblSauregPermiso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregRol")
    public JAXBElement<TblSauregRol> createTblSauregRol(TblSauregRol value) {
        return new JAXBElement<TblSauregRol>(_TblSauregRol_QNAME, TblSauregRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregSegAcceso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregSegAcceso")
    public JAXBElement<TblSauregSegAcceso> createTblSauregSegAcceso(TblSauregSegAcceso value) {
        return new JAXBElement<TblSauregSegAcceso>(_TblSauregSegAcceso_QNAME, TblSauregSegAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregUbicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregUbicacion")
    public JAXBElement<TblSauregUbicacion> createTblSauregUbicacion(TblSauregUbicacion value) {
        return new JAXBElement<TblSauregUbicacion>(_TblSauregUbicacion_QNAME, TblSauregUbicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregUsuAgencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregUsuAgencia")
    public JAXBElement<TblSauregUsuAgencia> createTblSauregUsuAgencia(TblSauregUsuAgencia value) {
        return new JAXBElement<TblSauregUsuAgencia>(_TblSauregUsuAgencia_QNAME, TblSauregUsuAgencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TblSauregUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "tblSauregUsuario")
    public JAXBElement<TblSauregUsuario> createTblSauregUsuario(TblSauregUsuario value) {
        return new JAXBElement<TblSauregUsuario>(_TblSauregUsuario_QNAME, TblSauregUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UbicacionInternacional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "ubicacionInternacional")
    public JAXBElement<UbicacionInternacional> createUbicacionInternacional(UbicacionInternacional value) {
        return new JAXBElement<UbicacionInternacional>(_UbicacionInternacional_QNAME, UbicacionInternacional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCodigoSms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "validarCodigoSms")
    public JAXBElement<ValidarCodigoSms> createValidarCodigoSms(ValidarCodigoSms value) {
        return new JAXBElement<ValidarCodigoSms>(_ValidarCodigoSms_QNAME, ValidarCodigoSms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCodigoSmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.registrocivil.gob.ec/", name = "validarCodigoSmsResponse")
    public JAXBElement<ValidarCodigoSmsResponse> createValidarCodigoSmsResponse(ValidarCodigoSmsResponse value) {
        return new JAXBElement<ValidarCodigoSmsResponse>(_ValidarCodigoSmsResponse_QNAME, ValidarCodigoSmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idAgencia", scope = GetUsuarioLogin.class)
    public JAXBElement<String> createGetUsuarioLoginIdAgencia(String value) {
        return new JAXBElement<String>(_GetUsuarioLoginIdAgencia_QNAME, String.class, GetUsuarioLogin.class, value);
    }

}
