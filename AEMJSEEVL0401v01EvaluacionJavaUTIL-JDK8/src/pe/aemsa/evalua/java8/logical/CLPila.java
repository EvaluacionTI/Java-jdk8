package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////
// Pila: lista en la que todas las inserciones y supresiones se
// hacen en un extremo de la misma.
//
public class CLPila extends CLListaCircularSE
{
  public CLPila() {}
  
  public void meterEnPila(Object obj)
  {
    anadirAlPrincipio(obj);
  }
  
  public Object sacarDePila()
  {
    return borrar();
  }
}
//////////////////////////////////////////////////////////////////
