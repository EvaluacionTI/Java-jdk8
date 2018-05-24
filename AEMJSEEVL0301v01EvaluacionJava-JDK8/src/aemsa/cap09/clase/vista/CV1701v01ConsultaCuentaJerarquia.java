package aemsa.cap09.clase.vista;

/////////////////////////////////////////////////////////////////

import aemsa.cap09.clase.CO09v03CuentaAhorro;
import aemsa.cap09.clase.CO09v05CuentaCorrienteConIn;

// Aplicaci�n para trabajar con CCuenta...
//
public class CV1701v01ConsultaCuentaJerarquia
{
  public static void main(String[] args)
  {
    CO09v03CuentaAhorro cliente01 = new CO09v03CuentaAhorro("Un nombre", "Una cuenta", 10000, 3.5, 30);

    System.out.println(cliente01.obtenerNombre());
    System.out.println(cliente01.obtenerCuenta());
    System.out.println(cliente01.estado());
    System.out.println(cliente01.obtenerTipoDeInteres());
    System.out.println(cliente01.intereses());
    
    CO09v05CuentaCorrienteConIn cliente02 = new CO09v05CuentaCorrienteConIn();
    cliente02.asignarNombre("cliente 02");
    cliente02.asignarCuenta("1234567890");
    cliente02.asignarTipoDeInteres(3.0);
    cliente02.asignarTransExentas(0);
    cliente02.asignarImportePorTrans(1.0);

    cliente02.ingreso(20000);
    cliente02.reintegro(10000);
    cliente02.intereses();
    cliente02.comisiones();
    System.out.println(cliente02.obtenerNombre());
    System.out.println(cliente02.obtenerCuenta());
    System.out.println(cliente02.estado());
  }
}
