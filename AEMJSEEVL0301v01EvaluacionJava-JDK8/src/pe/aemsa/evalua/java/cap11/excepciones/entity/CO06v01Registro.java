package pe.aemsa.evalua.java.cap11.excepciones.entity;

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CO06v01Registro
//
public class CO06v01Registro
{
  // Atributos
  private String referencia;
  private double precio;
  
  // M�todos
  public CO06v01Registro() {}
  public CO06v01Registro(String ref, double pre)
  {
    referencia = ref;
    precio = pre;
  }
  
  public void asignarReferencia(String ref)
  {
    referencia = ref;
  }
  
  public String obtenerReferencia()
  {
    return referencia;
  }
  
  public void asignarPrecio(double pre)
  {
    precio = pre;
  }
  
  public double obtenerPrecio()
  {
    return precio;
  }
  
  public int tamano()
  {
    // Longitud en bytes de los atributos (un Double = 8 bytes)
    return referencia.length()*2 + 8;
  }
}
