package aemsa.cap03.condicional;


import java.io.IOException;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CP0603ContarPalabras
{
  // Contar caracteres, palabras y l�neas en un texto 
  public static void main(String[] args)
  {
    final char eof = (char)-1;
    char car;
    boolean palabra = false;
    int ncaracteres = 0, npalabras = 0, nlineas = 0;
    
    try
    {
      System.out.println("Introducir texto. " +
                         "Pulse [Entrar] despu�s de cada l�nea.");
      System.out.println("Para finalizar pulsar Ctrl+z.\n");
      while ((car = (char)System.in.read()) != eof)
      {
        // [Entrar] = CRLF = \r\n
        if (car == '\r') continue; // le sigue un \n
        ncaracteres++;   // contador de caracteres
        // Eliminar blancos, tabuladores y finales de l�nea
        // entre palabras
        if (car == ' ' || car == '\n' || car == '\t')
          palabra = false;
        else if (!palabra) // comienza una palabra
        {
          npalabras++;   // contador de palabras
          palabra = true;
        }
        if (car == '\n') // finaliza una l�nea
          nlineas++;     // contador de l�neas
      }
      System.out.println();
      System.out.println(ncaracteres + " " + npalabras + " " +
                         nlineas);
    }
    catch(IOException ignorada) {}
  }
}
