
package aemsa.vista.colecciones.list;

import java.util.ArrayList;

public class CV02v03ClaseArrayListRemove {


    public static void main(String[] args) {
        
        // Adicionando elementos a la lista
        ArrayList oLista = new ArrayList();
        
        oLista.add("Leasing");
        oLista.add("Comercial");
        oLista.add(1321573);
        oLista.add("Operaciones");
        oLista.add("Operaciones");
        oLista.add(124);
        oLista.add(9);
        oLista.add("Unjfsc");
        oLista.add("Ili");
        oLista.add("Paula");
        
        System.out.println(oLista+ ", Size = " + oLista.size());
        
        System.out.println(oLista+ ", Size = " + oLista.get(2));
        
        oLista.remove(2);
        System.out.println(oLista+ ", Size = " + oLista.get(2));
        
        oLista.remove("comercial");
        System.out.println(oLista+ ", Size = " + oLista.getClass());

        oLista.set(0, "Ili");
        System.out.println(oLista+ ", Size = " + oLista.get(oLista.size()-4));

        // Estoy intentando remover un item demasiado grande o fuera de alcance
        oLista.remove(1321573);
        System.out.println(oLista+ ", Size = " + oLista.get(oLista.size()));
        
    }
    
}
