package pe.etg.bbva.evalua.java8.view.quiz;

public class CV0101v02OrdenacionBubbleSort {

    private static int iComparaciones = 0;
    private static int iIntercambios = 0;

    public void sortArray(int[] paiNumeros) {
        System.out.println("Algoritmo de Ordenación de Burbuja");
        int iAuxNumero;

        for (int x = 0; x <= paiNumeros.length; x++) {
            iAuxNumero = 0;
            for (int y = 1; y <= (paiNumeros.length - 1); y++) {
                iComparaciones++;
                if (paiNumeros[y - 1] > paiNumeros[y]) {
                    iAuxNumero = paiNumeros[y - 1];
                    paiNumeros[y - 1] = paiNumeros[y];
                    paiNumeros[y] = iAuxNumero;
                    iIntercambios++;
                }
            }
        }
    }

    public void mostrarArray(int[] paiNumeros) {
        System.out.println("Mostrar la salida");
        for (int iPosition = 0; iPosition < paiNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + paiNumeros[iPosition]);
        }
    }

    public static void main(String[] args) {
        CV0101v02OrdenacionBubbleSort oBubbleSort = new CV0101v02OrdenacionBubbleSort();

        int iNumeros[] = {55, 86, 48, 16, 82, 5, 22, 30, 9};

        System.out.println("Mostrar la lista");
        for (int iPosition = 0; iPosition < iNumeros.length; iPosition++) {
            System.out.println("Numero [ " + iPosition + " ] = " + iNumeros[iPosition]);
        }

        oBubbleSort.sortArray(iNumeros);
        oBubbleSort.mostrarArray(iNumeros);

        System.out.println("Número de comparaciones : " + iComparaciones);
        System.out.println("Número de intercambios     : " + iIntercambios);

    }

}
