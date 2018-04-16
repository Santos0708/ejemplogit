package ec.gob.digercic.wsintegracion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12.redhat-1
 * 2018-04-13T09:08:40.587-05:00
 * Generated source version: 3.1.12.redhat-1
 * 
 */
@WebService(targetNamespace = "http://service.registrocivil.gob.ec/", name = "WSAutenticacion")
@XmlSeeAlso({ObjectFactory.class})
public interface WSAutenticacion {

    @WebMethod
    @RequestWrapper(localName = "getRolesByUsuarioByAgenciaBySistema", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetRolesByUsuarioByAgenciaBySistema")
    @ResponseWrapper(localName = "getRolesByUsuarioByAgenciaBySistemaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetRolesByUsuarioByAgenciaBySistemaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListRol getRolesByUsuarioByAgenciaBySistema(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getSegAccesoByIdsRol", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetSegAccesoByIdsRol")
    @ResponseWrapper(localName = "getSegAccesoByIdsRolResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetSegAccesoByIdsRolResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListSegAcceso getSegAccesoByIdsRol(
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuarioByUserAndAgencia", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUserAndAgencia")
    @ResponseWrapper(localName = "getUsuarioByUserAndAgenciaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUserAndAgenciaResponse")
    @WebResult(name = "TblSauregUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario getUsuarioByUserAndAgencia(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia
    );

    @WebMethod
    @RequestWrapper(localName = "getEstructuraSistema", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetEstructuraSistema")
    @ResponseWrapper(localName = "getEstructuraSistemaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetEstructuraSistemaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListEstrucSist getEstructuraSistema(
        @WebParam(name = "cedula", targetNamespace = "")
        java.lang.String cedula,
        @WebParam(name = "idAgencia", targetNamespace = "")
        long idAgencia,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosByAgenciaMsp", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaMsp")
    @ResponseWrapper(localName = "getUsuariosByAgenciaMspResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaMspResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosByAgenciaMsp(
        @WebParam(name = "codMsp", targetNamespace = "")
        java.lang.String codMsp
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuarioByUsernameAndMail", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUsernameAndMail")
    @ResponseWrapper(localName = "getUsuarioByUsernameAndMailResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUsernameAndMailResponse")
    @WebResult(name = "TblSauregUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario getUsuarioByUsernameAndMail(
        @WebParam(name = "usuario", targetNamespace = "")
        java.lang.String usuario,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosFromPageForFirma", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosFromPageForFirma")
    @ResponseWrapper(localName = "getUsuariosFromPageForFirmaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosFromPageForFirmaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosFromPageForFirma(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idPagina", targetNamespace = "")
        java.lang.String idPagina
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciaByIdAgenciaWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciaByIdAgenciaWS")
    @ResponseWrapper(localName = "getAgenciaByIdAgenciaWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciaByIdAgenciaWSResponse")
    @WebResult(name = "TblSauregAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregAgencia getAgenciaByIdAgenciaWS(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciasByIdUbiacionStatusWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByIdUbiacionStatusWS")
    @ResponseWrapper(localName = "getAgenciasByIdUbiacionStatusWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByIdUbiacionStatusWSResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListAgencia getAgenciasByIdUbiacionStatusWS(
        @WebParam(name = "idUbicacion", targetNamespace = "")
        java.lang.String idUbicacion,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "tipoAgencia", targetNamespace = "")
        java.lang.String tipoAgencia,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionByIdUbicacion", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByIdUbicacion")
    @ResponseWrapper(localName = "getUbicacionByIdUbicacionResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByIdUbicacionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUbicacion getUbicacionByIdUbicacion(
        @WebParam(name = "idUbicacion", targetNamespace = "")
        java.lang.String idUbicacion
    );

    @WebMethod
    @RequestWrapper(localName = "leerEstructura", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.LeerEstructura")
    @ResponseWrapper(localName = "leerEstructuraResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.LeerEstructuraResponse")
    @WebResult(name = "TblSauregEstrucSist", targetNamespace = "")
    public java.util.List<ec.gob.digercic.wsintegracion.TblSauregEstrucSist> leerEstructura(
        @WebParam(name = "cedula", targetNamespace = "")
        java.lang.String cedula,
        @WebParam(name = "idAgencia", targetNamespace = "")
        long idAgencia,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionByCodDpa", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodDpa")
    @ResponseWrapper(localName = "getUbicacionByCodDpaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodDpaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUbicacion getUbicacionByCodDpa(
        @WebParam(name = "codDpa", targetNamespace = "")
        java.lang.String codDpa
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciasByIdSistemaWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByIdSistemaWS")
    @ResponseWrapper(localName = "getAgenciasByIdSistemaWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByIdSistemaWSResponse")
    @WebResult(name = "ListAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListAgencia getAgenciasByIdSistemaWS(
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosByAgencia", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgencia")
    @ResponseWrapper(localName = "getUsuariosByAgenciaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosByAgencia(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosByAgenciaMSPAll", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaMSPAll")
    @ResponseWrapper(localName = "getUsuariosByAgenciaMSPAllResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaMSPAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosByAgenciaMSPAll(
        @WebParam(name = "codMsp", targetNamespace = "")
        java.lang.String codMsp
    );

    @WebMethod
    @RequestWrapper(localName = "getCredencialesFirma", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetCredencialesFirma")
    @ResponseWrapper(localName = "getCredencialesFirmaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetCredencialesFirmaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getCredencialesFirma(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuAgenciaByUserAndAgencia", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByUserAndAgencia")
    @ResponseWrapper(localName = "getUsuAgenciaByUserAndAgenciaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByUserAndAgenciaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuAgencia getUsuAgenciaByUserAndAgencia(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia
    );

    @WebMethod
    @RequestWrapper(localName = "validarCodigoSms", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ValidarCodigoSms")
    @ResponseWrapper(localName = "validarCodigoSmsResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ValidarCodigoSmsResponse")
    @WebResult(name = "ResultadoString", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ResultadoString validarCodigoSms(
        @WebParam(name = "codigoSMS", targetNamespace = "")
        java.lang.String codigoSMS,
        @WebParam(name = "NomUsuario", targetNamespace = "")
        java.lang.String nomUsuario
    );

    @WebMethod
    @RequestWrapper(localName = "getRolesByUsuario", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetRolesByUsuario")
    @ResponseWrapper(localName = "getRolesByUsuarioResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetRolesByUsuarioResponse")
    @WebResult(name = "ListRol", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListRol getRolesByUsuario(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuAgenciaByIdProvIdRolStatus", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdProvIdRolStatus")
    @ResponseWrapper(localName = "getUsuAgenciaByIdProvIdRolStatusResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdProvIdRolStatusResponse")
    @WebResult(name = "ListUsuAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuAgencia getUsuAgenciaByIdProvIdRolStatus(
        @WebParam(name = "idProvincia", targetNamespace = "")
        java.lang.String idProvincia,
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "resetearClaveEnvioMail", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ResetearClaveEnvioMail")
    @ResponseWrapper(localName = "resetearClaveEnvioMailResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ResetearClaveEnvioMailResponse")
    @WebResult(name = "TblSauregUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario resetearClaveEnvioMail(
        @WebParam(name = "nombres", targetNamespace = "")
        java.lang.String nombres,
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email
    );

    @WebMethod
    @RequestWrapper(localName = "getUbsInternacionalByIdGrupo", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbsInternacionalByIdGrupo")
    @ResponseWrapper(localName = "getUbsInternacionalByIdGrupoResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbsInternacionalByIdGrupoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUbicacionInternacional getUbsInternacionalByIdGrupo(
        @WebParam(name = "idGrupo", targetNamespace = "")
        java.lang.String idGrupo
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuario", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuario")
    @ResponseWrapper(localName = "getUsuarioResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioResponse")
    @WebResult(name = "TblSauregUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario getUsuario(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "clave", targetNamespace = "")
        java.lang.String clave,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getPermisos", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetPermisos")
    @ResponseWrapper(localName = "getPermisosResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetPermisosResponse")
    @WebResult(name = "TblSauregPermiso", targetNamespace = "")
    public java.util.List<ec.gob.digercic.wsintegracion.TblSauregPermiso> getPermisos(
        @WebParam(name = "nui", targetNamespace = "")
        java.lang.Long nui
    );

    @WebMethod
    @RequestWrapper(localName = "getUbcInternacionalByIdUbc", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbcInternacionalByIdUbc")
    @ResponseWrapper(localName = "getUbcInternacionalByIdUbcResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbcInternacionalByIdUbcResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.UbicacionInternacional getUbcInternacionalByIdUbc(
        @WebParam(name = "idUbcInternacional", targetNamespace = "")
        java.lang.String idUbcInternacional
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionByCodUbiMagnaWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodUbiMagnaWS")
    @ResponseWrapper(localName = "getUbicacionByCodUbiMagnaWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodUbiMagnaWSResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUbicacion getUbicacionByCodUbiMagnaWS(
        @WebParam(name = "codUbiMagna", targetNamespace = "")
        java.lang.String codUbiMagna
    );

    @WebMethod
    @RequestWrapper(localName = "getCompRolEstrucUsuario", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetCompRolEstrucUsuario")
    @ResponseWrapper(localName = "getCompRolEstrucUsuarioResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetCompRolEstrucUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListCompRol getCompRolEstrucUsuario(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionesByIdGrupo", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionesByIdGrupo")
    @ResponseWrapper(localName = "getUbicacionesByIdGrupoResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionesByIdGrupoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUbicacion getUbicacionesByIdGrupo(
        @WebParam(name = "idGrupo", targetNamespace = "")
        java.lang.String idGrupo
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciasByInstitucionBySistema", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByInstitucionBySistema")
    @ResponseWrapper(localName = "getAgenciasByInstitucionBySistemaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasByInstitucionBySistemaResponse")
    @WebResult(name = "ListAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListAgencia getAgenciasByInstitucionBySistema(
        @WebParam(name = "idInstitucion", targetNamespace = "")
        java.lang.String idInstitucion,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciasPorInstitucion", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasPorInstitucion")
    @ResponseWrapper(localName = "getAgenciasPorInstitucionResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasPorInstitucionResponse")
    @WebResult(name = "ListAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListAgencia getAgenciasPorInstitucion(
        @WebParam(name = "idInstitucion", targetNamespace = "")
        java.lang.String idInstitucion
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionByTipo", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByTipo")
    @ResponseWrapper(localName = "getUbicacionByTipoResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByTipoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUbicacion getUbicacionByTipo(
        @WebParam(name = "tipo", targetNamespace = "")
        java.lang.String tipo
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuAgenciaByIdRolStatusWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdRolStatusWS")
    @ResponseWrapper(localName = "getUsuAgenciaByIdRolStatusWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdRolStatusWSResponse")
    @WebResult(name = "ListUsuAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuAgencia getUsuAgenciaByIdRolStatusWS(
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "controlSession", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ControlSession")
    @ResponseWrapper(localName = "controlSessionResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.ControlSessionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> controlSession(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "ipHost", targetNamespace = "")
        java.lang.String ipHost,
        @WebParam(name = "sessionId", targetNamespace = "")
        java.lang.String sessionId,
        @WebParam(name = "app", targetNamespace = "")
        java.lang.String app
    );

    @WebMethod
    @RequestWrapper(localName = "getInstitucionesBySistema", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetInstitucionesBySistema")
    @ResponseWrapper(localName = "getInstitucionesBySistemaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetInstitucionesBySistemaResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListInstitucion getInstitucionesBySistema(
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "Status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUbcListByIdGrupStatus", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbcListByIdGrupStatus")
    @ResponseWrapper(localName = "getUbcListByIdGrupStatusResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbcListByIdGrupStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUbicacion getUbcListByIdGrupStatus(
        @WebParam(name = "idGrupo", targetNamespace = "")
        java.lang.String idGrupo,
        @WebParam(name = "statusList", targetNamespace = "")
        java.lang.String statusList
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuAgenByIdRolUbicacionStatusWS", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenByIdRolUbicacionStatusWS")
    @ResponseWrapper(localName = "getUsuAgenByIdRolUbicacionStatusWSResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenByIdRolUbicacionStatusWSResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuAgencia getUsuAgenByIdRolUbicacionStatusWS(
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "idUbicacion", targetNamespace = "")
        java.lang.String idUbicacion,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUbicacionByCodAs400", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodAs400")
    @ResponseWrapper(localName = "getUbicacionByCodAs400Response", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUbicacionByCodAs400Response")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUbicacion getUbicacionByCodAs400(
        @WebParam(name = "codAs400", targetNamespace = "")
        java.lang.String codAs400
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuarioByUserAndAgenciaMsp", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUserAndAgenciaMsp")
    @ResponseWrapper(localName = "getUsuarioByUserAndAgenciaMspResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioByUserAndAgenciaMspResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario getUsuarioByUserAndAgenciaMsp(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "codMsp", targetNamespace = "")
        java.lang.String codMsp
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuarioLogin", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioLogin")
    @ResponseWrapper(localName = "getUsuarioLoginResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuarioLoginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.TblSauregUsuario getUsuarioLogin(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "clave", targetNamespace = "")
        java.lang.String clave,
        @WebParam(name = "ipAcceso", targetNamespace = "")
        java.lang.String ipAcceso,
        @WebParam(name = "sessionId", targetNamespace = "")
        java.lang.String sessionId,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosByIdAgenciaIdRol", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByIdAgenciaIdRol")
    @ResponseWrapper(localName = "getUsuariosByIdAgenciaIdRolResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByIdAgenciaIdRolResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosByIdAgenciaIdRol(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getAgenciasPorInstitucionYUsuario", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasPorInstitucionYUsuario")
    @ResponseWrapper(localName = "getAgenciasPorInstitucionYUsuarioResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetAgenciasPorInstitucionYUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListAgencia getAgenciasPorInstitucionYUsuario(
        @WebParam(name = "idInstitucion", targetNamespace = "")
        java.lang.String idInstitucion,
        @WebParam(name = "usuario", targetNamespace = "")
        java.lang.String usuario
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosByAgenciaBySistema", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaBySistema")
    @ResponseWrapper(localName = "getUsuariosByAgenciaBySistemaResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosByAgenciaBySistemaResponse")
    @WebResult(name = "ListUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosByAgenciaBySistema(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuAgenciaByIdAgIdRolStatus", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdAgIdRolStatus")
    @ResponseWrapper(localName = "getUsuAgenciaByIdAgIdRolStatusResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuAgenciaByIdAgIdRolStatusResponse")
    @WebResult(name = "ListUsuAgencia", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuAgencia getUsuAgenciaByIdAgIdRolStatus(
        @WebParam(name = "idAgencia", targetNamespace = "")
        java.lang.String idAgencia,
        @WebParam(name = "idRol", targetNamespace = "")
        java.lang.String idRol,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    );

    @WebMethod
    @RequestWrapper(localName = "getUsuariosBySistemaByAgenciaMspByRol", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosBySistemaByAgenciaMspByRol")
    @ResponseWrapper(localName = "getUsuariosBySistemaByAgenciaMspByRolResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.GetUsuariosBySistemaByAgenciaMspByRolResponse")
    @WebResult(name = "ListUsuario", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ListUsuario getUsuariosBySistemaByAgenciaMspByRol(
        @WebParam(name = "codMsp", targetNamespace = "")
        java.lang.String codMsp,
        @WebParam(name = "idSistema", targetNamespace = "")
        java.lang.String idSistema,
        @WebParam(name = "idsRol", targetNamespace = "")
        java.lang.String idsRol
    );

    @WebMethod
    @RequestWrapper(localName = "cambiarContraseniaUsuario", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.CambiarContraseniaUsuario")
    @ResponseWrapper(localName = "cambiarContraseniaUsuarioResponse", targetNamespace = "http://service.registrocivil.gob.ec/", className = "ec.gob.digercic.wsintegracion.CambiarContraseniaUsuarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ec.gob.digercic.wsintegracion.ResultadoString cambiarContraseniaUsuario(
        @WebParam(name = "nomUsuario", targetNamespace = "")
        java.lang.String nomUsuario,
        @WebParam(name = "claveAnterior", targetNamespace = "")
        java.lang.String claveAnterior,
        @WebParam(name = "claveNueva", targetNamespace = "")
        java.lang.String claveNueva
    );
}