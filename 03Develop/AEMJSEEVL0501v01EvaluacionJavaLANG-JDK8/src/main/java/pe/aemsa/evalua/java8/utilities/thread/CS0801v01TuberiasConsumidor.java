package pe.aemsa.evalua.java8.utilities.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;

//////////////////////////////////////////////////////////////////
// Tuber�as. Hilo consumidor.
//
public class CS0801v01TuberiasConsumidor extends Thread
{
  private PipedReader receptor = null;
  private BufferedReader flujoE = null;
  
  public CS0801v01TuberiasConsumidor(PipedReader re)  // constructor
  {
    receptor = re;
    flujoE = new BufferedReader(receptor);
  }

  public void run()
  {
    while (true)
    {
      obtenerMensaje();
    }
  }
  
  public synchronized void obtenerMensaje()
  {
    String msj = null;

    try
    {
      msj = flujoE.readLine(); // obtener mensaje de la tuber�a
      System.out.println("Consumidor " + getName() +
                         " obtuvo:   " + msj);
    }
    catch (IOException ignorada) {}
  }
  
  protected void finalize() throws IOException
  {
    if (flujoE != null) { flujoE.close(); flujoE = null; }
    if (receptor != null) { receptor.close(); receptor = null; }
  }
}
//////////////////////////////////////////////////////////////////

