
package aemsa.vista.colecciones.set;

import aemsa.entidad.colecciones.CE0201v01RangoImporte;
import aemsa.modelo.CD0201v01DataRangoImporte;
import java.util.HashSet;
import java.util.Iterator;

public class CV0401v01MostrarRangoImporteConsola {

    public static void main(String[] args) {
        
         HashSet<CE0201v01RangoImporte> moLista = new HashSet<>();
         CE0201v01RangoImporte oCERangoImporte = new CE0201v01RangoImporte();
         
         CD0201v01DataRangoImporte oCDRangoImporte = new CD0201v01DataRangoImporte();
        
         moLista = oCDRangoImporte.asignarDataRangoImporte();

         Iterator oIt = moLista.iterator();
        
         while (oIt.hasNext()){
            oCERangoImporte = (CE0201v01RangoImporte) oIt.next();
            System.out.println(oCERangoImporte.getImporteMinimo()+ " " + oCERangoImporte.getImporteMaximo());
         }
    }
    
}
