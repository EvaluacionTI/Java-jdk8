/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

/**
 *
 * @author INVERTEC
 */
public class CP02v04SwitchAnidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntContar;
        int lIntDestino;

        lIntContar = 1;
        lIntDestino = 1;

        switch(lIntContar){
            case 1:
                switch(lIntDestino){
                    case 0:
                        System.out.println("Destino es cero");
                        break;
                    case 1:
                        System.out.println("Destino es uno");
                        break;

                }
            case 2:
        }
    }

}
