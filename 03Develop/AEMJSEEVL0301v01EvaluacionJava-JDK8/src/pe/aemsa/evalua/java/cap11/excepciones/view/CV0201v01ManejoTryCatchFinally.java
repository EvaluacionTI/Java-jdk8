/*
 * .
 */
package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.util.Scanner;

public class CV0201v01ManejoTryCatchFinally {

    public static void main(String[] args) {
         System.out.println("Si registra un numero negativo, con punto o letras genera la excepción  ");
         
        Scanner oScanner = new Scanner(System.in);
        System.out.println("Scanner : " + oScanner);
        
        int iNumero = 0;
        try{
            iNumero = oScanner.nextInt();
            System.out.println("Scanner : " + iNumero);
        }catch(Exception ex){
            ex.printStackTrace(); // Este muestra la pila de errores
            //System.out.println("No registraste un valor numérico  ");
        }
        
    }
    
}
