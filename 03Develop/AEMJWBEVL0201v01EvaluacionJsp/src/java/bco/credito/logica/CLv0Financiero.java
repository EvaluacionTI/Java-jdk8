package bco.credito.logica;

import bco.credito.entidad.CEConversionTasa;
import bco.credito.entidad.CECredito;
import bco.credito.entidad.CEv0CronogramaCuotaFija;
import bco.credito.entidad.CEv0CuotaFija;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CLv0Financiero {

    /*
     * Conversion de Tasa
     */
    public double convertirTeaTem(double pTea) {
        double lFactor = (Math.pow((1 + pTea * 0.01), (1 / 12D)) - 1);
        return lFactor;
    }

    public double convertirTeaTed(double pTea) {
        return (Math.pow((1 + pTea * 0.01), (1 / 360D)) - 1);
    }

    public int plazoCorrido(int pIntFrecuencia) {
        int lIntNumeroDias = 0;

        switch (pIntFrecuencia) {
            case 1:
                lIntNumeroDias = 0; //VENCIMIENTO
                break;
            case 2:
                lIntNumeroDias = 1; //DIARIO
                break;
            case 3:
                lIntNumeroDias = 7; //SEMANAL
                break;
            case 4:
                lIntNumeroDias = 14; //BI SEMANAL
                break;
            case 5:
                lIntNumeroDias = 15; //QUINCENAL
                break;
            case 6:
                lIntNumeroDias = 30; //MENSUAL
                break;
            case 7:
                lIntNumeroDias = 180; //BI MENSUAL
                break;
            case 8:
                lIntNumeroDias = 90; //TRIMESTRAL
                break;
            case 9:
                lIntNumeroDias = 180; //SEMESTRAL
                break;
            case 10:
                lIntNumeroDias = 360; //ANUAL
                break;
            case 11:
                lIntNumeroDias = 720; //BI ANUAL
                break;
            case 12:
                lIntNumeroDias = 1080; //TRI ANUAL
                break;
        }
        return lIntNumeroDias;

    }

    public int baseCalculo(int pIntBaseCalculo) {
        int lIntBase = 0;
        switch (pIntBaseCalculo) {
            case 1:
                lIntBase = 360; //BASE MENSUAL 360 CON ANUAL 360
                break;
            case 2:
                lIntBase = 360; //BASE MENSUAL 365 CON ANUAL 360
                break;
            case 3:
                lIntBase = 365; //BASE MENSUAL 360 CON ANUAL 365
                break;
            case 4:
                lIntBase = 365; //BASE MENSUAL 365 CON ANUAL 365
                break;
        }
        return lIntBase;
    }

    public double mtd01v01convertirTEA(CEConversionTasa poCEConversionTasa) {
        double lDblPlazo;
        double lDblBaseCalculo;
        double lDblConversionTasa;
        double lDblBase;
        double lDblExponente;

        lDblPlazo = plazoCorrido(poCEConversionTasa.getmFrecuencia());
        lDblBaseCalculo = baseCalculo(poCEConversionTasa.getmBaseCalculo());

        lDblBase = (1 + poCEConversionTasa.getmTea() * 0.01D);
        lDblExponente = (lDblPlazo / lDblBaseCalculo) * 1D;

        lDblConversionTasa = Math.pow(lDblBase, lDblExponente);
        return 0;
    }

    /*
     * Tipo de amortización : Amortizacion de cuota fija o sistema aleman
     */
    public double montoCuotaFijoFormula(double pTea, double pNumeroCuotas, double pMontCredito) {
        double lFactorBase, lTasaBase, lMontoCuotaFijo;

        lTasaBase = convertirTeaTem(pTea);
        lFactorBase = 1 - Math.pow((1 + lTasaBase), pNumeroCuotas * -1D);
        lFactorBase = Math.pow(lFactorBase / lTasaBase, -1D);

        lMontoCuotaFijo = lFactorBase * pMontCredito;
        return lMontoCuotaFijo;
    }

    public double montoCuotaFijoFormula(CECredito poCredito) {
        double lFactorBase, lTasaBase, lMontoCuotaFijo;

        lTasaBase = convertirTeaTem(poCredito.getmTea());
        lFactorBase = 1 - Math.pow((1 + lTasaBase), poCredito.getmNumeroCuotas() * -1D);
        lFactorBase = Math.pow(lFactorBase / lTasaBase, -1D);

        lMontoCuotaFijo = lFactorBase * poCredito.getmMontoCredito();
        return lMontoCuotaFijo;
    }

    public int buscarMeses(int pIndice, int[] poaMeses) {
        int lValorEncontrado = 0;
        for (int i = 0; i < poaMeses.length; i++) {
            if (pIndice == i) {
                lValorEncontrado = poaMeses[i];
            }
        }
        return lValorEncontrado;
    }

    public double factorCuotaMensual(int pFactorPago, double pTea, int pNumeroDias) {
        Double lFactorBase, lTasaBase;

        lTasaBase = convertirTeaTem(pTea);
        lFactorBase = pFactorPago * Math.pow((1 + lTasaBase), ((pNumeroDias) * -1D / 360D));

        return lFactorBase;
    }

    /*
     * El periodo de gracia solo aplica para cronograma tipo mensual
     * Calcular la fecha de inicio de pago con o sin periodo de gracia
     * = (Fecha de Desembolso ) + (Número Dias Frecuencia Mensual * (1 + Número Días del Periodo de Gracia)
     */
    public Date fechaInicioPagoCuotaFija(Date pDteFechaDesembolso, int pIntNroDiasFrecuencia, int pIntNroMesesPeriodoGracia) {

        GregorianCalendar oFecha = new GregorianCalendar();
        oFecha.setTime(pDteFechaDesembolso);

        oFecha.add(GregorianCalendar.DATE, pIntNroDiasFrecuencia * (1 + pIntNroMesesPeriodoGracia));

        return oFecha.getTime();

    }

    public Date fechaInicioPagoCuotaFija(CEv0CuotaFija poCECuotaFija) {

        GregorianCalendar oFecha = new GregorianCalendar();
        oFecha.setTime(poCECuotaFija.getmFechaDesembolso());

        oFecha.add(GregorianCalendar.DATE, poCECuotaFija.getmNumeroDiasFrecuencia() * (1 + poCECuotaFija.getmNumeroMesesGracia()));

        return oFecha.getTime();

    }

    /*
     * Generacion de factores para las cuotas fijas
     */
    public List factoresCuotaFijav0(double pDblTea, Date pDteFechaDesembolso, Date pDteFechaInicioPago,
            int pIntNroDiasFrecuencia, int pIntNroMesesPeriodoGracia,
            int pIntPlazo, int pIntBaseCalculo) throws Exception {

        List<CEv0CronogramaCuotaFija> oLstCronogramaFactores = new ArrayList<>();
        CEv0CronogramaCuotaFija oCEFactoresCuotaFija = new CEv0CronogramaCuotaFija();

        Date lDteFechaInicioPago;
        Date lDteFechaVencimiento;

        int lIntTotalNumeroDias = 0;
        double lDblFactorInversa = 0;
        byte lBytNumeroMesesPago = 1;

        lDteFechaInicioPago = pDteFechaInicioPago;
        lDteFechaVencimiento = pDteFechaDesembolso;

        try {
            for (int indice = 1; indice <= pIntPlazo; indice++) {

                oCEFactoresCuotaFija.setmNumeroCuota(indice);
                oCEFactoresCuotaFija.setmFechaInicio(lDteFechaInicioPago);
                oCEFactoresCuotaFija.setmFechaVencimiento(lDteFechaVencimiento);
                oCEFactoresCuotaFija.setmNumeroDias(pIntNroDiasFrecuencia);

                lIntTotalNumeroDias += pIntNroDiasFrecuencia;

                oCEFactoresCuotaFija.setmNumeroDias(pIntNroDiasFrecuencia);
                oCEFactoresCuotaFija.setmAcumuladoDias(lIntTotalNumeroDias);

                lDblFactorInversa = Math.pow((1 + pDblTea * 0.01D), ((-1D * lIntTotalNumeroDias) / pIntBaseCalculo));

                oCEFactoresCuotaFija.setmFactorInversa(lDblFactorInversa);
                oCEFactoresCuotaFija.setmNumeroMesesPago(lBytNumeroMesesPago);
                oCEFactoresCuotaFija.setmFactorDoble(lDblFactorInversa * lBytNumeroMesesPago);

                oLstCronogramaFactores.add(oCEFactoresCuotaFija);

                oCEFactoresCuotaFija = new CEv0CronogramaCuotaFija();
            }

            return oLstCronogramaFactores;

        } catch (Exception ex) {
            ex.getMessage();
            throw ex;
        }
    }

    public List factoresCuotaFijav0(CEv0CronogramaCuotaFija poCECronograma) throws Exception {

        List<CEv0CronogramaCuotaFija> oLstCronogramaFactores = new ArrayList<>();
        CEv0CronogramaCuotaFija oCEFactoresCuotaFija = new CEv0CronogramaCuotaFija();

        Date lDteFechaInicioPago;
        Date lDteFechaVencimiento;

        int lIntTotalNumeroDias = 0;
        double lDblFactorInversa = 0;
        byte lBytNumeroMesesPago = 1;

        lDteFechaInicioPago = poCECronograma.getmFechaInicioPago();
        lDteFechaVencimiento = poCECronograma.getmFechaDesembolso();

        try {
            for (int indice = 1; indice <= poCECronograma.getmPlazo(); indice++) {

                oCEFactoresCuotaFija.setmNumeroCuota(indice);
                oCEFactoresCuotaFija.setmFechaInicio(lDteFechaInicioPago);
                oCEFactoresCuotaFija.setmFechaVencimiento(lDteFechaVencimiento);
                oCEFactoresCuotaFija.setmNumeroDias(poCECronograma.getmNumeroDiasFrecuencia());

                lIntTotalNumeroDias += poCECronograma.getmNumeroDiasFrecuencia();

                oCEFactoresCuotaFija.setmAcumuladoDias(lIntTotalNumeroDias);

                lDblFactorInversa = Math.pow((1 + poCECronograma.getmTea() * 0.01D), ((-1D * lIntTotalNumeroDias) / poCECronograma.getmNumeroDiasBaseCalculo()));

                oCEFactoresCuotaFija.setmFactorInversa(lDblFactorInversa);
                oCEFactoresCuotaFija.setmNumeroMesesPago(lBytNumeroMesesPago);
                oCEFactoresCuotaFija.setmFactorDoble(lDblFactorInversa * lBytNumeroMesesPago);

                oLstCronogramaFactores.add(oCEFactoresCuotaFija);

                oCEFactoresCuotaFija = new CEv0CronogramaCuotaFija();
            }

            return oLstCronogramaFactores;

        } catch (Exception ex) {
            ex.getMessage();
            throw ex;
        }
    }

    public List cronogramaCuotaFija(CEv0CuotaFija poCEDatosCuotaFija) {
        int lIntAcumulaDias = 0;
        double lDblTeaBase = 0.0D;
        double lDblFactorNormal = 0.0D;
        double lDblFactorInversa = 0.0D;
        double lDblFactorDoble = 0.0D;

        List<CEv0CronogramaCuotaFija> oLstCronogramaCuotaFija = new ArrayList<>();

        try {
            for (int indice = 1; indice <= poCEDatosCuotaFija.getmPlazo(); indice++) {
                CEv0CronogramaCuotaFija oCEDatosCronograma = new CEv0CronogramaCuotaFija();

                oCEDatosCronograma.setmNumeroCuota(indice);
                oCEDatosCronograma.setmNumeroDias(30);

                oCEDatosCronograma.setmNumeroDias(lIntAcumulaDias);
                lIntAcumulaDias += 30;
                lDblTeaBase = 1 + poCEDatosCuotaFija.getmTea() * 0.01D;
                lDblFactorNormal = (Math.pow(lDblTeaBase, (lIntAcumulaDias / 360D)) - 1D);
                lDblFactorInversa = (Math.pow(lDblTeaBase, ((1D * lIntAcumulaDias) / 360D)) - 1D);
                lDblFactorDoble = lDblFactorInversa * 1D;

                oCEDatosCronograma.setmFactorNormal(lDblFactorNormal);
                oCEDatosCronograma.setmFactorInversa(lDblFactorInversa);
                oCEDatosCronograma.setmFactorDoble(lDblFactorDoble);

                oLstCronogramaCuotaFija.add(oCEDatosCronograma);
            }

            return oLstCronogramaCuotaFija;
        } catch (Exception ex) {
            return null;
        }
    }
}
