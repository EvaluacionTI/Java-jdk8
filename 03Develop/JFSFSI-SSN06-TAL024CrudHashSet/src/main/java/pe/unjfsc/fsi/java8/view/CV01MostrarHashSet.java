package pe.unjfsc.fsi.java8.view;

import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.model.CIRetiroAFP25HashSet;
import pe.unjfsc.fsi.java8.model.impl.CMRetiroAFP25HashSet;

public class CV01MostrarHashSet {

    private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarHashSet");

    public static void main(String[] args) {
        CIRetiroAFP25HashSet oCrud = new CMRetiroAFP25HashSet();
        LOG.info("[EVL] Instancia CIRetiroAFP25HashSet : {}", oCrud);

        HashSet<CESaldoAfiliado> oResult = oCrud.consultAllRetiroDimensional();
        LOG.info("[EVL] Resultado Consulta ALL : {}", oResult.size());

        LOG.info("[EVL] Ubicando al 3 : {}", oCrud.consultaByIdRetiroDimensional(3));
        
        oCrud.saveRetiroDimensional(new CESaldoAfiliado(10, "0210", 29839.840));
        LOG.info("[EVL] New Result after save : {}", oResult.size());
        
        oCrud.deleteRetiroDimensional(3);
        LOG.info("[EVL] Nueva lista : {}", oCrud.consultAllRetiroDimensional().size());
        LOG.info("[EVL] Ubicando al 3 : {}", oCrud.consultaByIdRetiroDimensional(3));
    }
}
