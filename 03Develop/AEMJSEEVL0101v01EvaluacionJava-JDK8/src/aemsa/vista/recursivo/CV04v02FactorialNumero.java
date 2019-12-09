/*
* Fecha         :   28/03/2017
* Problema      :   Obtener el factorial de un número.
                    Recordar que el factorial de un número es el resultado que se obtiene de multiplicar dicho número por el anterior y así 
                    sucesivamente hasta llegar a uno.

* Resultado     :   El factorial de 4 es 4 * 3 * 2 * 1 es decir 24.

* Evaluación    :   Como puede observarse, la función iterativa sólo recorre un bucle while, mientras que la recursiva invoca un método 
                    nuevo hasta que número vale 1 (Esto requiere un trabajo considerablemente mayor por parte del ordenador).

                    La recursión es por lo tanto una potente herramienta en programación, pero hay que saber diferenciar cuando es útil y cuando no
                    La recursividad es una técnica que puede utilizarse en lugar de la iteración para resolver determinados tipos de problemas.
*/
package aemsa.vista.recursivo;

import java.util.Calendar;

public class CV04v02FactorialNumero {

    static int calcularFactorial(int piNumero){
        int iResultado = 1;
        while(piNumero > 0 ){
            iResultado = iResultado * piNumero;
            piNumero --;
        }
        return iResultado;
    }
    
    public static void main(String[] args) {
        System.out.println("Inicio " + Calendar.getInstance().getTime());
        System.out.println("Factorial de " + 5 + " es = " + calcularFactorial(5));
        System.out.println("Fin " + Calendar.getInstance().getTime());
    }
    
}
