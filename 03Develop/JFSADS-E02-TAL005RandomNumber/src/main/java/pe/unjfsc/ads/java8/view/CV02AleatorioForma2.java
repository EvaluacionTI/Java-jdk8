package pe.unjfsc.ads.java8.view;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV02AleatorioForma2 {
    private static final Logger LOG =  LoggerFactory.getLogger("CV02AleatorioForma2");
    
    public static void main(String[] args) {
        Random r = new Random();
        int Low = 100000;
        int High = 999999;
        int Result = r.nextInt(High - Low) + Low;
        
        LOG.info(" Numero generado {}", Result);
    }

}
