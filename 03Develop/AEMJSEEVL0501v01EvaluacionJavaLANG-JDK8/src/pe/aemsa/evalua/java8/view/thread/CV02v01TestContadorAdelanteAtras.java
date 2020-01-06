package pe.aemsa.evalua.java8.view.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.thread.CS02v01ContadorAdelante;
import pe.aemsa.evalua.java8.utilities.runnable.CS02v01ContadorAtras;

// Hilos.
//
public class CV02v01TestContadorAdelanteAtras
{
  public static void main(String[] args)
  {
    CS02v01ContadorAdelante cuentaAdelante = new CS02v01ContadorAdelante("Contador+");
    CS02v01ContadorAtras objCuentaAtras = new CS02v01ContadorAtras("Contador-");
  }
}
//////////////////////////////////////////////////////////////////
