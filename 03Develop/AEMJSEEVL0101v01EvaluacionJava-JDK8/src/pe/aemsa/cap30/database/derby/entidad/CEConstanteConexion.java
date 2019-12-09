package pe.aemsa.cap30.database.derby.entidad;

public class CEConstanteConexion {
    /*
        Variables de base de datos Derby
    */
    public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    public static final String SERVIDOR = "jdbc:derby://localhost:";
//    public static final String BASEDATOS = "unjfscdesarrollo;create=true";
    public static final String BASEDATOS = "aemsadesarrollo";
    public static final String USUARIO = "aemsa";
    public static final String CLAVE = "aemsa152027";
    public static final String PUERTO = "1527/";

    /*
        Mensajes informativos
    */
    public static final String MSG_URL_CONEXION = "URL de conexion";
    /*
        Mensajes de Correctos 
    */
    public static final String OK_CONEXION = "Conexion satisfactoria";
    
    /*
        Mensajes de Error
    */
    public static final String ERR_CONTROLADOR = "Controlador no instalado .....!";
    public static final String ERR_BD_NO_EXISTE = "Base de datos no Existe";
    public static final String ERR_COMUNICACION_BD = "Comunicacion no dispobible .....!";    
}
