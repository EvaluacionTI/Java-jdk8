package pe.aemsa.cap30.database.derby.vista;

import java.sql.Connection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.controlador.CCCompra;
import pe.aemsa.cap30.database.derby.entidad.CECompra;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;
import pe.aemsa.cap30.database.derby.modelo.impl.CDDataInternaCompra;


public class CV0803v01CrearDatosTablaCompra {
    private static final Logger MOLOG = LogManager.getLogger(CV0803v01CrearDatosTablaCompra.class);
    
    private static CDConexionDerby oCDConexion;
    private static Connection moCxn;
    
    public static void main(String[] args){
        MOLOG.info("=====> [EEI] Start method : main(String[] args) " + args.length);
        
            BasicConfigurator.configure();

            oCDConexion = new CDConexionDerby();
            
            MOLOG.info("=> [EEI] Intancia de conexión : " + oCDConexion);
            
            moCxn = oCDConexion.getOpenSQLDerby();
            
            if (moCxn!=null) {
                MOLOG.info("=> [[EEI] objecto conexión : " + moCxn);
                CCCompra oCCCompra = new CCCompra();
                CECompra oCECompra = new CECompra();
                CDDataInternaCompra oData = new CDDataInternaCompra();
                
                oCCCompra.registrar(oData.registroCompra());
                    
                 MOLOG.info("=> [[EEI] objecto CECompra : " + oCECompra.toString());                
           }

        
        MOLOG.info("=====> [EEI] End method : main(String[] args) " + args.length);
    }
    
}
