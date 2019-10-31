
package aemsa.vista.colecciones;

import aemsa.entidad.colecciones.CEAlumno;
import java.util.ArrayList;
import java.util.LinkedList;

public class CV02v04DiferenciaLinkedvsArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ArrayList vs LinkedList");
        
        ArrayList<CEAlumno> oListaArray = new ArrayList<CEAlumno>();
        LinkedList<CEAlumno> oListaLinked = new LinkedList<CEAlumno>();

        long antes;
        
        for(int i=0;i<10000;i++)
        {
           oListaArray.add(new CEAlumno(i,"Persona"+i));  // En este ejemplo cada persona lleva datos ficticios
           oListaLinked.add(new CEAlumno(i,"Persona"+i));
        }

        // 1. Insertar al principio
        System.out.println("Costo de insertar una persona en la posición 0");
        System.out.println("Tiempo invertido en insertar una persona en oListaArray (en nanosegundos):");
        antes = System.nanoTime();
        oListaArray.add(0,new CEAlumno(10001,"Prueba")); // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes); 
        
        System.out.println("Tiempo invertido en insertar una persona en oListaLinked (en nanosegundos):");
        antes = System.nanoTime();
        oListaLinked.add(0,new CEAlumno(10001,"Prueba"));  // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes);

        // 2. Insertar en el medio
        System.out.println("\n");
        System.out.println("Costo de insertar una persona en la posición 500");
        System.out.println("Tiempo invertido en insertar una persona en oListaArray (en nanosegundos):");
        antes = System.nanoTime();
        oListaArray.add(500,new CEAlumno(10001,"Prueba")); // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes); 
        
        System.out.println("Tiempo invertido en insertar una persona en oListaLinked (en nanosegundos):");
        antes = System.nanoTime();
        oListaLinked.add(500,new CEAlumno(10001,"Prueba"));  // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes);   

        // 3. Insertar en la última posición
        System.out.println("\n");
        System.out.println("Costo de insertar una persona en la última posición ");
        System.out.println("Tiempo invertido en insertar una persona en oListaArray (en nanosegundos):");
        antes = System.nanoTime();
        oListaArray.add(10001,new CEAlumno(10001,"Mery")); // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes); 
        
        
        System.out.println("Tiempo invertido en insertar una persona en oListaLinked (en nanosegundos):");
        antes = System.nanoTime();
        oListaLinked.add(10001,new CEAlumno(10001,"Esteban"));  // Inserción en posicion 0 de una persona
        System.out.println(System.nanoTime()- antes);          
    }
    
}
