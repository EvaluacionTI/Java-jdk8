/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

public class CV01v08IfMultipleEstaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntMes = 4;
        String lStrMensaje;

        if (lIntMes == 12 || lIntMes == 1 || lIntMes == 2)
            lStrMensaje = "Invierno";
        else if (lIntMes == 3 || lIntMes == 4 || lIntMes == 5)
                lStrMensaje = "Primavera";
        else if (lIntMes == 6 || lIntMes == 7 || lIntMes == 8)
            lStrMensaje = "Verano";
        else if (lIntMes == 9 || lIntMes == 10 || lIntMes == 11)
            lStrMensaje = "Otono";
        else
            lStrMensaje = "Fuera del mes";

        System.out.println("Abril está en el periodo de " + lStrMensaje);
    }

}
