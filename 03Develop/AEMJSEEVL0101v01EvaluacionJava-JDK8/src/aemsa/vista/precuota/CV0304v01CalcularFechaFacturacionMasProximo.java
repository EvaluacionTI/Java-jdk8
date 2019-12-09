/*
 * Fecha         :   28/03/2017
 * Problema      :   Calcular la fecha del primer vencimiento después del último desembolso.
                     Como mímimo debe estar lo más cercano a los 30 días
                     La fecha debe ser válida en el rango de los días de cronograma
                     2, 10, 15, 20, 21, 23, 25
 * Resultado     :   Mostrar la fecha del primver vencimiento
                    
 * Evaluación    :   Válido para una sola iteración
 */
package aemsa.vista.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CV0304v01CalcularFechaFacturacionMasProximo {
    static int[] aiDiaCronograma = {2, 10, 15, 20, 21, 23, 25};
    static Calendar moFechaDesembolso = Calendar.getInstance();
    static Calendar moFechaFacturacion = Calendar.getInstance();
    static SimpleDateFormat moSDFormatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    
    public static void main(String[] args) {
        int iDiaCronograma = 31;
        int iMesCronograma = 11;
        int iAaaaCronograma = 2017;
        
        moFechaDesembolso.set(iAaaaCronograma, iMesCronograma, iDiaCronograma);
        
        
        System.out.println(moFechaDesembolso.getTime());
        System.out.println(moSDFormatoFecha.format(moFechaDesembolso.getTime()));
        facturacionMasProxima(aiDiaCronograma, iAaaaCronograma, iMesCronograma, iDiaCronograma);
    }
    
    /*
        Descripción         :   Buscar la primera ocurrencia y tomar la fecha de facturación
        paiDiaFacturacion[] :   Arreglo de los días de facturación definidos
        piAaaaDesembolso    :   Año del desembolso
        piMesDesembolso     :   Mes del desembolso (0=Enero, 1=Febrero, etc).
        piDiaDesembolso     :   Día del desembolso
    */
    static void facturacionMasProxima(int paiDiaFacturacion[], int piAaaaDesembolso, int piMesDesembolso, int piDiaDesembolso){
        long iNumeroMilisegundos = 0;
        int iNumeroDias = 0;
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        int iPosicion = 0; // Ubicación de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][5]; // Arreglo para almacenar la fecha facturación, fecha corte y numero de dias.
        
        iAaaaPreCuota = piAaaaDesembolso;
        iMesPreCuota = piMesDesembolso;
        iDiaPreCuota = piDiaDesembolso;

        // 1. Validar el límite del mes - DICIEMBRE y el límite del tope de los dias de facturación
        if (iMesPreCuota == 11){
            iMesPreCuota = 0; // Enero
            iAaaaPreCuota = iAaaaPreCuota + 1; // Siguiente Año
        }else if (iDiaPreCuota >= paiDiaFacturacion[paiDiaFacturacion.length-1]){ // En el tope de los días de facturación
            iMesPreCuota += 1; // Siguiente mes
        }
        
        for(int i=0;i<paiDiaFacturacion.length;i++){

            // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
            moFechaFacturacion.set(iAaaaPreCuota, iMesPreCuota, paiDiaFacturacion[i]);
            iDiaPreCuota = moFechaFacturacion.get(Calendar.DATE);
            iMesPreCuota = moFechaFacturacion.get(Calendar.MONTH);
            iAaaaPreCuota = moFechaFacturacion.get(Calendar.YEAR);

            // 3. Restando la Fecha Facturación - Fecha de Desembolso
            iNumeroMilisegundos = moFechaFacturacion.getTimeInMillis() - moFechaDesembolso.getTimeInMillis();
            iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));
            //
            if (iNumeroDias > 0){
                System.out.println("Fecha Facturación próxima-->" + moFechaFacturacion.getTime().toLocaleString() + "|" + moFechaDesembolso.getTime().toLocaleString() + "|" + (iNumeroDias));
                sDiaFacturacion[iPosicion][0] = moSDFormatoFecha.format(moFechaFacturacion.getTime());
                sDiaFacturacion[iPosicion][1] = moSDFormatoFecha.format(moFechaDesembolso.getTime());
                sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                sDiaFacturacion[iPosicion][3] = String.valueOf(moFechaFacturacion.getTimeInMillis());
                sDiaFacturacion[iPosicion][4] = String.valueOf(moFechaDesembolso.getTimeInMillis());
                iPosicion++;
            }
        }
        // 4. Primera ocurrencia de Fecha de Facturación
        System.out.println("Fecha de facturación    " + sDiaFacturacion[0][0]);
    }
}
