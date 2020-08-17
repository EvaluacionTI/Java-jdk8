/*
 * A continuación veremos cómo se puede usar la clase Calendar y GregorianCalendar para representar una fecha determinada y poder modificarla 
 * según el calendario gregoriano:.
 */
package aemsa.cap06.funcion.fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV01v02FuncionCalendarGregorianCalendar {

    public static void main(String[] args) {
        Calendar oFechaCalendario = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+oFechaCalendario.getTime());
        System.out.println("Fecha actual: "+oFechaCalendario.getTime().toLocaleString());
        System.out.println("\n");
        
        oFechaCalendario.set(2000, Calendar.AUGUST, 31);
        System.out.println("Fecha 31 Agosto 2000: "+oFechaCalendario.getTime());
        System.out.println("Fecha 31 Agosto 2000: "+oFechaCalendario.getTime().toLocaleString());
        System.out.println("\n");
        
        System.out.println("como podremos observar no nos imprimirá la fecha deseada, hemos escrito una incoherencia");
        oFechaCalendario.set(Calendar.MONTH, 13);
        System.out.println("Fecha 13 meses más: " + 13 + "mes " + Calendar.MONTH + "salida -> "+ oFechaCalendario.getTime().toLocaleString());
        System.out.println("\n");
        
        /* como podremos observar no nos imprimirá la fecha deseada, hemos escrito una incoherencia*/
        oFechaCalendario.set(2000, Calendar.AUGUST, 31);
        System.out.println("Fecha 13 meses más: "+ 31 + "mes " + Calendar.AUGUST + "año " + 2000 + "salida -> "+ oFechaCalendario.getTime().toLocaleString());
        System.out.println("\n");
        
        System.out.println("volvemos a la fecha anterior usando set y empleamos el método add");
        /* volvemos a la fecha anterior usando set y empleamos el método add */
        oFechaCalendario.add(Calendar.MONTH, 13); /* Añadir 13 meses */
        System.out.println("Fecha 13 meses más: "+oFechaCalendario.getTime().toLocaleString()); /*ahora sí es correcto*/
        System.out.println("\n");
        
        oFechaCalendario.roll(Calendar.HOUR, 25); /* Añadir 25 horas */
        System.out.println("Fecha 25 horas más: "+oFechaCalendario.getTime().toLocaleString());    /*uso de roll*/
        System.out.println("\n");
        
        SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        System.out.println("Fecha Formateada: "+oSDFormatoFecha.format(oFechaCalendario.getTime()));
        System.out.println("\n");
    }
    
}
