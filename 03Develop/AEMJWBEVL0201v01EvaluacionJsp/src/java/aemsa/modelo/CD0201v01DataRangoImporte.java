
package aemsa.modelo;

import java.util.HashSet;
import aemsa.entidad.colecciones.CE0201v01RangoImporte;

public class CD0201v01DataRangoImporte {
    
    public HashSet<CE0201v01RangoImporte> asignarDataRangoImporte(){
         CE0201v01RangoImporte oCERangoImporte = new CE0201v01RangoImporte();
         HashSet<CE0201v01RangoImporte> oListaHashSet = new HashSet<CE0201v01RangoImporte>();
        
         oCERangoImporte.setImporteMinimo(0);
         oCERangoImporte.setImporteMaximo(1000);
         oListaHashSet.add(oCERangoImporte);
         oCERangoImporte = new CE0201v01RangoImporte();

         oCERangoImporte.setImporteMinimo(1001);
         oCERangoImporte.setImporteMaximo(3000);
         oListaHashSet.add(oCERangoImporte);
         oCERangoImporte = new CE0201v01RangoImporte();

         oCERangoImporte.setImporteMinimo(3001);
         oCERangoImporte.setImporteMaximo(6000);
         oListaHashSet.add(oCERangoImporte);
         oCERangoImporte = new CE0201v01RangoImporte();

         oCERangoImporte.setImporteMinimo(6001);
         oCERangoImporte.setImporteMaximo(99999);
         oListaHashSet.add(oCERangoImporte);

         return oListaHashSet;
    }
}
