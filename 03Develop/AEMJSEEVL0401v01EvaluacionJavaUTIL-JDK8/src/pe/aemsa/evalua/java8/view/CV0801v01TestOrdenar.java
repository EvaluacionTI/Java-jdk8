package pe.aemsa.evalua.java8.view;

//////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import pe.aemsa.evalua.java8.entity.CEPersona;
import pe.aemsa.evalua.java8.logical.CLListaTelefonos;
import pe.aemsa.evalua.java8.logical.impl.CL0102v01LeerTipoDato;

// Aplicaci�n para trabajar con un fichero accedido aleatoriamente
//
public class CV0801v01TestOrdenar {
    // Definir una referencia al flujo est�ndar de salida: flujoS

    static PrintStream flujoS = System.out;

    static CLListaTelefonos listatfnos;

    public static void imprimirListaTfnos() throws IOException {
        // Crear un flujo hacia la impresora
        FileWriter flujoS = new FileWriter("LPT1");

        String crlf = "\r\n"; // cambiar a la siguiente l�nea
        String ff = "\f";     // saltar a la siguiente p�gina
        Integer i;            // referencia a un objeto Integer
        Long l;               // referencia a un objeto Long
        int nregs = listatfnos.longitud(); // n�mero de registros

        for (int n = 0; n < nregs; n++) {
            // Saltar p�gina inicialmente y despu�s cada 60 l�neas
            if (n % 60 == 0) {
                flujoS.write(ff);
            }
            // Imprimir el registro n de la lista de telefonos
            i = new Integer(n); // n�mero de registro
            flujoS.write("Registro: " + i.toString() + crlf);
            flujoS.write(listatfnos.valorEn(n).obtenerNombre() + crlf);
            flujoS.write(listatfnos.valorEn(n).obtenerDireccion() + crlf);
            l = new Long(listatfnos.valorEn(n).obtenerTelefono());
            flujoS.write(l.toString() + crlf);
            flujoS.write(crlf); // saltar una l�nea
        }
        flujoS.write(ff); // saltar a la siguiente p�gina
        flujoS.close();   // cerrar el flujo hacia la impresora
    }

    public static boolean modificar(int nreg) throws IOException {
        String nombre, direccion;
        long telefono;
        int op;
        // CO06v01LeerTipoDato el registro
        CEPersona obj = listatfnos.valorEn(nreg);
        if (obj == null) {
            return false;
        }

        // Modificar el registro
        do {
            flujoS.print("\n\n");
            flujoS.println("Modificar el dato:");
            flujoS.println("1. Nombre");
            flujoS.println("2. Dirección");
            flujoS.println("3. Teléfono");
            flujoS.println("4. Salir y salvar los cambios");
            flujoS.println("5. Salir sin salvar los cambios");
            flujoS.println();
            flujoS.print("   Opci�n: ");
            op = CL0102v01LeerTipoDato.datoInt();

            switch (op) {
                case 1: // modificar nombre
                    flujoS.print("nombre:    ");
                    nombre = CL0102v01LeerTipoDato.dato();
                    obj.asignarNombre(nombre);
                    break;
                case 2: // modificar direccion
                    flujoS.print("direccion: ");
                    direccion = CL0102v01LeerTipoDato.dato();
                    obj.asignarDireccion(direccion);
                    break;
                case 3: // modificar telefono
                    flujoS.print("telefono:  ");
                    telefono = CL0102v01LeerTipoDato.datoLong();
                    obj.asignarTelefono(telefono);
                    break;
                case 4: // guardar los cambios
                    break;
                case 5: // salir sin guardar los cambios
                    break;
            }
        } while (op != 4 && op != 5);
        if (op == 4) {
            listatfnos.ponerValorEn(nreg, obj);
            return true;
        } else {
            return false;
        }
    }

    public static void actualizar(File fActual) throws IOException {    // Crear un fichero temporal
        File ficheroTemp = new File("listatfnos.tmp");
        CLListaTelefonos ftemp = new CLListaTelefonos(ficheroTemp);
        int nregs = listatfnos.longitud();
        // Copiar en el fichero temporal todos los registros del
        // fichero actual que en su campo telefono no tengan un 0
        CEPersona obj;
        for (int reg_i = 0; reg_i < nregs; reg_i++) {
            obj = listatfnos.valorEn(reg_i);
            if (obj.obtenerTelefono() != 0) {
                ftemp.anadir(obj);
            }
        }
        listatfnos.cerrar();
        ftemp.cerrar();
        fActual.delete();
        if (!ficheroTemp.renameTo(fActual)) {
            throw new IOException("no se actualiz� el fichero");
        }
    }

    public static int menu() throws IOException {
        flujoS.print("\n\n");
        flujoS.println("1. Buscar");
        flujoS.println("2. Buscar siguiente");
        flujoS.println("3. Modificar");
        flujoS.println("4. A�adir");
        flujoS.println("5. Eliminar");
        flujoS.println("6. Ordenar");
        flujoS.println("7. Imprimir");
        flujoS.println("8. Salir");
        flujoS.println();
        flujoS.print("   Opci�n: ");
        int op;
        do {
            op = CL0102v01LeerTipoDato.datoInt();
        } while (op < 1 || op > 8);
        return op;
    }

    public static void main(String[] args) {
        int opcion = 0, pos = -1;
        String cadenabuscar = null;
        String nombre, direccion;
        long telefono;
        boolean eliminado = false;
        boolean modificado = false;

        try {
            // Crear un objeto lista de telefonos vac�o (con 0 elementos)
            // o con el contenido del fichero listatfnos.dat si existe.
            File fichero = new File("listatfnos.dat");
            listatfnos = new CLListaTelefonos(fichero);

            do {
                opcion = menu();
                switch (opcion) {
                    case 1: // buscar
                        flujoS.print("conjunto de caracteres a buscar ");
                        cadenabuscar = CL0102v01LeerTipoDato.dato();
                        pos = listatfnos.buscar(cadenabuscar, 0);
                        if (pos == -1) {
                            if (listatfnos.longitud() != 0) {
                                flujoS.println("búsqueda fallida");
                            } else {
                                flujoS.println("lista vac�a");
                            }
                        } else {
                            flujoS.println("Número de registro: " + pos);
                            flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
                            flujoS.println(listatfnos.valorEn(pos).obtenerDireccion());
                            flujoS.println(listatfnos.valorEn(pos).obtenerTelefono());
                        }
                        break;
                    case 2: // buscar siguiente
                        pos = listatfnos.buscar(cadenabuscar, pos + 1);
                        if (pos == -1) {
                            if (listatfnos.longitud() != 0) {
                                flujoS.println("b�squeda fallida");
                            } else {
                                flujoS.println("lista vac�a");
                            }
                        } else {
                            flujoS.println("Número de registro: " + pos);
                            flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
                            flujoS.println(listatfnos.valorEn(pos).obtenerDireccion());
                            flujoS.println(listatfnos.valorEn(pos).obtenerTelefono());
                        }
                        break;
                    case 3: // modificar
                        // Solicitar el n�mero de registro a modificar  
                        flujoS.print("n�mero de registro entre 0 y "
                                + (listatfnos.longitud() - 1) + ": ");
                        pos = CL0102v01LeerTipoDato.datoInt();
                        modificado = modificar(pos);
                        if (modificado) {
                            flujoS.println("modificaci�n realizada con �xito");
                        } else {
                            flujoS.println("error: no se modific� el registro");
                        }
                        break;
                    case 4: // anadir
                        flujoS.print("nombre:    ");
                        nombre = CL0102v01LeerTipoDato.dato();
                        flujoS.print("direccion: ");
                        direccion = CL0102v01LeerTipoDato.dato();
                        flujoS.print("telefono:  ");
                        telefono = CL0102v01LeerTipoDato.datoLong();
                        listatfnos.anadir(new CEPersona(nombre, direccion, telefono));
                        break;
                    case 5: // eliminar
                        flujoS.print("telefono: ");
                        telefono = CL0102v01LeerTipoDato.datoLong();
                        eliminado = listatfnos.eliminar(telefono);
                        if (eliminado) {
                            flujoS.println("registro eliminado");
                        } else if (listatfnos.longitud() != 0) {
                            flujoS.println("telefono no encontrado");
                        } else {
                            flujoS.println("lista vac�a");
                        }
                        break;
                    case 6: // ordenar
                        listatfnos.quicksort();
                        break;
                    case 7: // imprimir
                        imprimirListaTfnos();
                        break;
                    case 8: // salir
                        // guardar lista
                        if (eliminado) {
                            actualizar(fichero);
                        }
                        listatfnos = null;
                }
            } while (opcion != 8);
        } catch (IOException e) {
            flujoS.println("Error: " + e.getMessage());
        }
    }
}
