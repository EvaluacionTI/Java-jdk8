/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.controladora;

import aemsa.entidad.CETipoInstitucion;
import aemsa.modelo.CDTipoInstitucion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CCTipoInstitucion {
    
    public ResultSet cargarTablaTipoInstitucionv0() throws SQLException{
        CDTipoInstitucion oCDTabla = new CDTipoInstitucion();
        
        return oCDTabla.cargarTablaTipoInstitucionv0();
    }
    
    public static List<CETipoInstitucion> cargarTablaTipoInstitucionv1()
       {
         return  CDTipoInstitucion.cargarTablaTipoInstitucionv1();
    }

    public static List<CETipoInstitucion> cargarTablaTipoInstitucionv2()
       {
         return  CDTipoInstitucion.cargarTablaTipoInstitucionv2();
    }    

}
