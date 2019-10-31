/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.sqlserver.modelo;

import aemsa.sqlserver.entidad.CEVTAt04_Moneda;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CDVTAt04_moneda {
    private Connection moCxnSQL = null;
    private ResultSet moRsSQL = null;
    private Statement moStSQL = null;
    private PreparedStatement moPsSQL = null;
    private CallableStatement moCsSQL = null;
    private CDConexion moCDCxnSQL = null;
            
    public ResultSet cargarTablaMonedaEmbebido(){
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";

        try {        
            moCDCxnSQL = new CDConexion();
            moCxnSQL = moCDCxnSQL.getOpenSQLServer();

            moPsSQL = moCxnSQL.prepareStatement(lStrComandoSQL);
            moRsSQL = moPsSQL.executeQuery();
        }catch(SQLException exSQL){
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }

        return moRsSQL;
    }

    public List<CEVTAt04_Moneda> cargarTablaMonedaEmbebidoColeccion() {
        String lStrComandoSQL = "SELECT * FROM VTAt04_moneda";
        List<CEVTAt04_Moneda> oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();

        try {        
            moCDCxnSQL = new CDConexion();
            moCxnSQL = moCDCxnSQL.getOpenSQLServer();

            moPsSQL = moCxnSQL.prepareStatement(lStrComandoSQL);
            moRsSQL = moPsSQL.executeQuery();
            if (moRsSQL != null) {
                while (moRsSQL.next()) {
                    CEVTAt04_Moneda oCEMoneda = new CEVTAt04_Moneda();
                    oCEMoneda.setMid_mon(moRsSQL.getInt("id_mon"));
                    oCEMoneda.setMtxt_abrv(moRsSQL.getString(2));
                    oCEMoneda.setMtxt_desc(moRsSQL.getString(3));
                    oCEMoneda.setMcod_iso_idio_orgn(moRsSQL.getString(4));
                    oCEMoneda.setMcod_iso_mon(moRsSQL.getString(5));
                    oCEMoneda.setMid_iso_mon(moRsSQL.getInt(6));
                    oCEMoneda.setMsn_ver(moRsSQL.getBoolean(7));
                    oCEMoneda.setMsn_upd(moRsSQL.getBoolean(8));
                    oCEMoneda.setMsn_anu(moRsSQL.getBoolean(9));
                    oCEMoneda.setMsn_del(moRsSQL.getBoolean(10));
                    oCEMoneda.setMsn_act(moRsSQL.getBoolean(11));
                    oCEMoneda.setMsn_dlft(moRsSQL.getBoolean(12));
                    oCEMoneda.setMfec_ini_vig(moRsSQL.getString(13));
                    oCEMoneda.setMfec_fin_vig(moRsSQL.getString(14));
                    oLstCEMoneda.add(oCEMoneda);
                }
            }
        } catch (SQLException exSQL) {
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
        moCDCxnSQL.setCerrarSQLServer(moCxnSQL, moRsSQL);
        return oLstCEMoneda;
    }

    public void agregarMonedaEmbebido(CEVTAt04_Moneda poCEMoneda) {
        String lStrComandoSQL = "INSERT VTAt04_moneda VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {        
            moCDCxnSQL = new CDConexion();
            moCxnSQL = moCDCxnSQL.getOpenSQLServer();

            moPsSQL = moCxnSQL.prepareStatement(lStrComandoSQL);
            moPsSQL.setInt(1, poCEMoneda.getMid_mon());
            moPsSQL.setString(2, poCEMoneda.getMtxt_abrv());
            moPsSQL.setString(3, poCEMoneda.getMtxt_desc());
            moPsSQL.setString(4, poCEMoneda.getMcod_iso_idio_orgn());
            moPsSQL.setString(5, poCEMoneda.getMcod_iso_mon());
            moPsSQL.setInt(6, poCEMoneda.getMid_iso_mon());
            moPsSQL.setBoolean(7, poCEMoneda.isMsn_ver());
            moPsSQL.setBoolean(8, poCEMoneda.isMsn_upd());
            moPsSQL.setBoolean(9, poCEMoneda.isMsn_anu());
            moPsSQL.setBoolean(10, poCEMoneda.isMsn_del());
            moPsSQL.setBoolean(11, poCEMoneda.isMsn_act());
            moPsSQL.setBoolean(12, poCEMoneda.isMsn_del());
            moPsSQL.setString(13, poCEMoneda.getMfec_ini_vig());
            moPsSQL.setString(14, poCEMoneda.getMfec_fin_vig());
            moPsSQL.executeUpdate();
        } catch (SQLException exSQL) {
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
        moCDCxnSQL.setCerrarSQLServer(moCxnSQL, moRsSQL, moPsSQL);
    }

    
    public List<CEVTAt04_Moneda> cargarTablaMonedaColeccionProcedimiento() {
        String lStrComandoSQL = "{CALL VTASPRCNSMoneda(1,NULL, NULL)}";
        List<CEVTAt04_Moneda> oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();

        try {
            moCDCxnSQL = new CDConexion();
            moCxnSQL = moCDCxnSQL.getOpenSQLServer();
            moCsSQL = moCxnSQL.prepareCall(lStrComandoSQL);
            moRsSQL = moCsSQL.executeQuery();

            if (moRsSQL != null) {
                while (moRsSQL.next()) {
                    CEVTAt04_Moneda oCEMoneda = new CEVTAt04_Moneda();
                    oCEMoneda.setMid_mon(moRsSQL.getInt("Id"));
                    oCEMoneda.setMtxt_abrv(moRsSQL.getString("Abreviatura"));
                    oCEMoneda.setMtxt_desc(moRsSQL.getString("Descripcion"));
                    oCEMoneda.setMcod_iso_idio_orgn(moRsSQL.getString("CodigoIdioma"));
                    oCEMoneda.setMcod_iso_mon(moRsSQL.getString("CodigoIsoMoneda"));
                    oCEMoneda.setMid_iso_mon(moRsSQL.getInt("IdIsoMoneda"));
                    oCEMoneda.setMsn_ver(moRsSQL.getBoolean("SiNoVer"));
                    oCEMoneda.setMsn_upd(moRsSQL.getBoolean(8));
                    oCEMoneda.setMsn_anu(moRsSQL.getBoolean(9));
                    oCEMoneda.setMsn_del(moRsSQL.getBoolean(10));
                    oCEMoneda.setMsn_act(moRsSQL.getBoolean(11));
                    oCEMoneda.setMsn_dlft(moRsSQL.getBoolean(12));
                    oCEMoneda.setMfec_ini_vig(moRsSQL.getString(13));
                    oCEMoneda.setMfec_fin_vig(moRsSQL.getString(14));

                    oLstCEMoneda.add(oCEMoneda);
                }
            }
        } catch (SQLException exSQL) {
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
        moCDCxnSQL.setCerrarSQLServer(moCxnSQL, moRsSQL);
        return oLstCEMoneda;
    }

    public List<CEVTAt04_Moneda> cargarTablaMonedaColeccionProcedimiento(int piTipoCNS, int piCodigo, String psNombre) {
        String lStrComandoSQL = "{CALL VTASPRCNSMoneda(?, ?, ?)}";
        List<CEVTAt04_Moneda> oLstCEMoneda = new ArrayList<CEVTAt04_Moneda>();

        try {
            moCDCxnSQL = new CDConexion();
            moCxnSQL = moCDCxnSQL.getOpenSQLServer();
            moCsSQL = moCxnSQL.prepareCall(lStrComandoSQL);
            moCsSQL.setInt(1, piTipoCNS);
            moCsSQL.setInt(2, piCodigo);
            moCsSQL.setString(3, psNombre);
            moRsSQL = moCsSQL.executeQuery();

            if (moRsSQL != null) {
                while (moRsSQL.next()) {
                    CEVTAt04_Moneda oCEMoneda = new CEVTAt04_Moneda();
                    oCEMoneda.setMid_mon(moRsSQL.getInt("Id"));
                    oCEMoneda.setMtxt_abrv(moRsSQL.getString("Abreviatura"));
                    oCEMoneda.setMtxt_desc(moRsSQL.getString("Descripcion"));
                    oCEMoneda.setMcod_iso_idio_orgn(moRsSQL.getString("CodigoIdioma"));
                    oCEMoneda.setMcod_iso_mon(moRsSQL.getString("CodigoIsoMoneda"));
                    oCEMoneda.setMid_iso_mon(moRsSQL.getInt("IdIsoMoneda"));
                    oCEMoneda.setMsn_ver(moRsSQL.getBoolean("SiNoVer"));
                    oCEMoneda.setMsn_upd(moRsSQL.getBoolean(8));
                    oCEMoneda.setMsn_anu(moRsSQL.getBoolean(9));
                    oCEMoneda.setMsn_del(moRsSQL.getBoolean(10));
                    oCEMoneda.setMsn_act(moRsSQL.getBoolean(11));
                    oCEMoneda.setMsn_dlft(moRsSQL.getBoolean(12));
                    oCEMoneda.setMfec_ini_vig(moRsSQL.getString(13));
                    oCEMoneda.setMfec_fin_vig(moRsSQL.getString(14));
                    
                    oLstCEMoneda.add(oCEMoneda);
                }
            }
        } catch (SQLException exSQL) {
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
        moCDCxnSQL.setCerrarSQLServer(moCxnSQL, moRsSQL);
        return oLstCEMoneda;
    }    
}
