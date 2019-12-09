package aemsa.cap15.hilos.thread;


import aemsa.cap15.hilos.sincronizar.CS04v01SincronizarMatriz;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Hilo consumidor.
//
public class CS04v01Consumidor extends Thread
{
  private CS04v01SincronizarMatriz matriz;
  private boolean continuar = true;
  
  public CS04v01Consumidor(CS04v01SincronizarMatriz m)  // constructor
  {
    matriz = m;
  }

  public void run()
  {
    int numero;

    while (continuar)
    {
      numero = matriz.obtener();
      //System.out.println("CS04v01Consumidor " + getName() +
      //                   " obtuvo:   n�mero " + n�mero);
    }
  }

  public void terminar()
  {
    continuar = false;
  }
}
//////////////////////////////////////////////////////////////////

