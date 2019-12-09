/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap05.arreglo;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;

/**
 *
 * @author background21
 */
public class CV02v01MatrizUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int nElementos;
            System.out.print("N�mero de elementos de la matriz: ");
            nElementos = CO06v01LeerTipoDato.datoInt();
            int[] m = new int[nElementos]; // crear la matriz m
            int i = 0; // sub�ndice

            System.out.println("Introducir los valores de la matriz.");
            for (i = 0; i < nElementos; i++)
            {
              System.out.print("m[" + i + "] = ");
              m[i] = CO06v01LeerTipoDato.datoInt();
            }

            // Visualizar los elementos de la matriz
            System.out.println();
            for (i = 0; i < nElementos; i++)
              System.out.print(m[i] + " ");
            System.out.println("\n\nFin del proceso.");
            
        }catch(Exception ex){}
    }
}
