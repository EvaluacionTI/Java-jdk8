
package aemsa.sqlserver.vista;

import aemsa.sqlserver.modelo.CDConexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV02v01ProbarConexion {

    private static final Logger moLog = LogManager.getLogger(CV02v01ProbarConexion.class);

    public static void main(String[] args) throws ParseException {
        
        Connection oCxn;
        Statement oSt = null;
        ResultSet oRs = null;
        
        try{
            System.out.println("Declarando un objeto Conexion ");
            CDConexion oCxnSQL = new CDConexion();

            //System.out.println("Accediendo a la propiedad del Objeto ");
            //oCxnSQL.openSQLServerConsola();

            //System.out.println("Accediendo a la propiedad del Objeto ");
            oCxn = oCxnSQL.getOpenSQLServer();

            System.out.println("Número de filas : " + oCxn);
            oSt = oCxn.createStatement();
            oRs = oSt.executeQuery("SELECT * FROM VTAt04_moneda");
            moLog.debug("Lectura " + oRs);
            System.out.println("Número de filas : " + oRs.getRow());

            oCxnSQL.setCerrarSQLServer(oCxn, oRs, oSt);

        }catch(SQLException exSQL){
            exSQL.getMessage();
        }
    }
}
