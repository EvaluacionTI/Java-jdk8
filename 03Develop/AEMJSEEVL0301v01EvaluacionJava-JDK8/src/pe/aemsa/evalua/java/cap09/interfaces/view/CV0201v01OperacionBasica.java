package pe.aemsa.evalua.java.cap09.interfaces.view;

import pe.aemsa.evalua.java.cap09.interfaces.utility.CI0201v01OperacionBasica;
import pe.aemsa.evalua.java.cap09.interfaces.utility.impl.CU0201v01OperacionBasica;


public class CV0201v01OperacionBasica {
    private static CI0201v01OperacionBasica oCIOperacionBasica;
    
    public static void main(String[] args) {
        oCIOperacionBasica = new CU0201v01OperacionBasica();
        
        System.out.println("Suma = " + oCIOperacionBasica.sumar(5, 1));
        System.out.println("Resta = " + oCIOperacionBasica.restar(5, 1));
        System.out.println("Multiplicacion = " + oCIOperacionBasica.multiplicar(5, 1));
        System.out.println("División = " + oCIOperacionBasica.dividir(5, 1));
    }
    
}
