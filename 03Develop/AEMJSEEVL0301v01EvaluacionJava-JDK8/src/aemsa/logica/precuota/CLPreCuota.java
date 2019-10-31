/*
 * Fecha        : 27/03/2017
 * Descripción  : Clase para el manejo de precuota de operaciones Leasing en función de los desembolsos
 * 
*/
package aemsa.logica.precuota;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import aemsa.utilidad.CUManejoFecha;

public class CLPreCuota {
    static final int DIA_FACTURACION_PRECUOTA = 15;
    static final int DIA_FACTURACION_CRONOGRAMA = 15;

    int miDiaPreCuota, miMesPreCuota, miAaaaPreCuota; // Dia, Mes y A�o de Pre Cuota
    int miDiaCorte, miMesCorte, miAaaaCorte; // Dia, Mes y A�o de Fecha de Corte

    Calendar moFechaDesembolso;
    Calendar moFechaFacturacion = GregorianCalendar.getInstance();
    Calendar moFechaCorte = GregorianCalendar.getInstance();
    SimpleDateFormat moSDFormatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");

    CUManejoFecha moCUManejoFechas = new CUManejoFecha();    
    
    public CLPreCuota(){
    	this.miDiaPreCuota = 0;
    	this.miMesPreCuota = 0;
    	this.miAaaaPreCuota = 0;

    	this.miDiaCorte = 0;
    	this.miMesCorte = 0;
    	this.miAaaaCorte = 0;
    	this.moFechaDesembolso = GregorianCalendar.getInstance();
    }

    /*
	 * Descripción      : Calcular el día de facturación Pre Cuota, Fecha de Facturación y Fecha de Corte.
	 * 
	 * piTipo           : 1 para retornar día de facturación, 2 para Fecha Facturación y 3 Fecha Corte
                              4 días respecto a la fecha de facturación y fecha del primer desembolso
	 * piDiaDesembolso  : 1 a 31 días
	 * piMesDesembolso  : 0 Enero, 1 Febrero hasta 11 Marzo según clase Calendar
	 * piAaaaDesembolso : Año a cuatro dígitos 	
	 * 
	 */
    public String fechaFacturacionPreCuota(int piTipo, int piDiaDesembolso, int piMesDesembolso, int piAaaaDesembolso){
	int iDiaFacturacionPreCuota[] = {2, 10, 15, 25};

        long iNumeroMilisegundos = 0; // Numero de milisegundos entre la fecha de facturaci�n y la fecha de desembolso
        int iNumeroDias = 0; // N�mero de d�as entre la fecha de facturaci�n y la fecha de desembolso
        int iNumeroVeces = 0; // Contador de veces a evaluar el ciclo de facturaci�n
        int iPosicion = 0; // Ubicaci�n de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][5]; // Arreglo para almacenar la fecha facturaci�n, fecha corte y numero de dias.
        String sValorFechaFacturacion = "";
        
        piMesDesembolso -= 1; // Numero tipo Calendar
        
        // 1. Fecha de desembolso tipo fecha
	moFechaDesembolso.set(piAaaaDesembolso, piMesDesembolso, piDiaDesembolso);
//		System.out.println("Fecha Desembolso : " + moFechaDesembolso.getTime().toLocaleString());
	miDiaPreCuota = 0;
        miMesPreCuota = 0;
        miAaaaPreCuota = 0;

        while (iNumeroVeces < 3){
            for(int i=0;i<iDiaFacturacionPreCuota.length;i++){
                // 2. Fecha de Facturaci�n en funci�n de los dias de facturaci�n
                moFechaFacturacion.set(piAaaaDesembolso, piMesDesembolso, iDiaFacturacionPreCuota[i]);
                miDiaPreCuota = moFechaFacturacion.get(Calendar.DATE);
                miMesPreCuota = moFechaFacturacion.get(Calendar.MONTH);
                miAaaaPreCuota = moFechaFacturacion.get(Calendar.YEAR);

//               System.out.println("Fecha Facturaci�n -->" + moFechaFacturacion.getTime().toLocaleString());

            // 3. Restando 15 d�as a la fecha de facturacion pre cuota = FECHA DE CORTE
                miDiaCorte = moFechaFacturacion.get(Calendar.DATE) - DIA_FACTURACION_PRECUOTA;
                miMesCorte = moFechaFacturacion.get(Calendar.MONTH);
                miAaaaCorte = moFechaFacturacion.get(Calendar.YEAR);

            // 4. Asignando la fecha de corte
                moFechaCorte.set(miAaaaCorte, miMesCorte, miDiaCorte);
//                System.out.println("Fecha Corte       -->" + moFechaCorte.getTime().toLocaleString());

            // 5. Restando la Fecha Facturaci�n Pre Cuota - Fecha de Desembolso
                iNumeroMilisegundos = moFechaFacturacion.getTimeInMillis() - moFechaDesembolso.getTimeInMillis();
                iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));

            // 6. Almacenando la Fecha Facturaci�n y Fecha Corte
                if (iNumeroDias > DIA_FACTURACION_PRECUOTA){
                    System.out.println("Milisegundos -->" + moFechaFacturacion.getTimeInMillis() + "-" + moFechaDesembolso.getTimeInMillis());
                    sDiaFacturacion[iPosicion][0] = moSDFormatoFecha.format(moFechaFacturacion.getTime());
                    sDiaFacturacion[iPosicion][1] = moSDFormatoFecha.format(moFechaCorte.getTime());
                    sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                    sDiaFacturacion[iPosicion][3] = String.valueOf(moFechaFacturacion.getTimeInMillis());
                    sDiaFacturacion[iPosicion][4] = String.valueOf(moFechaDesembolso.getTimeInMillis());
                    iPosicion++;
                } // if

            } // for
            // 7. Evaluando el l�mite de meses, es decir mes de diciembre
            if (miMesPreCuota==11){ // Diciembre
                piMesDesembolso = 0; // Enero
                piAaaaDesembolso = miAaaaPreCuota + 1; // Siguiente A�o 
            }else if(miDiaPreCuota == iDiaFacturacionPreCuota[iDiaFacturacionPreCuota.length-1]){ // Limite del d�a de facturaci�n
                piMesDesembolso = miMesPreCuota + 1; // Siguiente mes
            }
            
            iNumeroVeces++;

        } // while

        // 8. Mostrando el resultado de la fecha de facturaci�n y fecha de corte
//        System.out.println("Fecha Formateada: Facturaci�n y Corte");
//        for (String[] sDiaFacturacion1 : sDiaFacturacion) {
//                System.out.println(sDiaFacturacion1[0] + " | " + sDiaFacturacion1[1] + " | " + sDiaFacturacion1[2]);
//        }        

        // 9. Retorna la fecha facturaci�n
        if (piTipo == 1){
        	sValorFechaFacturacion = sDiaFacturacion[0][0].substring(0, 2);
        }else if (piTipo == 2){
        	sValorFechaFacturacion = sDiaFacturacion[0][0];
        }else if (piTipo == 3){
        	sValorFechaFacturacion = sDiaFacturacion[0][1];
        }else if (piTipo == 4){
        	sValorFechaFacturacion = sDiaFacturacion[0][2];
        }
	return sValorFechaFacturacion;
    }	

	
	/*
	 * Calcular el d�a de Cronograma Pago, Fecha de Facturaci�n Cronograma y Fecha de Corte.
	 * 	
	 */
	
    public String diaCronograma(int piTipo, int piDiaDesembolso, int piMesDesembolso, int piAaaaDesembolso){
	int iDiaFacturacionCronograma[] = {2, 10, 15, 20, 21, 23, 25};

        long iNumeroMilisegundos = 0; // Numero de milisegundos entre la fecha de facturaci�n y la fecha de desembolso
        int iNumeroDias = 0; // N�mero de d�as entre la fecha de facturaci�n y la fecha de desembolso
        int iNumeroVeces = 0; // Contador de veces a evaluar el ciclo de facturaci�n
        int iPosicion = 0; // Ubicaci�n de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][3]; // Arreglo para almacenar la fecha facturaci�n, fecha corte y numero de dias.
        String sValorFechaFacturacion = "";
        
        piMesDesembolso -= 1; // Numero tipo Calendar
        
        // 1. Fecha de desembolso tipo fecha
	moFechaDesembolso.set(piAaaaDesembolso, piMesDesembolso, piDiaDesembolso);
//		System.out.println("Fecha Desembolso : " + moFechaDesembolso.getTime().toLocaleString());
	miDiaPreCuota = 0;
        miMesPreCuota = 0;
        miAaaaPreCuota = 0;

        while (iNumeroVeces < 3){
            for(int i=0;i<iDiaFacturacionCronograma.length;i++){
        	// 2. Fecha de Facturaci�n en funci�n de los dias de facturaci�n
        	moFechaFacturacion.set(piAaaaDesembolso, piMesDesembolso, iDiaFacturacionCronograma[i]);
                miDiaPreCuota = moFechaFacturacion.get(Calendar.DATE);
                miMesPreCuota = moFechaFacturacion.get(Calendar.MONTH);
                miAaaaPreCuota = moFechaFacturacion.get(Calendar.YEAR);

//               System.out.println("Fecha Facturaci�n -->" + moFechaFacturacion.getTime().toLocaleString());

                // 3. Restando 15 d�as a la fecha de facturacion pre cuota = FECHA DE CORTE
                miDiaCorte = moFechaFacturacion.get(Calendar.DATE) - DIA_FACTURACION_PRECUOTA;
                miMesCorte = moFechaFacturacion.get(Calendar.MONTH);
                miAaaaCorte = moFechaFacturacion.get(Calendar.YEAR);

                // 4. Asignando la fecha de corte
                moFechaCorte.set(miAaaaCorte, miMesCorte, miDiaCorte);
//                System.out.println("Fecha Corte       -->" + moFechaCorte.getTime().toLocaleString());
                
                // 5. Restando la Fecha Facturaci�n Pre Cuota - Fecha de Desembolso
                iNumeroMilisegundos = moFechaFacturacion.getTimeInMillis() - moFechaDesembolso.getTimeInMillis();
                System.out.println("Milisegundos -->" + moFechaFacturacion.getTimeInMillis() + "-" + moFechaDesembolso.getTimeInMillis());                
                iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));
                
                // 6. Almacenando la Fecha Facturaci�n y Fecha Corte
                if (iNumeroDias > DIA_FACTURACION_PRECUOTA){
                	sDiaFacturacion[iPosicion][0] = moSDFormatoFecha.format(moFechaFacturacion.getTime());
                    sDiaFacturacion[iPosicion][1] = moSDFormatoFecha.format(moFechaCorte.getTime());
                    sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                    iPosicion++;
                	
                } // if

            } // for
            // 7. Evaluando el l�mite de meses, es decir mes de diciembre
            if (miMesPreCuota==11){ // Diciembre
                piMesDesembolso = 0; // Enero
                piAaaaDesembolso = miAaaaPreCuota + 1; // Siguiente A�o 
            }else if(miDiaPreCuota == iDiaFacturacionCronograma[iDiaFacturacionCronograma.length-1]){ // Limite del d�a de facturaci�n
                piMesDesembolso = miMesPreCuota + 1; // Siguiente mes
            }
            
            iNumeroVeces++;

        } // while
        // 8. Mostrando el resultado de la fecha de facturaci�n y fecha de corte
//        System.out.println("Fecha Formateada: Facturaci�n y Corte");
//        for (String[] sDiaFacturacion1 : sDiaFacturacion) {
//                System.out.println(sDiaFacturacion1[0] + " | " + sDiaFacturacion1[1] + " | " + sDiaFacturacion1[2]);
//        }
        // 9. Retorna la fecha facturaci�n
        switch (piTipo) {
            case 1:
                sValorFechaFacturacion = sDiaFacturacion[0][0].substring(0, 2);
                break;
            case 2:
                sValorFechaFacturacion = sDiaFacturacion[0][0];
                break;
            case 3:
                sValorFechaFacturacion = sDiaFacturacion[0][1];
                break;
            case 4:
                sValorFechaFacturacion = sDiaFacturacion[0][2];
                break;
            default:
                break;
        }
	return sValorFechaFacturacion;
    }
    
    /*
     * Fecha                :   28/03/2017
     * Descripción          :   Determinar la fecha de facturación a partir de la fecha de desembolso y los dias de facturación
     * paiDiaFacturacion[]  :   Arreglo que almacena los días de facturación
     * piAaaaDesembolso     :   Año del desembolso en formato YYYY
     * piMesDesembolso      :   Mes del desembolso que inicia en 1=Enero, 2=Febrero ..... 12=Diciembre
     * piDiaDesembolso      :   Día del desembolso que inicia en 1 y termina en 31 según el mes.
     * Resultado            :   Fecha de facturación más proxima
    */
    public String facturacionMasProxima(int paiDiaFacturacion[], int piAaaaDesembolso, int piMesDesembolso, int piDiaDesembolso){
        int iNumeroDias = 0;
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        int iPosicion = 0; // Ubicación de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][5]; // Arreglo para almacenar la fecha facturación, fecha corte y numero de dias.

        // 0. Los meses en java inician en 0=Enero, 1=Febrero 
        //    Seteo la fecha del desembolso que viene.
        moFechaDesembolso.set(piDiaDesembolso, piMesDesembolso - 1, piDiaDesembolso);
        iAaaaPreCuota = piAaaaDesembolso;
        iMesPreCuota = piMesDesembolso - 1;
        iDiaPreCuota = piDiaDesembolso;

        // 1. Validar el límite del mes - DICIEMBRE y el límite del tope de los dias de facturación
        if (iMesPreCuota == 11){
            iMesPreCuota = 0; // Enero
            iAaaaPreCuota = iAaaaPreCuota + 1; // Siguiente Año
        }else if (iDiaPreCuota >= paiDiaFacturacion[paiDiaFacturacion.length-1]){ // En el tope de los días de facturación
            iMesPreCuota += 1; // Siguiente mes
        }
        
        for(int i=0;i<paiDiaFacturacion.length;i++){

            // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
            moFechaFacturacion.set(iAaaaPreCuota, iMesPreCuota, paiDiaFacturacion[i]);

            // 3. Restando la Fecha Facturación - Fecha de Desembolso
            iNumeroDias = moCUManejoFechas.numeroDias(moFechaDesembolso, moFechaFacturacion);
            //
            if (iNumeroDias > 0){
//                System.out.println("Fecha Facturación próxima String -->" + moFechaFacturacion.getTime().toLocaleString() + "|" + moFechaDesembolso.getTime().toLocaleString() + "|" + (iNumeroDias));
                sDiaFacturacion[iPosicion][0] = moSDFormatoFecha.format(moFechaFacturacion.getTime());
                sDiaFacturacion[iPosicion][1] = moSDFormatoFecha.format(moFechaDesembolso.getTime());
                sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                sDiaFacturacion[iPosicion][3] = String.valueOf(moFechaFacturacion.getTimeInMillis());
                sDiaFacturacion[iPosicion][4] = String.valueOf(moFechaDesembolso.getTimeInMillis());
                iPosicion++;
            }
        }
        // 4. Primera ocurrencia de Fecha de Facturación
//        System.out.println("Fecha de facturación    " + sDiaFacturacion[0][0]);        
        return  sDiaFacturacion[0][0];
    }

    /*
     * Fecha                :   28/03/2017
     * Descripción          :   Determinar la fecha de facturación a partir de la fecha de desembolso y los dias de facturación
     * paiDiaFacturacion[]  :   Arreglo que almacena los días de facturación
     * pcFechaDesembolso    :   Fecha tipo calendario que corresponde a la fecha de desembolso
    */    
    public String facturacionMasProxima(int paiDiaFacturacion[], Calendar pcFechaDesembolso){
        int iNumeroDias = 0;
        int iDiaPreCuota, iMesPreCuota, iAaaaPreCuota; // Dia, Mes y Año de Pre Cuota
        int iPosicion = 0; // Ubicación de los que cumplen el criterio de evaluacion
        String sDiaFacturacion[][] = new String[20][5]; // Arreglo para almacenar la fecha facturación, fecha corte y numero de dias.
        
        iAaaaPreCuota = pcFechaDesembolso.get(Calendar.YEAR);
        iMesPreCuota = pcFechaDesembolso.get(Calendar.MONTH);
        iDiaPreCuota = pcFechaDesembolso.get(Calendar.DATE);

        // 1. Validar el límite del mes - DICIEMBRE y el límite del tope de los dias de facturación
        if (iMesPreCuota == 11){
            iMesPreCuota = 0; // Enero
            iAaaaPreCuota = iAaaaPreCuota + 1; // Siguiente Año
        }else if (iDiaPreCuota >= paiDiaFacturacion[paiDiaFacturacion.length-1]){ // En el tope de los días de facturación
            iMesPreCuota += 1; // Siguiente mes
        }
        
        for(int i=0;i<paiDiaFacturacion.length;i++){

            // 2. Fecha (Dia, Mes y Año) de la Facturación Pre Cuota
            moFechaFacturacion.set(iAaaaPreCuota, iMesPreCuota, paiDiaFacturacion[i]);

            // 3. Restando la Fecha Facturación - Fecha de Desembolso
            iNumeroDias = moCUManejoFechas.numeroDias(pcFechaDesembolso, moFechaFacturacion);

            //
            if (iNumeroDias > 0){
//                System.out.println("Fecha Facturación próxima Calendar -->" + moFechaFacturacion.getTime().toLocaleString() + "|" + pcFechaDesembolso.getTime().toLocaleString() + "|" + (iNumeroDias));
                sDiaFacturacion[iPosicion][0] = moSDFormatoFecha.format(moFechaFacturacion.getTime());
                sDiaFacturacion[iPosicion][1] = moSDFormatoFecha.format(pcFechaDesembolso.getTime());
                sDiaFacturacion[iPosicion][2] = String.valueOf(iNumeroDias);
                sDiaFacturacion[iPosicion][3] = String.valueOf(moFechaFacturacion.getTimeInMillis());
                sDiaFacturacion[iPosicion][4] = String.valueOf(pcFechaDesembolso.getTimeInMillis());
                iPosicion++;
            }
        }
        // 4. Primera ocurrencia de Fecha de Facturación
//        System.out.println("Fecha de facturación    " + sDiaFacturacion[0][0]);        
        return  sDiaFacturacion[0][0];
    }    
}
