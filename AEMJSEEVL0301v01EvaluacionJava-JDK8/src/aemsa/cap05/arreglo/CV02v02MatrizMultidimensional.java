
package aemsa.cap05.arreglo;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;

public class CV02v02MatrizMultidimensional {


    public static void main(String[] args) {
        try{
            int nfilas, ncols;     // filas y columnas de la matriz
             do
             {
               System.out.print("N�mero de filas de la matriz:    ");
               nfilas = CO06v01LeerTipoDato.datoInt();
             }
             while (nfilas < 1);    // no permitir un valor negativo
             do
             {
               System.out.print("N�mero de columnas de la matriz: ");
               ncols = CO06v01LeerTipoDato.datoInt();
             }
             while (ncols < 1);     // no permitir un valor negativo

             float[][] m = new float[nfilas][ncols]; // crear la matriz m
             int fila = 0, col = 0; // sub�ndices
             float sumafila = 0;    // suma de los elementos de una fila

             System.out.println("Introducir los valores de la matriz.");
             for (fila = 0; fila < nfilas; fila++)
             {
               for (col = 0; col < ncols; col++)
               {
                 System.out.print("m[" + fila + "][" + col + "] = ");
                 m[fila][col] = CO06v01LeerTipoDato.datoFloat();
               }
             }

             // Visualizar la suma de cada fila de la matriz
             System.out.println();
             for (fila = 0; fila < nfilas; fila++)
             {
               sumafila = 0;
               for (col = 0; col < ncols; col++)
                 sumafila += m[fila][col];
               System.out.println("Suma de la fila " + fila + ": " + sumafila);
             }
             System.out.println("\nFin del proceso.");            
        }catch(Exception ex){}
    }
}
