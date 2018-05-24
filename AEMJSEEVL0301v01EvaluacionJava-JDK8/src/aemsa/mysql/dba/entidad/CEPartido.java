/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.mysql.dba.entidad;

/**
 *
 * @author AEMSA
 */
public class CEPartido {
    private String mEquipo;
    private int mPartidoPerdido;
    private int mPartidoGanado;
    private int mPartidoEmpatado;

    /**
     * @return the mEquipo
     */
    public String getmEquipo() {
        return mEquipo;
    }

    /**
     * @param mEquipo the mEquipo to set
     */
    public void setmEquipo(String mEquipo) {
        this.mEquipo = mEquipo;
    }

    /**
     * @return the mPartidoPerdido
     */
    public int getmPartidoPerdido() {
        return mPartidoPerdido;
    }

    /**
     * @param mPartidoPerdido the mPartidoPerdido to set
     */
    public void setmPartidoPerdido(int mPartidoPerdido) {
        this.mPartidoPerdido = mPartidoPerdido;
    }

    /**
     * @return the mPartidoGanado
     */
    public int getmPartidoGanado() {
        return mPartidoGanado;
    }

    /**
     * @param mPartidoGanado the mPartidoGanado to set
     */
    public void setmPartidoGanado(int mPartidoGanado) {
        this.mPartidoGanado = mPartidoGanado;
    }

    /**
     * @return the mPartidoEmpatado
     */
    public int getmPartidoEmpatado() {
        return mPartidoEmpatado;
    }

    /**
     * @param mPartidoEmpatado the mPartidoEmpatado to set
     */
    public void setmPartidoEmpatado(int mPartidoEmpatado) {
        this.mPartidoEmpatado = mPartidoEmpatado;
    }
    
    
}
