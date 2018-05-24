/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap06.funcion.fecha;

import java.util.Calendar;

public class CV01v01FechaCalendar {

    public static void main(String[] args) {  
        Calendar oFechaCalendario = Calendar.getInstance();

//  Número de 
        System.out.println("Tipo de calendario    --> " + oFechaCalendario.getCalendarType());
        System.out.println("Nombre de clase       --> " + oFechaCalendario.getClass());
        // Inicia en DOMINGO que es 1, LUNES es 2 y MARTES es 3
        System.out.println("Primer día de semana  --> " + oFechaCalendario.getFirstDayOfWeek());
        System.out.println("Mínimo día de semana  --> " + oFechaCalendario.getMinimalDaysInFirstWeek());
        System.out.println("Fecha y hora          --> " + oFechaCalendario.getTime());
        System.out.println("Fecha en milisegundos --> " + oFechaCalendario.getTimeInMillis());
        System.out.println("Zona de tiempo        --> " + oFechaCalendario.getTimeZone());
        System.out.println("Año de la semana      --> " + oFechaCalendario.getWeekYear());
        System.out.println("Semana del año        --> " + oFechaCalendario.getWeeksInWeekYear());
        
//  Fecha del sistema separado por día, mes y año
        System.out.println("\n");
        System.out.println(oFechaCalendario.get(Calendar.DATE));
        System.out.println(oFechaCalendario.get(Calendar.MONTH));
        System.out.println(oFechaCalendario.get(Calendar.YEAR));
    }  
}
