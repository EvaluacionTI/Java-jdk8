package aemsa.vista.colecciones;

import aemsa.entidad.colecciones.CEAlumno;

public class CV01v01AsignarElementoAlumno {


    public static void main(String[] args) {
        
        CEAlumno oAlumno1 = new CEAlumno();
        CEAlumno oAlumno2 = new CEAlumno();
        CEAlumno oAlumno3 = new CEAlumno();
        
        oAlumno1.setNombre("Illari");
        oAlumno2.setNombre("Mery");
        oAlumno3.setNombre("Esteban");
        
        System.out.println("Dirección del Objeto :" + oAlumno1);
        System.out.println("Nombre del Objeto :" + oAlumno2.getNombre());
        System.out.println("Dirección del Objeto :" + oAlumno3.toString());
    }
    
}
