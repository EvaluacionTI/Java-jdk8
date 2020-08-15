package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.logical.CLGenerar;

public class CVMostrarNumeroAleatorio {
 private static final Logger LOG = LoggerFactory.getLogger("CVMostrarNumeroAleatorio");
 
    public static void main(String[] args) throws InterruptedException {
        CLGenerar oCLSecuencia = new CLGenerar();
        LOG.info("[EVL] Instancia", oCLSecuencia);
        oCLSecuencia.generarSecuenciaNumero();
    }
}
