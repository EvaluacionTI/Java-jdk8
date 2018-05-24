package bco.credito.vista;

import bco.credito.entidad.CEv0CronogramaCuotaFija;
import bco.credito.logica.CLv0Financiero;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CV03v01ProbarCronograma {

    public static void main(String[] args) {

        try {
            String lStrFechaDesembolso = "31/12/2012";
            SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            Date oDteFechaDesembolso = oFormatoFecha.parse(lStrFechaDesembolso);
            System.out.println("Fecha de Desembolso : " + oFormatoFecha.format(oDteFechaDesembolso));

            CLv0Financiero oCLFinanciero = new CLv0Financiero();
            Date oDteFechaInicioPago = oCLFinanciero.fechaInicioPagoCuotaFija(oDteFechaDesembolso, 30, 2);

            System.out.println("Fecha Inicio Pago : " + oFormatoFecha.format(oDteFechaInicioPago));

            List<CEv0CronogramaCuotaFija> oLstCronograma;
            oLstCronograma = oCLFinanciero.factoresCuotaFijav0(25, oDteFechaDesembolso, oDteFechaInicioPago, 30, 2, 24, 360);

            System.out.println(oLstCronograma);
            for (CEv0CronogramaCuotaFija oCEFactoresCuotaFija : oLstCronograma) {
                System.out.println(oCEFactoresCuotaFija.getmNumeroCuota() + "  " + 
                                              oFormatoFecha.format(oCEFactoresCuotaFija.getmFechaVencimiento()) + "  " +
                                              oCEFactoresCuotaFija.getmNumeroDias() + "   " + 
                                              oCEFactoresCuotaFija.getmAcumuladoDias() + "   " +
                                              oCEFactoresCuotaFija.getmFactorInversa() + "   " + 
                                              oCEFactoresCuotaFija.getmNumeroMesesPago() + "    " +
                                              oCEFactoresCuotaFija.getmFactorDoble()
                        );

            }
  



        } catch (Exception ex) {
        }

    }
}