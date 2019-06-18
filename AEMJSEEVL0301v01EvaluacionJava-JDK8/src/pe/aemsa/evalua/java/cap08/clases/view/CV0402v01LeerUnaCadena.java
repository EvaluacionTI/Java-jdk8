/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CV0402v01LeerUnaCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           // Definir un flujo de caracteres de entrada: flujoE
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader flujoE = new BufferedReader(isr);
    // Definir una referencia al flujo estándar de salida: flujoS
    PrintStream flujoS = System.out;
    String sdato; // variable para almacenar una línea de texto

    try
    {
      flujoS.print("Introduzca un texto: ");
      sdato = flujoE.readLine(); // leer una línea de texto
      flujoS.println(sdato);     // escribir la línea leída
    }
    catch (IOException ignorada) {ignorada.printStackTrace(); }
    }

}
