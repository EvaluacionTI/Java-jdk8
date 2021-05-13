package pe.unjfsc.ads.sesion10.java15.view;

import com.google.zxing.WriterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.sesion10.java15.utility.CU02WindowQR;

public class CV02MostrarQR {

    private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarQR");
    
    public static void main(String[] args) {
        try{
            CU02WindowQR oVentana = new CU02WindowQR();
            LOG.info("[ADS] Instancia de clase : {}", oVentana);
            
            oVentana.setVisible(true);
        }catch(WriterException ex){
            LOG.info("[ADS] Error en imagen : {} ", ex.getCause());
        }
    }

}
