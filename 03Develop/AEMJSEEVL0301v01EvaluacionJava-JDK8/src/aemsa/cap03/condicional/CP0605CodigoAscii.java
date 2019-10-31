/* ===========================================================================================================================
 * Proyecto                 :
 * Aplicacion
 * Modulo
 * Author
 * Fecha
 * Descripcion
 * 
 */
package aemsa.cap03.condicional;

import java.io.IOException;


public class CP0605CodigoAscii {

    public static void main(String[] args) throws IOException {

      // Código ASCII de cada uno de los caracteres de un texto
        final char lsEof = (char)-1;
        char lsCaracter = 0; // car = caracter nulo \0
        
        try{
          System.out.println("Introduzca una cadena de texto.");
          System.out.println("Para terminar pulse Ctrl+z\n");

          while ((lsCaracter = (char)System.in.read()) != lsEof){
              
              if (lsCaracter != '\r' && lsCaracter != '\n')
                    System.out.println("El código ASCII de " + lsCaracter + " es " + (int)lsCaracter);
          }
              
        }catch(IOException ex){
            throw ex;
        }

    }
}
