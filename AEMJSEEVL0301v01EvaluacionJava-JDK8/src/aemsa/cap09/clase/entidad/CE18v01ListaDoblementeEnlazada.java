package aemsa.cap09.clase.entidad;

public class CE18v01ListaDoblementeEnlazada {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CE18v01ListaDoblementeEnlazada() {
    }        // constructor sin par�metros

    public CE18v01ListaDoblementeEnlazada(String nom, double n) // constructor con par�metros
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
