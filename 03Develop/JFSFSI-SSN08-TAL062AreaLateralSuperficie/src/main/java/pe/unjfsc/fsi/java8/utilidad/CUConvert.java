package pe.unjfsc.fsi.java8.utilidad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CUConvert {

    private static final Logger LOG = LoggerFactory.getLogger("CUConvert");

    public String rotarDerechaIzquierda(String psCadena) {
        String sCadenaRotada = "";
        LOG.info(" psCadena {}", psCadena);
        LOG.info(" psCadena {}", psCadena.length());

        for (int i = psCadena.length(); i > 0; i--) {
            LOG.info(" psCadena {}", psCadena.substring(i-1, i));
            sCadenaRotada = sCadenaRotada + psCadena.substring(i-1, i);
        }

        return sCadenaRotada.trim();
    }
    
    public String extraerPrimerUltimaPosicion(String psCadena){
        
        String sPrimera = psCadena.substring(0, 1);
        String sUltima = psCadena.substring(psCadena.length()-1, psCadena.length());
        LOG.info(" sPrimera {}", sPrimera);
        LOG.info(" sUltima {}", sUltima);
        return sPrimera + sUltima;
    }
}
