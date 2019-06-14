
package aemsa.vista.colecciones.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*
    Cómo calcular las ocurrencias que aparecen en un array de números. Es decir, 
    cuántas veces aparece un número en un array.

*/

public class CV01v03ClaseHashMapOcurrenciasArray {

    public static void main(String[] args) {
        
        //1. Declarar arreglo
        int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,9,8};
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int clave;
        
        //2. Recorrer arreglo
        //   Si el número del array ya está en el HashMap, esto nos lo dice el método .containsKey(), 
        //   incrementamos su valor en uno. Si elemento no está en el array lo inicializamos con 1.
        for (int x=0;x < listaNumeros.length;x++) {			
            clave = listaNumeros[x];
            
            if (hm.containsKey(clave))
              hm.put(clave, hm.get(clave)+1);
            else
              hm.put(clave,1);			
        }
        
        //3. Acceder a HashMap
        //   Para acceder a los elementos de HashMap utilizamos los método .put() y .get()
        //   Para listar los elementos del HashMap vamos a utilizar un Iterator, el cual se apoyará en un conjunto o Set devuelto por el HashMap mediante el metodo .entrySet()
        Iterator<Entry<Integer,Integer>> it = hm.entrySet().iterator();
        String vez;

        while (it.hasNext()) {
          Entry<Integer,Integer> e = it.next();
          vez = (e.getValue()>1)?" veces":" vez";
          System.out.println("El número " + e.getKey() + " aparece " + e.getValue() + vez);
        }
    }
    
}

