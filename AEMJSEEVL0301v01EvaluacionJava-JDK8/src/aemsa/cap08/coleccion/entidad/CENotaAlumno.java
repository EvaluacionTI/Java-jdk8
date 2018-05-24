package aemsa.cap08.coleccion.entidad;

public class CENotaAlumno {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CENotaAlumno() {
    }        // constructor sin par�metros

    public CENotaAlumno(String nom, double n) // constructor con par�metros
    {
        nombre = nom;
        nota = n;
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
