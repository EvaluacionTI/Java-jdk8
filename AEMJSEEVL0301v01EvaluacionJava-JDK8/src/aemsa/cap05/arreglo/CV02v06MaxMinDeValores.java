
package aemsa.cap05.arreglo;

import aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CV02v06MaxMinDeValores {

    public static void main(String[] args) {
        try{
            int nElementos;    // n�mero de elementos (valor no negativo)
             do
             {
               System.out.print("N�mero de valores que desea introducir: ");
               nElementos = CO06v01LeerTipoDato.datoInt();
             }
             while (nElementos < 1);
             float[] dato = new float[nElementos]; // crear la matriz dato
             int i = 0;       // sub�ndice
             float max, min;  // valor m�ximo y valor m�nimo

             System.out.println("Introducir los valores.\n" +
                                "Para finalizar pulse [Entrar]");
             for (i = 0; i < dato.length; i++)
             {
               System.out.print("dato[" + i + "]= ");
               dato[i] = CO06v01LeerTipoDato.datoFloat();
               if (Float.isNaN(dato[i])) break; // salir del bucle
             }
             nElementos = i; // n�mero de valores le�dos
             // Obtener los valores m�ximo y m�nimo
             if (nElementos > 0)
             {
               max = min = dato[0];
               for (i = 0; i < nElementos; i++)
               {
                 if (dato[i] > max)
                   max = dato[i];
                 if (dato[i] < min)
                   min = dato[i];
               }
               // Escribir los resultados 
               System.out.println("\nValor m�ximo: " + max);
               System.out.println("Valor m�nimo: " + min);
             }
             else
               System.out.println("\nNo hay datos.");
        }catch(Exception ex){
            
        }

    }
}
