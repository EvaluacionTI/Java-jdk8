package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEAreaSuperficieLateral;
import static pe.unjfsc.fsi.java8.entity.CEConstant.LSA;
import pe.unjfsc.fsi.java8.logical.CIEvaluarSuperficie;
import pe.unjfsc.fsi.java8.logical.impl.CMEvaluarArea;

public class CV01ValidarRadio {
    public static final Logger LOG = LoggerFactory.getLogger("CV01ValidarRadio");
    
    public static void main (String[] poStr){
        LOG.info("[EVL] Start ");
        CEAreaSuperficieLateral oCESaldoAfiliado = new CEAreaSuperficieLateral();
        CIEvaluarSuperficie oCIArea = new CMEvaluarArea();
        
        LOG.info("[EVL] Entidad LSA : {} ", oCESaldoAfiliado);
        
        oCESaldoAfiliado.setLsa(LSA);
        oCESaldoAfiliado.setAltura(500);
        LOG.info("[EVL] New Entidad LSA : {} ", oCESaldoAfiliado);
        
        LOG.info("[EVL] Radio en LSA   : {} ", oCIArea.calcularLSA(oCESaldoAfiliado));
    }
}
