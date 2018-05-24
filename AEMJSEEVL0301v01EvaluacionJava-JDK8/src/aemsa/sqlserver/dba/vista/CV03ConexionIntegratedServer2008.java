package aemsa.sqlserver.dba.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CV03ConexionIntegratedServer2008 {

    private static Connection moCxn;
    private static String msDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private static String msServidor = "jdbc:sqlserver://ADIAZX//MSQLEXPRESS:";
//    private static String msBaseDatos = "AEMSATRANSACCIONAL;";
    private static String msServidor = "jdbc:sqlserver://SVBDBFDES04:";
    private static String msBaseDatos = "BFP_LEASING;";
    
    private static String msUsuario = "sa";
    private static String msClave = "aemsa152027";
    private static String mStrPuerto = "1433;";

    private static String msUrl = msServidor + mStrPuerto + " database = " + msBaseDatos + "IntegratedSecurity = true";
                                              
    public static void main(String[] args) {
        // Se requiere adicionar el archivo sqljdbc_auth.dll en la carpeta c:\windows\System32
        // You can download it from http://www.microsoft.com/en-us/download/details.aspx?displaylang=en&id=11774 .
        try{
            Class.forName(msDriver);
            System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msUrl);
            if (moCxn!=null){
                System.out.println("Conexion satisfactoria .....!" + moCxn);
            }
            
        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador no instalado .....!"+ex.getMessage());

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println(ex.getMessage());
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getMessage());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getMessage());
                    break;
            }
        }
    }
}