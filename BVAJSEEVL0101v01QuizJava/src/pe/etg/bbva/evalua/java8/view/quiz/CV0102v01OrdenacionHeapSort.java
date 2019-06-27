package pe.etg.bbva.evalua.java8.view.quiz;

/*
Dividiré la ordenación del montón en varias partes para que sea más comprensible.
¿Qué es el montón?
Entendiendo el árbol binario completo
Montones binarios
Tipos de montones
Heapifying un elemento
Pasos para el montón de pila
¿Qué es el montón?
Un montón es un árbol con algunas propiedades especiales, por lo que el valor del nodo debe ser mayor o igual que (menor o igual que en el caso de un montón mínimo) los hijos del nodo y el árbol deben ser un árbol binario completo.
Montones binarios
Los montones binarios son aquellos que pueden tener hasta 2 hijos. Usaremos montones binarios en nuestras próximas secciones.
Entendiendo el árbol binario completo:
El árbol binario completo es un árbol binario cuyas hojas están en el nivel h o h-1, donde h es la altura del árbol. 
Índice del hijo izquierdo = 2 * (índice de su padre) +1 
Índice del niño derecho = 2 * (índice de su padre) +2
Tipos de montones
Hay dos tipos de pila.
Max montón
Min montón
Montón máximo: es un montón binario donde el valor del nodo es mayor que el hijo izquierdo y derecho del nodo.
Montón mínimo: es un montón binario donde el valor del nodo es menor que el hijo izquierdo y derecho del nodo.

Heapifying un elemento:
Una vez que creamos un montón, puede que no satisfaga la propiedad del montón. Para hacer que se apile de nuevo, necesitamos ajustar las ubicaciones del montón y este proceso se conoce como heapificar los elementos. 
Para crear un montón máximo, compararemos el elemento actual con sus hijos y encontraremos el máximo, si el elemento actual no es el máximo, luego lo intercambiaremos por el máximo de la derecha o la izquierda.

Pasos para la clasificación del montón:
Representa la matriz como árbol binario completo.
El niño izquierdo estará en 2 * i + 1ª ubicación
El niño derecho estará en 2 * i + 2ª ubicación.
Construye un montón.
Todos los nodos de hoja ya satisfacen la propiedad del montón, por lo que no necesitamos heapificarlos.
El último nodo hoja estará presente en (n-1) la ubicación, por lo que el padre de la misma estará en (n-1) / 2ª ubicación, por lo tanto (n-1) / 2 será la ubicación del último nodo no hoja.
Iterar sobre nodos sin hojas y heapificar los elementos.
Después de construir un montón, el elemento max estará en la raíz del montón. Lo intercambiaremos por (n-1) la ubicación, por lo que el elemento más grande estará en el lugar adecuado y lo quitaremos del montón reduciendo el tamaño de n.
Cuando intercambias el elemento más grande, puede perturbar la propiedad de la pila máxima, por lo que debes volver a apilarlo.
Una vez que realice los pasos anteriores hasta que no queden elementos en el montón, al final se ordenará la matriz.


 */
public class CV0102v01OrdenacionHeapSort {

    private static int iComparaciones = 0;
    private static int iIntercambios = 0;

    public void sort(int piNumeros[]) {
        int iSizeNumeros = piNumeros.length;

        //1. Build heap
        for (int i = iSizeNumeros / 2 - 1; i >= 0; i--) {
            heapify(piNumeros, iSizeNumeros, i);
        }

        //2. One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = iSizeNumeros - 1; i >= 0; i--) {
            //3. piNumeros[0] is a root of the heap and is the max element in heap
            int iNumeroAux = piNumeros[0];
            piNumeros[0] = piNumeros[i];
            piNumeros[i] = iNumeroAux;

            // 4. call max heapify on the reduced heap
            heapify(piNumeros, i, 0);
        }
    }

    // To heapify a subtree with node i
    public void heapify(int piNumeros[], int piHeapSize, int piNdex) {
        int largest = piNdex; // Initialize largest as root
        int leftChildIdx = 2 * piNdex + 1; // left = 2*i + 1
        int rightChildIdx = 2 * piNdex + 2; // right = 2*i + 2
        iComparaciones++;

        // If left child is larger than root
        if (leftChildIdx < piHeapSize && piNumeros[leftChildIdx] > piNumeros[largest]) {
            largest = leftChildIdx;
        }

        // If right child is larger than largest so far
        if (rightChildIdx < piHeapSize && piNumeros[rightChildIdx] > piNumeros[largest]) {
            largest = rightChildIdx;
        }

        // If largest is not root
        if (largest != piNdex) {
            int swap = piNumeros[piNdex];
            piNumeros[piNdex] = piNumeros[largest];
            piNumeros[largest] = swap;

            iIntercambios++;
            // Recursive call to  heapify the sub-tree
            heapify(piNumeros, piHeapSize, largest);
        }
    }

    public void mostrarArray(int[] paiNumeros) {
        System.out.println("Mostrar la salida");
        for (int iPosition = 0; iPosition < paiNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + paiNumeros[iPosition]);
        }
    }

    public static void main(String[] args) {
        CV0102v01OrdenacionHeapSort oBubbleSort = new CV0102v01OrdenacionHeapSort();

        int iNumeros[] = {55, 86, 48, 16, 82, 5, 22, 30, 9};

        System.out.println("Mostrar la lista");
        for (int iPosition = 0; iPosition < iNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + iNumeros[iPosition]);
        }

        oBubbleSort.sort(iNumeros);
        oBubbleSort.mostrarArray(iNumeros);

        System.out.println("Número de comparaciones : " + iComparaciones);
        System.out.println("Número de intercambios     : " + iIntercambios);

    }

}
