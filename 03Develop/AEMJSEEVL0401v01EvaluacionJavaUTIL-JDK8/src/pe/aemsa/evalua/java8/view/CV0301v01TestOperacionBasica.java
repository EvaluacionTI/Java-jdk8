package pe.aemsa.evalua.java8.view;

import aemsa.cap08.coleccion.entidad.CEElementoLSE;
import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;
//////////////////////////////////////////////////////////////////
// Operaciones b�sicas en una lista lineal simplemente enlazada
//
public class CV0301v01TestOperacionBasica {

    public static CEElementoLSE buscarEn(CEElementoLSE p) throws IOException {
        CEElementoLSE q;
        
        int x;

        // Buscar en una lista un elemento con un valor x
        q = p;             // q referencia el primer elemento de la lista
        System.out.print("dato a buscar: ");
        x = CO06v01LeerTipoDato.datoInt();
        while (q != null && q.dato != x) {
            q = q.siguiente; // q referencia al siguiente elemento
        }
        return q;
    }

    public static void main(String[] args) throws IOException {
        CEElementoLSE p, q, r; // referencias
        int n, eof = Integer.MIN_VALUE, x;

        // Crear una lista de enteros
        System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        p = null; // lista vac�a
        System.out.print("dato: ");
        System.out.print("Integer MIN_VALUE");
        while ((n = CO06v01LeerTipoDato.datoInt()) != eof) {
            q = new CEElementoLSE();
            q.dato = n;
            q.siguiente = p;
            p = q;
            System.out.print("dato: ");
        }

        System.out.println();
        n = 111;
        // Inserci�n de un elemento al comienzo de la lista
        q = new CEElementoLSE();
        q.dato = n;      // asignaci�n de valores
        q.siguiente = p; // reasignaci�n de referencias
        p = q;

        r = buscarEn(p);
        x = 222;
        // Inserci�n en la lista detr�s del elemento referenciado por r
        q = new CEElementoLSE();
        q.dato = x; // valor insertado
        q.siguiente = r.siguiente;
        r.siguiente = q;

        r = buscarEn(p);
        x = 333;
        // Inserci�n en la lista antes del elemento referenciado por r
        q = new CEElementoLSE();
        q.dato = r.dato;     // copiar miembro a miembro un objeto en otro
        q.siguiente = r.siguiente;
        r.dato = x;          // valor insertado
        r.siguiente = q;

        r = buscarEn(p);
        // Borrar el sucesor del elemento referenciado por r
        q = r.siguiente;           // q referencia el elemento a borrar
        r.siguiente = q.siguiente; // enlazar los elementos anterior
        // y posterior al borrado 
        q = null; // objeto referenciado por q a la basura (borrar)

        r = buscarEn(p);
        // Borrar el elemento referenciado por r
        q = r.siguiente;
        r.dato = q.dato; // copiar miembro a miembro un objeto en otro
        r.siguiente = q.siguiente;
        q = null;        // objeto referenciado por q a la basura (borrar)

        // Recorrer de una lista
        q = p; // salvar la referencia al primer elemento de la lista
        while (q != null) {
            System.out.print(q.dato + " ");
            q = q.siguiente;
        }

        // Borrar la lista
        p = null;

        System.out.println();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        runtime.runFinalization();
    }
}
