package pe.unjfsc.fsi.java8.logical.impl;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEConstant;
import pe.unjfsc.fsi.java8.logical.CIUtilidad;

public class CMEvaluar implements CIUtilidad{
    private static final Logger LOG = LoggerFactory.getLogger("CMEvaluar");

    @Override
    public String convertirMayuscula(String pCadenaMinuscula) {
        LOG.info("[EVL] Cadena recibida : {}", pCadenaMinuscula);
        String enMayuscula = pCadenaMinuscula.toUpperCase();
        LOG.info("[EVL] Cadena convertida : {}", enMayuscula);
        return enMayuscula;
    }

    @Override
    public int generarCodigo5Digitos() {
        Random oR = new Random();
        LOG.info("[EVL] Instancia Random : {}", oR);
        int iResult = oR.nextInt(CEConstant.MAX_NUMBER - CEConstant.MIN_NUMBER) + CEConstant.MIN_NUMBER;
        LOG.info("[EVL] Número generado : {}", iResult);
        return iResult;
    }
}
