package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEToro;
import pe.unjfsc.fsi.java8.logical.CIUtilidad;
import pe.unjfsc.fsi.java8.logical.impl.CMEvaluar;

public class CVMostrarInterface {

    private static final Logger LOG = LoggerFactory.getLogger("CVMostrarInterface");

    public static void main(String[] args) {
        LOG.info("[EVL] Start : ");
        
        CEToro oToro = new CEToro();
        CIUtilidad oUtilidad = new CMEvaluar();
        
        LOG.info("[EVL] Instancia inicial CEToro : {}", oToro);
        LOG.info("[EVL] Instancia CIUtilidad : {}", oUtilidad);
        
        oToro.setCodigo(oUtilidad.generarCodigo5Digitos());
        oToro.setNombre("negro salmon");
        oToro.setAlias("MARCO");
        oToro.setFechaNacimiento("31/07/1999");
        LOG.info("[EVL] Instancia con dato CEToro : {}", oToro);
        
        LOG.info("[EVL] Conversion Mayuscula : {}", oUtilidad.convertirMayuscula(oToro.getNombre()));
    }
}
