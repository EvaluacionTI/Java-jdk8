package pe.etg.bbva.evalua.java8.view.quiz;

public class CV0101v01OrdenacionBubbleSort {

    public static void main(String[] args) {
        int iNumeros[] = {55, 86, 48, 16, 82, 5, 22, 30, 9};
        int iComparaciones = 0;
        int iIntercambios = 0;
        
        System.out.println("Mostrar la lista");
        for (int iPosition=0;iPosition < iNumeros.length;iPosition++){
            System.out.println("Numero [ " + iPosition + " ] = " + iNumeros[iPosition]);
        }
        
        System.out.println("Algoritmo de Ordenación de Burbuja");
        int iAuxNumero=0;
        for (int x=0;x<=iNumeros.length;x++){
            for (int y=1;y <= (iNumeros.length-1);y++){
                iComparaciones++;
                if (iNumeros[y-1] > iNumeros[y]){
                    iAuxNumero = iNumeros[y-1];
                    iNumeros[y-1] = iNumeros[y]; 
                    iNumeros[y] = iAuxNumero;
                    iIntercambios++;
                }
            }
        }
        
        System.out.println("Mostrar la salida");
        for (int iPosition=0;iPosition < iNumeros.length;iPosition++){
            System.out.println("Numero [ " + iPosition + " ] = " + iNumeros[iPosition]);
        }
        
        System.out.println("Número de comparaciones : " + iComparaciones);
        System.out.println("Número de intercambios     : " + iIntercambios);
    }
    
}
