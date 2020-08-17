package pe.aemsa.cap30.database.derby.modelo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.entidad.CECompra;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;
import pe.aemsa.cap30.database.derby.modelo.CICompra;

public class CDCompra implements CICompra{
    private static final Logger MOLOG = LogManager.getLogger(CDCompra.class);
    private Connection oCxnSQL = null;
    private CDConexionDerby oCxn = null;
    private CECompra oCECompra;
    private Statement oStSQL;
    
    public CDCompra(){
        oCxn = new CDConexionDerby();
        oCECompra = new CECompra();
    }
        
    @Override
    public void saveCompra(CECompra poCECompra) {
        MOLOG.info("=====> [FCS] Start method : saveCompra(CECompra poCECompra)");
        
        SimpleDateFormat oFechaFormato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sFechaddMMyyhhmmss = oFechaFormato.format(poCECompra.getFechaSistema());
      
        String lStrComandoSQL = "INSERT INTO FCSt01_compra VALUES (" + poCECompra.getIdCompra() + ", '" + poCECompra.getNombreProducto() + "', " 
                + poCECompra.getCantidad() + ", " + poCECompra.getPrecio() + ", "  + poCECompra.isSiNoActivo() + ", '" + sFechaddMMyyhhmmss + "')";
        
        oStSQL = null;
        try{
            oCxnSQL = oCxn.getOpenSQLDerby();
            oStSQL = oCxnSQL.createStatement();
            oStSQL.execute(lStrComandoSQL);
            
            oStSQL.close();
            oCxnSQL.close();
        } catch(SQLException exSQL) {
            MOLOG.info("=> [FCS] Error SQL : " + exSQL.getErrorCode());
        }
        MOLOG.info("=====> [FCS] End method : saveCompra(CECompra poCECompra)");
    }

    @Override
    public boolean updateCompra(CECompra poCECompra) {
        MOLOG.info("=====> [FCS] Start method : updateCompra(CECompra poCECompra)");
        
        String lStrComandoSQL = "UPDATE FCSt01_compra SET txt_nom = " + poCECompra.getNombreProducto() + ", " + "mto_pre = " + poCECompra.getPrecio() + ", " 
                + "mto_qt = " + poCECompra.getCantidad() + ", " + "sn_activo = "+ poCECompra.isSiNoActivo() + ", " + "fec_sis = "+ poCECompra.getFechaSistema() 
                +  " WHERE id_compra = " + poCECompra.getIdCompra() ;
        boolean bSnActualizar = false;
        oStSQL = null;
        
        try{
            oCxnSQL = oCxn.getOpenSQLDerby();
            oStSQL = oCxnSQL.createStatement();
            oStSQL.execute(lStrComandoSQL);
            bSnActualizar = true;
            
            oStSQL.close();
            oCxnSQL.close();
        } catch(SQLException exSQL) {
            MOLOG.info("=> [FCS] Error SQL : " + exSQL.getErrorCode());
        }
        
        MOLOG.info("=====> [FCS] End method : updateCompra(CECompra poCECompra)");
        return bSnActualizar;
    }

    @Override
    public boolean deleteCompra(int piIdCompra) {
        MOLOG.info("=====> [FCS] Start method : deleteCompra(int piIdCompra)");

        String lStrComandoSQL = "DELETE FROM FCSt01_compra WHERE id_compra = " + piIdCompra;
        boolean bSnEliminar  = false;
        oStSQL = null;
        try{
            oCxnSQL = oCxn.getOpenSQLDerby();
            oStSQL = oCxnSQL.createStatement();
            oStSQL.execute(lStrComandoSQL);
            bSnEliminar = true;
            
            oStSQL.close();
            oCxnSQL.close();
        } catch(SQLException exSQL) {
            MOLOG.info("=> [FCS] Error SQL : " + exSQL.getErrorCode());
        } 
        
        MOLOG.info("=====> [FCS] End method : deleteCompra(int piIdCompra)");
        return bSnEliminar;
    }

    @Override
    public List<CECompra> listAllCompra() {
        MOLOG.info("=====> [FCS] Start method :  listAllCompra()");
        String lStrComandoSQL = "SELECT * FROM FCSt01_compra";

        List<CECompra> oLstCECompra = new ArrayList<>();
      
        try {
            oCxnSQL = oCxn.getOpenSQLDerby();
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    oCECompra = new CECompra();
                    oCECompra.setIdCompra(oRsSQL.getInt("id_compra"));
                    oCECompra.setNombreProducto(oRsSQL.getString("txt_nom"));
                    oCECompra.setCantidad(oRsSQL.getDouble("mto_qt"));
                    oCECompra.setPrecio(oRsSQL.getDouble("mto_pre"));
                    oCECompra.setSiNoActivo(oRsSQL.getBoolean("sn_activo"));
                    oCECompra.setFechaSistema(oRsSQL.getDate("fec_sis"));

                    oLstCECompra.add(oCECompra);

                }
                return oLstCECompra;

            }
            oPsSQL.close();
            oCxnSQL.close();
        } catch(SQLException exSQL) {
             MOLOG.info("=> [FCS] Error SQL : " + exSQL.getErrorCode());
        }
        
        MOLOG.info("=====> [FCS] End method :  listAllCompra()");
        return null;
    }

    @Override
    public CECompra listByIdCompra(int piIdCompra) {
        MOLOG.info("=====> [FCS] Start method : listByIdCompra(int piIdCompra)");
        
        String lStrComandoSQL = "SELECT * FROM FCSt01_compra WHERE id_compra = " + piIdCompra;
 
        try {
            oCxnSQL = oCxn.getOpenSQLDerby();
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    oCECompra = new CECompra();
                    oCECompra.setIdCompra(oRsSQL.getInt("id_compra"));
                    oCECompra.setNombreProducto(oRsSQL.getString("txt_nom"));
                    oCECompra.setCantidad(oRsSQL.getDouble("mto_qt"));
                    oCECompra.setPrecio(oRsSQL.getDouble("mto_pre"));
                    oCECompra.setSiNoActivo(oRsSQL.getBoolean("sn_activo"));
                    oCECompra.setFechaSistema(oRsSQL.getDate("fec_sis"));

                }
                return oCECompra;

            }
            oPsSQL.close();
            oCxnSQL.close();
        } catch(SQLException exSQL) {
             MOLOG.info("=> [FCS] Error SQL : " + exSQL.getErrorCode());
        }        
        
        MOLOG.info("=====> [FCS] End method : listByIdCompra(int piIdCompra)");
        return null;
    }
    
}
