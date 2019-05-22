package pe.aemsa.cap30.database.derby.vista;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.controlador.CCCompra;
import pe.aemsa.cap30.database.derby.entidad.CECompra;


public class CV0804v02ListarUnDatoCompra {
    private static final Logger MOLOG = LogManager.getLogger(CV0804v02ListarUnDatoCompra.class);

    public static void main(String[] args) {
        MOLOG.info("=====> [EEI] Start method : main(String[] args) " + args.length);

        BasicConfigurator.configure();
        
        CCCompra oCCCompra = new CCCompra();

        MOLOG.info("=> oCCCompra : {} " + oCCCompra);

        CECompra oCECompra = oCCCompra.listarUnRegistro(16);
        
        MOLOG.info("=> Compra : {} " + oCECompra.toString());

        MOLOG.info("=====> [EEI] End method : main(String[] args) " + args.length);
    }
    
}
