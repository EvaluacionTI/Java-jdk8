/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0602ContinueConEtiqueta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        salida: for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if (j > i){
                    System.out.println();
                    continue salida;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }

}
