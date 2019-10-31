
package pe.aemsa.cap30.database.derby.entidad;

import java.util.Date;

public class CECompra {
    private int idCompra;
    private String nombreProducto;
    private double cantidad;
    private double precio;
    private boolean siNoActivo;
    private Date fechaSistema;  

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isSiNoActivo() {
        return siNoActivo;
    }

    public void setSiNoActivo(boolean siNoActivo) {
        this.siNoActivo = siNoActivo;
    }

    public Date getFechaSistema() {
        return fechaSistema;
    }

    public void setFechaSistema(Date fechaSistema) {
        this.fechaSistema = fechaSistema;
    }

    @Override
    public String toString() {
        return "CECompra{" + "idCompra=" + idCompra + ", nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precio=" + precio + ", siNoActivo=" + siNoActivo + ", fechaSistema=" + fechaSistema + '}';
    }    
}
