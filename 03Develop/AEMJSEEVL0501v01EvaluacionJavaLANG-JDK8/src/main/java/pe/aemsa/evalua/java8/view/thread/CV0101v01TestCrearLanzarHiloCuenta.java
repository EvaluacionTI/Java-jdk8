package pe.aemsa.evalua.java8.view.thread;

import pe.aemsa.evalua.java8.utilities.thread.CS01v01Cuenta;


//////////////////////////////////////////////////////////////////
// Hilos.
//
public class CV0101v01TestCrearLanzarHiloCuenta
{
  public static void main(String[] args)
  {
    int nCuentas = 2; // n�mero de contadores
    // Crear y lanzar el hilo Cuentas
    CS01v01Cuenta oHiloCuentas = new CS01v01Cuenta(nCuentas);
    
    oHiloCuentas.start();
  }
}
//////////////////////////////////////////////////////////////////
