package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////
// Lista lineal simplemente enlazada
//
public class CLListaLinealSE
{
  // p: referencia al primer elemento de la lista
  private CElemento p = null;

  // Elemento de una lista lineal simplemente enlazada
  private class CElemento
  {
    // Atributos
    private double dato;
    private CElemento siguiente; // siguiente elemento
    // M�todos
    private CElemento() {} // constructor
  }

  public CLListaLinealSE() {} // constructor
  
  // A�adir un elemento al principio de la lista
  public void anadirAlPrincipio(double n)
  {
    CElemento q = new CElemento();
    q.dato = n;      // asignaci�n de valores
    q.siguiente = p; // reasignaci�n de referencias
    p = q;
  }
  
  public void mostrarTodos()
  {
    // Recorrer la lista
    CElemento q = p; // referencia al primer elemento
    while (q != null)
    {
      System.out.print(q.dato + " ");
      q = q.siguiente;
    }
  }
  
  public double obtener(int i){
      return i;
  }
}
//////////////////////////////////////////////////////////////////
