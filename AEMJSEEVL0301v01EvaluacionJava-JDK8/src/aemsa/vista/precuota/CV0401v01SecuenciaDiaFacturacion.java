/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.vista.precuota;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author      :   ALEDIA
 * Descripción  :   Determinar el siguiente dia de facturación
 */
public class CV0401v01SecuenciaDiaFacturacion {

    /**
     * @param args the command line arguments
     */
    static final int DIA_02 = 2;
    static final int DIA_10 = 10;
    static final int DIA_15 = 15;
    static final int DIA_25 = 25;
    public static void main(String[] args) {
       int iaDiaPosicion[] = {0,1,2,3};
       int iaDiaFacturacion[] = {2,10,15,25};

       int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
       
       Calendar oFechaDesembolso = GregorianCalendar.getInstance();

        // Dia, Mes y Año del Sistema

        System.out.println("Fecha Sistema : " + oFechaDesembolso.getTime().toLocaleString());

        // 1. Fecha (Dia, Mes y Año) de Desembolso
        iDiaDesembolso = 02;
        iMesDesembolso = 04;
        iAaaaDesembolso = 2017;
        
        oFechaDesembolso.set(iAaaaDesembolso, iMesDesembolso-1, iDiaDesembolso);
        System.out.println("Fecha Desembolso : " + oFechaDesembolso.getTime().toLocaleString());

        for (int i=0;i<iaDiaFacturacion.length;i++){
            System.out.println(i + " Dia de Facturación :" + iaDiaFacturacion[i]);
        }
        
        if (iDiaDesembolso < DIA_02){
            iaDiaPosicion[0] = 0;
            iaDiaPosicion[1] = 1;
            iaDiaPosicion[2] = 2;
            iaDiaPosicion[3] = 3;
                    
        }else if (iDiaDesembolso >= DIA_02 && iDiaDesembolso < DIA_10 ){
            iaDiaPosicion[0] = 1;
            iaDiaPosicion[1] = 2;
            iaDiaPosicion[2] = 3;
            iaDiaPosicion[3] = 0;
            
        }else if (iDiaDesembolso >= DIA_10 && iDiaDesembolso < DIA_15 ){
            iaDiaPosicion[0] = 2;
            iaDiaPosicion[1] = 3;
            iaDiaPosicion[2] = 0;
            iaDiaPosicion[3] = 1;
            
        }else if (iDiaDesembolso >= DIA_15 && iDiaDesembolso < DIA_25 ){
            iaDiaPosicion[0] = 3;
            iaDiaPosicion[1] = 0;
            
            iaDiaPosicion[2] = 1;
            iaDiaPosicion[3] = 2;
            
        }else{
            iaDiaPosicion[0] = 0;
            iaDiaPosicion[1] = 1;
            iaDiaPosicion[2] = 2;
            iaDiaPosicion[3] = 3;   

        }
        
        // Determinar la posición de inicio
        System.out.print("Dia Posición :" );
        int iPosicion = 0;
        for (int i=0;i<iaDiaPosicion.length;i++){
            System.out.print(iaDiaPosicion[i]);
        }
        
    }
    
}
