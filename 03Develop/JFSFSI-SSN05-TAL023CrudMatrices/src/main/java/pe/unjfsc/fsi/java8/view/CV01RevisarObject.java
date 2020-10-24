package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.model.CIRetiroAfp25;
import pe.unjfsc.fsi.java8.model.impl.CDRetiroAFP25Matrices;

public class CV01RevisarObject {
    private static final Logger LOG = LoggerFactory.getLogger("CV01RevisarObject");

    public static void main(String[] args) {
        CIRetiroAfp25 oCrudMatrices = new CDRetiroAFP25Matrices();
        LOG.info("[EVL] Instancia CIRetiroAfp25 : {}", oCrudMatrices);
        
        Object[][] oResult = oCrudMatrices.consultAllRetiroDimensional();
        LOG.info("[EVL] Resultado : {}", oResult.length);
    }
    
}
