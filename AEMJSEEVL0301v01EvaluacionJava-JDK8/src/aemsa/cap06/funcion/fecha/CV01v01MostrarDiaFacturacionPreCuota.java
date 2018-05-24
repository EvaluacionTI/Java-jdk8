package aemsa.cap06.funcion.fecha;
/*        
 * Mostrar el d�a de la facturaci�n formateando con el d�a, mes y a�o  
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CV01v01MostrarDiaFacturacionPreCuota {

	public static void main(String[] args) {
		int iDiaFacturacionPreCuota[] = {2, 10, 15, 25};
		int iDia, iMes, iAaaa;
		
		SimpleDateFormat oSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
		
		Calendar oFechaCalendario = GregorianCalendar.getInstance();
		iDia = oFechaCalendario.get(oFechaCalendario.DATE);
		iMes = oFechaCalendario.get(oFechaCalendario.MONTH);
		iAaaa = oFechaCalendario.get(oFechaCalendario.YEAR);
		
		System.out.println("Fecha Sistema : " + oFechaCalendario.getTime().toLocaleString());
		
		for(int i=0;i<iDiaFacturacionPreCuota.length;i++){
			
			oFechaCalendario.set(iAaaa, iMes, iDiaFacturacionPreCuota[i]);
			System.out.println(iDiaFacturacionPreCuota[i] + "\n");
	        System.out.println("Fecha Formateada: "+oSDFormatoFecha.format(oFechaCalendario.getTime()));
		}
	}

}
