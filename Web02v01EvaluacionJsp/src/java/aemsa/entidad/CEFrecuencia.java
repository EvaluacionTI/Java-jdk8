/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.entidad;

import java.io.Serializable;

public class CEFrecuencia implements Serializable{
    private int mid_frecuencia;
    private String mtxt_abrv;
    private String mtxt_desc;
    private int mnro_dias_mes;
    private int mid_idioma;

    public int getMid_frecuencia() {
        return mid_frecuencia;
    }

    public String getMtxt_abrv() {
        return mtxt_abrv;
    }

    public String getMtxt_desc() {
        return mtxt_desc;
    }

    public int getMnro_dias_mes() {
        return mnro_dias_mes;
    }

    public int getMid_idioma() {
        return mid_idioma;
    }

    public void setMid_frecuencia(int mid_frecuencia) {
        this.mid_frecuencia = mid_frecuencia;
    }

    public void setMtxt_abrv(String mtxt_abrv) {
        this.mtxt_abrv = mtxt_abrv;
    }

    public void setMtxt_desc(String mtxt_desc) {
        this.mtxt_desc = mtxt_desc;
    }

    public void setMnro_dias_mes(int mnro_dias_mes) {
        this.mnro_dias_mes = mnro_dias_mes;
    }

    public void setMid_idioma(int mid_idioma) {
        this.mid_idioma = mid_idioma;
    }

}
