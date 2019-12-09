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
public class CV0401v02SecuenciaFechaFacturacion {

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
       int iaMMFacturacion[] = {0,0,0,0};
       int iaYYYYFacturaicion[] = {0,0,0,0};

       int iDiaDesembolso, iMesDesembolso, iAaaaDesembolso; // Dia, Mes y Año de Desembolso
       int iMesSiguiente, iAaaaSiguiente;
       
       Calendar oFechaDesembolso = GregorianCalendar.getInstance();
       Calendar oFechaFacturacion = GregorianCalendar.getInstance();

       iMesSiguiente = 0;
       iAaaaSiguiente = 0;
       
        // Dia, Mes y Año del Sistema

        System.out.println("Fecha Sistema : " + oFechaDesembolso.getTime().toLocaleString());

        // 1. Fecha (Dia, Mes y Año) de Desembolso
        iDiaDesembolso = 02;
        iMesDesembolso = 12;
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

            iaMMFacturacion[0] = iMesDesembolso;
            iaMMFacturacion[1] = iMesDesembolso;
            iaMMFacturacion[2] = iMesDesembolso;
            iaMMFacturacion[3] = iMesDesembolso;
            
            iaYYYYFacturaicion[0] = iAaaaDesembolso;
            iaYYYYFacturaicion[1] = iAaaaDesembolso;
            iaYYYYFacturaicion[2] = iAaaaDesembolso;
            iaYYYYFacturaicion[3] = iAaaaDesembolso;
            
        }else if (iDiaDesembolso >= DIA_02 && iDiaDesembolso < DIA_10 ){
            iaDiaPosicion[0] = 1;
            iaDiaPosicion[1] = 2;
            iaDiaPosicion[2] = 3;
            iaDiaPosicion[3] = 0;

            iaMMFacturacion[0] = iMesDesembolso;
            iaMMFacturacion[1] = iMesDesembolso;
            iaMMFacturacion[2] = iMesDesembolso;
            iaMMFacturacion[3] = iMesDesembolso+1;
            
            iaYYYYFacturaicion[0] = iAaaaDesembolso;
            iaYYYYFacturaicion[1] = iAaaaDesembolso;
            iaYYYYFacturaicion[2] = iAaaaDesembolso;
            iaYYYYFacturaicion[3] = iAaaaDesembolso;

            if (iMesDesembolso== 12){
                iaMMFacturacion[3] = iMesDesembolso + 1;
                iaYYYYFacturaicion[3] = iAaaaDesembolso + 1;
            }
            
        }else if (iDiaDesembolso >= DIA_10 && iDiaDesembolso < DIA_15 ){
            iaDiaPosicion[0] = 2;
            iaDiaPosicion[1] = 3;
            iaDiaPosicion[2] = 0;
            iaDiaPosicion[3] = 1;
            
            iaMMFacturacion[0] = iMesDesembolso;
            iaMMFacturacion[1] = iMesDesembolso;
            iaMMFacturacion[2] = iMesDesembolso+1;
            iaMMFacturacion[3] = iMesDesembolso+1;
            
            iaYYYYFacturaicion[0] = iAaaaDesembolso;
            iaYYYYFacturaicion[1] = iAaaaDesembolso;
            iaYYYYFacturaicion[2] = iAaaaDesembolso;
            iaYYYYFacturaicion[3] = iAaaaDesembolso;

            if (iMesDesembolso== 12){
                iaMMFacturacion[2] = iMesDesembolso + 1;
                iaYYYYFacturaicion[2] = iAaaaDesembolso + 1;
                iaMMFacturacion[3] = iMesDesembolso + 1;
                iaYYYYFacturaicion[3] = iAaaaDesembolso + 1;
            }
        }else if (iDiaDesembolso >= DIA_15 && iDiaDesembolso < DIA_25 ){
            iaDiaPosicion[0] = 3;
            iaDiaPosicion[1] = 0;
            iaDiaPosicion[2] = 1;
            iaDiaPosicion[3] = 2;
            
            iaMMFacturacion[0] = iMesDesembolso;
            iaMMFacturacion[1] = iMesDesembolso+1;
            iaMMFacturacion[2] = iMesDesembolso+1;
            iaMMFacturacion[3] = iMesDesembolso+1;
            
            iaYYYYFacturaicion[0] = iAaaaDesembolso;
            iaYYYYFacturaicion[1] = iAaaaDesembolso;
            iaYYYYFacturaicion[2] = iAaaaDesembolso;
            iaYYYYFacturaicion[3] = iAaaaDesembolso;

            if (iMesDesembolso== 12){
                iaMMFacturacion[1] = iMesDesembolso + 1;
                iaYYYYFacturaicion[1] = iAaaaDesembolso + 1;                
                iaMMFacturacion[2] = iMesDesembolso + 1;
                iaYYYYFacturaicion[2] = iAaaaDesembolso + 1;
                iaMMFacturacion[3] = iMesDesembolso + 1;
                iaYYYYFacturaicion[3] = iAaaaDesembolso + 1;
            }
        }else{
            iaDiaPosicion[0] = 0;
            iaDiaPosicion[1] = 1;
            iaDiaPosicion[2] = 2;
            iaDiaPosicion[3] = 3;   

            iaMMFacturacion[0] = iMesDesembolso+1;
            iaMMFacturacion[1] = iMesDesembolso+1;
            iaMMFacturacion[2] = iMesDesembolso+1;
            iaMMFacturacion[3] = iMesDesembolso+1;
            
            iaYYYYFacturaicion[0] = iAaaaDesembolso;
            iaYYYYFacturaicion[1] = iAaaaDesembolso;
            iaYYYYFacturaicion[2] = iAaaaDesembolso;
            iaYYYYFacturaicion[3] = iAaaaDesembolso;

            if (iMesDesembolso== 12){
                iaMMFacturacion[0] = iMesDesembolso + 1;
                iaYYYYFacturaicion[0] = iAaaaDesembolso + 1;
                iaMMFacturacion[1] = iMesDesembolso + 1;
                iaYYYYFacturaicion[1] = iAaaaDesembolso + 1;
                iaMMFacturacion[2] = iMesDesembolso + 1;
                iaYYYYFacturaicion[2] = iAaaaDesembolso + 1;
                iaMMFacturacion[3] = iMesDesembolso + 1;
                iaYYYYFacturaicion[3] = iAaaaDesembolso + 1;
            }

        }
        
        // Determinar la posición de inicio
        System.out.print("Dia Posición :" );
        int iPosicion = 0;
        for (int i=0;i<iaDiaPosicion.length;i++){
            System.out.print(iaDiaPosicion[i]);
        }

        for (int i=0;i<iaDiaPosicion.length;i++){
            oFechaFacturacion.set(iaYYYYFacturaicion[i], iaMMFacturacion[i]-1, iaDiaFacturacion[iaDiaPosicion[i]] );
            System.out.println("\n"+iaDiaFacturacion[iaDiaPosicion[i]] + " = " + oFechaFacturacion.getTime().toLocaleString());
        }
        
    }
    
}
