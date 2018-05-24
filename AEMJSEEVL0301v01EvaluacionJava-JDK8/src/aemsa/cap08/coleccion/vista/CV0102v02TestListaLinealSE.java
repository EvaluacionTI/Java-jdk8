package aemsa.cap08.coleccion.vista;

//////////////////////////////////////////////////////////////////

import aemsa.cap08.coleccion.logica.CLListaLinealSE;
import aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.IOException;

// Crear una lista lineal simplemente enlazada
//
public class CV0102v02TestListaLinealSE
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
    int i = 0;
    double d = lse.obtener(i);
    while (!Double.isNaN(d))
    {
      System.out.print(d + " ");
      i++;
      d = lse.obtener(i);
    }
  }
}
