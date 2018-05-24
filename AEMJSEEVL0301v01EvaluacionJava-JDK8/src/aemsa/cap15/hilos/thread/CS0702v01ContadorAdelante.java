package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////
// Clase que define un hilo que cuenta ascendentemente mientras
// que el atributo continuar sea true.
//
public class CS0702v01ContadorAdelante extends Thread
{
  private boolean continuar = true;
  
  public CS0702v01ContadorAdelante()
  {
    start();
  }
  
  public CS0702v01ContadorAdelante(String nombreHilo)
  {
    setName(nombreHilo);
    start();
  }
  
  public void run()
  {
    int i = 1;
    while (continuar)
    {
      System.out.println(getName() + " " + i++ + "\r");
    }
    System.out.println();
  }

  public void terminar()
  {
    continuar = false;
  }
}
//////////////////////////////////////////////////////////////////
