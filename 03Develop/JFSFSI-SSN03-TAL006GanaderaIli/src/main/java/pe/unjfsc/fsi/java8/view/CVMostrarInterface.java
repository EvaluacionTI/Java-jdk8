package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.fsi.java8.entity.CEToro;
import pe.unjfsc.fsi.java8.logical.CIUtilidad;
import pe.unjfsc.fsi.java8.logical.impl.CMEvaluar;

public class CVMostrarInterface {

    private static final Logger LOG = LoggerFactory.getLogger("CVMostrarInterface");

    public static void main(String[] args) {

        LOG.info("[EVL] Iniciando :");

        CEToro oCEToro = new CEToro();
        oCEToro.setNombre("marco");

        CIUtilidad oCLUtilidad = new CMEvaluar();

        long numeroGenerado = oCLUtilidad.generarNumero();
        String cadena = oCLUtilidad.convertirMayuscula(oCEToro.getNombre());

        LOG.info(" {} ", numeroGenerado);
        LOG.info(cadena);
    }

}
