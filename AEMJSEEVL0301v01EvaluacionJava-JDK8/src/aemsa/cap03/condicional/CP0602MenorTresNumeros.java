package aemsa.cap03.condicional;

import java.io.IOException;

import aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CP0602MenorTresNumeros
{
  // Menor de tres números a, b y c
   
  public static void main(String[] args) throws IOException
  {
        float a, b, c, menor;

        // Leer los valores de a, b y c
        System.out.print("a : "); a = CO06v01LeerTipoDato.datoFloat();
        System.out.print("b : "); b = CO06v01LeerTipoDato.datoFloat();
        System.out.print("c : "); c = CO06v01LeerTipoDato.datoFloat();
        // Obtener el menor
        if (a < b)
          if (a < c)
            menor = a;
          else
            menor =c;
        else
          if (b < c)
            menor = b;
          else
            menor = c;
        System.out.println("Menor = " + menor);
  }
}
