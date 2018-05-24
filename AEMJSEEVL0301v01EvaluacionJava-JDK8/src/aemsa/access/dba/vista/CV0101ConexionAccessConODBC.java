package aemsa.access.dba.vista;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
*
 * Sólo funciona para versiones con menores a JDK8 vía el driver de conexion a accees por ODBC: sun.jdbc.odbc.JdbcOdbcDriver
 * 
 */
public class CV0101ConexionAccessConODBC {

    // Previamente se tiene que configurar en el OBDC
    private static Connection moCxn;
    private static String msDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static String msBaseDeDatos = "jdbc:odbc:BFPLeasing.accdb";
    private static String msUsuario = "aemsa";
    private static String msClave = "152027";
    
    public static void main(String[] args) {
        
        try{
            Class.forName(msDriver);
            System.out.println("Class.forName = " + msDriver);
            
            //System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msBaseDeDatos, msUsuario, msClave);
            if (moCxn != null){
                System.out.println("Conexion satisfactoria .....! " + moCxn);
            }
            
        }catch(ClassNotFoundException oCNFE){
            System.out.println(oCNFE.getStackTrace());
            
            System.out.println("No se ha podido cargar el Driver JDBC-ODBC -----> " + oCNFE.getMessage());
        }catch(SQLException oSQL){
            System.out.println(oSQL.getMessage());
        }
    }
    
}
