package aemsa.cap15.hilos.thread;


import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

//////////////////////////////////////////////////////////////////
// Tuber�as. Hilo productor.
//
public class CS0802v01TuberiasProductor extends Thread
{
  private PipedWriter emisor = null;
  private PrintWriter flujoS = null;

  public CS0802v01TuberiasProductor(PipedWriter em) // constructor
  {
    emisor = em;
    flujoS = new PrintWriter(emisor);
  }

  public void run()
  {
    while (true)
    {
      almacenarMensaje();
      try
      {
        int msegs = (int)(Math.random() * 100);
        // Poner a dormir el hilo hasta que se produzca el
        // siguiente mensaje.
        sleep(msegs);
      }
      catch (InterruptedException e) { }
    }
  }
  
  public synchronized void almacenarMensaje()
  {
    int numeroMsj;       // n�mero de mensaje
    String textoMensaje; // texto mensaje
    
    numeroMsj = (int)(Math.random() * 100);
    // Suponer operaciones para buscar el mensaje en una tabla
    // de mensajes; resultado:
    textoMensaje = "mensaje #" + numeroMsj;
    flujoS.println(textoMensaje); // enviar mensaje por la tuber�a
    System.out.println("Productor  " + getName() +
                       " almacena: " + textoMensaje);
  }
  
  protected void finalize() throws IOException
  {
    if (flujoS != null) { flujoS.close(); flujoS = null; }
    if (emisor != null) { emisor.close(); emisor = null; }
  }
}
//////////////////////////////////////////////////////////////////
