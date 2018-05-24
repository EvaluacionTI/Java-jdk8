package aemsa.cap09.clase;

public class CO15v01DatosListaLinealSE {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CO15v01DatosListaLinealSE() {
    }        // constructor sin par�metros

    public CO15v01DatosListaLinealSE(String nom, double n) // constructor con par�metros
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
