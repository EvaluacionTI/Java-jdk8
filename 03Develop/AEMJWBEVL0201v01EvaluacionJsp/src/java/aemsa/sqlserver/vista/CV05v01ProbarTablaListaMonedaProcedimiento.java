
package aemsa.sqlserver.vista;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;
import aemsa.sqlserver.modelo.CDVTAt04_moneda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV05v01ProbarTablaListaMonedaProcedimiento {

    private static final Logger moLog = LogManager.getLogger(CV03v01ProbarTablaMoneda.class);
    public static void main(String[] args) {
       
        try{
            System.out.println("Declarando un objeto Conexion ");
            CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
            List<CEVTAt04_Moneda> oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();
            
            oLstCEMoneda = oCDMoneda.cargarTablaMonedaColeccionProcedimiento();
            
            moLog.debug("Lectura " + oLstCEMoneda.size());
            System.out.println("Número de filas de lista: " + oLstCEMoneda.size());

            oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();;
            oLstCEMoneda = oCDMoneda.cargarTablaMonedaColeccionProcedimiento(2, 1, null);
            System.out.println("Número de filas lista selectiva: " + oLstCEMoneda.size());
            
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
