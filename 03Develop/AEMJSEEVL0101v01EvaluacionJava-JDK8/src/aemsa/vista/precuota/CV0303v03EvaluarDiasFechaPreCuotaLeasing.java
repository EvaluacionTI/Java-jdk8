/*
 * A continuación veremos cómo se puede usar la clase Calendar y GregorianCalendar para representar una fecha determinada y poder modificarla 
 * según el calendario gregoriano:.
 */
package aemsa.vista.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV0303v03EvaluarDiasFechaPreCuotaLeasing {
    static final int DIA_FACTURACION = 15;

    public static void main(String[] args) {
        int iDiaFacturacionPreCuota[] = {2, 10, 15, 20, 21, 23, 25};
        int iDia, iMes, iAaaa; // Dia, Mes y Año de Sistema
        int iDiaCorte, iMesCorte, iAaaaCorte; // Dia, Mes y Año de Fecha de Corte
        int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        long iNumeroMilisegundos = 0;
        int iNumeroDias = 0;
        int iNumeroVeces = 0;
        int iPosicion = 0;
        String sDiaFacturacion[][] = new String[20][3];
        
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
        iDiaPreCuota = 0;
        iMesPreCuota = 0;
        iAaaaPreCuota = 0;
        while (iNumeroVeces < 3){
            
            for(int i=0;i<iDiaFacturacionPreCuota.length;i++){

                // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
                oFechaFacturacionPreCuota.set(iAaaaDesembolso, iMesDesembolso,iDiaFacturacionPreCuota[i]);
                iDiaPreCuota = oFechaFacturacionPreCuota.get(Calendar.DATE);
                iMesPreCuota = oFechaFacturacionPreCuota.get(Calendar.MONTH);
                iAaaaPreCuota = oFechaFacturacionPreCuota.get(Calendar.YEAR);
                System.out.println("Fecha Facturación -->" + iNumeroVeces + " para " + oFechaFacturacionPreCuota.getTime().toLocaleString());

                // 3. Restando 15 días a la fecha de facturacion pre cuota = FECHA DE CORTE
                iDiaCorte = oFechaFacturacionPreCuota.get(Calendar.DATE)-DIA_FACTURACION;
                iMesCorte = oFechaFacturacionPreCuota.get(Calendar.MONTH);
                iAaaaCorte = oFechaFacturacionPreCuota.get(Calendar.YEAR);

                // 4. Asignando la fecha de corte
                oFechaCorte.set(iAaaaCorte, iMesCorte,iDiaCorte);
                System.out.println("Fecha Corte -->" + iNumeroVeces + " para " + oFechaCorte.getTime().toLocaleString());

                // 5. Restando la Fecha Facturación Pre Cuota - Fecha de Desembolso
                iNumeroMilisegundos = oFechaFacturacionPreCuota.getTimeInMillis() - oFechaCalendario.getTimeInMillis();
                iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));
                
                // 6. Almacenando la Fecha Facturación y Fecha Corte
                if (iNumeroDias > DIA_FACTURACION){
                    sDiaFacturacion[iPosicion][0] = oSDFormatoFecha.format(oFechaFacturacionPreCuota.getTime());
                    sDiaFacturacion[iPosicion][1] = oSDFormatoFecha.format(oFechaCorte.getTime());
                    sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                    iPosicion++;
                }
            }
            // 7. Evaluando el límite de meses, es decir mes de diciembre
            if (iMesPreCuota==11){ // Diciembre
                iMesDesembolso = 0; // Enero
                iAaaaDesembolso = iAaaaPreCuota + 1; // Siguiente Año 
            }else if(iDiaPreCuota == 25){
                iMesDesembolso = iMesPreCuota + 1; // Siguiente mes
            }

            System.out.println("Fecha Formateada: Facturación y Corte -->" + iDiaPreCuota);
            iNumeroVeces++;
            System.out.println("Veces -->" + iNumeroVeces);
        }
        // 8. Mostrando el resultado de la fecha de facturación y fecha de corte
        System.out.println("Fecha Formateada: Facturación y Corte");
        for (String[] sDiaFacturacion1 : sDiaFacturacion) {
            System.out.println(sDiaFacturacion1[0] + " | " + sDiaFacturacion1[1] + " | " + sDiaFacturacion1[2]);
        }
        
        
    }
}
