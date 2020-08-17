package aemsa.entidad.jstl;

import java.util.ArrayList;
import java.util.List;

public class CEListaNombre {
    private List<String> listaNombre;
    
    public CEListaNombre(){
        listaNombre = new ArrayList<String>();
        
        listaNombre.add("Mery");
        listaNombre.add("Rosa");
        listaNombre.add("Cárdenas");
        listaNombre.add("Povis");
        listaNombre.add("Reina");
    }

    public List<String> getListaNombre() {
        return listaNombre;
    }

    public void setListaNombre(List<String> moListaNombre) {
        this.listaNombre = moListaNombre;
    }


}
