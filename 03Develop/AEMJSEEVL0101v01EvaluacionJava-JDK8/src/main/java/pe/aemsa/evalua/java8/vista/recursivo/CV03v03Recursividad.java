/*
* Fecha         :   28/03/2017
* Problema      :   Implementar un método recursivo que imprima en forma descendente de 5 a 1 de uno en uno.
* Resultado     :   Se imprimen los números 5 4 3 2 1 y no se bloquea el programa.

* Evaluación    :   a) Analice qué sucede cada vez que el if (x>0) se evalúa como falso, ¿a qué línea del programa retorna?

*/
package aemsa.vista.recursivo;

public class CV03v03Recursividad {

    void imprimir(int piValor){
        if (piValor > 0){
            System.out.println(piValor);
            imprimir(piValor - 1);            
        }
    }
    
    public static void main(String[] args) {
        CV03v03Recursividad oRecursivo = new CV03v03Recursividad();
        
        oRecursivo.imprimir(5);
    }
    
}
