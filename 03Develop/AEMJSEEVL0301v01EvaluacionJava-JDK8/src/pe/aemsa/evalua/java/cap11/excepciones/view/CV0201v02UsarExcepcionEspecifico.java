/*
 * .
 */
package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CV0201v02UsarExcepcionEspecifico {

    public static void main(String[] args) {
         System.out.println("Si registra un numero con punto (12,54) o letras genera la excepción  ");
         
        Scanner oScanner = new Scanner(System.in);
        System.out.println("Scanner : " + oScanner);
        
        int iNumero = 0;
        try{
            iNumero = oScanner.nextInt();
            System.out.println("Scanner : " + iNumero);
        }catch(InputMismatchException ex){
            //ex.printStackTrace(); // Este muestra la pila de errores
            System.out.println("No registraste un valor numérico : " + ex.hashCode());
        }finally{
            System.out.println("Terminado satisfactoriamente");
        }
        
    }
    
}
