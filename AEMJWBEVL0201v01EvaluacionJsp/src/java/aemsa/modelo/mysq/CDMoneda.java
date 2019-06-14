/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.modelo.mysq;

import aemsa.entidad.CEMoneda;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class CDMoneda {

    public ResultSet cargarTablaMonedav0() throws SQLException {
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();
        PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
        ResultSet oRsSQL = oPsSQL.executeQuery();

        return oRsSQL;
    }

    public static List<CEMoneda> cargarTablaMonedav1() {
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";

        List<CEMoneda> oLstCEMoneda = new ArrayList<CEMoneda>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

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

    public static List<CEMoneda> cargarTablaMonedav2() {
        String lStrComandoSQL = "{CALL VTASPRCNSMoneda(2,NULL, NULL)}";
        List<CEMoneda> oLstCEMoneda = new ArrayList<CEMoneda>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

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
