package aemsa.cap07.excepcion;

import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

//////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con un fichero accedido aleatoriamente
// Utiliza la clase Leer para leer de la entrada est�ndar cadenas
// y datos de tipos primitivos.
public class CV06v01MantenimientoArchivo {
    // Definir una referencia al flujo est�ndar de salida: flujoS

    static PrintStream flujoS = System.out;
    static CO06v02BaseDeDatos articulos;
    static boolean ficheroAbierto = false;

    public static void nuevoFich() throws IOException {
        if (ficheroAbierto) {
            flujoS.println("Ya hay un fichero abierto.");
            return;
        }
        flujoS.print("Nombre del fichero: ");
        File objFichero = new File(CO06v01LeerTipoDato.dato()); // nombre fichero
        while (objFichero.exists()) {
            flujoS.println("Este fichero existe. Escriba otro.");
            objFichero = new File(CO06v01LeerTipoDato.dato());
        }
        articulos = new CO06v02BaseDeDatos(objFichero);
        ficheroAbierto = true;
    }

    public static void abrirFich() throws IOException {
        if (ficheroAbierto) {
            flujoS.println("Ya hay un fichero abierto.");
            return;
        }

        flujoS.print("Nombre del fichero: ");
        File objFichero = new File(CO06v01LeerTipoDato.dato()); // nombre fichero

        File obj = null;
        char resp;
        while (!objFichero.exists()) {
            flujoS.println("Este fichero no existe.");
            flujoS.print("�Desea ver la lista de ficheros? s/n: ");
            resp = (char) System.in.read();
            System.in.skip(System.in.available());
            if (resp == 'n') {
                return;
            }
            // Obtener un listado del directorio actual de trabajo
            obj = new File(System.getProperty("user.dir"));
            String[] nombresDir = obj.list();
            for (int i = 0; i < nombresDir.length; i++) {
                flujoS.print(nombresDir[i] + ",  ");
            }
            flujoS.print("\n\nNombre del fichero: ");
            objFichero = new File(CO06v01LeerTipoDato.dato());
        }
        articulos = new CO06v02BaseDeDatos(objFichero);
        ficheroAbierto = true;
    }

    public static void anadirReg() throws IOException {
        String referencia;
        double precio;

        flujoS.print("Referencia:    ");
        referencia = CO06v01LeerTipoDato.dato();
        flujoS.print("Precio:        ");
        precio = CO06v01LeerTipoDato.datoDouble();
        articulos.anadir(new CO06v01Registro(referencia, precio));
    }

    public static void modificarReg() throws IOException {
        String referencia;
        double precio;
        int op, nreg;

        // Solicitar el n�mero de registro a modificar  
        flujoS.print("N�mero de registro entre 0 y "
                + (articulos.longitud() - 1) + ": ");
        nreg = CO06v01LeerTipoDato.datoInt();

        // Leer el registro
        CO06v01Registro obj = articulos.valorEn(nreg);
        if (obj == null) {
            return;
        }
        // Visualizarlo
        flujoS.println(obj.obtenerReferencia());
        flujoS.println(obj.obtenerPrecio());

        // Modificar el registro
        do {
            flujoS.print("\n\n");
            flujoS.println("Modificar el dato:");
            flujoS.println("1. Referencia");
            flujoS.println("2. Precio");
            flujoS.println("3. Salir y salvar los cambios");
            flujoS.println("4. Salir sin salvar los cambios");
            flujoS.println();
            flujoS.print("   Opci�n: ");
            op = CO06v01LeerTipoDato.datoInt();

            switch (op) {
                case 1: // modificar referencia
                    flujoS.print("Referencia:    ");
                    referencia = CO06v01LeerTipoDato.dato();
                    obj.asignarReferencia(referencia);
                    break;
                case 2: // modificar precio
                    flujoS.print("Precio:  ");
                    precio = CO06v01LeerTipoDato.datoDouble();
                    obj.asignarPrecio(precio);
                    break;
                case 3: // guardar los cambios
                    break;
                case 4: // salir sin guardar los cambios
                    break;
            }
        } while (op != 3 && op != 4);
        if (op == 3) {
            articulos.ponerValorEn(nreg, obj);
        }
    }

    public static boolean eliminarReg() throws IOException {
        String referencia;
        flujoS.print("Referencia: ");
        referencia = CO06v01LeerTipoDato.dato();
        boolean eliminado = articulos.eliminar(referencia);
        if (eliminado) {
            flujoS.println("registro eliminado");
        } else if (articulos.longitud() != 0) {
            flujoS.println("referencia no encontrada");
        } else {
            flujoS.println("lista vac�a");
        }
        return eliminado;
    }

    public static void visualizarRegs() throws IOException {
        int nreg = -1, nregs = articulos.longitud();
        if (nregs == 0) {
            flujoS.println("lista vac�a");
        }
        flujoS.print("conjunto de caracteres a buscar ");
        String str = CO06v01LeerTipoDato.dato();
        CO06v01Registro obj = null;
        do {
            nreg = articulos.buscar(str, nreg + 1);
            if (nreg > -1) {
                obj = articulos.valorEn(nreg);
                flujoS.println("Registro: " + nreg);
                flujoS.println(obj.obtenerReferencia());
                flujoS.println(obj.obtenerPrecio());
                flujoS.println();
            }
        } while (nreg != -1);
        if (obj == null) {
            flujoS.println("no se encontr� ning�n registro");
        }
    }

    public static int menu() throws IOException {
        flujoS.print("\n\n");
        flujoS.println("1. Nuevo fichero");
        flujoS.println("2. Abrir fichero");
        flujoS.println("3. A�adir registro");
        flujoS.println("4. Modificar registro");
        flujoS.println("5. Eliminar registro");
        flujoS.println("6. Visualizar registros");
        flujoS.println("7. Salir");
        flujoS.println();
        flujoS.print("   Opci�n: ");
        int op;
        do {
            op = CO06v01LeerTipoDato.datoInt();
            if (op < 1 || op > 7) {
                flujoS.print("Opci�n no v�lida. Elija otra: ");
            }
        } while (op < 1 || op > 7);
        if (op > 2 && op < 7 && !ficheroAbierto) {
            flujoS.println("No hay un fichero abierto.");
            return 0;
        }
        return op;
    }

    public static void main(String[] args) {
        int opcion = 0;

        try {
            do {
                opcion = menu();
                switch (opcion) {
                    case 1: // nuevo fichero
                        nuevoFich();
                        break;
                    case 2: // abrir fichero
                        abrirFich();
                        break;
                    case 3: // a�adir registro al final del fichero
                        anadirReg();
                        break;
                    case 4: // modificar registro
                        modificarReg();
                        break;
                    case 5: // eliminar registro
                        eliminarReg();
                        break;
                    case 6: // visualizar registros
                        visualizarRegs();
                        break;
                    case 7: // salir
                        if (articulos.tieneRegsEliminados()) {
                            articulos.actualizar();
                        }
                        articulos = null;
                }
            } while (opcion != 7);
        } catch (IOException e) {
            flujoS.println("Error: " + e.getMessage());
        }
    }
}
