package aemsa.cap09.clase;

/**
 * CONCEPTO CLASE: Es la creaci�n de una clase con sus miembros (atributos) y
 *                                sus m�todos que son las operaciones que defines su comportamiento
 */

public class CO0102v01DefineClaseInterna {
      public String Marca;
      public String Procesador;
      public String Pantalla;
      public boolean OrdenadorEncendido;
      public boolean Presentacion;

      public void EncenderOrdenador()
      {
        if (OrdenadorEncendido == true) // si est� encendido...
          System.out.println("El ordenador ya est� encendido.");
        else // si no est� encendido, encenderlo.
        {
          OrdenadorEncendido = true;
          System.out.println("El ordenador se ha encendido.");
        }
      }

      public void Estado()
      {
        System.out.println("\nEstado del ordenador:" +
                           "\nMarca " + Marca +
                           "\nProcesador " + Procesador +
                           "\nPantalla " + Pantalla + "\n");
        if (OrdenadorEncendido == true) // si el ordenador est� encendido...
          System.out.println("El ordenador est� encendido.");
        else // si no est� encendido...
          System.out.println("El ordenador est� apagado.");
      }
}
