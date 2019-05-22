
package pe.aemsa.cap01.introduccion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CV06v01FechaHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     GregorianCalendar fh1 = new GregorianCalendar();
     
    System.out.println("Año: " + fh1.get(Calendar.YEAR) + 
                       " Hora: " + fh1.get(Calendar.HOUR_OF_DAY));
    
    GregorianCalendar fh2 = new GregorianCalendar(2001, 1, 21);
    System.out.println("Año: " + fh2.get(Calendar.YEAR) + 
                       " Hora: " + fh2.get(Calendar.HOUR_OF_DAY));
    
    GregorianCalendar fh3 = new GregorianCalendar(2001, 1, 21, 12, 30, 15);
    System.out.println("Año: " + fh3.get(Calendar.YEAR) + 
                       " Hora: " + fh3.get(Calendar.HOUR_OF_DAY));
    
    GregorianCalendar fh = new GregorianCalendar();
    
    fh.set(Calendar.DAY_OF_MONTH, 21);
    fh.set(Calendar.MONTH, 1);
    fh.set(Calendar.YEAR, 2001);
    
    System.out.println("Año: " + fh.get(Calendar.YEAR));
    
    Date dfh = new Date();
    System.out.println(dfh);

    }

}
