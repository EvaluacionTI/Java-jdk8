/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO09v04CuentaCorriente;

public class CV0801v01CuentaBancaria {

  public static void main (String[] args){
    // Abrir una cuenta con 1.000.000 a un 2%
    CO09v04CuentaCorriente Cuenta01 = new CO09v04CuentaCorriente();
    Cuenta01.ingreso(1000000);
    Cuenta01.obtenerTipoDeInteres();

    // Operaciones
    System.out.println(Cuenta01.intereses());
    Cuenta01.ingreso(500000);
    Cuenta01.reintegro(200000);
    System.out.println(Cuenta01.estado());
    Cuenta01.ingreso(500);
    System.out.println(Cuenta01.estado());
  }
}

