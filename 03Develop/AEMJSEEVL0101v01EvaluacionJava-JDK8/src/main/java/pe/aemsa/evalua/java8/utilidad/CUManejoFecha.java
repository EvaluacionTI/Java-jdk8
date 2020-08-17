/*
 * Fecha            :   29/03/2017
 * Descripción      :   Utilidad para el control de fechas
 * 
 *                      Si aplicamos formato (SimpleDateFormat) la diferencia de milisegundos se redondea más
 *                      Con formato :   02/12/2016        10/01/2017        39
 *                                     1484065704997 | 1480696104997 = 3369600000, incluye si proviene con parametros Calendar
 *                      Sin formato :   02/12/2016        10/01/2017        38
 *                                     1484065852804 | 1480696252814 = 3369599990, incluye si proviene con parametros String
 */
package aemsa.utilidad;

import java.util.Calendar;

public class CUManejoFecha {
    Calendar moCFechaFinal, moCFechaInicial;
    
    public CUManejoFecha(){
        moCFechaFinal = Calendar.getInstance();
        moCFechaInicial = Calendar.getInstance();
    }
    
    /*
     * Fecha           : 29/03/2017
     * Descripción     : Determinar el número de días de dos fechas tipo String
    */    
    public int numeroDias(String psFechaInicial, String psFechaFinal){
        long iNumeroMilisegundos = 0;
        int iDia, iMes, iAaaa;
        int iNumeroDias = 0;
        
        // Se resta al mes -1 considerando que el mes en java su indica es 0=Enero, 1=Febrero, 2=Marzo así sucesivamente
        iDia = Integer.valueOf(psFechaFinal.substring(0, 2));
        iMes = Integer.valueOf(psFechaFinal.substring(3, 5))-1;
        iAaaa = Integer.valueOf(psFechaFinal.substring(6, 10));
        moCFechaFinal.set(iAaaa, iMes, iDia);
        
        iDia = Integer.valueOf(psFechaInicial.substring(0, 2));
        iMes = Integer.valueOf(psFechaInicial.substring(3, 5))-1;
        iAaaa = Integer.valueOf(psFechaInicial.substring(6, 10));
        moCFechaInicial.set(iAaaa, iMes, iDia);
        
        try{
//            System.out.println(moCFechaFinal.getTime() + " | " + moCFechaInicial.getTime());
//            System.out.println(moSDFormatoFecha.format(moCFechaFinal.getTime()) + " | " + moSDFormatoFecha.format(moCFechaInicial.getTime()));
            
            iNumeroMilisegundos = (moCFechaFinal.getTimeInMillis() - moCFechaInicial.getTimeInMillis());

            System.out.println(moCFechaFinal.getTimeInMillis() + " | " + moCFechaInicial.getTimeInMillis() + " = " + iNumeroMilisegundos);
            iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L)) + 1;
        }catch(Exception ex){
            ex.getMessage();
        }
        return iNumeroDias;
    }

    /*
     * Fecha           : 29/03/2017
     * Descripción     : Determinar el número de días de dos fechas tipo Calendar que vienen inicializados
     * psFechaInicial  : Fecha Inicial formateado en función de tipo Calendar
     * psFechaFinal    : Fecha Inicial formateado en función de tipo Calendar    
    */    
    public int numeroDias(Calendar psFechaInicial, Calendar psFechaFinal){
        long iNumeroMilisegundos = 0;
        int iNumeroDias = 0;
        
        try{
            System.out.println(psFechaFinal.getTime() + " | " + psFechaInicial.getTime());
//            System.out.println(moSDFormatoFecha.format(moCFechaFinal.getTime()) + " | " + moSDFormatoFecha.format(moCFechaInicial.getTime()));
            
            iNumeroMilisegundos = (psFechaFinal.getTimeInMillis() - psFechaInicial.getTimeInMillis());

//            System.out.println(psFechaFinal.getTimeInMillis() + " | " + psFechaInicial.getTimeInMillis() + " = " + iNumeroMilisegundos);
            iNumeroDias = (int) (iNumeroMilisegundos / (1000L*60L*60L*24L));
        }catch(Exception ex){
            ex.getMessage();
        }
        return iNumeroDias;
    }    
    
}
