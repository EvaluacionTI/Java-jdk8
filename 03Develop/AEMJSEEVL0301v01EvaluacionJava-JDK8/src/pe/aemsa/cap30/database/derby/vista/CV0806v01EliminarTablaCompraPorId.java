package pe.aemsa.cap30.database.derby.vista;

import java.sql.Connection;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.controlador.CCCompra;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;


public class CV0806v01EliminarTablaCompraPorId {
private static final Logger MOLOG = LogManager.getLogger(CV0806v01EliminarTablaCompraPorId.class);
    
    private static CDConexionDerby oCDConexion;
    private static Connection moCxn;
    public static void main(String[] args) {
            MOLOG.info("=====> [EEI] Start method : main(String[] args) " + args.length);
        
            BasicConfigurator.configure();

            oCDConexion = new CDConexionDerby();
            
            MOLOG.info("=> [EEI] Intancia de conexión : " + oCDConexion);
            
            moCxn = oCDConexion.getOpenSQLDerby();
            if (moCxn!=null) {
                MOLOG.info("=> [[EEI] objecto conexión : " + moCxn);
                CCCompra oCCCompra = new CCCompra();

                int iIdCompra = 1520;
                oCCCompra.eliminar(iIdCompra);
                    
                 MOLOG.info("=> [[EEI] Identificador de Compra : " + iIdCompra);                
           }
        MOLOG.info("=====> [EEI] End method : main(String[] args) " + args.length);            
    }
}