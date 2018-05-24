package aemsa.cap15.hilos;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.runnable.CS02v01ContadorAtras;
import aemsa.cap15.hilos.thread.CS02v01ContadorAdelante;

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
