package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.fsi.java8.entity.CEAreaTotalSuperficie;
import static pe.unjfsc.fsi.java8.entity.CEConstant.LSA;
import pe.unjfsc.fsi.java8.logical.CIEvaluarSuperficie;
import pe.unjfsc.fsi.java8.logical.impl.CMEvaluarArea;

public class CV02ValidarArea {
    public static final Logger LOG = LoggerFactory.getLogger("CV01ValidarRadio");
    private static CEAreaSuperficieLateral oCELsa;
    private static CEAreaSuperficieLateral oCELsaRpta;
    private static CEAreaTotalSuperficie oCEAts, oCEAtsRpta;
    
    public static void main (String[] poStr){
        LOG.info("[EVL] Start ");
        oCELsa = new CEAreaSuperficieLateral();
        CIEvaluarSuperficie oCIArea = new CMEvaluarArea();
        
        LOG.info("[EVL] Instancia Entidad LSA : {} ", oCELsa);
        
        oCELsa.setLsa(LSA);
        oCELsa.setAltura(500);
        LOG.info("[EVL] Envio Entidad LSA : {} ", oCELsa);
        oCELsaRpta = oCIArea.calcularLSA(oCELsa);
        LOG.info("[EVL] New Entidad LSA : {} ", oCELsa);
        
        oCEAts = new CEAreaTotalSuperficie();
        oCEAts.setoCELsa(oCELsa);
        LOG.info("[EVL] Entidad TSA : {} ", oCEAts);
                
        oCEAtsRpta = oCIArea.calcularTSA(oCEAts);
        LOG.info("[EVL] New Entidad TSA : {} ", oCEAtsRpta);
    }
}
