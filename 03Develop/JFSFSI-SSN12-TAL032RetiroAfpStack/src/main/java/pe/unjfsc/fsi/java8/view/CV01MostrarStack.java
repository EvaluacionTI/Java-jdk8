package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.logical.CIRetiroAFP25Stack;
import pe.unjfsc.fsi.java8.logical.impl.CMRetiroAFP25Stack;


public class CV01MostrarStack {
    private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarStack");

    public static void main(String[] args) {

        CIRetiroAFP25Stack oLista = new CMRetiroAFP25Stack();
        LOG.info("[EVL] Instancia Interface : {}", oLista);
        LOG.info("[EVL] Mostrar all : ");

        LOG.info("[EVL] Insert Afiliado : ");
        oLista.saveRetiroStack(new CESaldoAfiliado(27, "17202715", 1202715.17));

        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroStack());

        LOG.info("[EVL] Mostrar by Id : ");
        LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroStack(15));

        LOG.info("[EVL] Delete by Id : ");
        oLista.deleteRetiroStack(10);
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroStack());

        LOG.info("[EVL] Update by Id : ");
        oLista.updateRetiroStack(new CESaldoAfiliado(4, "20204", 56780.99));
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroStack());
    }

}
