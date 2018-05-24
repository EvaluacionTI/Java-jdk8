/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap09.clase.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CV1301v02TestNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InputStreamReader oISR = new InputStreamReader(System.in);

        BufferedReader oFlujoEntrada = new BufferedReader(oISR);

        PrintStream FlujoSalida = System.out;

        char car = 0;
        try{
            FlujoSalida.print("Caracter :");
            car  = (char)oFlujoEntrada.read();

            FlujoSalida.println(car);

            FlujoSalida.print("Caracter :");
            car  = (char)oFlujoEntrada.read();

            FlujoSalida.println(car);
        }catch(IOException ex){}


    }

}
