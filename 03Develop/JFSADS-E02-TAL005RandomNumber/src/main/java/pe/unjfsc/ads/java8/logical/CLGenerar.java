package pe.unjfsc.ads.java8.logical;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static pe.unjfsc.ads.java8.entity.CEParameterConstant.HUK_SECOND;
import static pe.unjfsc.ads.java8.entity.CEParameterConstant.ISKAY_SECOND;
import static pe.unjfsc.ads.java8.entity.CEParameterConstant.MAX_NUMBER;
import static pe.unjfsc.ads.java8.entity.CEParameterConstant.MIN_NUMBER;

public class CLGenerar {

    private static final Logger LOG = LoggerFactory.getLogger("CLGenerar");

    public int generarEntero6Digitos() {
        Random r = new Random();
        int Low = MIN_NUMBER;
        int High = MAX_NUMBER;
        LOG.info("[EVL] Mínimo : {} ", Low);
        LOG.info("[EVL] Máximo : {} ", High);
        int iResult = r.nextInt(High - Low) + Low;
        LOG.info("[EVL] Numero generado : {} ", iResult);
        return iResult;
    }

    public long generar2Segundos() throws InterruptedException {
        long inicio = System.currentTimeMillis();

        Thread.sleep(ISKAY_SECOND);

        long fin = System.currentTimeMillis();

        LOG.info("[EVL] Tiempo inicio : {} ", inicio);
        LOG.info("[EVL] Tiempo fin    : {} ", fin);
        long tiempo = (long) ((fin - inicio) / HUK_SECOND);

        LOG.info("[EVL] Número segundos : {}", tiempo);
        return tiempo;
    }

    public void generarSecuenciaNumero() throws InterruptedException {
        boolean flag = false;
        while (true) {
            for (int i = 2; i <= 180; i++) {
                if (flag = false) {
                    LOG.info("[EVL] Número generado inicial : {}", generarEntero6Digitos());
                    flag = true;
                }
            }
            if (generar2Segundos() == 2) {
                LOG.info("[EVL] Número generado : {}", generarEntero6Digitos());
                flag = false;
            }
        }
    }
}
