package pe.etg.bbva.evalua.java8.view.quiz;

public class CV0103v01OrdenacionSelectionSort {

    private static int iComparaciones = 0;
    private static int iIntercambios = 0;

    public void sort(int piNumeros[]) {
        int iSizeNumeros = piNumeros.length;

        //1. One by one move boundary of unsorted subarray 
        for (int i = 0; i < iSizeNumeros  - 1; i++) {
            // 2. Find the minimum element in unsorted array
            int iMinimun = i;
            for (int j=i+1;j<iSizeNumeros;j++){
                iComparaciones++;
                if (piNumeros[j] < piNumeros[iMinimun]){
                    iMinimun = j;
                    iIntercambios++;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            int iNumeroAux = piNumeros[iMinimun];
            piNumeros[iMinimun] = piNumeros[i];
            piNumeros[i] = iNumeroAux;
        }
    }

    public void mostrarArray(int[] paiNumeros) {
        System.out.println("Mostrar la salida");
        for (int iPosition = 0; iPosition < paiNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + paiNumeros[iPosition]);
        }
    }

    public static void main(String[] args) {
        CV0103v01OrdenacionSelectionSort oBubbleSort = new CV0103v01OrdenacionSelectionSort();

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
