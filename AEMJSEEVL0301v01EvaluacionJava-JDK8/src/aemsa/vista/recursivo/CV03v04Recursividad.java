/*
* Fecha         :   28/03/2017
* Problema      :   Imprimir los números de 1 a 5 en pantalla utilizando recursividad.
* Resultado     :   Se imprimen los números 1 2 3 4 5 y no se bloquea el programa.

* Evaluación    :   Es importante tener en cuenta que siempre en una función recursiva debe haber un if para finalizar la recursividad 
                    ( en caso contrario la función recursiva será infinita y provocará que el programa se bloquee)

*/
package aemsa.vista.recursivo;

public class CV03v04Recursividad {

    void imprimir(int piValor){
        if (piValor < 6){
            System.out.println(piValor);
            imprimir(piValor + 1);            
        }
    }
    
    public static void main(String[] args) {
        CV03v04Recursividad oRecursivo = new CV03v04Recursividad();
        
        oRecursivo.imprimir(1);
    }
    
}
