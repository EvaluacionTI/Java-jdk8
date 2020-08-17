package pe.aemsa.cap12.java8.flujos.entidad;

import java.io.Serializable;

public class CE03v01Persona implements Serializable {
    // Atributos

    private String nombre;
    private String direccion;
    private long telefono;

    // M�todos
    public CE03v01Persona() {
    }

    public CE03v01Persona(String nom, String dir, long tel) {
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

    @Override
    public String toString() {
        return "CE03v01Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
