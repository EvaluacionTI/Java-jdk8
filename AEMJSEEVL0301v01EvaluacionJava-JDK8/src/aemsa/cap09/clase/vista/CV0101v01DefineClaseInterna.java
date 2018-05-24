package aemsa.cap09.clase.vista;


/**
 *
 *
 *  CONCEPTO: En la clase principal como es main se puede definir una clase ordenador este con sus miembros y métodos.
 */
public class CV0101v01DefineClaseInterna {

     public static void main(String[] args) {
        // TODO code application logic here
        COComputadora oMiOrdenador = new COComputadora();

        System.out.println("En la misma clase principal se define un clase secundaria");
        oMiOrdenador.Marca = "Ast";
        oMiOrdenador.Procesador = "Intel Pentium";
        oMiOrdenador.Pantalla = "TFT";
        oMiOrdenador.EncenderOrdenador();
        oMiOrdenador.Estado();
        System.out.println("Hash code = " + oMiOrdenador.hashCode());
  }

}
class COComputadora
{
  String Marca;
  String Procesador;
  String Pantalla;
  boolean OrdenadorEncendido;
  boolean Presentacion;

  void EncenderOrdenador()
  {
    if (OrdenadorEncendido == true) // si está encendido...
      System.out.println("El ordenador ya está encendido.");
    else // si no está encendido, encenderlo.
    {
      OrdenadorEncendido = true;
      System.out.println("El ordenador se ha encendido.");
    }
  }

  void Estado()
  {
    System.out.println("\nEstado del ordenador:" +
                       "\nMarca " + Marca +
                       "\nProcesador " + Procesador +
                       "\nPantalla " + Pantalla + "\n");
    if (OrdenadorEncendido == true) // si el ordenador está encendido...
      System.out.println("El ordenador está encendido.");
    else // si no está encendido...
      System.out.println("El ordenador está apagado.");
  }
}
