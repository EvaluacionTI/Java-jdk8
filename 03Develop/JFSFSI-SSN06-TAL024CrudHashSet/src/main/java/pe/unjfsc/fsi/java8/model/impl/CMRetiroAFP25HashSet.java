package pe.unjfsc.fsi.java8.model.impl;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.model.CIRetiroAFP25HashSet;

public class CMRetiroAFP25HashSet implements CIRetiroAFP25HashSet {

    private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFP25HashSet");
    private HashSet<CESaldoAfiliado> oData;
    private CESaldoAfiliado oCESaldo;

    public CMRetiroAFP25HashSet() {
        LOG.info("[EVL] Antes dec instanciar : {}", oData);
        oData = new HashSet<>();
        LOG.info("[EVL] despues de instanciar : {}", oData.size());

        oData.add(new CESaldoAfiliado(1, "2002", 3500.00));
        oData.add(new CESaldoAfiliado(2, "2003", 4500.00));
        oData.add(new CESaldoAfiliado(3, "2005", 13500.00));
        oData.add(new CESaldoAfiliado(4, "2007", 24500.00));
        oData.add(new CESaldoAfiliado(5, "2008", 35000.00));
        oData.add(new CESaldoAfiliado(6, "2009", 56600.00));

        LOG.info("[EVL] load data : {}", oData.size());
    }

    @Override
    public void saveRetiroDimensional(CESaldoAfiliado poData) {
        LOG.info("[EVL] Save new CESaldoAfiliado : {}", poData);
        oData.add(new CESaldoAfiliado(poData.getId(), poData.getCodigoAfiliado(), poData.getSaldoCIC()));
    }

    @Override
    public void updateRetiroDimensional(CESaldoAfiliado poData) {
        LOG.info("[EVL] actualizar CESaldoAfiliado : {}", poData);

        Iterator<CESaldoAfiliado> it = oData.iterator();

        while (it.hasNext()) {
            oCESaldo = new CESaldoAfiliado();
            LOG.info("[EVL] instancia CESaldoAfiliado : {}", oCESaldo);
            oCESaldo = it.next();

            if (oCESaldo.getId() == poData.getId()) {
                oCESaldo.setCodigoAfiliado(poData.getCodigoAfiliado());
                oCESaldo.setSaldoCIC(poData.getSaldoCIC());
                break;
            }
        }
    }

    @Override
    public void deleteRetiroDimensional(int pId) {
        LOG.info("[EVL] Eliminar Id : {}", pId);
        Iterator<CESaldoAfiliado> it = oData.iterator();

        while (it.hasNext()) {
            oCESaldo = new CESaldoAfiliado();
            LOG.info("[EVL] instancia CESaldoAfiliado : {}", oCESaldo);
            oCESaldo = it.next();

            if (oCESaldo.getId() == pId) {
                oData.remove(oCESaldo);
                break;
            }
        }
    }

    @Override
    public HashSet<CESaldoAfiliado> consultAllRetiroDimensional() {
        LOG.info("[EVL] Consulta en la collection All : {}");
        return oData;
    }

    @Override
    public CESaldoAfiliado consultaByIdRetiroDimensional(int pId) {
        LOG.info("[EVL] Consulta por Id para CESaldoAfiliado : {}", pId);
        CESaldoAfiliado oResult = null;
        Iterator<CESaldoAfiliado> it = oData.iterator();
        while (it.hasNext()) {
            oCESaldo = new CESaldoAfiliado();
            LOG.info("[EVL] instancia CESaldoAfiliado : {}", oCESaldo);
            oCESaldo = it.next();

            if (oCESaldo.getId() == pId) {
                oResult = new CESaldoAfiliado();
                oResult = oCESaldo;
                break;
            }
        }
        return oResult;
    }
}