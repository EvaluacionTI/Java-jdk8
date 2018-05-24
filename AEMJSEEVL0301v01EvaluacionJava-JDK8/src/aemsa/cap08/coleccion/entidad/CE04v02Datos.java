package aemsa.cap08.coleccion.entidad;

public class CE04v02Datos {
    // Atributos

    private String nombre;
    private double nota;

    // M�todos
    public CE04v02Datos() {
    }        // constructor sin par�metros

    public CE04v02Datos(String nom, double n) // constructor con par�metros
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
