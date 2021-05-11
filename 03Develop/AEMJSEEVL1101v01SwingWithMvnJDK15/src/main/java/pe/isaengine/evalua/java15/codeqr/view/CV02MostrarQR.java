package pe.isaengine.evalua.java15.codeqr.view;

import com.google.zxing.WriterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.isaengine.evalua.java15.codeqr.utility.CU02WindowQR;

public class CV02MostrarQR {
    private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarQR");
    
    public static void main(String[] args) {
        try{
            CU02WindowQR oVentana = new CU02WindowQR();
            oVentana.setVisible(true);
        }catch(WriterException ex){
            LOG.info("[EVL] Error en imagen : {} ", ex.getCause());
        }
    }
}
