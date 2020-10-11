package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.logical.CIRetiroAFP25LinkedList;
import pe.unjfsc.fsi.java8.logical.impl.CMRetiroAFP25LinkedList;


public class CV01MostrarLinkedList {
    private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarLinkedList");

    public static void main(String[] args) {

        CIRetiroAFP25LinkedList oLista = new CMRetiroAFP25LinkedList();
        LOG.info("[EVL] Instancia Interface : {}", oLista);
        LOG.info("[EVL] Mostrar all : ");

        LOG.info("[EVL] Insert Afiliado : ");
        oLista.saveRetiroLinkedList(new CESaldoAfiliado(27, "17202715", 1202715.17));

        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedList());

        LOG.info("[EVL] Mostrar by Id : ");
        LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroLinkedList(15));

        LOG.info("[EVL] Delete by Id : ");
        oLista.deleteRetiroLinkedList(10);
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedList());

        LOG.info("[EVL] Update by Id : ");
        oLista.updateRetiroLinkedList(new CESaldoAfiliado(4, "20204", 56780.99));
        LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedList());
    }

}
