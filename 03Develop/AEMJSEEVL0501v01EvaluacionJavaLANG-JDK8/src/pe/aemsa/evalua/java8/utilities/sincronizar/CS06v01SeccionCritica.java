package pe.aemsa.evalua.java8.utilities.sincronizar;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Secci�n cr�tica.
//
public class CS06v01SeccionCritica
{
  // Atributos
  private double[] dato;
  private int ind = 0;
  public int tamano;
  
  // M�todos
  public CS06v01SeccionCritica(int n)
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

  public synchronized int calculos(String hilo)
  {
    if (ind >= tamano) return tamano;
    double x = Math.random();
    System.out.println(hilo + " tomo la muestra " + ind);
    asignar(x, ind);
    ind++;
    return ind;
  }
}
//////////////////////////////////////////////////////////////////
