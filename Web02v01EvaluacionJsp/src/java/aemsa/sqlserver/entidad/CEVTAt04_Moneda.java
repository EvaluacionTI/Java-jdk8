/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.sqlserver.entidad;

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

    public int getMid_mon() {
        return mid_mon;
    }

    public void setMid_mon(int mid_mon) {
        this.mid_mon = mid_mon;
    }

    public String getMtxt_abrv() {
        return mtxt_abrv;
    }

    public void setMtxt_abrv(String mtxt_abrv) {
        this.mtxt_abrv = mtxt_abrv;
    }

    public String getMtxt_desc() {
        return mtxt_desc;
    }

    public void setMtxt_desc(String mtxt_desc) {
        this.mtxt_desc = mtxt_desc;
    }

    public String getMcod_iso_idio_orgn() {
        return mcod_iso_idio_orgn;
    }

    public void setMcod_iso_idio_orgn(String mcod_iso_idio_orgn) {
        this.mcod_iso_idio_orgn = mcod_iso_idio_orgn;
    }

    public String getMcod_iso_mon() {
        return mcod_iso_mon;
    }

    public void setMcod_iso_mon(String mcod_iso_mon) {
        this.mcod_iso_mon = mcod_iso_mon;
    }

    public int getMid_iso_mon() {
        return mid_iso_mon;
    }

    public void setMid_iso_mon(int mid_iso_mon) {
        this.mid_iso_mon = mid_iso_mon;
    }

    public boolean isMsn_ver() {
        return msn_ver;
    }

    public void setMsn_ver(boolean msn_ver) {
        this.msn_ver = msn_ver;
    }

    public boolean isMsn_upd() {
        return msn_upd;
    }

    public void setMsn_upd(boolean msn_upd) {
        this.msn_upd = msn_upd;
    }

    public boolean isMsn_anu() {
        return msn_anu;
    }

    public void setMsn_anu(boolean msn_anu) {
        this.msn_anu = msn_anu;
    }

    public boolean isMsn_del() {
        return msn_del;
    }

    public void setMsn_del(boolean msn_del) {
        this.msn_del = msn_del;
    }

    public boolean isMsn_act() {
        return msn_act;
    }

    public void setMsn_act(boolean msn_act) {
        this.msn_act = msn_act;
    }

    public boolean isMsn_dlft() {
        return msn_dlft;
    }

    public void setMsn_dlft(boolean msn_dlft) {
        this.msn_dlft = msn_dlft;
    }

    public String getMfec_ini_vig() {
        return mfec_ini_vig;
    }

    public void setMfec_ini_vig(String mfec_ini_vig) {
        this.mfec_ini_vig = mfec_ini_vig;
    }

    public String getMfec_fin_vig() {
        return mfec_fin_vig;
    }

    public void setMfec_fin_vig(String mfec_fin_vig) {
        this.mfec_fin_vig = mfec_fin_vig;
    }

}
