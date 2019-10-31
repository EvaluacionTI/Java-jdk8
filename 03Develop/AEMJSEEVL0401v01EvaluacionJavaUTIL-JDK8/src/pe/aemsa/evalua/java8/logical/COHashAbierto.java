package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////

import aemsa.cap08.coleccion.entidad.CEAlumno;


//////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CHashAbierto. Redefine
// los m�todos: fa (funci�n de acceso) y comparar.
//
public class COHashAbierto extends CLHashAbierto
{
  public COHashAbierto(int nElementos)
  {
    super(nElementos);
  }
  
  public int fa(Object obj)
  {
    return (int)((CEAlumno)obj).obtenerMatricula() % numeroDeElementos();
  }
  
  public int comparar(Object obj1, Object obj2)
  {
    if (((CEAlumno)obj1).obtenerMatricula() ==
           ((CEAlumno)obj2).obtenerMatricula())
      return 0;
    else
      return 1;
  }
}
//////////////////////////////////////////////////////////////////