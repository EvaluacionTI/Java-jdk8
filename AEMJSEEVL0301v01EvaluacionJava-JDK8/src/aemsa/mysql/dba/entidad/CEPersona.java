package aemsa.mysql.dba.entidad;

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CPersona
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
}
