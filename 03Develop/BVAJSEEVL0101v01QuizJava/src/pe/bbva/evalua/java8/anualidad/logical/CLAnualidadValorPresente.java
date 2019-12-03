package pe.bbva.evalua.java8.anualidad.logical;

import com.sun.istack.internal.logging.Logger;
import java.math.BigDecimal;

public class CLAnualidadValorPresente {
    private final Logger MOLOG = Logger.getLogger(CLAnualidadValorPresente.class);
    
    private static final int BASE_CALCULO = 360;
    public double valueValorPresenteCuota(double pdValorFuturo, double pdTasaAnual, int piPlazoTotalDias, int piFrecuenciaDias){
        MOLOG.info("[EVL] Valor futuro : " + pdValorFuturo + "/" + pdTasaAnual + "/" + piPlazoTotalDias + "/" + piFrecuenciaDias);

        double dFactor_base_calculo = (pdTasaAnual / BASE_CALCULO);
        double dFactor_tasa = (1 + dFactor_base_calculo * piFrecuenciaDias);
        int iNumero_periodo = (piPlazoTotalDias / piFrecuenciaDias);
        
        double dResult = pdValorFuturo / Math.pow(dFactor_tasa, iNumero_periodo);
        
        MOLOG.info("[EVL] dFactor_base_calculo : " + dFactor_base_calculo);
        MOLOG.info("[EVL] dFactor_tasa : " + dFactor_base_calculo);
        MOLOG.info("[EVL] iNumero_periodo : " + iNumero_periodo);
        MOLOG.info("[EVL] dResult : " + dResult);
        
        return dResult;
    
    }
    
    public Double valorPresenteCuota(Double pdValorFuturo, Double pdTasaAnual, int piPlazoTotalDias, int piFrecuenciaDias){

        Double dFactor_base_calculo = (pdTasaAnual / BASE_CALCULO);
        Double dFactor_tasa = (1 + dFactor_base_calculo * piFrecuenciaDias);
        int iNumero_periodo = (piPlazoTotalDias / piFrecuenciaDias);
        
        Double dResult = pdValorFuturo / Math.pow(dFactor_tasa, iNumero_periodo);

        MOLOG.info("[EVL] dFactor_base_calculo : " + dFactor_base_calculo);
        MOLOG.info("[EVL] dFactor_tasa : " + dFactor_base_calculo);
        MOLOG.info("[EVL] iNumero_periodo : " + iNumero_periodo);
        MOLOG.info("[EVL] dResult : " + dResult);
        
        return dResult;
    }
    
    public double valuePresent(double pdValorFuturo, double pdTasaAnual, int piPlazoTotalDias, int piFrecuenciaDias){
     
        int iNumero_periodo = (piPlazoTotalDias / piFrecuenciaDias);
        double dFactor_base_calculo = pdTasaAnual * (piFrecuenciaDias / BASE_CALCULO);
        
        double dFactor_base = Math.pow(dFactor_base_calculo, iNumero_periodo);


        double dFactor_tasa = (dFactor_base + 1)/ dFactor_base;
        double dFactor = (1 - dFactor_tasa)/dFactor_base_calculo;
        
        double dResult = pdValorFuturo * dFactor;

        MOLOG.info("[EVL] dFactor_base_calculo : " + dFactor_base_calculo);
        MOLOG.info("[EVL] dFactor_base : " + dFactor_base);
        MOLOG.info("[EVL] dFactor_tasa : " + dFactor_tasa);
        MOLOG.info("[EVL] iNumero_periodo : " + iNumero_periodo);
        MOLOG.info("[EVL] dFactor : " + dFactor);
        MOLOG.info("[EVL] dResult : " + dResult);
        
        return dResult;
    }
}
