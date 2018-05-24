package aemsa.cap07.excepcion;

/////////////////////////////////////////////////////////////////
import aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

// Aplicaci�n para trabajar con la clase CO03v01Banco y la jerarqu�a
// de clases derivadas de CO03v07Cuenta
//
public class CV03v01EvaluaCuentaBanco {

    public static void escribirDatos(CO03v01Banco banco, String fich) throws IOException {
        PrintWriter fcli = null;
        CO03v07Cuenta cliente;
        CO03v03ListaClientes lista = new CO03v03ListaClientes(banco.longitud());
        try {
            for (int i = 0; i < banco.longitud(); i++) {
                //cliente = clienteEn(i);
                cliente = leerDatos(i);
                lista.anadir(cliente.obtenerNombre(), i);
            }
            // Abrir el fichero para escribir. Se crea el flujo fcli;
            fcli = new PrintWriter(new FileWriter(fich));
            lista.escribir(fcli);
        } finally {
            // Cerrar el fichero
            if (fcli != null) {
                fcli.close();
            }
        }
    }

    // Para la entrada de datos se utiliza Leer.class
    public static CO03v07Cuenta leerDatos(int op) throws IOException {
        CO03v07Cuenta obj = null;
        String nombre, cuenta;
        double saldo, tipoi, mant;
        System.out.print("Nombre.................: ");
        nombre = CO06v01LeerTipoDato.dato();
        System.out.print("Cuenta.................: ");
        cuenta = CO06v01LeerTipoDato.dato();
        System.out.print("Saldo..................: ");
        saldo = CO06v01LeerTipoDato.datoDouble();
        System.out.print("Tipo de inter�s........: ");
        tipoi = CO06v01LeerTipoDato.datoDouble();
        if (op == 1) {
            System.out.print("Mantenimiento..........: ");
            mant = CO06v01LeerTipoDato.datoDouble();
            obj = new CO03v04CuentaAhorro(nombre, cuenta, saldo, tipoi, mant);
        } else {
            int transex;
            double imptrans;
            System.out.print("Importe por transacci�n: ");
            imptrans = CO06v01LeerTipoDato.datoDouble();
            System.out.print("Transacciones exentas..: ");
            transex = CO06v01LeerTipoDato.datoInt();
            if (op == 2) {
                obj = new CO03v05CuentaCorriente(nombre, cuenta, saldo, tipoi, imptrans, transex);
            } else {
                obj = new CO03v05CuentaCorriente(nombre, cuenta, saldo, tipoi, imptrans, transex);
            }
        }
        return obj;
    }

    public static int menu() throws IOException {
        System.out.print("\n\n");
        System.out.println("1. Saldo");
        System.out.println("2. Buscar siguiente");
        System.out.println("3. Ingreso");
        System.out.println("4. Reintegro");
        System.out.println("5. A�adir");
        System.out.println("6. Eliminar");
        System.out.println("7. Mantenimiento");
        System.out.println("8. Escribir");
        System.out.println("9. Salir");
        System.out.println();
        System.out.print("   Opci�n: ");
        int op;
        do {
            op = CO06v01LeerTipoDato.datoInt();
        } while (op < 1 || op > 9);
        return op;
    }

    public static void main(String[] args) throws IOException {
        // Definir una referencia al flujo est�ndar de salida: flujoS
        PrintStream flujoS = System.out;

        // Crear un objeto banco vac�o (con cero elementos)
        CO03v01Banco banco = new CO03v01Banco();

        int opcion = 0, pos = -1;
        String cadenabuscar = null;
        String nombre, cuenta;
        double cantidad;
        boolean eliminado = false;

        do {
            opcion = menu();
            switch (opcion) {
                case 1: // saldo
                    flujoS.print("Nombre o cuenta, total o parcial ");
                    cadenabuscar = CO06v01LeerTipoDato.dato();
                    pos = banco.buscar(cadenabuscar, 0);
                    if (pos == -1) {
                        if (banco.longitud() != 0) {
                            flujoS.println("b�squeda fallida");
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
                            flujoS.println("b�squeda fallida");
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
                    cuenta = CO06v01LeerTipoDato.dato();
                    pos = banco.buscar(cuenta, 0);
                    if (pos == -1) {
                        if (banco.longitud() != 0) {
                            flujoS.println("b�squeda fallida");
                        } else {
                            flujoS.println("no hay clientes");
                        }
                    } else {
                        flujoS.print("Cantidad: ");
                        cantidad = CO06v01LeerTipoDato.datoDouble();
                        if (opcion == 3) {
                            banco.clienteEn(pos).ingreso(cantidad);
                        } else {
                            banco.clienteEn(pos).reintegro(cantidad);
                        }
                    }
                    break;
                case 5: // a�adir
                    flujoS.print("Tipo de cuenta: 1-(CA), 2-(CC), 3-CCI  ");
                    do {
                        opcion = CO06v01LeerTipoDato.datoInt();
                    } while (opcion < 1 || opcion > 3); {
                }

                banco.anadir(null);
                //leerDatos(opcion));
                break;
                case 6: // eliminar
                    flujoS.print("Cuenta: ");
                    cuenta = CO06v01LeerTipoDato.dato();
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
                case 8: // escribir
                    try {
                        flujoS.print("Fichero: ");
                        nombre = CO06v01LeerTipoDato.dato();
                        escribirDatos(banco, nombre);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9: // salir
                    banco = null;
            }

        } while (opcion != 8);
    }
}
/////////////////////////////////////////////////////////////////
