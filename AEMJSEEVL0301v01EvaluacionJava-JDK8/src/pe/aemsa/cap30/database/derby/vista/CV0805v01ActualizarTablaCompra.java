package pe.aemsa.cap30.database.derby.vista;

import java.sql.Connection;
import java.util.Date;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.controlador.CCCompra;
import pe.aemsa.cap30.database.derby.entidad.CECompra;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;

public class CV0805v01ActualizarTablaCompra {
private static final Logger MOLOG = LogManager.getLogger(CV0805v01ActualizarTablaCompra.class);
    
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
                CECompra oCECompra = new CECompra();

                Date oFechaSistema = new Date();

                oCECompra.setIdCompra(1520);
                oCECompra.setNombreProducto("Actualiza DEMO DERBY 10.13.1.1");
                oCECompra.setCantidad(15.135);
                oCECompra.setPrecio(1999.27);
                oCECompra.setSiNoActivo(false);
                oCECompra.setFechaSistema(oFechaSistema);                
                
                oCCCompra.modificar(oCECompra);
                    
                 MOLOG.info("=> [[EEI] objecto CECompra : " + oCECompra.toString());                
           }

        MOLOG.info("=====> [EEI] End method : main(String[] args) " + args.length);            
    }
    
}
