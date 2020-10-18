package pe.ias.bbva.evalua.java8.postgres.entity;

import java.io.Serializable;

public class CECanal implements Serializable{

    private String codigoCanal;
    private String abreviatura;
    private String descripcion;
    private String fechaAlta;
    private String usuarioAlta;
    private String fechaModifica;
    private String usuarioModifica;
    private String fechaElimina;
    private String usuarioElimina;
    
    public String getCodigoCanal() {
        return codigoCanal;
    }

    public void setCodigoCanal(String codigoCanal) {
        this.codigoCanal = codigoCanal;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public String getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public String getFechaElimina() {
        return fechaElimina;
    }

    public void setFechaElimina(String fechaElimina) {
        this.fechaElimina = fechaElimina;
    }

    public String getUsuarioElimina() {
        return usuarioElimina;
    }

    public void setUsuarioElimina(String usuarioElimina) {
        this.usuarioElimina = usuarioElimina;
    }
    
    @Override
    public String toString() {
        return "CECanal{" + "codigoCanal=" + codigoCanal + ", abreviatura=" + abreviatura + ", descripcion=" + descripcion + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModifica=" + fechaModifica + ", usuarioModifica=" + usuarioModifica + ", fechaElimina=" + fechaElimina + ", usuarioElimina=" + usuarioElimina + '}';
    }
    
}
