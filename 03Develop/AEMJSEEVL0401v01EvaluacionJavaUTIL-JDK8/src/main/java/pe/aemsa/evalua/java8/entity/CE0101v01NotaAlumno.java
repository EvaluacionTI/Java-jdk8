package pe.aemsa.evalua.java8.entity;

import java.util.logging.Logger;


public class CE0101v01NotaAlumno {

    private static final Logger MOLOG = Logger.getLogger("CE0101v01NotaAlumno");
    
    private String nombre;
    private double nota;

    // M�todos
    public CE0101v01NotaAlumno() {
    }        // constructor sin par�metros

    public CE0101v01NotaAlumno(String nom, double n) // constructor con par�metros
    {
        nombre = nom;
        nota = n;
        MOLOG.info("CE0101v01NotaAlumno" + nombre + " | " + nota);
    }

    public void asignarNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNota(double n) {
        nota = n;
    }

    public double obtenerNota() {
        return nota;
    }
}
