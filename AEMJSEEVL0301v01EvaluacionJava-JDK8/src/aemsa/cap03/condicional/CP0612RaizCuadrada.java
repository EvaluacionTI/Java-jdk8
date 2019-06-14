package aemsa.cap03.condicional;

import java.io.IOException;

import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CP0612RaizCuadrada
{
  // Ra�z cuadrada. M�todo de Newton.
  public static void main(String[] args) throws IOException
  {
    double n;        // n�mero
    double aprox;    // aproximaci�n a la ra�z cuadrada
    double antaprox; // anterior aproximaci�n a la ra�z cuadrada
    double epsilon;  // coeficiente de error
        
    do
    {
      System.out.print("N�mero: ");
      n = CO06v01LeerTipoDato.datoDouble();
    }
    while ( n < 0 );
    do
    {
      System.out.print("Ra�z cuadrada aproximada: ");
      aprox = CO06v01LeerTipoDato.datoDouble();
    }
    while ( aprox <= 0 );
    do
    {
    System.out.print("Coeficiente de error: ");
    epsilon = CO06v01LeerTipoDato.datoDouble();
    }
    while ( epsilon <= 0 );
    do
    {
      antaprox = aprox;
      aprox = (n/antaprox + antaprox) / 2;
    }
    while (Math.abs(aprox - antaprox) >= epsilon);
    System.out.println("La ra�z cuadrada de " + n + " es " + aprox);
  }
}
