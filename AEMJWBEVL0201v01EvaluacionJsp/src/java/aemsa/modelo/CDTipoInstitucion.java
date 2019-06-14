/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.modelo;

import aemsa.modelo.mysq.CDConexionMySq;
import aemsa.entidad.CETipoInstitucion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CDTipoInstitucion {

    public ResultSet cargarTablaTipoInstitucionv0() throws SQLException {
        String lStrComandoSQL = "SELECT * FROM FNZt01_tipo_institucion";

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();
        PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
        ResultSet oRsSQL = oPsSQL.executeQuery();

        return oRsSQL;
    }

    public static List<CETipoInstitucion> cargarTablaTipoInstitucionv1() {
        String lStrComandoSQL = "SELECT * FROM FNZt01_tipo_institucion";

        List<CETipoInstitucion> oLstCETipoInstitucionBancaria = new ArrayList<CETipoInstitucion>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

        try {
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    CETipoInstitucion oCETipoInstitucionBancaria = new CETipoInstitucion();
                    oCETipoInstitucionBancaria.setMid_tipo_institucion(oRsSQL.getInt(1));
                    oCETipoInstitucionBancaria.setMcod_tipo_institucion(oRsSQL.getNString(2));
                    oCETipoInstitucionBancaria.setMtxt_abrv(oRsSQL.getNString(3));
                    oCETipoInstitucionBancaria.setMtxt_desc(oRsSQL.getNString(4));
                    oCETipoInstitucionBancaria.setMid_idioma(oRsSQL.getInt(5));

                    oLstCETipoInstitucionBancaria.add(oCETipoInstitucionBancaria);

                }
                return oLstCETipoInstitucionBancaria;

            }

        } catch (Exception ex) {
        }
        return null;
    }

    public static List<CETipoInstitucion> cargarTablaTipoInstitucionv2() {
        String lStrComandoSQL = "{CALL FNZSPRCNSTipoInstitucion(2,NULL, NULL)}";
        List<CETipoInstitucion> oLstCETipoInstitucionBancaria = new ArrayList<CETipoInstitucion>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

        try {
            CallableStatement oPsSQL = oCxnSQL.prepareCall(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {
                    CETipoInstitucion oCETipoInstitucionBancaria = new CETipoInstitucion();
                    oCETipoInstitucionBancaria.setMid_tipo_institucion(oRsSQL.getInt(1));
                    oCETipoInstitucionBancaria.setMcod_tipo_institucion(oRsSQL.getNString(2));
                    oCETipoInstitucionBancaria.setMtxt_abrv(oRsSQL.getNString(3));
                    oCETipoInstitucionBancaria.setMtxt_desc(oRsSQL.getNString(4));
                    oCETipoInstitucionBancaria.setMid_idioma(oRsSQL.getInt(5));

                    oLstCETipoInstitucionBancaria.add(oCETipoInstitucionBancaria);
                }
                return oLstCETipoInstitucionBancaria;
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
