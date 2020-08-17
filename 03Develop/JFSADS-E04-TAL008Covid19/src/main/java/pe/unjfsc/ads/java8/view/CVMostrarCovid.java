package pe.unjfsc.ads.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.java8.entity.CECovid19;
import pe.unjfsc.ads.java8.logical.CICovid19;
import pe.unjfsc.ads.java8.logical.impl.CMProyectarCovid;

public class CVMostrarCovid {

    public static final Logger LOG = LoggerFactory.getLogger("CVMostrarCovid");

    public static void main(String[] args) {
        LOG.info("[EVL] Start : {} ");
        
        CECovid19 oCECovid = new CECovid19();
        CICovid19 oCMProyectar = new CMProyectarCovid();

        LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
        LOG.info("[EVL] Entidad Proyectar : {} ", oCMProyectar);
        oCECovid = oCMProyectar.proyectarCovid19();
        LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
    }
}
