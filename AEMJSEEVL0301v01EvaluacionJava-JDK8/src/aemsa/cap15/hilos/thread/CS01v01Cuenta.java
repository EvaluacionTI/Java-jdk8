package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////
// Clase que define un hilo CS01v01Cuenta que lanza hilos de la clase
// ContadorAdelante.
//
public class CS01v01Cuenta extends Thread
{
  private static int nCuentas;

  private CS01Contador500000[] cuenta;

  public CS01v01Cuenta(int n)
  {
    nCuentas = n; // n�mero de hilos contadores
    // Establecer la prioridad de este hilo
    setPriority((nCuentas+2)%Thread.MAX_PRIORITY);
    // Crear y establecer las prioridades de los hilos contador
    cuenta = new CS01Contador500000[nCuentas];
    for (int i = 0; i < nCuentas; i++)
    {
      cuenta[i] = new CS01Contador500000();
      cuenta[i].setPriority((i+3)%Thread.MAX_PRIORITY-1);
    }
  }

  public void run()
  {
    int i;
    boolean hayaHilosVivos;

    // Mostrar el nombre y la prioridad de este hilo
    System.out.println(this.getName() + ", P-" +
                       this.getPriority());

    // Lanzar los hilos contadores para su ejecuci�n
    for (i = 0; i < nCuentas; i++)
      cuenta[i].start();

    do
    {
      // Mostrar nombre del hilo, prioridad y estado de la cuenta
      for (i = 0; i < nCuentas; i++)
        System.out.print(cuenta[i].getName() +
                         ", P-" + cuenta[i].getPriority() + " " +
                         cuenta[i].cuenta + " ");
      System.out.print("\r");

      // �Hay hilos vivos?
      hayaHilosVivos = cuenta[0].isAlive();
      for (i = 1; i < nCuentas; i++)
        hayaHilosVivos = hayaHilosVivos || cuenta[i].isAlive();

      // Ahora el hilo dormir� nMilisegundos, mientras los hilos
      // contadores siguen su curso.
      try
      {
        int nMilisegundos = (int)(10 * Math.pow(2,nCuentas));
        sleep(nMilisegundos);
      }
      catch (InterruptedException e) { }
    }
    while (hayaHilosVivos);
  }    
}
//////////////////////////////////////////////////////////////////
