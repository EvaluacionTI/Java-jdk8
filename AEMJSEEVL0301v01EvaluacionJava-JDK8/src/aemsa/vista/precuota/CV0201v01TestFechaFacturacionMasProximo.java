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

import aemsa.logica.precuota.CLPreCuota;

public class CV0201v01TestFechaFacturacionMasProximo {
    static int[] aiDiaCronograma = {2, 10, 15, 20, 21, 23, 25};
    static Calendar moFechaDesembolso = Calendar.getInstance();
    static SimpleDateFormat moSDFormatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    
    
    public static void main(String[] args) {
        int iDiaCronograma = 31;
        int iMesCronograma = 12;
        int iAaaaCronograma = 2017;
        
        CLPreCuota oCLFacturacion = new CLPreCuota();
        
        moFechaDesembolso.set(iAaaaCronograma, iMesCronograma - 1, iDiaCronograma);
        
        System.out.println(moFechaDesembolso.getTime());
        System.out.println("Fecha Desembolso " + moSDFormatoFecha.format(moFechaDesembolso.getTime())+"\n");
        System.out.println(oCLFacturacion.facturacionMasProxima(aiDiaCronograma, iAaaaCronograma, iMesCronograma, iDiaCronograma));
        System.out.println(oCLFacturacion.facturacionMasProxima(aiDiaCronograma, moFechaDesembolso));
        
    }
    
 }
