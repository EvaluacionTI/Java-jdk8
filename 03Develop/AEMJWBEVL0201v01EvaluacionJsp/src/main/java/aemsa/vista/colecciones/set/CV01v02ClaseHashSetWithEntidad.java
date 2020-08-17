
package aemsa.vista.colecciones.set;

import aemsa.entidad.colecciones.CEAlumno;
import java.util.HashSet;

public class CV01v02ClaseHashSetWithEntidad {

    public static void main(String[] args) {
        
        CEAlumno oCEPerson1 = new CEAlumno(18, "Carlos");
        CEAlumno oCEPerson2 = new CEAlumno(25, "Miguel");
        CEAlumno oCEPerson3 = new CEAlumno(18, "Rafael");
        CEAlumno oCEPerson4 = new CEAlumno(30, "Luis");

        HashSet<CEAlumno> oCEAlumno = new HashSet<CEAlumno>();
        
        oCEAlumno.add(oCEPerson1);
        oCEAlumno.add(oCEPerson2);
        oCEAlumno.add(oCEPerson3);
        oCEAlumno.add(oCEPerson4);

        // Por defecto la clase HashSet no realiza ninguna comparacion
        System.out.println(oCEAlumno.size());

    }
    
}
