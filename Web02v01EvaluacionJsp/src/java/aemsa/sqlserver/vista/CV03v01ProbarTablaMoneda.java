
package aemsa.sqlserver.vista;

import aemsa.sqlserver.modelo.CDConexion;
import aemsa.sqlserver.modelo.CDVTAt04_moneda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV03v01ProbarTablaMoneda {

    private static final Logger moLog = LogManager.getLogger(CV03v01ProbarTablaMoneda.class);
    private static Connection moCxn = null;
    private static ResultSet moRs = null;

    public static void main(String[] args) {
        
       
        try{
            System.out.println("Declarando un objeto Conexion ");
            CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();

            moRs = oCDMoneda.cargarTablaMonedaEmbebido();
            
            //moLog.debug("Lectura " + moRs);
            System.out.println("Result Set : " + moRs);
            System.out.println("Número de filas : " + moRs.getRow());
            
            moRs.close();
        
        }catch(SQLException exSQL){
            exSQL.getMessage();
        }
    }
}
