/*
 * Fecha            :   29/03/2017
 * Descripción      :   Utilidad para el formato de fechas
 * 
 *                      Validar el formato de fechas
 */
package aemsa.utilidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class CUFormatoFecha {
    SimpleDateFormat moFormatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            
    private boolean isFechaValida(String sFecha) {
        try {
            moFormatoFecha.setLenient(false);
            moFormatoFecha.parse(sFecha);
        } catch (ParseException exPE) {
            return false;
        }
        return true;
    }
    
}
