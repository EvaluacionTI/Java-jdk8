package pe.aemsa.evalua.java8.entity;

/////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CEPersona
//
public class CEPersona
{
  // Atributos
  private String nombre;
  private String direccion;
  private long telefono;
  
  // M�todos
  public CEPersona() {}
  public CEPersona(String nom, String dir, long tel)
  {
    nombre = nom;
    direccion = dir;
    telefono = tel;
  }
  
  public void asignarNombre(String nom)
  {
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
  public void asignarDireccion(String dir)
  {
    direccion = dir;
  }
  
  public String obtenerDireccion()
  {
    return direccion;
  }
  
  public void asignarTelefono(long tel)
  {
    telefono = tel;
  }
  
  public long obtenerTelefono()
  {
    return telefono;
  }
  
  public int tamano()
  {
    // Longitud en bytes de los atributos (un Long = 8 bytes)
    return nombre.length()*2 + direccion.length()*2 + 8;
  }
}
