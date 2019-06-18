/*
 * Description : Escribir un programa que agregue dos números imprime la suma a STDOUT. 
*                       Lea la entrada de STDIN. La primera línea de su entrada contendrá un número entero (N) que le 
* indica cuántas líneas más hay en la entrada. Cada una de las N líneas subsiguientes contiene 2 enteros). 
* Debe imprimir la suma de cada par en una línea separada de STDOUT..
 */
package pe.etg.bbva.evalua.java8.view.quiz1;

import java.util.Scanner;

public class CV0101v01StdInOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
    
}
