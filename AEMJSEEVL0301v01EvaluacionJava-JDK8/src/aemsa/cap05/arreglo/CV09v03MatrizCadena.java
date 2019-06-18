
package aemsa.cap05.arreglo;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class CV09v03MatrizCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            // Definir un flujo de caracteres de entrada: flujoE
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            // Definir una referencia al flujo est�ndar de salida: flujoS
            PrintStream flujoS = System.out;

            int nFilas = 0, fila = 0;
            do
            {
              System.out.print("N�mero de filas de la matriz:  ");
              nFilas = CO06v01LeerTipoDato.datoInt();
            }
            while (nFilas < 1);       // no permitir un valor negativo
            // Matriz de cadenas de caracteres
            String[] nombre = new String[nFilas];

            System.out.println("Escriba los nombres que desea introducir.");
            System.out.println("Puede finalizar pulsando las teclas [Ctrl][Z].");
            for (fila = 0; fila < nFilas; fila++)
            {
              flujoS.print("Nombre[" + fila + "]: ");
              nombre[fila] = flujoE.readLine();
              // Si se puls� [Ctrl][Z], salir del bucle
              if (nombre[fila] == null) break;
            }
            flujoS.print("\n\n");
            nFilas = fila; // n�mero de filas le�das
            char respuesta;
            do
            {
              flujoS.print("�Desea visualizar el contenido de la matriz? (s/n): ");
              respuesta = ((flujoE.readLine()).toLowerCase()).charAt(0);
            }
            while (respuesta != 's' && respuesta != 'n');
            if ( respuesta == 's' )
            {
              // Visualizar la lista de nombres
              flujoS.println();
              for (fila = 0; fila < nFilas; fila++)
                flujoS.println(nombre[fila]);
            }            
        }catch (IOException ignorada) { }
    }

}
