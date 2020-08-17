
package aemsa.cap06.funcion.fecha.utilidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CLConversionFecha {
    private Date oFechaConversion;
    
    public Date convertirCadenaAFechaYymmdd(String psFecha) throws ParseException{
        SimpleDateFormat oFormatoFecha = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        oFechaConversion = oFormatoFecha.parse(psFecha);
        return oFechaConversion;
    }
    
    public java.sql.Date convertirFechaUtilDateASqlDate(Date podFecha){
        java.sql.Date oFechaSql = new java.sql.Date(podFecha.getTime());
        return oFechaSql;
    }
}
