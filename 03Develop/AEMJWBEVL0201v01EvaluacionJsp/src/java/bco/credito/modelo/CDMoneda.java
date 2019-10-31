/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bco.credito.modelo;

import bco.credito.entidad.CEMoneda;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class CDMoneda {

/*
    Descripcion : Lectura de la tabla de manera embebida el SQL
    Retorna     : ResultSet
*/
    public ResultSet cargarTablaMonedav0() throws SQLException {
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";

        Connection oCxnSQL = CDConexionMySql.getInstancia().getConexionMySql();
        PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
        ResultSet oRsSQL = oPsSQL.executeQuery();

        return oRsSQL;
    }

/*
    Descripcion : Lectura de la tabla de manera embebida el SQL
    Retorna     : Coleccion de tipo List
*/    
    public static List<CEMoneda> cargarTablaMonedav1() {
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";

        List<CEMoneda> oLstCEMoneda = new ArrayList<CEMoneda>();

        Connection oCxnSQL = CDConexionMySql.getInstancia().getConexionMySql();

        try {
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    CEMoneda oCEMoneda = new CEMoneda();
                    oCEMoneda.setId(oRsSQL.getInt(1));
                    oCEMoneda.setAbreviatura(oRsSQL.getNString(2));
                    oCEMoneda.setDescripcion(oRsSQL.getNString(3));
                    oLstCEMoneda.add(oCEMoneda);
                }
                return oLstCEMoneda;
            }

        } catch (Exception ex) {
        }
        return null;
    }

/*
    Descripcion : Lectura de la tabla vía un procedimiento almacenado
    Retorna     : Colección tipo List
*/    
    public static List<CEMoneda> cargarTablaMonedav2() {
        String lStrComandoSQL = "{CALL VTASPRCNSMoneda(2,NULL, NULL)}";
        List<CEMoneda> oLstCEMoneda = new ArrayList<CEMoneda>();

        Connection oCxnSQL = CDConexionMySql.getInstancia().getConexionMySql();

        try {
            CallableStatement oPsSQL = oCxnSQL.prepareCall(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {
                    CEMoneda oCEMoneda = new CEMoneda();
                    oCEMoneda.setId(oRsSQL.getInt(1));
                    oCEMoneda.setAbreviatura(oRsSQL.getNString(2));
                    oCEMoneda.setDescripcion(oRsSQL.getNString(3));

                   oLstCEMoneda.add(oCEMoneda);
                }
                return oLstCEMoneda;
            }
            return null;
        } catch (SQLException ex) {
            System.out.print(ex);
            return null;
        } catch (Exception ex) {
            System.out.print(ex);
            return null;
        } finally {
            try {
                oCxnSQL.close();
            } catch (SQLException ex) {
                System.out.print("No se puede cerrar la conexion" + ex);
            }
        }
    }
}
