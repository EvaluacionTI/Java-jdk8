package aemsa.cap06.funcion.fecha;
/*
 * Validar para la evaluaci�n del d�a de facturaci�n elegido y la fecha de corte
 * a) La fecha de facturaci�n es igual a la fecha de proceso se debe ignorar el d�a de facturaci�n y pasar al siguiente
 * b) Si la fecha de corte del resultado de fecha de facturaci�n - 15 d�a resulta un mes inferior al proceso no se debe
 *    considerar y pasar al siguiente d�a de facturaci�n
 * c) Si la fecha de corte del resultado de fecha de facturaci�n - 15 d�a resulta un d�a inferior al proceso no se debe
 *    considerar y pasar al siguiente d�a de facturaci�n
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV02v01EvaluarDiaFacturacionVsDiaProcesoPreCuota {
    static final int DIA_FACTURACION = 15;

    public static void main(String[] args) {
		
        int iDiaFacturacionPreCuota[] = {2, 10, 15, 25};
        int iDia, iMes, iAaaa; // Dia, Mes y A�o de Facturaci�n
        int iDiaCorte, iMesCorte, iAaaaCorte; // Dia, Mes y A�o de Fecha de Corte
        int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y A�o de Desembolso

        // 1. Se dimensiona el arreglo en funci�n del tama�o del arreglo de los d�as de facturaci�n
        String sDiaFacturacion[][] = new String[iDiaFacturacionPreCuota.length+1][iDiaFacturacionPreCuota.length+1];;

        SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");

        Calendar oFechaCalendario = GregorianCalendar.getInstance();
        Calendar oFechaCorte = GregorianCalendar.getInstance();

        // Dia, Mes y A�o de Proceso o Desembolso

        System.out.println("Fecha Sistema : " + oFechaCalendario.getTime().toLocaleString());

        // Dia, Mes y A�o de Proceso o Desembolso
        iDiaDesembolso = 02;
        iMesDesembolso = 11;
        iAaaaDesembolso = 2016;
        oFechaCalendario.set(iAaaaDesembolso, iMesDesembolso, iDiaDesembolso);
        System.out.println("Fecha Desembolso : " + oFechaCalendario.getTime().toLocaleString());

        // Restando la fecha de facturaci�n y la fecha de corte
        for(int i=0;i<iDiaFacturacionPreCuota.length;i++){

                oFechaCalendario.set(iAaaaDesembolso, iMesDesembolso, iDiaFacturacionPreCuota[i]);
                iDiaCorte = iDiaFacturacionPreCuota[i]-DIA_FACTURACION;
                iMesCorte = oFechaCalendario.get(oFechaCalendario.MONTH);
                iAaaaCorte = oFechaCalendario.get(oFechaCalendario.YEAR);

                oFechaCorte.set(iAaaaCorte, iMesCorte,iDiaCorte);
                sDiaFacturacion[i][0] = oSDFormatoFecha.format(oFechaCalendario.getTime());
                sDiaFacturacion[i][1] = oSDFormatoFecha.format(oFechaCorte.getTime());

        }

        // Mostrando el resultado de la fecha de facturaci�n y fecha de corte
        System.out.println("Fecha Formateada: Facturaci�n y Corte");
        for(int i=0;i<iDiaFacturacionPreCuota.length;i++){
            System.out.println(sDiaFacturacion[i][0] + " |" + sDiaFacturacion[i][1]);
        }		
    }

}
