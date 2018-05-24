
package aemsa.sqlserver.vista;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;
import aemsa.sqlserver.modelo.CDVTAt04_moneda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV06v01ProbarInsertarMonedaEmbebido {

    private static final Logger moLog = LogManager.getLogger(CV03v01ProbarTablaMoneda.class);
    public static void main(String[] args) {
       
        try{
            System.out.println("Creando un objeto");
            CEVTAt04_Moneda oCEMoneda = new CEVTAt04_Moneda();
            CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();

            moLog.debug("Entidad" + oCEMoneda);
            oCEMoneda.setMid_mon(1);
            oCEMoneda.setMtxt_abrv("S/.");
            oCEMoneda.setMtxt_desc("NUEVOS SOLES");
            oCEMoneda.setMcod_iso_idio_orgn("ES");
            oCEMoneda.setMcod_iso_mon("PEN");
            oCEMoneda.setMid_iso_mon(604);
            oCEMoneda.setMsn_ver(true);
            oCEMoneda.setMsn_upd(true);
            oCEMoneda.setMsn_anu(false);
            oCEMoneda.setMsn_del(false);
            oCEMoneda.setMsn_act(true);
            oCEMoneda.setMsn_dlft(false);
            oCEMoneda.setMfec_ini_vig("03/01/2015");
            oCEMoneda.setMfec_fin_vig("14/12/2016");
            
            oCDMoneda.agregarMonedaEmbebido(oCEMoneda);
            
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
