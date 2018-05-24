/*
 * A continuación veremos cómo se puede usar la clase Calendar y GregorianCalendar para representar una fecha determinada y poder modificarla 
 * según el calendario gregoriano:.
 */
package aemsa.vista.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV0303v01EvaluarDiaFechaFacturacionPreCuotaLeasing {
    static final int DIA_FACTURACION = 15;

    public static void main(String[] args) {
        int iDiaFacturacionPreCuota[] = {2, 10, 15, 20, 21, 23, 25};
        int iDia, iMes, iAaaa; // Dia, Mes y Año de Sistema
        int iDiaCorte, iMesCorte, iAaaaCorte; // Dia, Mes y Año de Fecha de Corte
        int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        int iNumeroVeces = 0;
        String sDiaFacturacion[][] = new String[10][10];
        
        SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        
        Calendar oFechaCalendario = GregorianCalendar.getInstance();
        Calendar oFechaFacturacionPreCuota = GregorianCalendar.getInstance();
        Calendar oFechaCorte = GregorianCalendar.getInstance();

        // Dia, Mes y Año del Sistema

        System.out.println("Fecha Sistema : " + oFechaCalendario.getTime().toLocaleString());

        // 1. Fecha (Dia, Mes y Año) de Desembolso
        iDiaDesembolso = 02;
        iMesDesembolso = 11;
        iAaaaDesembolso = 2016;
        oFechaCalendario.set(iAaaaDesembolso, iMesDesembolso, iDiaDesembolso);
        System.out.println("Fecha Desembolso : " + oFechaCalendario.getTime().toLocaleString());
        
        for(int i=0;i<iDiaFacturacionPreCuota.length;i++){

            // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
            oFechaFacturacionPreCuota.set(iAaaaDesembolso, iMesDesembolso,iDiaFacturacionPreCuota[i]);
            iDiaPreCuota = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.DATE);
            iMesPreCuota = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.MONTH);
            iAaaaPreCuota = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.YEAR);

            // 3. Determinar la fecha de corte
            iDiaCorte = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.DATE)-DIA_FACTURACION;
            iMesCorte = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.MONTH);
            iAaaaCorte = oFechaFacturacionPreCuota.get(oFechaFacturacionPreCuota.YEAR);

            // 4. Asignando la fecha de corte
            oFechaCorte.set(iAaaaCorte, iMesCorte,iDiaCorte);

            sDiaFacturacion[i][0] = oSDFormatoFecha.format(oFechaFacturacionPreCuota.getTime());
            sDiaFacturacion[i][1] = oSDFormatoFecha.format(oFechaCorte.getTime());

        }

        // Mostrando el resultado de la fecha de facturación y fecha de corte
        System.out.println("Fecha Formateada: Facturación y Corte");
        for (String[] sDiaFacturacion1 : sDiaFacturacion) {
            System.out.println(sDiaFacturacion1[0] + " |" + sDiaFacturacion1[1]);
        }	        
    }
    
}
