package pe.aemsa.evalua.java.cap08.clases.view;

/////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java.cap08.clases.view.CO09v03CuentaAhorro;

// Aplicaci�n para trabajar con CCuenta...
//
public class CV0802v01LeerCuentaBanco {

    public static void main(String[] args) {

        CO09v03CuentaAhorro cliente01 = new CO09v03CuentaAhorro();
        CO09v03CuentaAhorro cliente02 = new CO09v03CuentaAhorro("Un nombre", "Una cuenta", 1000000, 3.5, 300);

        cliente01.asignarNombre("Un nombre");
        cliente01.asignarCuenta("Una cuenta");
        cliente01.asignarTipoDeInteres(2.5);
        cliente01.asignarCuotaManten(300);

        cliente01.ingreso(1000000);
        cliente01.reintegro(500000);
        cliente01.comisiones();

        System.out.println(cliente01.obtenerNombre());
        System.out.println(cliente01.obtenerCuenta());
        System.out.println(cliente01.estado());
        System.out.println(cliente01.obtenerTipoDeInteres());
    }
}
