package aemsa.cap09.clase;

public class CO11v01DatosArbol {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CO11v01DatosArbol() {
    }        // constructor sin par�metros

    // constructor con par�metros
    public CO11v01DatosArbol(String nom, double n) {
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
