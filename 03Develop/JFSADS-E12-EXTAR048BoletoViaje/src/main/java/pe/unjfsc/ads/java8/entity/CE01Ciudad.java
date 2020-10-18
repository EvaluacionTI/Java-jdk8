package pe.unjfsc.ads.java8.entity;

public class CE01Ciudad {
    private String codigo;
    private String nombre;

    public CE01Ciudad(){}
    
    public CE01Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CEOrigenDestino{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

}
