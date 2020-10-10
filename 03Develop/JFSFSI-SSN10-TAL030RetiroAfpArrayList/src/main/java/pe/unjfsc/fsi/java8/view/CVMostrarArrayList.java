package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.logical.CIRetiroAFP25ArrayList;
import pe.unjfsc.fsi.java8.logical.impl.CMRetiroAFP25ArrayList;

public class CVMostrarArrayList {
    private static final Logger LOG = LoggerFactory.getLogger("CVMostrarArrayList");

    public static void main(String[] args) {

        CIRetiroAFP25ArrayList oLista = new CMRetiroAFP25ArrayList();
        LOG.info("[EVL] Instancia Interface : {}", oLista);
        LOG.info("[EVL] Mostrar all : ");

        LOG.info("[EVL] Insert Afiliado : ");
        oLista.saveRetiroArrayList(new CESaldoAfiliado(27, "17202715", 1202715.17));

        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());

        LOG.info("[EVL] Mostrar by Id : ");
        LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroArrayList(15));

        LOG.info("[EVL] Delete by Id : ");
        oLista.deleteRetiroArrayList(10);
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());

        LOG.info("[EVL] Update by Id : ");
        oLista.updateRetiroArrayList(new CESaldoAfiliado(4, "20204", 56780.99));
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());
    }

}
