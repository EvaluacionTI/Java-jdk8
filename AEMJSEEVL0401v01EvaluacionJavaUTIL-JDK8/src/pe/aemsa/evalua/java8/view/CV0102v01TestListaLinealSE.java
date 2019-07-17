package pe.aemsa.evalua.java8.view;

import java.io.IOException;
import pe.aemsa.evalua.java8.logical.CLListaLinealSE;
//////////////////////////////////////////////////////////////////
// Crear una lista lineal simplemente enlazada
//
public class CV0102v01TestListaLinealSE
{
  public static void main(String[] args) throws IOException
  {
    // Crear una lista lineal vac�a
    CLListaLinealSE lse = new CLListaLinealSE();
    
    // Leer datos reales y a�adirlos a la lista
    double n;
    boolean eof = true;
    System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
    System.out.print("dato: ");
    while (Double.isNaN(n = CO06v01LeerTipoDato.datoDouble()) != eof)
    {
      lse.anadirAlPrincipio(n);
      System.out.print("dato: ");
    }

    // Mostrar la lista de datos
    System.out.println();
    lse.mostrarTodos();
  }
}
