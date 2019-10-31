/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

/**
 *
 * @author INVERTEC
 */
public class CP02v02Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<6; i++)
            switch(i){
                case 0:
                    System.out.println("i es Cero");
                    break;
                case 1:
                    System.out.println("i es Uno");
                    break;
                case 2:
                    System.out.println("i es Dos");
                    break;
                case 3:
                    System.out.println("i es Tres");
                    break;
                default:
                    System.out.println("i es mayor que 3");
            }
    }

}
