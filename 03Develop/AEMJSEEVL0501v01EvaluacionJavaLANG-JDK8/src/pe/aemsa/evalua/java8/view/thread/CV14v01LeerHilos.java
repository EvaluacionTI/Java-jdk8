package pe.aemsa.evalua.java8.view.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.runnable.CS02v01ContadorAtras;
import pe.aemsa.evalua.java8.utilities.thread.CS02v01ContadorAdelante;

// Hilos.
//
public class CV14v01LeerHilos
{
  public static void main(String[] args)
  {
    CS02v01ContadorAdelante cuentaAdelante = new CS02v01ContadorAdelante("Contador+");
    CS02v01ContadorAtras objCuentaAtras = new CS02v01ContadorAtras("Contador-");
  }
}
//////////////////////////////////////////////////////////////////
