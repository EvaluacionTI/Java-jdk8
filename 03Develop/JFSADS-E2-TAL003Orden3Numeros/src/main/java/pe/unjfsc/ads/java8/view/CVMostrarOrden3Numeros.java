package pe.unjfsc.ads.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.java8.entity.CEOrdenar;
import pe.unjfsc.ads.java8.logical.CLOrdenar;

public class CVMostrarOrden3Numeros {

    private static final Logger LOG = LoggerFactory.getLogger(CVMostrarOrden3Numeros.class);

    public static void main(String[] args) {
        CEOrdenar oCEOrdenar = new CEOrdenar();
        CLOrdenar oCLOrdenar = new CLOrdenar();

        oCEOrdenar = oCLOrdenar.ordenarNumeros(7, 4, 3);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(1, 3, 4);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(3, 5, 4);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(8, 17, 9);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(18, 19, 3);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(14, 19, 4);
        LOG.info(oCEOrdenar.toString());
        oCEOrdenar = oCLOrdenar.ordenarNumeros(7, 4, 6);
        LOG.info(oCEOrdenar.toString());
    }

}
