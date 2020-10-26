
package pe.unjfsc.fsi.java8.entity;

public class CEToro {
    private int codigo;
    private String nombre;
    private String alias;
    private String fechaNacimiento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "CEToro{" + "codigo=" + codigo + ", nombre=" + nombre + ", alias=" + alias + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
