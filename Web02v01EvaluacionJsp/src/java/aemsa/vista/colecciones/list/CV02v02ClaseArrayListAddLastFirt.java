
package aemsa.vista.colecciones.list;

import java.util.ArrayList;

public class CV02v02ClaseArrayListAddLastFirt {


    public static void main(String[] args) {
        
        // Adicionando elementos a la lista
        ArrayList oLista = new ArrayList();
        
        oLista.add("Leasing");
        oLista.add("Comercial");
        oLista.add(1321573);
        oLista.add("Operaciones");
        oLista.add(124);
        oLista.add(9);
        oLista.add("Unjfsc");     
        
        System.out.println(oLista+ ", Size = " + oLista.size());
        
        
        oLista.add(1, "a");
        System.out.println(oLista+ ", Size = " + oLista.get(1));
        
        oLista.add("sda");
        System.out.println(oLista+ ", Size = " + oLista.get(8));
    }
    
}
