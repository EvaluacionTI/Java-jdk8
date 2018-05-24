/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.mysql.controladora;

import aemsa.mysql.dba.entidad.CETipoInstitucion;
import aemsa.mysql.dba.modelo.CDTipoInstitucion;

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
}
