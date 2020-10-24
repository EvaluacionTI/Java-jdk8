package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.model.CIRetiroAfp25;
import pe.unjfsc.fsi.java8.model.impl.CDRetiroAFP25Matrices;

public class CV02RevisarSaveObject {
    private static final Logger LOG = LoggerFactory.getLogger("CV02RevisarSaveObject");

    public static void main(String[] args) {
        CIRetiroAfp25 oCrudMatrices = new CDRetiroAFP25Matrices();
        LOG.info("[EVL] Instancia CIRetiroAfp25 : {}", oCrudMatrices);
        
        LOG.info("[EVL] Insert : {}");
        Object[][] oDatos = new Object[1][3];
        oDatos[0][0] = 4;
        oDatos[0][1] = "2020";
        oDatos[0][2] = 2020.20;
        
        oCrudMatrices.saveRetiroDimensional(oDatos);
    }
    
}
