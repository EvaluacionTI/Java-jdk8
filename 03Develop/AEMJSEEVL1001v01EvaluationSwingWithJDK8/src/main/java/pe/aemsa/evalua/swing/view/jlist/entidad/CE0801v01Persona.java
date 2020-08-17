/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jlist.entidad;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ALDV
 */
public class CE0801v01Persona implements Serializable{
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Boolean sexo;
    private String tipoDocumento;
    private int hobie;
    private String imagen;

    public CE0801v01Persona(String psNombre, String psApellido, Date pdFechaNacimiento, Boolean pbSexo, 
                                                String psTipoDocumento, int piHobie, String psImagen){
        this.nombre = psNombre;
        this.apellido = psApellido;
        this.fechaNacimiento = pdFechaNacimiento;
        this.sexo = pbSexo;
        this.tipoDocumento = psTipoDocumento;
        this.hobie = piHobie;
        this.imagen = psImagen;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getHobie() {
        return hobie;
    }

    public void setHobie(int hobie) {
        this.hobie = hobie;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
