package aemsa.cap15.hilos.thread;

import aemsa.cap15.hilos.sincronizar.CS04v01SincronizarMatriz;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Hilo productor.
//
public class CS04v02Productor extends Thread
{
  private CS04v01SincronizarMatriz matriz;
  private boolean continuar = true;
  
  public CS04v02Productor(CS04v01SincronizarMatriz m) // constructor
  {
    matriz = m;
  }

  public void run()
  {
    int numero; // n�mero producido

    while (continuar)
    {
      numero = (int)(Math.random() * 100);
      matriz.almacenar(numero); // almacena el n�mero
      //System.out.println("CS04v02Productor  " + getName() +
      //                   " almacena: n�mero " + n�mero);
    }
  }

  public void terminar()
  {
    continuar = false;
  }
}
//////////////////////////////////////////////////////////////////
