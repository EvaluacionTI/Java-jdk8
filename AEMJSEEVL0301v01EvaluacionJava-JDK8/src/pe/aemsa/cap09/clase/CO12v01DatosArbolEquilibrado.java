package pe.aemsa.cap09.clase;

public class CO12v01DatosArbolEquilibrado {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CO12v01DatosArbolEquilibrado() {
    }        // constructor sin par�metros

    public CO12v01DatosArbolEquilibrado(String nom, double n) // constructor con par�metros
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
