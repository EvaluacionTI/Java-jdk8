package pe.ias.bbva.evalua.java8.postgres.model.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.ias.bbva.evalua.java8.postgres.entity.CECanal;
import pe.ias.bbva.evalua.java8.postgres.entity.CEConstDataBase;
import pe.ias.bbva.evalua.java8.postgres.model.CDConexionPostgres;
import pe.ias.bbva.evalua.java8.postgres.model.CICanal;

public class CDCanalEmbebido implements CICanal {

    private Connection moCxnSQL = null;
    private ResultSet moRsSQL = null;
    private final Statement moStSQL = null;
    private PreparedStatement moPsSQL = null;
    private final CallableStatement moCsSQL = null;
    private CDConexionPostgres moCDCxnSQL = null;
    private CECanal oCECanal;

    public CDCanalEmbebido() {
        moCDCxnSQL = new CDConexionPostgres();
        oCECanal = new CECanal();
    }

    @Override
    public boolean saveChannel(CECanal poCanal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateChannel(CECanal poCanal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteChannel(CECanal poCanal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CECanal> listAllChannel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CECanal getChannelByCode(String psCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CECanal> getChannelByPaginationWithArrayList(Long pageSize, Long paginationKey) {
        ArrayList<CECanal> oListData = null;
        Long numberBlock = pageSize * paginationKey - paginationKey;

        moCDCxnSQL = new CDConexionPostgres();
        moCxnSQL = moCDCxnSQL.getConexion();
        try {
            moPsSQL = moCxnSQL.prepareStatement(CEConstDataBase.SQL_SELECT_CANAL_PAGINATION);
            moPsSQL.setLong(1, pageSize);
            moPsSQL.setLong(2, numberBlock);
            moRsSQL = moPsSQL.executeQuery();
            if (moRsSQL != null) {
                while (moRsSQL.next()) {
                    oCECanal = new CECanal();
                    oCECanal.setCodigoCanal(moRsSQL.getString("cod_canal"));
                    oCECanal.setDescripcion(moRsSQL.getString(2));

                    oListData.add(oCECanal);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CDCanalEmbebido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return oListData;        
    }

    @Override
    public List<CECanal> getChannelByPaginationWithList(Long pageSize, Long paginationKey) {
        List<CECanal> oListData = null;
        Long numberBlock = pageSize * paginationKey - paginationKey;

        moCDCxnSQL = new CDConexionPostgres();
        moCxnSQL = moCDCxnSQL.getConexion();
        try {
            moPsSQL = moCxnSQL.prepareStatement(CEConstDataBase.SQL_SELECT_CANAL_PAGINATION);
            moPsSQL.setLong(1, pageSize);
            moPsSQL.setLong(2, numberBlock);
            moRsSQL = moPsSQL.executeQuery();
            if (moRsSQL != null) {
                while (moRsSQL.next()) {
                    oCECanal = new CECanal();
                    oCECanal.setCodigoCanal(moRsSQL.getString("cod_canal"));
                    oCECanal.setDescripcion(moRsSQL.getString(2));

                    oListData.add(oCECanal);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CDCanalEmbebido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return oListData;
    }

    @Override
    public Long getNumberOfRecord() {
        Long totalRecord = 0L;
        moCDCxnSQL = new CDConexionPostgres();
        moCxnSQL = moCDCxnSQL.getConexion();
        try {
            moPsSQL = moCxnSQL.prepareStatement(CEConstDataBase.SQL_COUNT_CANAL);
            moRsSQL = moPsSQL.executeQuery();
            if (moRsSQL != null && moRsSQL.next()) {
                    totalRecord = moRsSQL.getLong(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CDCanalEmbebido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            moCDCxnSQL.setCerrar(moCxnSQL);
        }
        return totalRecord;
    }
}
