package pe.aemsa.evalua.java8.view.thread;


import pe.aemsa.evalua.java8.utilities.thread.CS0801v01TuberiasConsumidor;
import pe.aemsa.evalua.java8.utilities.thread.CS0802v01TuberiasProductor;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;


//////////////////////////////////////////////////////////////////
// Tuber�as.
//
public class CV08v01TestTuberias
{
  public static void main(String[] args)
  {
    try
    {
      PipedWriter emisor = new PipedWriter();
      PipedReader receptor = new PipedReader(emisor);

      CS0802v01TuberiasProductor oCSProductor = new CS0802v01TuberiasProductor(emisor);
      CS0801v01TuberiasConsumidor oCSConsumidor = new CS0801v01TuberiasConsumidor(receptor);

      oCSProductor.start();
      oCSConsumidor.start();
    }
    catch (IOException e) {}
  }
}
//////////////////////////////////////////////////////////////////
