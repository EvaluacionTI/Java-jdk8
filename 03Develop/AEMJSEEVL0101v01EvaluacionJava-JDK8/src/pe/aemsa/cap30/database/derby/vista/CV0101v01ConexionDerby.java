
package pe.aemsa.cap30.database.derby.vista;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;

public class CV0101v01ConexionDerby {
    private static final Logger MOLOG = LogManager.getLogger(CV0101v01ConexionDerby.class);
    private static CDConexionDerby oCDConexion;
    private static Connection moCxn;
    
    public static void main(String[] args) {
        MOLOG.info("=====> [FCS] Start method - main(String[] args)] :" + args.length);
        BasicConfigurator.configure();

        try{
            oCDConexion = new CDConexionDerby();
            
            moCxn = oCDConexion.getOpenSQLDerby();
            if (moCxn!=null) {
                moCxn.close();
            }
            System.out.println(moCxn);
        }catch(SQLException oSQL){
            System.out.println("Error SQL :" + oSQL.getMessage());
        }
        MOLOG.info("=====> [FCS] End method - main(String[] args)] ");
    }
}
