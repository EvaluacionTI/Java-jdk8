
package aemsa.cap05.arreglo;

import aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CV02v03NotaMediaMatrizUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int nAlumnos;    // n�mero de alumnos (valor no negativo)
            do
            {
              System.out.print("N�mero de alumnos: ");
              nAlumnos = CO06v01LeerTipoDato.datoInt();
            }
            while (nAlumnos < 1);
            float[] nota = new float[nAlumnos]; // crear la matriz nota
            int i = 0;       // sub�ndice
            float suma = 0F; // suma total de las notas medias

            System.out.println("Introducir las notas medias del curso.");
            for (i = 0; i < nota.length; i++)
            {
              System.out.print("Nota media del alumno " + (i+1) + ": ");
              nota[i] = CO06v01LeerTipoDato.datoFloat();
            }

            // Sumar las notas medias
            for (i = 0; i < nota.length; i++)
              suma += nota[i];

            // Visualizar la nota media del curso
            System.out.println("\n\nNota media del curso: " + suma / nAlumnos);            
        }catch(Exception ex){}
    }
}
