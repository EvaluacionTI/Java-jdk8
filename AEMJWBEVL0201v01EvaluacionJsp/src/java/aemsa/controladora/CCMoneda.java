package aemsa.controladora;

import aemsa.entidad.CEMoneda;
import aemsa.modelo.mysq.CDMoneda;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

public class CCMoneda {

    public ResultSet cargarTablaMonedav0() throws SQLException{
        CDMoneda oCDMoneda = new CDMoneda();
        
        return oCDMoneda.cargarTablaMonedav0();
    }
    
    public static List<CEMoneda> cargarTablaMonedav1() {
        return CDMoneda.cargarTablaMonedav1();
    }

    public static List<CEMoneda> cargarTablaMonedav2() {
        return CDMoneda.cargarTablaMonedav2();
    }    
}
