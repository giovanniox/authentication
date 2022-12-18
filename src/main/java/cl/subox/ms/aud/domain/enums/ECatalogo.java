package cl.subox.ms.aud.domain.enums;

import cl.bch.cloud.commons.error.domains.IError;
import cl.bch.cloud.commons.error.domains.MensajeCliente;
import cl.bch.cloud.commons.error.domains.enums.EActionButton;
import cl.bch.cloud.commons.error.domains.enums.ESeverity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.PRECONDITION_FAILED;
import static org.springframework.http.HttpStatus.REQUEST_TIMEOUT;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@AllArgsConstructor
@Getter
public enum ECatalogo implements IError {

    EJECUCION_EXITOSA("BFCON_000", "Ejecucion exitosa", OK.value(), null),
    ERROR_GENERAL("BFDEF_001",
            "Error de Sistema. Este servicio está temporalmente no disponible, por favor intenta más tarde.",
            INTERNAL_SERVER_ERROR.value(), MensajeCliente.builder()
            .titulo("Ha ocurrido un problema en el proceso.")
            .subtitulo("Por favor, intenta nuevamente")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),

    /* ERROR OAUTH */
    ERROR_TOKEN_EXPIRADO("BFSEC_001", "Token Expirado",
            UNAUTHORIZED.value(), null),
    ERROR_TOKEN_INVALIDO("BFSEC_002", "Token Invalido",
            UNAUTHORIZED.value(), null),
    ERROR_AUTORIZACION_FALTANTE("BFSEC_003", "Usuario no autorizado",
            UNAUTHORIZED.value(), null),
    ERROR_TOKEN_UTILIZADO("BFSEC_004", "Token Utilizado",
            UNAUTHORIZED.value(), null),

    ERROR_INVALID_ARGUMENT("BFBRQ_001", "Parámetros inválidos",
            BAD_REQUEST.value(), null),
    ERROR_AUTORIZACION_PATH("BFBRQ_002", "Path no registrado",
            UNAUTHORIZED.value(), null),
    API_READ_TIMEOUT("BFBRQ_003", "Conexion timeout api",
            REQUEST_TIMEOUT.value(), null)

    /* BASE DE DATOS */,
    ERROR_DAO("BFBDD_001", "Error controlado interacción base de datos",
            INTERNAL_SERVER_ERROR.value(), null),


    /* ERROR API AUTORIZACION APIS REST*/

    ERROR_CONEXION_API_AUTORIZACION_OFAC_RIESGO("BFTAU_001",
            "Error Conexion Api Ofac",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_FICHA("BFTAU_002",
            "Error Conexion Api Ficha",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_VECTOR("BFTAU_003",
            "Error Conexion Api Vector Cedula Equifax",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_LISTA_OPORTUNIDADES("BFTAU_004",
            "Error Conexion Api Lista Oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_DETALLE_OPORTUNIDAD("BFTAU_005",
            "Error Conexion Api Detalle Oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_PROFILE_INTERACT("BFTAU_006",
            "Error Conexion consulta profile interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_OFFERTS_INTERACT("BFTAU_007",
            "Error Conexion consulta ofertas interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_POSTEVENT_INTERACT("BFTAU_008",
            "Error Conexion envio postEvent interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_PRODUCTOS_CLIENTE("BFTAU_009",
            "Error Conexion Api Productos Cliente",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_RECAPTCHA("BFTAU_010",
            "Error Conexion Api Recaptcha",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_PREVIRED_CLIENTE("BFTAU_011",
            "Error Conexion Api Previred",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_DEPURADOR("BFTAU_012",
            "Error Conexion Api Depurador",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_INHABILIDADES("BFTAU_013",
            "Error Conexion Inhabilidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_TOKEN_CHALLENGE_PREGUNTAS_SEGURIDAD("BFTAU_014",
            "Error Conexion token preguntas Seguridad",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_PREGUNTAS_SEGURIDAD("BFTAU_015",
            "Error Conexion Preguntas Seguridad",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_VALIDACION_PREGUNTAS_SEGURIDAD("BFTAU_016",
            "Error Validación Preguntas Seguridad",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_SERVIDOR_API_AUTORIZACION_OFAC_RIESGO("BFTAU_017",
            "Error Servidor Api Ofac",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_CLIENTE_FICHA("BFTAU_018",
            "Error Servidor Api Ficha",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_CLIENTE_VECTOR("BFTAU_019",
            "Error Servidor Api Vector Cedula Equifax",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_LISTA_OPORTUNIDADES("BFTAU_020",
            "Error Servidor Api Lista Oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_DETALLE_OPORTUNIDAD("BFTAU_021",
            "Error Servidor Api Detalle Oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_PROFILE_INTERACT("BFTAU_022",
            "Error Servidor consulta profile interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_OFFERTS_INTERACT("BFTAU_023",
            "Error Servidor consulta ofertas interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_POSTEVENT_INTERACT("BFTAU_024",
            "Error Servidor envio postEvent interact",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_PRODUCTOS_CLIENTE("BFTAU_025",
            "Error Servidor Api Productos Cliente",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_RECAPTCHA("BFTAU_026",
            "Error Servidor Api Recaptcha",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_PREVIRED_CLIENTE("BFTAU_027",
            "Error Servidor Api Previred",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_DEPURADOR("BFTAU_028",
            "Error Servidor Api Depurador",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_TOKEN_CHALLENGE_PREGUNTAS_SEGURIDAD("BFTAU_029",
            "Error Servidor Api Seguridad Firma Token",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_PREGUNTAS_SEGURIDAD("BFTAU_030",
            "Error Servidor Api Seguridad Firma Preguntas",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_VALIDACION_PREGUNTAS_SEGURIDAD("BFTAU_031",
            "Error Servidor Api Seguridad Firma Validación Preguntas",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_FICHA_BASICA("BFTAU_032",
            "Error al obtener informacion basica",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_CONSULTA_INF_BASICA_LAB("BFTAU_033",
            "Error al obtener informacion basica laboral",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_CONSULTA_DISPOSITIVOS("BFTAU_034",
            "Error al obtener información dispositivos seguridad",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_CONSULTA_PRODUCTOS("BFTAU_035",
            "Error al consultar productos cliente",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_CLIENTE_PLATINUM("BFTAU_036",
            "Error al consultar mora cliente",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_BIOMETRIA("BFTAU_037",
            "Error al consultar biometría",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_CLIENTE_PLATINUM("BFTAU_038",
            "Error al consultar mora cliente",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_CONEXION_API_AUTORIZACION_BIOMETRIA("BFTAU_039",
            "Error conexión api biometría",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_FICHA_BASICA("BFTAU_040",
            "Error servidor api ficha basica",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_CONSULTA_PRODUCTOS("BFTAU_041",
            "Error servidor api consulta productos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_CONSULTA_DISPOSITIVOS("BFTAU_042",
            "Error conexión api biometría",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_INHABILIDADES("BFTAU_043",
            "Error servidor api inhabilidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION_INFO_BASICA_LAB("BFTAU_044",
            "Error servidor api inhabilidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    /* venta */

    ERROR_API_VENTA_TALLER_PRODUCTO_CATEGORIA("BFTVE_001",
            "Error en taller de producto por categoria",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_TALLER_PRODUCTO_REGLA_SIN_APLICADA("BFTVE_002",
            "Error en taller de producto sin reglas aplicada",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_TALLER_PRODUCTO_REGLA_CON_APLICADA("BFTVE_003",
            "Error en taller de producto con reglas aplicada",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_OPORTUNIDAD_ACTIVA("BFTVE_004",
            "Error en activar oportunidad",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_API_VENTA_OPORTUNIDAD_SUBIR_DOCUMENTO("BFTVE_005",
            "Problema al subir documento a la oportunidad",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_API_VENTA_CONEXION_CONFIG_FIRMA_ESIGN("BFTVE_006",
            "Error conexion configuracion firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_SOLICITUD_FIRMA_ESIGN("BFTVE_007",
            "Error conexion solicitud firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_FIRMA_ESIGN("BFTVE_008",
            "Error conexion firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_DETALLE_OPORTUNIDADES("BFTVE_009",
            "Error conexion detalle oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_SUBIR_DOCUMENTO_OPORTUNIDADES("BFTVE_010",
            "Error conexion subir documento oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_CREA_OPORTUNIDADES("BFTVE_011",
            "Error conexion crea oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ACTIVA_OPORTUNIDADES("BFTVE_012",
            "Error conexion activa oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_CATEGORIAS_TALLER("BFTVE_013",
            "Error conexion consulta categorias Taller productos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_DETALLE_TALLER("BFTVE_014",
            "Error conexion consulta detalle Taller productos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ANULAR_OPORTUNIDAD("BFTVE_015",
            "Error conexion anular oportunidad",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PROSPECTO_CORE("BFTVE_016",
            "Error conexion enrolamiento prospecto core",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PROSPECTO_MDM("BFTVE_017",
            "Error conexion enrolamiento prospecto mdm",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PORTAL("BFTVE_018",
            "Error conexion enrolamiento portal",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PORTAL_FLAG_CAMBIOCLAVE("BFTVE_019",
            "Error conexion enrolamiento portal flag cambio clave",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PORTAL_FLAG_PRIMERLOGIN("BFTVE_020",
            "Error conexion enrolamiento portal flag primer login",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PORTAL_FLAG_DESBLOQUEO("BFTVE_021",
            "Error conexion enrolamiento portal flag desbloqueo",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_PROSPECTO_RESETEOCLAVE("BFTVE_022",
            "Error conexion enrolamiento portal restablece clave",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENVIO_MAIL("BFTVE_023",
            "Error conexion api envio mail",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_PLANTILLA_DOCUMENTO("BFTVE_024",
            "Error conexion api generacion documento",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ENCRIPTA_PDF("BFTVE_025",
            "Error conexion api encripta pdf",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_BIOMETRIA_IMAGENES("BFTVE_026",
            "Error conexion api obiene imagenes biometricas",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_API_VENTA_SERVIDOR_CONFIG_FIRMA_ESIGN("BFTVE_027",
            "Error servidor configuracion firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_SOLICITUD_FIRMA_ESIGN("BFTVE_028",
            "Error servidor solicitud firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_FIRMA_ESIGN("BFTVE_029",
            "Error servidor firma Esign",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_DETALLE_OPORTUNIDADES("BFTVE_030",
            "Error servidor detalle oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_SUBIR_DOCUMENTO_OPORTUNIDADES("BFTVE_031",
            "Error servidor subir documento oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_CREA_OPORTUNIDADES("BFTVE_032",
            "Error servidor crea oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ACTIVA_OPORTUNIDADES("BFTVE_033",
            "Error servidor activa oportunidades",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_CATEGORIAS_TALLER("BFTVE_034",
            "Error servidor consulta categorias Taller productos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_DETALLE_TALLER("BFTVE_035",
            "Error servidor consulta detalle Taller productos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ANULAR_OPORTUNIDAD("BFTVE_036",
            "Error servidor anular oportunidad",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PROSPECTO("BFTVE_037",
            "Error servidor enrolamiento prospecto",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PROSPECTO_CORE("BFTVE_038",
            "Error servidor enrolamiento prospecto core",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PROSPECTO_MDM("BFTVE_039",
            "Error servidor enrolamiento prospecto mdm",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PORTAL("BFTVE_040",
            "Error servidor enrolamiento portal",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PORTAL_FLAG_CAMBIOCLAVE("BFTVE_041",
            "Error servidor enrolamiento portal flag cambio clave",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PORTAL_FLAG_PRIMERLOGIN("BFTVE_042",
            "Error servidor enrolamiento portal flag primer login",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PORTAL_FLAG_DESBLOQUEO("BFTVE_043",
            "Error servidor enrolamiento portal flag desbloqueo",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_PROSPECTO_RESETEOCLAVE("BFTVE_044",
            "Error servidor enrolamiento portal restablece clave",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENVIO_MAIL("BFTVE_045", "Error servidor api envio mail",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_PLANTILLA_DOCUMENTO("BFTVE_046",
            "Error servidor api generacion documento",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENCRIPTA_PDF("BFTVE_047",
            "Error servidor api encripta pdf",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_BIOMETRIA_IMAGENES("BFTVE_048",
            "Error servidor api obiene imagenes biometricas",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_GENERAL("BFTVE_049",
            "Error general api venta",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    ERROR_API_VENTA_CONEXION_ENROLAMIENTO_IDG("BFTVE_050",
            "Error conexion enrolamiento idg",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_AGREGAR_DISPOSITIVO("BFTVE_051",
            "Error conexion agregar dispositivos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_CONEXION_ACTUALIZAR_DISPOSITIVO("BFTVE_052",
            "Error conexion actualizar dispositivos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ENROLAMIENTO_IDG("BFTVE_053",
            "Error servidor enrolamiento idg",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_AGREGAR_DISPOSITIVO("BFTVE_054",
            "Error servidor agregar dispositivos",
            HttpStatus.PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_SERVIDOR_ACTUALIZAR_DISPOSITIVO("BFTVE_055",
            "Error servidor actualizar dispositivos",
            HttpStatus.PRECONDITION_FAILED.value(), null),

    /* biometria */
    ERROR_CONEXION_API_BIOMETRIA("BFTBI_001", "Error Conexion Api Biometria",
            PRECONDITION_FAILED.value(), null),

    ERROR_SERVIDOR_API_BIOMETRIA("BFTBI_002", "Error Servidor Api Biometria",
            PRECONDITION_FAILED.value(), null),

    /* anexa */

    ERROR_API_ANEXA_CONEXION("BFTAN_001", "Error Conexion Api Anexa",
            PRECONDITION_FAILED.value(), null),

    ERROR_API_ANEXA_SERVIDOR("BFTAN_002", "Error Servidor Api Anexa",
            PRECONDITION_FAILED.value(), null),

    ERROR_API_ANEXA_LISTA_VALOR_SERVIDOR("BFTAN_003", "Error servidor Api lista valor",
            PRECONDITION_FAILED.value(), null),

    ERROR_API_ANEXA_LISTA_VALOR_CONEXION("BFTAN_004", "Error conexion Api lista valor",
            PRECONDITION_FAILED.value(), null),


    /* documentos */
    ERROR_CONEXION_API_DOCUMENTOS("BFTDO_001", "Error Conexion Api Documentos",
            PRECONDITION_FAILED.value(), null),

    ERROR_SERVIDOR_API_DOCUMENTOS("BFTDO_002", "Error Servidor Api Documentos",
            PRECONDITION_FAILED.value(), null),


    /* autorizacion */
    ERROR_CONEXION_API_AUTORIZACION("BFTAU_036", "Error Conexion Api Autorizacion",
            PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_AUTORIZACION("BFTAU_037", "Error Servidor Api Autorizacion",
            PRECONDITION_FAILED.value(), null),

    ERROR_CONEXION_API_VENTA("BFTVE_050", "Error Conexion Api Venta",
            PRECONDITION_FAILED.value(), null),
    ERROR_SERVIDOR_API_VENTA("BFTVE_051", "Error Servidor Api Venta",
            PRECONDITION_FAILED.value(), null),


    /* ERRORES HANDLER MICROSERVICIOS */

    ERROR_API_AUTORIZACION_CLIENTE_CC("BFRNE_004", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("¡Hey! Ya tienes tu Cuenta Corriente Digital")
            .subtitulo("Con una es más que suficiente. Recuerda que puedes ver tu Tarjeta de Débito " +
                    "E-Commerce desde Banco en Línea.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CEDULA_INCORRECTA("BFRNE_005", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Los datos de tu cédula de identidad no son correctos")
            .subtitulo("Por favor, ve a inicio y vuelve a intentar.")
            .severity(ESeverity.WARN)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CEDULA_NO_VIGENTE("BFRNE_006", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, tu cédula de identidad no se encuentra vigente")
            .subtitulo("Regulariza esta situación para que puedas contratar esta cuenta.")
            .severity(ESeverity.WARN)
            .build()),
    ERROR_API_AUTORIZACION_CEDULA_NO_DISPONIBLE("BFRNE_007", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no pudimos validar tu cédula")
            .subtitulo("Por favor, intentalo más tarde.")
            .severity(ESeverity.WARN)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_CON_OPORTUNIDAD("BFRNE_008", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("¡Hey! Ya hiciste una solicitud de Cuenta Corriente Digital")
            .subtitulo("Con una es más que suficiente. Si tienes dudas consulta nuestros canales de atención.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_SIN_OFERTAS("BFRNE_009", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no puedes solicitar este producto")
            .subtitulo("Te invitamos a contratar Cuenta FAN.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_CUENTA_FAN)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_NO_EXISTE_INTERACT("BFRNE_010", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no puedes solicitar este producto")
            .subtitulo("Te invitamos a contratar Cuenta FAN.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_CUENTA_FAN)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_CON_INHABILIDAD("BFRNE_011", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no puedes solicitar este producto")
            .subtitulo("Por favor, vuelve al inicio.")
            .severity(ESeverity.ERROR)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_OFAC("BFRNE_012", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no puedes solicitar este producto")
            .subtitulo("Por favor, vuelve al inicio.")
            .severity(ESeverity.ERROR)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_MENOR_EDAD("BFRNE_013", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no cumples los requisitos para solicitar")
            .subtitulo("Por favor, vuelve al inicio.")
            .severity(ESeverity.ERROR)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_RENTA_INSUFICIENTE("BFRNE_015", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no cumples con los requisitos necesarios para contratar una " +
                    "Cuenta Corriente Digital.")
            .subtitulo("De todas maneras tenemos un producto 100% para ti. ¡Te invitamos a contratar una " +
                    "<strong>Cuenta FAN</strong>!")
            .severity(ESeverity.INFO)
            .action(EActionButton.TRES_DOS_UNO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_CELULAR_EXISTENTE("BFRNE_016", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), null),
    ERROR_API_AUTORIZACION_CLIENTE_EMAIL_EXISTENTE("BFRNE_017", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), null),
    ERROR_API_AUTORIZACION_DESAFIO_SIN_PREGUNTAS_SEGURIDAD("BFRNE_018", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("No pudimos encontrar preguntas de seguridad")
            .subtitulo("No es posible que puedas solicitar Cuenta Corriente Digital ahora." +
                    "Te invitamos a contratar Cuenta FAN")
            .severity(ESeverity.WARN)
            .action(EActionButton.IR_CUENTA_FAN)
            .build()),
    ERROR_API_AUTORIZACION_DESAFIO_DIARIO_PREGUNTAS_ALCANZADO("BFRNE_019", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Generaste el máximo de intentos de preguntas de seguridad")
            .subtitulo("Puedes volver a intentar en 24 horas.")
            .severity(ESeverity.WARN)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_DESAFIO_VALIDACION_PREGUNTAS_RESPUESTAS_INCORRECTAS("BFRNE_020",
            Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), null),
    ERROR_API_BIOMETRIA_SESION_PROGRESO("BFRNE_021", "Sesion en progreso",
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Ya iniciaste una solicitud")
            .subtitulo("Intenta nuevamente más tarde.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_CELULAR_EMAIL_EXISTENTE("BFRNE_022", Constants.MESSAGE_API_AUTORIZACION,
            PRECONDITION_FAILED.value(), null),
    ERROR_API_VENTA_PIN_NOT_MATCH("BFRNE_023", Constants.MESSAGE_API_VENTA,
            PRECONDITION_FAILED.value(), null),
    ERROR_CLIENTE_CUBANO("BFRNE_024", "Cliente inhabilitado",
            UNAUTHORIZED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, no puedes solicitar este producto")
            .subtitulo("Por favor, vuelve al inicio.")
            .severity(ESeverity.ERROR)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_BIOMETRIA_REINTENTOS_SUPERADOS("BFRNE_025", "Reintentos superados",
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, superaste los reintentos de biometría")
            .subtitulo("Por tu seguridad intenta nuevamente en 24 horas.")
            .severity(ESeverity.WARN)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build()),
    ERROR_API_AUTORIZACION_CLIENTE_INVALIDO_IDG("BFRNE_026", "Cliente inhabilitado",
            PRECONDITION_FAILED.value(), MensajeCliente.builder()
            .titulo("Lo sentimos, tenemos en nuestros registros otro número de teléfono.")
            .subtitulo("Por el momento no puedes contratar este producto. <br class='d-none d-md-block'/>" +
                    "Si quieres editarlo acércate a un <strong>Mesón de ayuda</strong> en tu sucursal más cercana.")
            .severity(ESeverity.INFO)
            .action(EActionButton.IR_INICIO_FLUJO)
            .build());


    /* Metodos para obtener Enum dado el codigo */
    private static final Map<String, ECatalogo> map = new HashMap<>();

    static {
        for (ECatalogo codigosECatalogo : ECatalogo.values()) {
            map.put(codigosECatalogo.codigo, codigosECatalogo);
        }
    }

    private final String codigo;
    private final String mensaje;
    private final int status;
    private final MensajeCliente mensajeCliente;

    public static ECatalogo obtieneCatalogoPorCodigo(String codigo) {
        return map.getOrDefault(codigo, ECatalogo.ERROR_GENERAL);
    }


    private static class Constants {
        public static final String MESSAGE_API_AUTORIZACION = "Error Api Autenticacion";
        public static final String MESSAGE_API_VENTA = "Error controlado Api Venta";
    }
}
