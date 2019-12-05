package pe.aemsa.evalua.java8.view;

import pe.aemsa.evalua.java8.logical.CLRecursion;
import pe.aemsa.evalua.java8.logical.impl.CL0102v01LeerTipoDato;
import java.io.IOException;

// Recursividad
//
public class CV0901v01TestRecursion {

    public static void main(String[] args) throws IOException {
        int m, n, a;
        System.out.println("Cálculo de A(m,n)=A(m-1,A(m,n-1))\n");
        System.out.print("Valor de m: ");
        m = CL0102v01LeerTipoDato.datoInt();
        System.out.print("Valor de n: ");
        n = CL0102v01LeerTipoDato.datoInt();
        a = CLRecursion.Ackerman(m, n);
        System.out.println("\nA(" + m + "," + n + ") = " + a);
        a = CLRecursion.AckermanNR(m, n);
        System.out.println("\nA(" + m + "," + n + ") = " + a);
    }
}
