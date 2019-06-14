package aemsa.sqlserver.controladora;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;
import aemsa.sqlserver.modelo.CDVTAt04_moneda;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

public class CCVTAt04_Moneda {

    public ResultSet cargarTablaMonedaEmbebido() throws SQLException{
        CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
        
        return oCDMoneda.cargarTablaMonedaEmbebido();
    }
    
    public static List<CEVTAt04_Moneda> cargarTablaMonedaColeccion() throws SQLException {
        CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
        
        return oCDMoneda.cargarTablaMonedaEmbebidoColeccion();
    }

    public static List<CEVTAt04_Moneda> cargarTablaMonedaColeccionProcedimiento() throws SQLException {
        CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
        
        return oCDMoneda.cargarTablaMonedaColeccionProcedimiento();
    }    

    public void agregarMonedaEmbebido(CEVTAt04_Moneda poCEMoneda) throws SQLException{
         CDVTAt04_moneda oCDMoneda = new CDVTAt04_moneda();
        
        oCDMoneda.agregarMonedaEmbebido(poCEMoneda);
    }


}
