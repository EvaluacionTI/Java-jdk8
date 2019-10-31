/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.entidad;

import java.io.Serializable;

public class CEVTAt04_Moneda implements Serializable{
    private int mid_mon;
    private String mtxt_abrv;
    private String mtxt_desc;
    private String mcod_iso_idio_orgn;
    private String mcod_iso_mon;
    private int mid_iso_mon;
    private boolean msn_ver;
    private boolean msn_upd;
    private boolean msn_anu;
    private boolean msn_del;
    private boolean msn_act;
    private boolean msn_dlft;
    private String mfec_ini_vig;
    private String mfec_fin_vig;

    /**
     * @return the mid_mon
     */
    public int getIdentificadorMoneda() {
        return mid_mon;
    }

    /**
     * @param mid_mon the mid_mon to set
     */
    public void setIdentificadorMoneda(int mid_mon) {
        this.mid_mon = mid_mon;
    }

    /**
     * @return the mtxt_abrv
     */
    public String getAbreviaturaMoneda() {
        return mtxt_abrv;
    }

    /**
     * @param mtxt_abrv the mtxt_abrv to set
     */
    public void setAbreviaturaMoneda(String mtxt_abrv) {
        this.mtxt_abrv = mtxt_abrv;
    }

    /**
     * @return the mtxt_desc
     */
    public String getDescripcionMoneda() {
        return mtxt_desc;
    }

    /**
     * @param mtxt_desc the mtxt_desc to set
     */
    public void setDescripcionMoneda(String mtxt_desc) {
        this.mtxt_desc = mtxt_desc;
    }

    /**
     * @return the mcod_iso_idio_orgn
     */
    public String getCodigoISOIdiomaOrigen() {
        return mcod_iso_idio_orgn;
    }

    /**
     * @param mcod_iso_idio_orgn the mcod_iso_idio_orgn to set
     */
    public void setCodigoISOIdiomaOrigen(String mcod_iso_idio_orgn) {
        this.mcod_iso_idio_orgn = mcod_iso_idio_orgn;
    }

    /**
     * @return the mcod_iso_mon
     */
    public String getCodigoISOMoneda() {
        return mcod_iso_mon;
    }

    /**
     * @param mcod_iso_mon the mcod_iso_mon to set
     */
    public void setCodigoISOMoneda(String mcod_iso_mon) {
        this.mcod_iso_mon = mcod_iso_mon;
    }

    /**
     * @return the mid_iso_mon
     */
    public int getIdISOMoneda() {
        return mid_iso_mon;
    }

    /**
     * @param mid_iso_mon the mid_iso_mon to set
     */
    public void setIdISOMoneda(int mid_iso_mon) {
        this.mid_iso_mon = mid_iso_mon;
    }

    /**
     * @return the msn_ver
     */
    public boolean getSiNoVer() {
        return msn_ver;
    }

    /**
     * @param msn_ver the msn_ver to set
     */
    public void setSiNoVer(boolean msn_ver) {
        this.msn_ver = msn_ver;
    }

    /**
     * @return the msn_upd
     */
    public boolean getSiNoActualizar() {
        return msn_upd;
    }

    /**
     * @param msn_upd the msn_upd to set
     */
    public void setSiNoActualizar(boolean msn_upd) {
        this.msn_upd = msn_upd;
    }

    /**
     * @return the msn_anu
     */
    public boolean getSiNoAnular() {
        return msn_anu;
    }

    /**
     * @param msn_anu the msn_anu to set
     */
    public void setSiNoAnular(boolean msn_anu) {
        this.msn_anu = msn_anu;
    }

    /**
     * @return the msn_del
     */
    public boolean getSiNoEliminar() {
        return msn_del;
    }

    /**
     * @param msn_del the msn_del to set
     */
    public void setSiNoEliminar(boolean msn_del) {
        this.msn_del = msn_del;
    }

    /**
     * @return the msn_act
     */
    public boolean getSiNoActivo() {
        return msn_act;
    }

    /**
     * @param msn_act the msn_act to set
     */
    public void setSiNoActivo(boolean msn_act) {
        this.msn_act = msn_act;
    }

    /**
     * @return the msn_dlft
     */
    public boolean getSiNoDefault() {
        return msn_dlft;
    }

    /**
     * @param msn_dlft the msn_dlft to set
     */
    public void setSiNoDefault(boolean msn_dlft) {
        this.msn_dlft = msn_dlft;
    }

    /**
     * @return the mfec_ini_vig
     */
    public String getFechaInicioVigencia() {
        return mfec_ini_vig;
    }

    /**
     * @param mfec_ini_vig the mfec_ini_vig to set
     */
    public void setFechaInicioVigencia(String mfec_ini_vig) {
        this.mfec_ini_vig = mfec_ini_vig;
    }

    /**
     * @return the mfec_fin_vig
     */
    public String getFechaFinVigencia() {
        return mfec_fin_vig;
    }

    /**
     * @param mfec_fin_vig the mfec_fin_vig to set
     */
    public void setFechaFinVigencia(String mfec_fin_vig) {
        this.mfec_fin_vig = mfec_fin_vig;
    }

 
}
