package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO03v02Persona;

public class CV0202v01LlamarClaseExternaPersona
{
  public static void main(String[] args)
  {
    CO03v02Persona unaPersona = new CO03v02Persona("Su nombre", 22, 2, 2002);
    System.out.println(unaPersona.obtenerNombre());
    System.out.println(unaPersona.obtenerFechaNa());
  }
}
