package aemsa.cap09.clase.vista;

/////////////////////////////////////////////////////////////////

import aemsa.cap09.clase.CO06v01LeerTipoDato;
import aemsa.cap09.clase.CO09v01Banco;
import aemsa.cap09.clase.CO09v02Cuenta;
import aemsa.cap09.clase.CO09v03CuentaAhorro;
import aemsa.cap09.clase.CO09v04CuentaCorriente;
import aemsa.cap09.clase.CO09v05CuentaCorrienteConIn;
import java.io.IOException;
import java.io.PrintStream;

// Aplicacion para trabajar con la clase CO09v01Banco y la jerarquoa
// de clases derivadas de CO09v02Cuenta
//
public class CV1507v03CalcularSaldoCuentaBanco {
    // Para la entrada de datos se utiliza Leer.class

    public static CO09v02Cuenta leerDatos(int op) throws IOException {
        
        CO06v01LeerTipoDato Leer = new CO06v01LeerTipoDato();
        
        CO09v02Cuenta obj = null;
        String nombre, cuenta;
        double saldo, tipoi, mant;
        System.out.print("Nombre.................: ");
        nombre = Leer.dato();
        System.out.print("Cuenta.................: ");
        cuenta = Leer.dato();
        System.out.print("Saldo..................: ");
        saldo = Leer.datoDouble();
        System.out.print("Tipo de interos........: ");
        tipoi = Leer.datoDouble();
        if (op == 1) {
            System.out.print("Mantenimiento..........: ");
            mant = Leer.datoDouble();
            obj = new CO09v03CuentaAhorro(nombre, cuenta, saldo, tipoi, mant);
        } else {
            int transex;
            double imptrans;
            System.out.print("Importe por transaccion: ");
            imptrans = Leer.datoDouble();
            System.out.print("Transacciones exentas..: ");
            transex = Leer.datoInt();
            if (op == 2) {
                obj = new CO09v04CuentaCorriente(nombre, cuenta, saldo, tipoi,
                        imptrans, transex);
            } else {
                obj = new CO09v05CuentaCorrienteConIn(nombre, cuenta, saldo,
                        tipoi, imptrans, transex);
            }
        }
        return obj;
    }

    public static int meno() throws IOException {
        CO06v01LeerTipoDato Leer = new CO06v01LeerTipoDato();
        
        System.out.print("\n\n");
        System.out.println("1. Saldo");
        System.out.println("2. Buscar siguiente");
        System.out.println("3. Ingreso");
        System.out.println("4. Reintegro");
        System.out.println("5. Aoadir");
        System.out.println("6. Eliminar");
        System.out.println("7. Mantenimiento");
        System.out.println("8. Salir");
        System.out.println();
        System.out.print("   Opcion: ");
        int op;
        do {
            op = Leer.datoInt();
        } while (op < 1 || op > 8);
        return op;
    }

    public static void main(String[] args) throws IOException {
        CO06v01LeerTipoDato Leer = new CO06v01LeerTipoDato();
        
        // Definir una referencia al flujo estondar de salida: flujoS
        PrintStream flujoS = System.out;

        // Crear un objeto banco vacoo (con cero elementos)
        CO09v01Banco banco = new CO09v01Banco();

        int opcion = 0, pos = -1;
        String cadenabuscar = null;
        String nombre, cuenta;
        double cantidad;
        boolean eliminado = false;

        do {
            opcion = meno();
            switch (opcion) {
                case 1: // saldo
                    flujoS.print("Nombre o cuenta, total o parcial ");
                    cadenabuscar = Leer.dato();
                    pos = banco.buscar(cadenabuscar, 0);
                    if (pos == -1) {
                        if (banco.longitud() != 0) {
                            flujoS.println("bosqueda fallida");
                        } else {
                            flujoS.println("no hay clientes");
                        }
                    } else {
                        flujoS.println(banco.clienteEn(pos).obtenerNombre());
                        flujoS.println(banco.clienteEn(pos).obtenerCuenta());
                        flujoS.println(banco.clienteEn(pos).estado());
                    }
                    break;
                case 2: // buscar siguiente
                    pos = banco.buscar(cadenabuscar, pos + 1);
                    if (pos == -1) {
                        if (banco.longitud() != 0) {
                            flujoS.println("bosqueda fallida");
                        } else {
                            flujoS.println("no hay clientes");
                        }
                    } else {
                        flujoS.println(banco.clienteEn(pos).obtenerNombre());
                        flujoS.println(banco.clienteEn(pos).obtenerCuenta());
                        flujoS.println(banco.clienteEn(pos).estado());
                    }
                    break;
                case 3: // ingreso
                case 4: // reintegro
                    flujoS.print("Cuenta: ");
                    cuenta = Leer.dato();
                    pos = banco.buscar(cuenta, 0);
                    if (pos == -1) {
                        if (banco.longitud() != 0) {
                            flujoS.println("bosqueda fallida");
                        } else {
                            flujoS.println("no hay clientes");
                        }
                    } else {
                        flujoS.print("Cantidad: ");
                        cantidad = Leer.datoDouble();
                        if (opcion == 3) {
                            banco.clienteEn(pos).ingreso(cantidad);
                        } else {
                            banco.clienteEn(pos).reintegro(cantidad);
                        }
                    }
                    break;
                case 5: // aoadir
                    flujoS.print("Tipo de cuenta: 1-(CA), 2-(CC), 3-CCI  ");
                    do {
                        opcion = Leer.datoInt();
                    } while (opcion < 1 || opcion > 3);
                    banco.anadir(leerDatos(opcion));
                    break;
                case 6: // eliminar
                    flujoS.print("Cuenta: ");
                    cuenta = Leer.dato();
                    eliminado = banco.eliminar(cuenta);
                    if (eliminado) {
                        flujoS.println("registro eliminado");
                    } else if (banco.longitud() != 0) {
                        flujoS.println("cuenta no encontrada");
                    } else {
                        flujoS.println("no hay clientes");
                    }
                    break;
                case 7: // mantenimiento
                    for (pos = 0; pos < banco.longitud(); pos++) {
                        banco.clienteEn(pos).comisiones();
                        banco.clienteEn(pos).intereses();
                    }
                    break;
                case 8: // salir
                    banco = null;
            }
        } while (opcion != 8);
    }
}
/////////////////////////////////////////////////////////////////
