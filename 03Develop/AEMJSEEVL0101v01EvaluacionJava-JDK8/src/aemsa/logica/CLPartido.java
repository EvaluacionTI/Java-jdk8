/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.logica;

import aemsa.mysql.dba.entidad.CEPartido;

/**
 *
 * @author AEMSA
 */
public class CLPartido {
    
    public int calcularPartidoTotal(int pIntPartidoPerdido, int pIntPartidoEmpatado, int pIntPartidoGanado){
        return (pIntPartidoPerdido + pIntPartidoEmpatado + pIntPartidoGanado);
    }
    
    public int calcularPartidoTotal(CEPartido poCEPartido){
        return (poCEPartido.getmPartidoPerdido() + poCEPartido.getmPartidoGanado() + poCEPartido.getmPartidoEmpatado());
    }
}
