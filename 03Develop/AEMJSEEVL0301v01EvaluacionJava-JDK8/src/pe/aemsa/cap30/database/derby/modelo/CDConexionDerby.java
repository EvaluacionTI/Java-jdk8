
package pe.aemsa.cap30.database.derby.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.entidad.CEConstanteConexion;

public class CDConexionDerby {
    private Connection moSQLCxn = null;

    private static final Logger MOLOG = LogManager.getLogger(CDConexionDerby.class);
    
    public Connection getOpenSQLDerby(){

        String lStrUrl = CEConstanteConexion.SERVIDOR + CEConstanteConexion.PUERTO + CEConstanteConexion.BASEDATOS;
        MOLOG.info("=====> [ " + CEConstanteConexion.MSG_URL_CONEXION + "] " + lStrUrl);
        try{
            Class.forName(CEConstanteConexion.DRIVER).newInstance();

            moSQLCxn = DriverManager.getConnection(lStrUrl,CEConstanteConexion.USUARIO, CEConstanteConexion.CLAVE);
            MOLOG.info("=====> [Dirección de Conexion ] " + moSQLCxn);
            if (moSQLCxn!=null){
                MOLOG.info("=====> [" + CEConstanteConexion.OK_CONEXION + "] " + moSQLCxn.getSchema());
            }
        }catch(SQLNonTransientConnectionException ex){
           MOLOG.error("=====> [ Error al conectar al Servidor de Base de Datos ] " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            MOLOG.error("=====> ["+ CEConstanteConexion.ERR_CONTROLADOR + "] " + ex.getMessage());
        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    MOLOG.error("=====> [" + CEConstanteConexion.ERR_COMUNICACION_BD + "] " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    MOLOG.error("=====> [" + CEConstanteConexion.ERR_BD_NO_EXISTE + "] " + ex.getErrorCode());
                    break;
            }

        }catch(IllegalAccessException | InstantiationException ex){
            // error en conexion
            MOLOG.error("=====> [No se logró la Conexion ] " + ex.getLocalizedMessage());

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return moSQLCxn;
        
    }

    public void setCerrarSQLDerby(Connection poCxn){
        try{
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }    
    
    public void setCerrarSQLDerby(Connection poCxn, ResultSet poRs){
        try{
            poRs.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
    
    public void setCerrarSQLDerby(Connection poCxn, ResultSet poRs, Statement poSt){
        try{
            poRs.close();
            poSt.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
    
    public void setCerrarSQLDerby(Connection poCxn, ResultSet poRs, PreparedStatement poPs){
        try{
            poRs.close();
            poPs.close();
            poCxn.close();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }    
}
