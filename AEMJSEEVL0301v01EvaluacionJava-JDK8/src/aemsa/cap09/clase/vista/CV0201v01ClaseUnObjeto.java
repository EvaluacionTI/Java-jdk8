/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap09.clase.vista;

import java.io.IOException;

public class CV0201v01ClaseUnObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     int n;
    try
    {
      System.out.print("Dato: ");
      n = System.in.read(); // leer un carácter desde el teclado
      System.out.println((char)n); // visualizar el carácter

      // Investigamos
      Class ObjetoClass; // objeto Class
      ObjetoClass = System.in.getClass();
      System.out.println("Clase de in:  " + ObjetoClass.getName());
      ObjetoClass = System.out.getClass();
      System.out.println("Clase de out: " + ObjetoClass.getName());
      ObjetoClass = System.err.getClass();
      System.out.println("Clase de err: " + ObjetoClass.getName());

      System.out.println("Clase de Primitivo: " + ObjetoClass.isPrimitive());
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    }

}
