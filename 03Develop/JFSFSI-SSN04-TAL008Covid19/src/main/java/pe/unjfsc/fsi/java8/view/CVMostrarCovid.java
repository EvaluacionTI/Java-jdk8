package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CECovid19;
import pe.unjfsc.fsi.java8.logical.CICovid19;
import pe.unjfsc.fsi.java8.logical.impl.CMProyectarCovid;

public class CVMostrarCovid {

    public static final Logger LOG = LoggerFactory.getLogger("CVMostrarCovid");

    public static void main(String[] args) {
        LOG.info("[EVL] Start : {} ");
        
        CECovid19 oCECovid = new CECovid19();
        CICovid19 oCMProyectar = new CMProyectarCovid();

        LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
        LOG.info("[EVL] Entidad Proyectar : {} ", oCMProyectar);

        LOG.info("[EVL] Fallecidos  : {} ", oCMProyectar.calcularFallecidos(10));
        LOG.info("[EVL] Contagios   : {} ", oCMProyectar.calcularContagios(10));
        LOG.info("[EVL] Nacimientos : {} ", oCMProyectar.calcularNacimientos(10));
        LOG.info("[EVL] Poblacion   : {} ", oCMProyectar.calcularPoblacion(10));

        oCECovid = oCMProyectar.proyectarCovid19(10);
        LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
    }
}
