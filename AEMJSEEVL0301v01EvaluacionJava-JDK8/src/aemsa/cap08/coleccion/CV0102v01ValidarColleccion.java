package aemsa.cap08.coleccion;

import java.util.ArrayList;

import java.util.List;
import pe.aemsa.cap09.clase.entity.CE0101v01Persona;

public class CV0102v01ValidarColleccion {

    public static void main(String[] args) {
        ArrayList oPrestamo = new ArrayList();
        CE0101v01Persona oPersona = new CE0101v01Persona();
        oPersona = null;
        
        List<CE0101v01Persona> oHeader = new ArrayList<>();
        
        System.out.println(oPrestamo);
        System.out.println(oPrestamo.size());

        if (oPersona != null){
            System.out.println(oPersona);
        }
        System.out.println(oHeader);
        System.out.println(oHeader.size());
        
        /*for(int i=0;i<12;i++){
            oPrestamo.add(i);
        }

        Iterator oIt = oPrestamo.iterator();
        
        System.out.println(oPrestamo);
        System.out.println(oPrestamo.size());
        System.out.println(oPrestamo.listIterator());
        while (oIt.hasNext()){
            System.out.println(oPrestamo);
            System.out.println("\n");
            System.out.println(oPrestamo.get(1));
            oIt.next();
        }*/
    }
}
