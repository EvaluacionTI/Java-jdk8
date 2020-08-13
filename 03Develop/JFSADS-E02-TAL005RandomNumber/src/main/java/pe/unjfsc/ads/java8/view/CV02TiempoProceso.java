package pe.unjfsc.ads.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV02TiempoProceso {

    private static final Logger LOG = LoggerFactory.getLogger("CV02TiempoProceso");

    public static void main(String[] args) throws InterruptedException {
        long inicio = System.currentTimeMillis();

        Thread.sleep(2000);

        long fin = System.currentTimeMillis();

        LOG.info("Tiempo inicio : {} ", inicio);
        LOG.info("Tiempo fin    : {} ", fin);
        long tiempo = (long) ((fin - inicio) / 1000);

        LOG.info("Número segundos : {}", tiempo);

    }
}
