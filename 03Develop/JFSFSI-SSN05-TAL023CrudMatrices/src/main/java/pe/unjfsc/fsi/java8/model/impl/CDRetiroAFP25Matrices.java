package pe.unjfsc.fsi.java8.model.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.model.CIRetiroAfp25;

public class CDRetiroAFP25Matrices implements CIRetiroAfp25 {

    private static final Logger LOG = LoggerFactory.getLogger("CDRetiroAFP25Matrices");

    private Object[][] oData;

    public CDRetiroAFP25Matrices() {
        LOG.info("[EVL] Antes dec instanciar : {}", oData);
        oData = new Object[100][3];
        LOG.info("[EVL] despues de instanciar : {}", oData.length);

        // Identificador equivalente al de la clase CESaldosAfiliado
        oData[0][0] = 1;
        oData[1][0] = 2;
        oData[2][0] = 3;
        oData[3][0] = 4;
        oData[4][0] = 5;
        oData[5][0] = 6;

        //Codigo del afiliado
        oData[0][1] = "2002";
        oData[1][1] = "2003";
        oData[2][1] = "2004";
        oData[3][1] = "2005";
        oData[4][1] = "2007";
        oData[5][1] = "2008";

        //Saldo del afiliado
        oData[0][2] = 3500.00;
        oData[1][2] = 4500.00;
        oData[2][2] = 13000.00;
        oData[3][2] = 24000.00;
        oData[4][2] = 35000.00;
        oData[5][2] = 56600.00;
        LOG.info("[EVL] load data : {}", oData.length);
    }

    @Override
    public void saveRetiroDimensional(Object[][] poData) {
        int lId = (int) poData[0][0];
        String lCodigo = (String) poData[0][1];
        double lSaldoCIC = (double) poData[0][2];

        LOG.info("[EVL] id : {}", lId);
        LOG.info("[EVL] lCodigo : {}", lCodigo);
        LOG.info("[EVL] lSaldoCIC : {}", lSaldoCIC);
        for (int x = 0; x < oData.length; x++) {
            LOG.info("[EVL] 3 datos : {} {} {} {}", x, oData[x][0], oData[x][1], oData[x][2]);
            if (oData[x][0] == null && oData[x][1] == null && oData[x][2] == null) {
                LOG.info("[EVL] antes de agregar : {}");
                oData[x][0] = lId;
                oData[x][1] = lCodigo;
                oData[x][2] = lSaldoCIC;
                LOG.info("[EVL] despues de agregar : {} {} {}", oData[x][0], oData[x][1], oData[x][2]);
                x = oData.length + 1;
            }
        }
    }

    @Override
    public void updateRetiroDimensional(Object[][] poData) {
        int lId = (int) poData[0][0];
        String lCodigo = (String) poData[0][1];
        double lSaldoCIC = (double) poData[0][2];
        LOG.info("[EVL] id : {}", lId);
        LOG.info("[EVL] lCodigo : {}", lCodigo);
        LOG.info("[EVL] lSaldoCIC : {}", lSaldoCIC);

        for (int x = 0; x < oData.length; x++) {
            LOG.info("[EVL] 3 datos : {} {} {} {}", x, oData[x][0], oData[x][1], oData[x][2]);
            if (oData[x][0] == null && oData[x][1] == null && oData[x][2] == null) {
                continue;
            } else {
                LOG.info("[EVL] antes de agregar : {}");
                if (oData[x][0].equals(lId)) {
                    oData[x][1] = lCodigo;
                    oData[x][2] = lSaldoCIC;
                    x = oData.length + 1;
                }
                LOG.info("[EVL] despues de agregar : {}");
            }
        }
    }

    @Override
    public void deleteRetiroDimensional(int pId) {
        for (int x = 0; x < oData.length; x++) {
            LOG.info("[EVL] 3 datos : {} {} {} {}", x, oData[x][0], oData[x][1], oData[x][2]);
            if (oData[x][0] == null && oData[x][1] == null && oData[x][2] == null) {
                continue;
            } else {
                LOG.info("[EVL] antes de agregar : {}");
                if (oData[x][0].equals(pId)) {
                    oData[x][0] = null;
                    oData[x][1] = null;
                    oData[x][2] = null;
                    x = oData.length + 1;
                }
                LOG.info("[EVL] despues de agregar : {}");
            }
        }
    }

    @Override
    public Object[][] consultAllRetiroDimensional() {
        LOG.info("[EVL] Consulta general : {}", oData.length);
        return oData;
    }

    @Override
    public Object[][] consultaByIdRetiroDimensional(int pId) {
        Object[][] oResult = new Object[1][3];
        for (int x = 0; x < oData.length; x++) {
            LOG.info("[EVL] 3 datos : {} {} {} {}", x, oData[x][0], oData[x][1], oData[x][2]);
            if (oData[x][0] == null && oData[x][1] == null && oData[x][2] == null) {
                continue;
            } else {
                LOG.info("[EVL] antes de agregar : {}");
                if (oData[x][0].equals(pId)) {
                    oResult[0][0] = oData[x][0];
                    oResult[0][1] = oData[x][1];
                    oResult[0][2] = oData[x][2];
                    x = oData.length + 1;
                }
                LOG.info("[EVL] despues de agregar : {}");
            }
        }
        return oResult;
    }
}
