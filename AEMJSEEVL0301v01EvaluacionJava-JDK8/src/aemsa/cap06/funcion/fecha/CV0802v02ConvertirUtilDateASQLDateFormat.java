package aemsa.cap06.funcion.fecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CV0802v02ConvertirUtilDateASQLDateFormat {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        
        Date oFechaUtil = new Date();
        java.sql.Date oFechaSql = new java.sql.Date(oFechaUtil.getTime());
        
        System.out.println("Usando formato de fecha : " + df.format(oFechaUtil));
                
        System.out.println("utilDate:" + oFechaUtil);
        System.out.println("sqlDate:" + oFechaSql);
    }
}
