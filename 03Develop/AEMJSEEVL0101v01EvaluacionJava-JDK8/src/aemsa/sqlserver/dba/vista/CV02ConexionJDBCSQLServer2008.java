package aemsa.sqlserver.dba.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CV02ConexionJDBCSQLServer2008 {

    private static Connection moCxn;
    private static String msDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String msServidor = "jdbc:sqlserver://ADIAZX//MSQLEXPRESS:";
    private static String msBaseDatos = "AEMSATRANSACCIONAL;";
    private static String msUsuario = "sa";
    private static String msClave = "aemsa152027";
    private static String mStrPuerto = "1433;";


//    private static String msUrl = msServidor + mStrPuerto + "; database = " + msBaseDatos + "; user = " + msUsuario + "; password = " + msClave;
    private static String msUrl = msServidor + mStrPuerto + " database = " + msBaseDatos;
                                              
    public static void main(String[] args) {
        try{
            Class.forName(msDriver);
            System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msUrl, msUsuario, msClave);
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