/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.mysql.dba.entidad;

public class CETipoInstitucion {
    private int mid_tipo_institucion;
    private String mcod_tipo_institucion;
    private String mtxt_abrv;
    private String mtxt_desc;
    private int mid_idioma;

    public int getMid_tipo_institucion() {
        return mid_tipo_institucion;
    }

    public String getMcod_tipo_institucion() {
        return mcod_tipo_institucion;
    }

    public String getMtxt_abrv() {
        return mtxt_abrv;
    }

    public String getMtxt_desc() {
        return mtxt_desc;
    }

    public int getMid_idioma() {
        return mid_idioma;
    }

    public void setMid_tipo_institucion(int mid_tipo_institucion) {
        this.mid_tipo_institucion = mid_tipo_institucion;
    }

    public void setMcod_tipo_institucion(String mcod_tipo_institucion) {
        this.mcod_tipo_institucion = mcod_tipo_institucion;
    }

    public void setMtxt_abrv(String mtxt_abrv) {
        this.mtxt_abrv = mtxt_abrv;
    }

    public void setMtxt_desc(String mtxt_desc) {
        this.mtxt_desc = mtxt_desc;
    }

    public void setMid_idioma(int mid_idioma) {
        this.mid_idioma = mid_idioma;
    }
    
}
