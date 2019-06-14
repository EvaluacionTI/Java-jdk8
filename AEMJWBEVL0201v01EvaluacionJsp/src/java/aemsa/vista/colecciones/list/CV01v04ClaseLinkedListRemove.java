
package aemsa.vista.colecciones.list;

import java.util.LinkedList;


public class CV01v04ClaseLinkedListRemove {


    public static void main(String[] args) {
        
        // Adicionando elementos a la lista
        LinkedList oLista = new LinkedList();
        
        oLista.add(new Integer(1));
        oLista.add(new Integer(5));
        oLista.add(new Integer(7));
        oLista.add(new Integer(2));
        oLista.add(new Integer(0));
        oLista.add(new Integer(9));
        
        System.out.println(oLista+ ", Size = " + oLista.size());
        
        System.out.println(oLista+ ", Size = " + oLista.get(2));
        oLista.remove(2);
        System.out.println(oLista+ ", Size = " + oLista.get(2));
        
        oLista.removeFirst();
        System.out.println(oLista+ ", Size = " + oLista.getFirst());

        oLista.removeLast();
        System.out.println(oLista+ ", Size = " + oLista.getLast());
        
        oLista.set(0, "Ili");
        System.out.println(oLista+ ", Size = " + oLista.getFirst());
    }
    
}
