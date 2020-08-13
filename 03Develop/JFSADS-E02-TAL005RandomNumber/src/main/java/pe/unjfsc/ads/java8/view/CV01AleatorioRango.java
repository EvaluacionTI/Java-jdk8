package pe.unjfsc.ads.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV01AleatorioRango {
    private static final Logger LOG =  LoggerFactory.getLogger("CV01AleatorioRango");
    // need a random number between -500 and +500
    public static void main(String[] args) {
       long myRandomLong = (long)(Math.random() * 500 * (Math.random() > 0.5 ? 1 : -1));
       LOG.info(" Numero generado {}", myRandomLong);
    }
    
}
