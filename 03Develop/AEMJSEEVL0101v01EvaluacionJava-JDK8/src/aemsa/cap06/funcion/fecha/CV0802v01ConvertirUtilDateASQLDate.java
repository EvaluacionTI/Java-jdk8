package aemsa.cap06.funcion.fecha;

import java.util.Date;

public class CV0802v01ConvertirUtilDateASQLDate {

    public static void main(String[] args) {
        Date oFechaUtil = new Date();
        java.sql.Date oFechaSql = new java.sql.Date(oFechaUtil.getTime());
        
        System.out.println("utilDate:" + oFechaUtil);
        System.out.println("sqlDate:" + oFechaSql);
    }
}
