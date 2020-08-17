/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0504BreakGoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean lBlnVerdad = true;

        primero:{
            segundo:{
                tercero:{
                    System.out.println("Antes del Break");
                    if (lBlnVerdad) break segundo;
                    System.out.println("Se ejecuta en tercero");
                }
                System.out.println("Se ejecuta en segundo");
            }
            System.out.println("Se ejecuta en primero");
        }
    }

}
