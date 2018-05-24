/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0505BreakAnidadoExterior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        salida: for(int i=0; i < 3; i++){
            System.out.println("Paso " + i + " : ");

            for (int j=0; j<100; j++){
                if(j==10) break salida;
                System.out.print( j + " ");
            }
            System.out.print("Esto no se imprime");
        }
        System.out.print("Bucle completo con break anidado exterior");
    }

}
