package pe.aemsa.evalua.java8.view;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.entity.CE04v02Datos;
import pe.aemsa.evalua.java8.logical.CLCola;
import pe.aemsa.evalua.java8.logical.CLListaCircularSE;
import pe.aemsa.evalua.java8.logical.CLPila;
import pe.aemsa.evalua.java8.logical.impl.CL0102v01LeerTipoDato;

import java.io.IOException;

// Pilas y colas
//
public class CV0401v01TestPilasColasCircularSE
{
  public static void mostrarLista(CLListaCircularSE lista)
  {
    // Mostrar todos los elementos de la lista
    int i = 0, tam = lista.tamano();
    CE04v02Datos obj;
    while (i < tam)
    {
      if (lista instanceof CLPila) 
        obj = (CE04v02Datos)((CLPila)lista).sacarDePila();
      else if (lista instanceof CLCola)
        obj = (CE04v02Datos)((CLCola)lista).sacarDeCola();
      else
      {
        i++;
        continue;
      }
      System.out.println(i + ".-  " + obj.obtenerNombre() + " " +
                         obj.obtenerNota());
      i++;
    }
    if (tam == 0) System.out.println("lista vac�a");
  }
  
  public static void main(String[] args) throws IOException
  {
    // Crear una pila y una cola vac�as
    CLPila pila = new CLPila();
    CLCola cola = new CLCola();
    
    // Leer datos y a�adirlos a ambas
    String nombre;
    double nota;
    int i = 0;
    System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
    System.out.print("nombre: ");
    while ((nombre = CL0102v01LeerTipoDato.dato()) != null)
    {
      System.out.print("nota:   ");
      nota = CL0102v01LeerTipoDato.datoDouble();
      pila.meterEnPila(new CE04v02Datos(nombre, nota));
      cola.meterEnCola(new CE04v02Datos(nombre, nota));
      System.out.print("nombre: ");
    }
    System.out.println("\n");

    // Mostrar la pila
    System.out.println("\nPila:");
    mostrarLista(pila);
    // Mostrar la pila por segunda vez
    System.out.println("\nPila:");
    mostrarLista(pila);
    
    // Mostrar la cola
    System.out.println("\nCola:");
    mostrarLista(cola);
    // Mostrar la cola por segunda vez
    System.out.println("\nCola:");
    mostrarLista(cola);
    
    // Crear una lista circular
    CLListaCircularSE lcse = new CLListaCircularSE();
    lcse.anadirAlFinal(new CE04v02Datos("lcse", 10));
    // Mostrar la lista circular
    System.out.println("\nlcse:");
    mostrarLista(lcse);
  }
}
