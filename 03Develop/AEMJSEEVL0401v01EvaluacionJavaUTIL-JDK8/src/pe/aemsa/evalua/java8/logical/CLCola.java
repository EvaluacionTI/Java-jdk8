package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////
// Cola: lista en la que todas las inserciones se hacen por un
// extremo de la lista (por el final) y todas las supresiones se
// hacen por el otro extremo (por el principio).
//
public class CLCola extends CLListaCircularSE
{
  public CLCola() {}
  
  public void meterEnCola(Object obj)
  {
    anadirAlFinal(obj);
  }
  
  public Object sacarDeCola()
  {
    return borrar();
  }
}
//////////////////////////////////////////////////////////////////
