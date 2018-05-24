package aemsa.cap08.coleccion.entidad;

/////////////////////////////////////////////////////////////////

// Definici�n de la clase CAlumno
//
public class CEAlumno
{
  // Atributos
  private int matricula;
  private String nombre;
  
  // M�todos
  public CEAlumno() {}
  public CEAlumno(String nom, int mat)
  {
    nombre = nom;
    matricula = mat;
  }
  
  public void asignarNombre(String nom)
  {
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
  public void asignarMatricula(int mat)
  {
    matricula = mat;
  }
  
  public long obtenerMatricula()
  {
    return matricula;
  }
}
