/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

/**
 *
 * @author INVERTEC
 */
public class CP02v03SwitchEstaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntMes = 4;
        String lStrMensaje="";
        
        switch(lIntMes){
            case 12:
            case 1:
            case 2:
                lStrMensaje = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                lStrMensaje = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                lStrMensaje = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                lStrMensaje = "Otono";
                break;
            default:
                System.out.println("Fuera del rango");
            }
                        System.out.println("Abril está en el periodo de " + lStrMensaje + ".");
    }

}
