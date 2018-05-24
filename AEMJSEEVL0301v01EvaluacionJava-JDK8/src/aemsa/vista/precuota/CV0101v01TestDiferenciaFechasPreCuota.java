/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.vista.precuota;

import aemsa.utilidad.CUManejoFecha;
import java.util.Calendar;

/**
 *
 * @author ALEDIA
 */
public class CV0101v01TestDiferenciaFechasPreCuota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sFechaInicial, sFechaFinal;
        
        CUManejoFecha oCUFecha = new CUManejoFecha();
        Calendar ocFechaInicial;
        Calendar ocFechaFinal = Calendar.getInstance();
        
        int iDia, iMes, iAaaa;
        ocFechaInicial = Calendar.getInstance();
        
        sFechaInicial = "25/11/2016";
        System.out.println("Estraer de cadena dia, mes año ");
        System.out.println(sFechaInicial + " --> " + sFechaInicial.substring(0, 2));
        System.out.println(sFechaInicial + " --> " + sFechaInicial.substring(3, 5));
        System.out.println(sFechaInicial + " --> " + sFechaInicial.substring(6, 10));
        System.out.println("\n");
        
        sFechaInicial = "02/12/2016";
        sFechaFinal = "10/01/2017";
        
        System.out.println("Diferencia fechas tipo cadena -->");
        System.out.println("Fecha Inicial : " + sFechaInicial);
        System.out.println("Fecha Final   : " + sFechaFinal);
        System.out.println("Número de días -->" + oCUFecha.numeroDias(sFechaInicial,sFechaFinal));
        System.out.println("\n");
        
        iDia = Integer.valueOf(sFechaInicial.substring(0, 2));
        iMes = Integer.valueOf(sFechaInicial.substring(3, 5))-1;
        iAaaa = Integer.valueOf(sFechaInicial.substring(6, 10));
        ocFechaInicial.set(iAaaa, iMes, iDia);

        iDia = Integer.valueOf(sFechaFinal.substring(0, 2));
        iMes = Integer.valueOf(sFechaFinal.substring(3, 5))-1;
        iAaaa = Integer.valueOf(sFechaFinal.substring(6, 10));
        ocFechaFinal.set(iAaaa, iMes, iDia);
        
        System.out.println("Diferencia fechas tipo Calendar -->");
        System.out.println("Fecha Inicial : " + ocFechaInicial.getTime().toLocaleString());
        System.out.println("Fecha Final   : " + ocFechaFinal.getTime().toLocaleString());
        System.out.println("Número de dias -->" + oCUFecha.numeroDias(ocFechaInicial,ocFechaFinal));
    }
    
}
