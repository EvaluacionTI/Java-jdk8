package pe.aemsa.evalua.java.cap11.excepciones.entity;

/////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

// Aplicaci�n para trabajar con matrices de objetos
//
public class CV02v01MenuExcepcion {

    public static int menu() throws IOException {
        System.out.print("\n\n");
        System.out.println("1. Buscar");
        System.out.println("2. Buscar siguiente");
        System.out.println("3. A�adir");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println();
        System.out.print("   Opci�n: ");
        int op;
        do {
            op = CO06v01LeerTipoDato.datoInt();
        } while (op < 1 || op > 5);
        return op;
    }

    public static void main(String[] args) {
        // Definir un flujo de caracteres de entrada: flujoE
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        // Definir una referencia al flujo est�ndar de salida: flujoS
        PrintStream flujoS = System.out;

        // Crear un objeto lista de tel�fonos vac�o (con cero elementos)
        CO02v01ListaTelefonos listatfnos = new CO02v01ListaTelefonos();
        int opcion = 0, pos = -1;
        String cadenabuscar = null;
        String nombre, direccion;
        long telefono;
        boolean eliminado = false;
        do {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1: // buscar
                        flujoS.print("conjunto de caracteres a buscar ");
                        cadenabuscar = flujoE.readLine();
                        pos = listatfnos.buscar(cadenabuscar, 0);
                        if (pos == -1) {
                            if (listatfnos.longitud() != 0) {
                                flujoS.println("b�squeda fallida");
                            } else {
                                flujoS.println("lista vac�a");
                            }
                        } else {
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
                            flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
                            flujoS.println(listatfnos.valorEn(pos).obtenerDireccion());
                            flujoS.println(listatfnos.valorEn(pos).obtenerTelefono());
                        }
                        break;
                    case 3: // a�adir
                        flujoS.print("nombre:    ");
                        nombre = flujoE.readLine();
                        flujoS.print("direcci�n: ");
                        direccion = flujoE.readLine();
                        flujoS.print("tel�fono:  ");
                        telefono = CO06v01LeerTipoDato.datoLong();
                        listatfnos.anadir(new CO02v01Persona(nombre, direccion, telefono));
                        break;
                    case 4: // eliminar
                        flujoS.print("tel�fono: ");
                        telefono = CO06v01LeerTipoDato.datoLong();
                        eliminado = listatfnos.eliminar(telefono);
                        if (eliminado) {
                            flujoS.println("registro eliminado");
                        } else if (listatfnos.longitud() != 0) {
                            flujoS.println("tel�fono no encontrado");
                        } else {
                            flujoS.println("lista vac�a");
                        }
                        break;
                    case 5: // salir
                        listatfnos = null;
                }
            } catch (Exception ex) {
            }
        } while (opcion != 5);
    }
}
