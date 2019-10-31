package aemsa.cap15.hilos.modelo;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Secci�n cr�tica.
//
public class CD06v02SeccionCritica
{
  // Atributos
  private double[] dato;
  public int ind = 0;
  public int tamano;
  
  // M�todos
  public CD06v02SeccionCritica(int n)
  {
    if (n < 1) n = 10;
    tamano = n;
    dato = new double[n];
  }

  public double obtener(int i)
  {
    return dato[i];
  }

  public void asignar(double x, int i)
  {
    dato[i] = x;
  }
}
//////////////////////////////////////////////////////////////////
