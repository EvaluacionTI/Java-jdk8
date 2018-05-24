/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0502BreakSalirBucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 0;

        while(i < 100){
            if(i==10) break;
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Bucle While Completo");
    }

}
