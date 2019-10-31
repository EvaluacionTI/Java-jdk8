package aemsa.cap15.hilos.sincronizar;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos: wait y notify.
//
public class CS04v01SincronizarMatriz
{
  private int[] m;
  private int indProd = 0; // �ndice productor
  private int indCons = 0; // �ndice consumidor
  private int elementosVacios, elementosLlenos;
  
  public CS04v01SincronizarMatriz(int n)
  {
    if (n < 1) n = 10;
    m = new int[n];
    elementosVacios = m.length;
    elementosLlenos = 0;
  }

  public synchronized void almacenar(int num)
  {
    // Esperar a que haya elementos vac�os
    while (elementosVacios == 0)
    {
      try
      {
        wait(); // el hilo se pone a dormir y cede el monitor
      }
      catch (InterruptedException e) { }
    }
    elementosVacios--;
    elementosLlenos++;
    System.out.print("vacíos: " + elementosVacios + ", llenos: " +
                     elementosLlenos + "  \r");
    m[indProd] = num;
    indProd = (indProd + 1) % m.length;
    // Despertar hilos;
    notifyAll();
  }

  public synchronized int obtener()
  {
    // Esperar a que haya elementos llenos
    while (elementosLlenos == 0)
    {
      try
      {
        wait(); // el hilo se pone a dormir y cede el monitor
      }
      catch (InterruptedException e) { }
    }
    elementosVacios++;
    elementosLlenos--;
    System.out.print("vacíos: " + elementosVacios + ", llenos: " +
                     elementosLlenos + "  \r");
    int num =  m[indCons];
    indCons = (indCons + 1) % m.length;
    notifyAll();
    return num;
  }
}
//////////////////////////////////////////////////////////////////
