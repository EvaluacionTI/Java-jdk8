package pe.unjfsc.fsi.java8.logical.impl;

import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.logical.CIRetiroAFP25ArrayList;

public class CMRetiroAFP25ArrayList implements CIRetiroAFP25ArrayList {

    private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFP25ArrayList");

    private ArrayList<CESaldoAfiliado> moListAfiliado;
    private CESaldoAfiliado moCESaldoAfilidado;

    public CMRetiroAFP25ArrayList() {
        moListAfiliado = new ArrayList<>();

        moListAfiliado.add(new CESaldoAfiliado(1, "2000", 2500.05));
        moListAfiliado.add(new CESaldoAfiliado(2, "2001", 3500.10));
        moListAfiliado.add(new CESaldoAfiliado(3, "2002", 4500.15));
        moListAfiliado.add(new CESaldoAfiliado(4, "2003", 5500.20));
        moListAfiliado.add(new CESaldoAfiliado(5, "2004", 6000.25));
        moListAfiliado.add(new CESaldoAfiliado(6, "2005", 6500.30));
        moListAfiliado.add(new CESaldoAfiliado(7, "2006", 7000.35));
        moListAfiliado.add(new CESaldoAfiliado(8, "2007", 7500.40));
        moListAfiliado.add(new CESaldoAfiliado(9, "2008", 8000.45));
        moListAfiliado.add(new CESaldoAfiliado(10, "2009", 8500.50));
        moListAfiliado.add(new CESaldoAfiliado(11, "2010", 9000.55));
        moListAfiliado.add(new CESaldoAfiliado(12, "2011", 9500.60));
        moListAfiliado.add(new CESaldoAfiliado(13, "2012", 10500.70));
        moListAfiliado.add(new CESaldoAfiliado(14, "2013", 11500.80));
        moListAfiliado.add(new CESaldoAfiliado(15, "2014", 12500.90));
        moListAfiliado.add(new CESaldoAfiliado(16, "2015", 13500.99));
        moListAfiliado.add(new CESaldoAfiliado(17, "2016", 14500.98));
        moListAfiliado.add(new CESaldoAfiliado(18, "2017", 15500.97));
        moListAfiliado.add(new CESaldoAfiliado(19, "2018", 16500.96));
        moListAfiliado.add(new CESaldoAfiliado(20, "2019", 17500.95));
        moListAfiliado.add(new CESaldoAfiliado(21, "2020", 18500.94));
    }

    @Override
    public void saveRetiroArrayList(CESaldoAfiliado poCESaldoAfiliado) {
        moListAfiliado.add(new CESaldoAfiliado(poCESaldoAfiliado.getId(), poCESaldoAfiliado.getCodigoAfiliado(), poCESaldoAfiliado.getSaldoCIC()));
    }

    @Override
    public void updateRetiroArrayList(CESaldoAfiliado poCESaldoAfiliado) {
        Iterator<CESaldoAfiliado> it = moListAfiliado.iterator();
        while (it.hasNext()) {
            moCESaldoAfilidado = new CESaldoAfiliado();
            moCESaldoAfilidado = it.next();
            if (moCESaldoAfilidado.getId() == poCESaldoAfiliado.getId()) {
                moCESaldoAfilidado.setCodigoAfiliado(poCESaldoAfiliado.getCodigoAfiliado());
                moCESaldoAfilidado.setSaldoCIC(poCESaldoAfiliado.getSaldoCIC());
                break;
            }
        }
    }

    @Override
    public void deleteRetiroArrayList(int pId) {
        Iterator<CESaldoAfiliado> it = moListAfiliado.iterator();
        while (it.hasNext()) {
            moCESaldoAfilidado = new CESaldoAfiliado();
            moCESaldoAfilidado = it.next();
            if (moCESaldoAfilidado.getId() == pId) {
                moListAfiliado.remove(moCESaldoAfilidado);
                break;
            }
        }
    }

    @Override
    public ArrayList<CESaldoAfiliado> consultaAllRetiroArrayList() {
        LOG.info("[EVL ArrayList {}", moListAfiliado);
        return moListAfiliado;
    }

    @Override
    public CESaldoAfiliado consultaByIdRetiroArrayList(int pId) {
        CESaldoAfiliado oCESaldoAfilidado = null;
        CESaldoAfiliado oCESaldoResult = null;

        Iterator<CESaldoAfiliado> it = moListAfiliado.iterator();
        while (it.hasNext()) {
            oCESaldoAfilidado = new CESaldoAfiliado();
            oCESaldoAfilidado = it.next();
            if (oCESaldoAfilidado.getId() == pId) {
                oCESaldoResult = new CESaldoAfiliado();
                oCESaldoResult = oCESaldoAfilidado;
                break;
            }
        }
        return oCESaldoResult;
    }

    @Override
    public String[][] convertArrayListToMatriz(ArrayList<CESaldoAfiliado> poLista) {
        String[][] aDataResponse = new String[poLista.size()][3];

        int iRow = 0;
        for (CESaldoAfiliado oItem : poLista) {
            aDataResponse[iRow][0] = String.valueOf(oItem.getId());
            aDataResponse[iRow][1] = oItem.getCodigoAfiliado();
            aDataResponse[iRow][2] = String.valueOf(oItem.getSaldoCIC());
            iRow++;
        }
        return aDataResponse;
    }
}
