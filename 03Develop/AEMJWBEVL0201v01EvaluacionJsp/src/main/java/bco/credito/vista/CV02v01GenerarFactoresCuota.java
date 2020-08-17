/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bco.credito.vista;

import bco.credito.entidad.CECredito;
import bco.credito.logica.CLFinanciero;

/**
 *
 * @author background21
 */
public class CV02v01GenerarFactoresCuota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String[] oaMeses = new String[12];
        String oaMeses[]={"Ene", "Feb","Mar","Abr","May","Jun","Jul","Ago","Set","Oct","Nov","Dic"};

        // Factores de mes de pago para cuotas simple, double y monto de no pago
        // Donde 0 = No pago de cuota
        //       1 = Pago simple por default
        //       2 = Pago doble
        //       3 = Pago triple
        //       4 = Pago cuadruple, etc
        
        int oaMesesPago[]={1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println("Factores de Pago\n");
        
        for (int i=0;i<oaMeses.length;i++){
            System.out.println((i+1)+" " + oaMeses[i]+ " " +oaMesesPago[i]);
        }
        
        // Generando la matriz con los factores apropiados
        //
        // N° Cuota, N° Dias, N° Días Acumulado, FactorPago, Factor Interes
        
         double[][] oCronogramaFactores = new double[12][5];
         double lAcumuladoFactores = 0;
         double lMontoCuotaFijo = 0;
         
         CECredito oCredito = new CECredito();
         CLFinanciero oFinanciero = new CLFinanciero();
         
         oCredito.setmMontoCredito(120000);
         oCredito.setmNumeroCuotas(12);
         oCredito.setmTea(25);
         
         int lDiasFrecuencia = 30;
         int lAcumuladoDias = 0;
         
         for (int i=0;i<oCredito.getmNumeroCuotas();i++){
             lAcumuladoDias = lAcumuladoDias + lDiasFrecuencia;
             oCronogramaFactores[i][0]=i+1; //Número de Cuota
             oCronogramaFactores[i][1]=lDiasFrecuencia; //Número de Días
             oCronogramaFactores[i][2]=lAcumuladoDias; //Días acumulados
             oCronogramaFactores[i][3]=oFinanciero.buscarMeses(i, oaMesesPago); //Factor de Pago
             oCronogramaFactores[i][4]= oFinanciero.factorCuotaMensual(oFinanciero.buscarMeses(i, oaMesesPago), oCredito.getmTea(), lAcumuladoDias);
             
         }
         Double lSumatoriaFactores;
         
         lSumatoriaFactores = 0D;
         
         for (int i=0; i<oCredito.getmNumeroCuotas();i++){
             System.out.println(oCronogramaFactores[i][0] + " " + oCronogramaFactores[i][1] + " " + oCronogramaFactores[i][2] + " " + oCronogramaFactores[i][3]+ " " + oCronogramaFactores[i][4]);
             lSumatoriaFactores += oCronogramaFactores[i][4];
         }
        
         System.out.println("Sumatoria Factores = " + lSumatoriaFactores + "\n");
         System.out.println("Monto Cuota Fija = " + oCredito.getmMontoCredito()/lSumatoriaFactores);
    }
}
