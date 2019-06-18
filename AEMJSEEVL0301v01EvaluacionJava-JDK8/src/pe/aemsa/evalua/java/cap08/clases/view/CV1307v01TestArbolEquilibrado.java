package pe.aemsa.evalua.java.cap08.clases.view;

//////////////////////////////////////////////////////////////////
import pe.aemsa.evalua.java.cap08.clases.view.CO12v01DatosArbolEquilibrado;
import pe.aemsa.evalua.java.cap08.clases.view.CO12v03ArbolBinarioEquilibrado;
import javax.swing.JOptionPane;

// Crear un �rbol binario perfectamente equilibrado de n nodos
//
public class CV1307v01TestArbolEquilibrado {

    public static void main(String[] args) {
        String lsNumeroNodos = null;
        int numeroDeNodos;

        CO12v03ArbolBinarioEquilibrado arbolbe = new CO12v03ArbolBinarioEquilibrado();


        lsNumeroNodos = JOptionPane.showInputDialog(null, "Numero de Nodos", "Datos", 0);
        numeroDeNodos = Integer.parseInt(lsNumeroNodos);

        //System.out.print("N�mero de nodos: ");
        //numeroDeNodos = Leer.datoInt();

        arbolbe.construirArbolEquilibrado(numeroDeNodos);
        System.out.println();

        // Buscar datos
        String nombre;

        nombre = JOptionPane.showInputDialog(null, "Nombre a buscar", "Datos", 0);

//        System.out.print("nombre a buscar: ");
        // nombre = Leer.dato();
        CO12v01DatosArbolEquilibrado obj = (CO12v01DatosArbolEquilibrado) arbolbe.buscar(new CO12v01DatosArbolEquilibrado(nombre, 0));
        if (obj != null) {
            System.out.println(obj.obtenerNombre() + "  "
                    + obj.obtenerNota());
        } else {
            System.out.println("La busqueda fallo");
        }

        // Mostrar los nodos del �rbol
        System.out.println("\nArbol:");
        arbolbe.visitarInorden();
    }
}
