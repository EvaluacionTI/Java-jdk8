/*
* Fecha         :   28/03/2017
* Problema      :   Implementación de un método recursivo que reciba un parámetro de tipo entero y luego llame en forma recursiva con el valor 
                    del parámetro menos 1.
* Resultado     :   Pdremos observar que en pantalla se imprime:
                    5 4 3 2 1 0 -1 -2 -3   . . . . . . . . .
                    hasta que se bloquee el programa.

* Evaluación    :   a) Desde la main se llama a la función imprimir y se le envía el valor 5. El parámetro x recibe el valor 5. 
                    b) Se ejecuta el algoritmo de la función, imprime el contenido del parámetro (5) y seguidamente se llama a una función, 
                       en este caso a sí misma (por eso decimos que es una función recursiva), enviándole el valor 4.

                    c) El parámetro x recibe el valor 4 y se imprime en pantalla el cuatro, llamando nuevamente a la función imprimir 
                       enviándole el valor 3.

Tener en cuenta que cada llamada a una función consume 4 bytes por la llamada y en este caso 4 bytes por el parámetro x. Como nunca finaliza la ejecución completa de las funciones se desborda la pila estática por las sucesivas llamadas.
*/
package aemsa.vista.recursivo;

public class CV03v02Recursividad {

    void imprimir(int piValor){
        System.out.println(piValor);
        imprimir(piValor - 1);
    }
    
    public static void main(String[] args) {
        CV03v02Recursividad oRecursivo = new CV03v02Recursividad();
        
        oRecursivo.imprimir(5);
    }
    
}
