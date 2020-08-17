/*
* Fecha         :   28/03/2017
* Problema      :   Implementar un método recursivo para ordenar los elementos de un vector.

* Resultado     :   Mostrar el vector 
                    Sin ordenar : 312  614  88  22  54  

                    Ordenado    : 22  54  88  312  614  
* Evaluación    :   Hasta ahora hemos visto problemas que se pueden resolver tanto con recursividad como con estructuras repetitivas.
                    Es muy importante tener en cuenta que siempre que podamos emplear un algoritmo no recursivo será mejor 
                    (ocupa menos memoria de ram y se ejecuta más rápidamente)
                    Pero hay casos donde el empleo de recursividad hace mucho más sencillo el algoritmo 

*/
package aemsa.vista.recursivo;

import java.util.Calendar;

public class CV04v03RecursivoOrdenarVector {
    static int [] aiVector = {312, 614, 88, 22, 54};
    
    void ordenar (int [] v, int cant) {
        if (cant > 1) {
            for (int f = 0 ; f < cant - 1 ; f++)
                if (v [f] > v [f + 1]) {
                    int aux = v [f];
                    v [f] = v [f + 1];
                    v [f + 1] = aux;
                }
            ordenar (v, cant - 1);
        }
    }
    void imprimir () {
        for (int f = 0 ; f < aiVector.length ; f++)
            System.out.print (aiVector [f] + "  ");
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        System.out.println("Inicio " + Calendar.getInstance().getTimeInMillis());
        
        CV04v03RecursivoOrdenarVector oCVRecursivo = new CV04v03RecursivoOrdenarVector();
        // Imprimir sin ordenar
        oCVRecursivo.imprimir ();

        oCVRecursivo.ordenar (aiVector, aiVector.length);
        // Imprimir Ordenado
        oCVRecursivo.imprimir ();
        
        System.out.println("Fin " + Calendar.getInstance().getTimeInMillis());
    }
    
}
