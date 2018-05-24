/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

import java.io.IOException;

/**
 *
 * @author INVERTEC
 */
public class Main0202DoWhileMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        char lChrOpcion;

        do{
            System.out.println("Ayuda de Opciones");
            System.out.println("1. If");
            System.out.println("2. Switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("Seleccione opciones:");
            lChrOpcion = (char) System.in.read();
        }while (lChrOpcion < '1' || lChrOpcion > '5');

        System.out.println("\n");

        switch(lChrOpcion){
            case '1':
                System.out.println("La condición IF");
                break;
            case '2':
                System.out.println("La condición Switch");
                break;
            case '3':
                System.out.println("La condición While");
                break;
            case '4':
                System.out.println("La condición Do While");
                break;
            case '5':
                System.out.println("La condición For");
                break;
        }
    }

}
