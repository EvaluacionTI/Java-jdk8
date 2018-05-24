
package aemsa.vista.colecciones.list;

import aemsa.entidad.colecciones.CEMoneda;
import java.util.Iterator;
import java.util.LinkedList;


public class CV01v06ClaseLinkedListIteratorObjeto {


    public static void main(String[] args) {
        
        // Adicionando elementos a la lista
        CEMoneda oCEMoneda = new CEMoneda();
       LinkedList<CEMoneda> oLista = new LinkedList<CEMoneda>();

        oCEMoneda.setId(1);
        oCEMoneda.setAbreviatura("S/");
        oCEMoneda.setCodigoNumero("604");
        oCEMoneda.setCodigoLetra("PEN");
        oCEMoneda.setDescripcion("SOLES");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();

        oCEMoneda.setId(2);
        oCEMoneda.setAbreviatura("S/.");
        oCEMoneda.setCodigoNumero("604");
        oCEMoneda.setCodigoLetra("PEN");
        oCEMoneda.setDescripcion("NUEVOS SOLES");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();

        oCEMoneda.setId(3);
        oCEMoneda.setAbreviatura("I");
        oCEMoneda.setCodigoNumero("604");
        oCEMoneda.setCodigoLetra("PEI");
        oCEMoneda.setDescripcion("INTI");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();

        oCEMoneda.setId(4);
        oCEMoneda.setAbreviatura("US$");
        oCEMoneda.setCodigoNumero("840");
        oCEMoneda.setCodigoLetra("USD");
        oCEMoneda.setDescripcion("DOLARES AMERICANOS");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();

        oCEMoneda.setId(5);
        oCEMoneda.setAbreviatura("E");
        oCEMoneda.setCodigoNumero("978");
        oCEMoneda.setCodigoLetra("EUR");
        oCEMoneda.setDescripcion("EUROS");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();

        oCEMoneda.setId(6);
        oCEMoneda.setAbreviatura("R");
        oCEMoneda.setCodigoNumero("986");
        oCEMoneda.setCodigoLetra("BRL");
        oCEMoneda.setDescripcion("REAL");
        oLista.add(oCEMoneda);
        oCEMoneda = new CEMoneda();
        
        System.out.println(oLista+ ", Size = " + oLista.size());
                
        Iterator<CEMoneda> oRow = oLista.iterator();
        while(oRow.hasNext()){
            oCEMoneda = oRow.next();
            
            System.out.println(oCEMoneda.getId() + " | " + oCEMoneda.getAbreviatura() + " | " + oCEMoneda.getCodigoNumero() + " | " + oCEMoneda.getCodigoLetra() + " | " + oCEMoneda.getDescripcion());
        }
    }
}
