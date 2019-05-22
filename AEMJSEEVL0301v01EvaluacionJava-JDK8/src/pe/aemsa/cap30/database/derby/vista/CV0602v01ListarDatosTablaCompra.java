package pe.aemsa.cap30.database.derby.vista;

import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.controlador.CCCompra;
import pe.aemsa.cap30.database.derby.entidad.CECompra;

public class CV0602v01ListarDatosTablaCompra {
    private static final Logger MOLOG = LogManager.getLogger(CV0602v01ListarDatosTablaCompra.class);

    public static void main(String[] args) {
        MOLOG.info("=====> [FCS] Start method : main(String[] args) " + args.length);

        BasicConfigurator.configure();
        
        CCCompra oCCCompra = new CCCompra();

        MOLOG.info("=> oCCCompra : {} " + oCCCompra);

        List<CECompra> oLista = oCCCompra.listarTodosRegistros();
        
        MOLOG.info("=> Cantidad : {} " + oLista.size());

        MOLOG.info("=====> [FCS] End method : main(String[] args) " + args.length);
    }
}
