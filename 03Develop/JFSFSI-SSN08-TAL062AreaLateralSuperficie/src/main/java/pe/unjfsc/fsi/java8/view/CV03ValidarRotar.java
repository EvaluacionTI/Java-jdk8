package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.utility.CUConvert;

public class CV03ValidarRotar {
    private static final Logger LOG = LoggerFactory.getLogger("CV03ValidarRotar");
    
    public static void main(String[] args) {
        CUConvert oCURotar = new CUConvert();
        LOG.info("CUConvert : {}", oCURotar);
        LOG.info("Rotar : {}", oCURotar.rotarDerechaIzquierda("alex"));

        LOG.info("Extraer : {}", oCURotar.extraerPrimerUltimaPosicion("alex"));
    }
    
}
