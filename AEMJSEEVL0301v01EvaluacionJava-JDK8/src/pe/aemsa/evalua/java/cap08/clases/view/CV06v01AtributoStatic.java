package pe.aemsa.evalua.java.cap08.clases.view;


public class CV06v01AtributoStatic
{
  public static void main (String[] args)
  {
    COrdenador.EstablecerGarantia((byte)3);
  }
}

class COrdenador{
  private String mStrMarca;
  private String mStrProcesador;
  private String mStrPantalla;
  private static byte mIntGarantia;
  private boolean mBlnOrdenadorEncendido;
  private boolean mBlnPresentacion;
  // ...
  
  public static void EstablecerGarantia(byte g)
  {
    mIntGarantia = g; // Garant�a es un miembro de la clase
  }
}
