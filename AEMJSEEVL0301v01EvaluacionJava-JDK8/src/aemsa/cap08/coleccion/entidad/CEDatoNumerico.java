package aemsa.cap08.coleccion.entidad;

public class CEDatoNumerico
{
  // Atributos
  private int inf, sup;

  // M�todos
  public CEDatoNumerico(int i, int s) // constructor con par�metros
  {
    inf = i;
    sup = s;
  }
  
  public int obtenerInf()
  {
    return inf;
  }
  
  public int obtenerSup()
  {
    return sup;
  }
}
