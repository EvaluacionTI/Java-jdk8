/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0501BreakSalirBucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i< 100; i++){
            if(i==10) break;
            System.out.println("i = " + i);
        }
        System.out.println("Bucle For completo");
    }

}
