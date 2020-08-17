package pe.etg.bbva.evalua.swing.view.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CV0101v01MostrarFecha {

    public static void main(String[] args) {
        SimpleDateFormat formatoFecha;
        Date fechaActual = new Date();

        System.out.println("REPORTE DE FECHAS FORMATEADAS");
        formatoFecha = new SimpleDateFormat();
        System.out.println("Formato según configuración regional:\t" + formatoFecha.format(fechaActual));

        formatoFecha = new SimpleDateFormat("EEEE dd MMMM yyyy");
        System.out.println("Formato EEEE dd MMMM yyyy:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd-MMMM-yyyy HH:mm:ss");
        System.out.println("Formato dd-MMMM-yyyy HH:mm:ss:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println("Formato dd-MMM-yyyy HH:mm:ss:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd-MM-yy HH:mm:ss");
        System.out.println("Formato dd-MM-yy HH:mm:ss:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd/MM/yy HH:mm:ss");
        System.out.println("Formato dd/MM/yy HH:mm:ss:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd-MM-yy hh:mm:ss a");
        System.out.println("Formato dd-MM-yy hh:mm:ss a:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("dd-MM-yy HH:mm:ss:SS");
        System.out.println("Formato dd-MM-yy HH:mm:ss:SS:\t\t" + formatoFecha.format(fechaActual));

        formatoFecha.applyPattern("YYYY/MMM EEEE dd hh:mm a (D");
        System.out.println("Formato YYYY/MMM EEEE dd hh:mm a D:\t" + formatoFecha.format(fechaActual) + " días del año)");
    }

}
