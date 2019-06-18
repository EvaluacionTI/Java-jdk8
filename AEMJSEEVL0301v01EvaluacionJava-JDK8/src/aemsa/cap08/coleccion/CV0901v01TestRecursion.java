package aemsa.cap08.coleccion;

//////////////////////////////////////////////////////////////////

import aemsa.cap08.coleccion.logica.CLRecursion;
import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;

// Recursividad
//
public class CV0901v01TestRecursion
{
  public static void main(String[] args) throws IOException
  {
    int m, n, a;
    System.out.println("Cálculo de A(m,n)=A(m-1,A(m,n-1))\n");
    System.out.print("Valor de m: "); m = CO06v01LeerTipoDato.datoInt();
    System.out.print("Valor de n: "); n = CO06v01LeerTipoDato.datoInt();
    a = CLRecursion.Ackerman(m,n);
    System.out.println("\nA(" + m + "," + n + ") = " + a);
    a = CLRecursion.AckermanNR(m,n);
    System.out.println("\nA(" + m + "," + n + ") = " + a);
  }
}
//////////////////////////////////////////////////////////////////
