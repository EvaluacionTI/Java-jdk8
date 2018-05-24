/*
 * A continuación veremos cómo se puede usar la clase Calendar y GregorianCalendar para representar una fecha determinada y poder modificarla 
 * según el calendario gregoriano:.
 */
package aemsa.vista.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV0303v04CalcularFechaCorteDiaFacturacion {
    static final int DIA_FACTURACION = 15;

    public static void main(String[] args) {
        int iDiaFacturacionPreCuota[] = {2, 10, 15, 25};
        int iDia, iMes, iAaaa; // Dia, Mes y Año de Sistema
        int iDiaCorte, iMesCorte, iAaaaCorte; // Dia, Mes y Año de Fecha de Corte
        int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        long iNumeroMilisegundos = 0; // Numero de milisegundos entre la fecha de facturación y la fecha de desembolso
        int iNumeroDias = 0; // Número de días entre la fecha de facturación y la fecha de desembolso
        int iNumeroVeces = 0; // Contador de veces a evaluar el ciclo de facturación
        int iPosicion = 0; // Ubicación de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][5]; // Arreglo para almacenar la fecha facturación, fecha corte y numero de dias.
        
        SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        
        Calendar oFechaCalendario = GregorianCalendar.getInstance();
        Calendar oFechaFacturacionPreCuota = GregorianCalendar.getInstance();
        Calendar oFechaCorte = GregorianCalendar.getInstance();

        // Dia, Mes y Año del Sistema

        System.out.println("Fecha Sistema : " + oFechaCalendario.getTime().toLocaleString());
        
        // 1. Fecha (Dia, Mes y Año) de Desembolso
        iDiaDesembolso = 16;
        iMesDesembolso = 11; // Enero = 0, Febrero = 1, Marzo = 2
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
                    System.out.println("Milisegundos -->" + oFechaFacturacionPreCuota.getTimeInMillis() + "-" + oFechaCalendario.getTimeInMillis());
                    sDiaFacturacion[iPosicion][0] = oSDFormatoFecha.format(oFechaFacturacionPreCuota.getTime());
                    sDiaFacturacion[iPosicion][1] = oSDFormatoFecha.format(oFechaCorte.getTime());
                    sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                    sDiaFacturacion[iPosicion][3] = String.valueOf(oFechaFacturacionPreCuota.getTimeInMillis());
                    sDiaFacturacion[iPosicion][4] = String.valueOf(oFechaCalendario.getTimeInMillis());
                    iPosicion++;
                }
            }

            // 7. Evaluando el límite de meses, es decir mes de diciembre
            if (iMesPreCuota==11){ // Diciembre
                iMesDesembolso = 0; // Enero
                iAaaaDesembolso = iAaaaPreCuota + 1; // Siguiente Año 
            }else if(iDiaPreCuota == iDiaFacturacionPreCuota[iDiaFacturacionPreCuota.length-1]){ // Limite del día de facturación
                iMesDesembolso = iMesPreCuota + 1; // Siguiente mes
            }

            System.out.println("Fecha Formateada: Facturación y Corte -->" + iDiaPreCuota);
            iNumeroVeces++;
            System.out.println("Veces -->" + iNumeroVeces);
        }

        // 8. Mostrando el resultado de la fecha de facturación y fecha de corte
        System.out.println("Fecha Formateada: Facturación y Corte");
        for (String[] sDiaFacturacion1 : sDiaFacturacion) {
                System.out.println(sDiaFacturacion1[0] + " | " + sDiaFacturacion1[1] + " | " + sDiaFacturacion1[2] + " | " + sDiaFacturacion1[3] + " | " + sDiaFacturacion1[4]);
        }
        
        // 9. Mostrar la primera fecha de facturación cuya fecha de corte se encuentre más cercano al primer desembolso.
        System.out.println("Fecha de facturación    " + sDiaFacturacion[0][0]);
        System.out.println("Fecha de corte          " + sDiaFacturacion[0][1]);
        System.out.println("Número Días             " + sDiaFacturacion[0][2]);
        System.out.println("Milisegundos Factución  " + sDiaFacturacion[0][3]);
        System.out.println("Milisegundos Desembolso " + sDiaFacturacion[0][4]);
        
    }
}
