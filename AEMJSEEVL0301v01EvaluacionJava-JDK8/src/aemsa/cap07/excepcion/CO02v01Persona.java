package aemsa.cap07.excepcion;

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CO02v01Persona
//
public class CO02v01Persona {
    // Atributos

    private String nombre;
    private String direccion;
    private long telefono;

    // M�todos
    public CO02v01Persona() {
    }

    public CO02v01Persona(String nom, String dir, long tel) {
        nombre = nom;
        direccion = dir;
        telefono = tel;
    }

    public void asignarNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarDireccion(String dir) {
        direccion = dir;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void asignarTelefono(long tel) {
        telefono = tel;
    }

    public long obtenerTelefono() {
        return telefono;
    }
}
