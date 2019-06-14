package aemsa.cap09.clase.vista;

//////////////////////////////////////////////////////////////////
import pe.aemsa.cap09.clase.CO15v01DatosListaLinealSE;
import pe.aemsa.cap09.clase.CO15v02ListaLinealSE;
import javax.swing.JOptionPane;

// Crear una lista lineal simplemente enlazada
//
public class CV1305v01TestListaLinealSE {

    public static void mostrarLista(CO15v02ListaLinealSE lse) {
        // Mostrar todos los elementos de la lista
        int i = 0, tam = lse.tamano();
        CO15v01DatosListaLinealSE obj;
        while (i < tam) {
            obj = (CO15v01DatosListaLinealSE) lse.obtener(i);
            System.out.println(i + ".-  " + obj.obtenerNombre() + " "
                    + obj.obtenerNota());
            i++;
        }
    }

    public static void main(String[] args) {
        // Crear una lista lineal vac�a
        CO15v02ListaLinealSE lse = new CO15v02ListaLinealSE();

        // Leer datos y a�adirlos a la lista
        String nombre;
        double nota;
        int i = 0;

        //System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        //System.out.print("nombre: ");

        nombre = JOptionPane.showInputDialog(null, "Nombre ", "Datos", 3);
        //while ((nombre = Leer.dato()) != null) {
        while ((nombre) != null) {
            System.out.print("nota:   ");
            //nota = Leer.datoDouble();
            nombre = JOptionPane.showInputDialog(null, "Ingrese Nota ", "Datos", 3);
            nota = Double.parseDouble(nombre);
            System.out.print(nota);
            
            lse.anadirAlFinal(new CO15v01DatosListaLinealSE(nombre, nota));
            System.out.println(new CO15v01DatosListaLinealSE(nombre, nota));
            
            System.out.println("nombre: "+nombre);
        }

        // A�adir un objeto al principio
        lse.anadirAlPrincipio(new CO15v01DatosListaLinealSE("abcd", 10));
        // A�adir un objeto en la posici�n 1
        lse.anadir(1, new CO15v01DatosListaLinealSE("defg", 9.5));

        System.out.println("\n");
        // Mostrar el primero
        CO15v01DatosListaLinealSE obj = (CO15v01DatosListaLinealSE) lse.obtenerPrimero();
        System.out.println("Primero: " + obj.obtenerNombre() + " "
                + obj.obtenerNota());

        // Mostrar el �ltimo
        obj = (CO15v01DatosListaLinealSE) lse.obtenerultimo();
        System.out.println("�ltimo:  " + obj.obtenerNombre() + " "
                + obj.obtenerNota());

        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(lse);

        // Borrar el elemento de �ndice 2
        obj = (CO15v01DatosListaLinealSE) lse.borrar(2);
        if (obj == null) {
            System.out.println("Error: elemento no borrado");
        }

        // Modificar el elemento de �ndice 1
        obj = (CO15v01DatosListaLinealSE) lse.obtener(1);
        obj.asignarNota(9);

        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(lse);
    }
}
