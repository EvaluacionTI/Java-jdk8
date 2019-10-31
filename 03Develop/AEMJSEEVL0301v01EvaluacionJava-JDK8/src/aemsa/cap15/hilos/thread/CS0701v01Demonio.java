package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////
// Hilo demonio. Suena "bip" aproximadamente cada segundo
//
public class CS0701v01Demonio extends Thread
{
  public CS0701v01Demonio()
  {
    setDaemon(true);
    start();
  }
  
  public void run()
  {
    char bip = '\u0007';
    while (true)
    {
      try
      {
        sleep(1000); // duerme durante 1 segundo
      }
      catch (InterruptedException e) {}
      System.out.print(bip);
    }
  }
}
//////////////////////////////////////////////////////////////////
