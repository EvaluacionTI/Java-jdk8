/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap09.clase.vista;

import java.io.PrintStream;

public class CV1301v03TestNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintStream oFlujoSalida = System.out;

        char car1 = 'A', car2 = 65, car3 = 0;

        car3 = (char)(car1 + 'a' - 'A');

        oFlujoSalida.println(car3 + "" + (int)car3);
        car3 = (char)(car2 + 32);

        oFlujoSalida.println(car3 + "" + (int)car3);
    }

}
