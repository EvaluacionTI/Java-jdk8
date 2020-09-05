package pe.unjfsc.fsi.java8.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEConstant;
import pe.unjfsc.fsi.java8.entity.CECovid19;
import pe.unjfsc.fsi.java8.logical.CICovid19;

public class CMProyectarCovid implements CICovid19 {

    public static final Logger LOG = LoggerFactory.getLogger("CMProyectarCovid");

    CECovid19 oCECovid;

    @Override
    public CECovid19 proyectarCovid19(int piDiasTranscurridos) {
        oCECovid = new CECovid19();

        LOG.info("[EVL] Instancia CECovid19 : {} ", oCECovid);
        oCECovid.setDay(piDiasTranscurridos);
        oCECovid.setFallecido(calcularFallecidos(piDiasTranscurridos));
        oCECovid.setNacimiento(calcularNacimientos(piDiasTranscurridos));
        oCECovid.setContagio(calcularContagios(piDiasTranscurridos));
        oCECovid.setPoblacion(calcularPoblacion(piDiasTranscurridos));

        LOG.info("[EVL] Objeto CECovid19 : {} ", oCECovid);

        return oCECovid;
    }

    @Override
    public int calcularFallecidos(int piDiasTranscurridos) {
        LOG.info("[EVL] Dias transcurridos : {}", piDiasTranscurridos);
        int iResult = CEConstant.FALLECIDO_DAY*piDiasTranscurridos;
        LOG.info("[EVL] Numero fallecidos : {}", iResult);
        return iResult;
    }

    @Override
    public int calcularNacimientos(int piDiasTranscurridos) {
        LOG.info("[EVL] Dias transcurridos : {}", piDiasTranscurridos);
        int iResult = CEConstant.NACIMIENTO_DAY*piDiasTranscurridos;
        LOG.info("[EVL] Numero Nacimientos : {}", iResult);
        return iResult;
    }

    @Override
    public int calcularContagios(int piDiasTranscurridos) {
        LOG.info("[EVL] Dias transcurridos : {}", piDiasTranscurridos);
        int iResult = (int) (CEConstant.POBLACION*CEConstant.CONTAGIO*piDiasTranscurridos);
        LOG.info("[EVL] Numero Contagios : {}", iResult);
        return iResult;
    }

    @Override
    public int calcularPoblacion(int piDiasTranscurridos) {
        LOG.info("[EVL] Dias transcurridos : {}", piDiasTranscurridos);
        int iResult = (int) (CEConstant.POBLACION+calcularNacimientos(piDiasTranscurridos) - calcularFallecidos(piDiasTranscurridos));
        LOG.info("[EVL] Poblacion estimada: {}", iResult);
        return iResult;
    }

}
