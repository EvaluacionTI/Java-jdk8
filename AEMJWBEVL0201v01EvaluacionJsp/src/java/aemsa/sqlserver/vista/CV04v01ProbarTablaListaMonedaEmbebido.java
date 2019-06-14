
package aemsa.sqlserver.vista;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;
import aemsa.sqlserver.modelo.CDVTAt04_moneda;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CV04v01ProbarTablaListaMonedaEmbebido {

    private static final Logger moLog = LogManager.getLogger(CV03v01ProbarTablaMoneda.class);

    public static void main(String[] args) {
       
        try{
            System.out.println("Declarando un objeto Conexion ");
            CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
            List<CEVTAt04_Moneda> oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();
            
            oLstCEMoneda = oCDMoneda.cargarTablaMonedaEmbebidoColeccion();
            
            moLog.debug("Lectura " + oLstCEMoneda.size());
            System.out.println("Número de filas : " + oLstCEMoneda.size());
            

        }catch(NullPointerException exNPE){
            exNPE.getMessage();
        }
    }
}
