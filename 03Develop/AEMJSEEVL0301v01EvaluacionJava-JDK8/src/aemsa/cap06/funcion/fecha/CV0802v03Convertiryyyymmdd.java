
package aemsa.cap06.funcion.fecha;

import aemsa.cap06.funcion.fecha.utilidad.CLConversionFecha;
import java.text.ParseException;
import java.util.Date;


public class CV0802v03Convertiryyyymmdd {

    public static void main(String[] args) throws ParseException {
        CLConversionFecha oConvertirFecha = new CLConversionFecha();
        
        System.out.println( oConvertirFecha.convertirCadenaAFechaYymmdd("2018-11-10 12:52:00"));
        
        CLConversionFecha oConversion = new CLConversionFecha();
        Date oFecha = oConversion.convertirCadenaAFechaYymmdd("2018-11-15 10:14:45 PM");
        System.out.println( "Fecha java.util.Date : " + oFecha);
        
        java.sql.Date oFechaSql = oConversion.convertirFechaUtilDateASqlDate(oFecha);
        System.out.println( "Fecha java.sql.Date : " + oFechaSql);
    }
    
}
