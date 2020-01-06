package pe.aemsa.evalua.java8.utilities.thread;

//////////////////////////////////////////////////////////////////
// Clase que define un hilo contador.
//
public class CS01Contador500000 extends Thread{
  public int cuenta;
  private double suma = 0;

  public void run()
  {
    for (cuenta = 0; cuenta < 500000; cuenta++)
    {
      // Realizar algunos c�lculos
      suma += Math.random();
    }
  }
  // Otros m�todos
}
