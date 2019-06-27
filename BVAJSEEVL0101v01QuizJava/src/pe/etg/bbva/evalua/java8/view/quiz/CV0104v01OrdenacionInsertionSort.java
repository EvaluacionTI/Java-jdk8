package pe.etg.bbva.evalua.java8.view.quiz;

public class CV0104v01OrdenacionInsertionSort {

    private static int iComparaciones = 0;
    private static int iIntercambios = 0;

    public void sort(int piNumeros[]) {
        int iSizeNumeros = piNumeros.length;

        for (int i = 1; i < iSizeNumeros ; i++) {
            /* select value to be inserted */
            int iKeyNumero = piNumeros[i];
            int j = i - 1;
            iComparaciones++;
            /*locate hole position for the element to be inserted */
            while (j >= 0 && piNumeros[j] > iKeyNumero) { 
                piNumeros[j + 1] = piNumeros[j]; 
                j = j - 1; 
                iIntercambios++;
            } 
            /* insert the number at hole position */
            piNumeros[j + 1] = iKeyNumero; 
        }
    }

    public void mostrarArray(int[] paiNumeros) {
        System.out.println("Mostrar la salida");
        for (int iPosition = 0; iPosition < paiNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + paiNumeros[iPosition]);
        }
    }

    public static void main(String[] args) {
        CV0104v01OrdenacionInsertionSort oBubbleSort = new CV0104v01OrdenacionInsertionSort();

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
