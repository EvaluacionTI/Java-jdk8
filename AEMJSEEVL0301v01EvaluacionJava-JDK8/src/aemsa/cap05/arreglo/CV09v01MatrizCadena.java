
package aemsa.cap05.arreglo;

import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class CV09v01MatrizCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            // Definir un flujo de caracteres de entrada: flujoE
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            // Definir una referencia al flujo est�ndar de salida: flujoS
            PrintStream flujoS = System.out;

            int nFilas = 0, nCarsPorFila = 0;
            int fila = 0, nCarsLeidos = 0, eof = -1;
            do
            {
              System.out.print("N�mero de filas de la matriz:  ");
              nFilas = CO06v01LeerTipoDato.datoInt();
            }
            while (nFilas < 1);       // no permitir un valor negativo
            do
            {
              System.out.print("N�mero de caracteres por fila: ");
              nCarsPorFila = CO06v01LeerTipoDato.datoInt();
            }
            while (nCarsPorFila < 1); // no permitir un valor negativo
            // Matriz de cadenas de caracteres
            char[][] nombre = new char[nFilas][nCarsPorFila];

            System.out.println("Escriba los nombres que desea introducir.");
            System.out.println("Para finalizar pulse las teclas [Ctrl][Z].");
            for (fila = 0; fila < nFilas; fila++)
            {
              flujoS.print("Nombre[" + fila + "]: ");
              nCarsLeidos = flujoE.read(nombre[fila], 0, nCarsPorFila);
              // Si se puls� [Ctrl][Z], salir del bucle
              if (nCarsLeidos == eof) break;
              // Eliminar los caracteres CR LF
              nombre[fila][nCarsLeidos-1] = '\0';
              nombre[fila][nCarsLeidos-2] = '\0';
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
          }
          catch (IOException ignorada) { }
    }

}
