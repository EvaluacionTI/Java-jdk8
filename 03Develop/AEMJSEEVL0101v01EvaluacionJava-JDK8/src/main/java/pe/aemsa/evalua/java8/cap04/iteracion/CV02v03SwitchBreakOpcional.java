/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class CV02v03SwitchBreakOpcional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i<12; i++)
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i es menor que CINCO");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i es mayor que DIEZ");
                    break;
                default:
                    System.out.println("i es menor es DIEZ o MAS");

            }
    }

}
