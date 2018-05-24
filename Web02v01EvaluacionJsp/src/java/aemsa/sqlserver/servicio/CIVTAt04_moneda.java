/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.sqlserver.servicio;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;
import java.util.List;

/**
 *
 * @author ALDVV
 */
public interface CIVTAt04_moneda {
    public void grabarMoneda(CEVTAt04_Moneda poCEVTAt04_moneda);
    public CEVTAt04_Moneda buscarMoneda(int pId);
    public void eliminarMoneda(int pId);
    public List listaMoneda();
}
