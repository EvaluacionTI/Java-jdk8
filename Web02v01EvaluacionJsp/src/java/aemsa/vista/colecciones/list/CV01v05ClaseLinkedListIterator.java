
package aemsa.vista.colecciones.list;

import java.util.Iterator;
import java.util.LinkedList;


public class CV01v05ClaseLinkedListIterator {


    public static void main(String[] args) {
        
        // Adicionando elementos a la lista
        LinkedList oLista = new LinkedList();
        
        oLista.add("Mery");
        oLista.add("Esteban");
        oLista.add("Paula");
        oLista.add("Illari");
        
        System.out.println(oLista+ ", Size = " + oLista.size());
                
        LinkedList oLista2 = new LinkedList(oLista);
        
        Iterator oIt = oLista2.iterator();
        
        while (oIt.hasNext()){
            System.out.println(oIt.next());
        }
    }
}
