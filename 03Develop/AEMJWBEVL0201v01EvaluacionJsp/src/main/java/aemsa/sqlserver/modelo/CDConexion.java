package aemsa.sqlserver.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CDConexion {
    private Connection moSQLCxn;
    
    public Connection getOpenSQLServer(){
        
        // El driver sqljdbc4.1.jar requiere el java 7.0 Java Runtime Environment 
        // El driver sqljdbc4.2.jar requiere el java 8.0 Java Runtime Environment 
        /*String lStrControlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String lStrTipoDriver = "jdbc:sqlserver:";
        String lStrServidor = "//INVERTEC:";
        String lStrPuerto = "1433;";
        String lStrBaseDatos = "aemsadesarrollo;";

        String lStrUsuario="sa;";
        String lStrClave = "aemsa152027;";
*/
        
        String lStrControlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //String lStrServidor = "jdbc:sqlserver://ADIAZX//MSQLEXPRESS:";
        String lStrServidor = "jdbc:sqlserver://INVERTEC:";        
        String lStrPuerto = "1433;";
        String lStrBaseDatos = "aemsadesarrollo;";

        String lStrUsuario="sa;";
        String lStrClave = "aemsa152027;";

        String lStrUrl = lStrServidor + lStrPuerto + " database = " + lStrBaseDatos + "user = " + lStrUsuario + "password = " + lStrClave;
                                              
        try{
            Class.forName(lStrControlador);

            moSQLCxn = DriverManager.getConnection(lStrUrl);
            if (moSQLCxn!=null){
                System.out.println("Conexion realizada .....!" + moSQLCxn);
            }
        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador no instalado .....!"+ex.getMessage());

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion .....!");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return moSQLCxn;
        
    }

    public void setCerrarSQLServer(Connection poCxn){
        try{
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }    
    
    public void setCerrarSQLServer(Connection poCxn, ResultSet poRs){
        try{
            poRs.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
    
    public void setCerrarSQLServer(Connection poCxn, ResultSet poRs, Statement poSt){
        try{
            poRs.close();
            poSt.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
    
    public void setCerrarSQLServer(Connection poCxn, ResultSet poRs, PreparedStatement poPs){
        try{
            poRs.close();
            poPs.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
}
