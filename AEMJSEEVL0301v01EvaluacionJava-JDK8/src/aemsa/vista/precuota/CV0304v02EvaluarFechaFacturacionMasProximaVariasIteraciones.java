/*
 * Fecha         :   28/03/2017
 * Problema      :   Calcular la fecha del primer vencimiento después del último desembolso.
                     Como mímimo debe estar lo más cercano a los 30 días
                     La fecha debe ser válida en el rango de los días de cronograma
                     2, 10, 15, 20, 21, 23, 25
 * Resultado     :   Mostrar la fecha del primver vencimiento
                    
 * Evaluación    :   Se puede ampliar para mas iteraciones si se llega al límite
 */
package aemsa.vista.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CV0304v02EvaluarFechaFacturacionMasProximaVariasIteraciones {
    static final int DIA_FACTURACION = 30;
    static int[] aiDiaCronograma = {2, 10, 15, 20, 21, 23, 25};
    static Calendar moFechaFacturacion = Calendar.getInstance();
    
    public static void main(String[] args) {
        int iDiaCronograma = 26;
        int iMesCronograma = 10;
        int iAaaaCronograma = 2017;
        
        moFechaFacturacion.set(iAaaaCronograma, iMesCronograma, iDiaCronograma);
        SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        
        System.out.println(moFechaFacturacion.getTime());
        System.out.println(oSDFormatoFecha.format(moFechaFacturacion.getTime()));
        facturacionMasProxima(aiDiaCronograma, iAaaaCronograma, iMesCronograma, iDiaCronograma);
    }
    
    /*
        Descripción     :   Buscar la primera ocurrencia de la fecha de facturación
    */
    static void facturacionMasProxima(int paiDiaCronograma[], int piAaaaDesembolso, int piMesDesembolso, int piDiaDesembolso){
        int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        int iTopeIteracion = 1;
        int iContadorIteracion = 1;
        
        iAaaaPreCuota = piAaaaDesembolso;
        iMesPreCuota = piMesDesembolso;
        iDiaPreCuota = piDiaDesembolso;

        if (iMesPreCuota == 11){
            iMesPreCuota = 0; // Enero
            iAaaaPreCuota = iAaaaPreCuota + 1; // Siguiente Año
        }else if (iDiaPreCuota >= paiDiaCronograma[paiDiaCronograma.length-1]){ // En el tope de los días de Cronograma
            iMesPreCuota += 1; // Siguiente mes
            iTopeIteracion = 2; // Cuando llega al límite del cronograma se genera la siguiente iteración
        }
        
        while (iContadorIteracion <= iTopeIteracion){
            for(int i=0;i<paiDiaCronograma.length;i++){

                // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
                moFechaFacturacion.set(iAaaaPreCuota, iMesPreCuota, paiDiaCronograma[i]);
                iDiaPreCuota = moFechaFacturacion.get(Calendar.DATE);
                iMesPreCuota = moFechaFacturacion.get(Calendar.MONTH);
                iAaaaPreCuota = moFechaFacturacion.get(Calendar.YEAR);

                System.out.println("Fecha Facturación próxima-->" + moFechaFacturacion.getTime().toLocaleString());            
            }
            if (iMesPreCuota == 11){
                iMesPreCuota = 0; // Enero
                iAaaaPreCuota = iAaaaPreCuota + 1; // Siguiente Año
            }else{
                iMesPreCuota += 1; // Siguiente mes
            }
            iContadorIteracion += 1;
        }
    }
}
