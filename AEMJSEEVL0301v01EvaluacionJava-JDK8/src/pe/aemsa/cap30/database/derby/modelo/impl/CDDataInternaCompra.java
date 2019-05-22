package pe.aemsa.cap30.database.derby.modelo.impl;

import java.util.Date;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.entidad.CECompra;

public class CDDataInternaCompra {
    private static final Logger MOLOG = LogManager.getLogger(CDDataInternaCompra.class);
    private CECompra oCECompra;
    
    public CECompra registroCompra(){
        MOLOG.info("=====> Start [ registroCompra() ] ");
        oCECompra = new CECompra();
        Date oFechaSistema = new Date();
        
        oCECompra.setIdCompra(1520);
        oCECompra.setNombreProducto("DEMO DERBY 10.13.1.1");
        oCECompra.setCantidad(5.35);
        oCECompra.setPrecio(16.04);
        oCECompra.setSiNoActivo(true);
        oCECompra.setFechaSistema(oFechaSistema);
        
        MOLOG.info("=> Data : {} " + oCECompra.toString());
        MOLOG.info("=====> End [ registroCompra() ] ");
        
        return oCECompra;
    }
}
