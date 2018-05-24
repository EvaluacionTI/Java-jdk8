package aemsa.sqlserver.dba.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CV01ConexionOBDCSQLServer2008 {
/*
    Solo hasta la version 7 se tiene soporte con odbc
    */
    private static Connection moCxn;
    private static String msDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static String msServidor = "jdbc:odbc:";
    private static String msBaseDatos = "SQLWinLeasing;";
    private static String msUsuario = "";
    private static String msClave = "";

    private static String msUrl = msServidor + msBaseDatos;  
                                              
    public static void main(String[] args) {
        try{
            Class.forName(msDriver);
            System.out.println("Class.forName" + msDriver);
            
            moCxn = DriverManager.getConnection(msUrl, msUsuario, msClave);
            if (moCxn!=null){
                System.out.println("Conexion realizada .....!" + moCxn);
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