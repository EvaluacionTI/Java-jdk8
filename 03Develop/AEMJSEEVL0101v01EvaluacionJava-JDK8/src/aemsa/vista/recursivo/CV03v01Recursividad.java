/*
* Fecha         :   28/03/2017
* Problema      :   Implementación de un método recursivo
* Resultado     :   La función repetir es recursiva porque dentro de la función se llama a sí misma.
                    Cuando ejecuta este programa se bloqueará y generará una excepción: 
                                        "Exception in thread "main" java.lang.StackOverflowError"

* Evaluación    :   Analicemos como funciona:
                    a) Primero se ejecuta la función main, luego de crear un objeto llamamos a la función repetir.
                    b) Hay que tener en cuenta que cada vez que se llama a una función se reservan 4 bytes de la memoria que se liberarán 
                       cuando finalice su ejecución.
                    c) La primera línea de la función llama a la función repetir, es decir que se reservan 4 bytes nuevamente. 
                       Se ejecuta nuevamente una instancia de la función repetir y así sucesivamente hasta que la pila estática se colme y se 
                       cuelgue el programa.
*/
package aemsa.vista.recursivo;

public class CV03v01Recursividad {

    void repetir(){
        repetir();
    }
    
    public static void main(String[] args) {
        CV03v01Recursividad oRecursivo = new CV03v01Recursividad();
        
        oRecursivo.repetir();
    }
    
}
