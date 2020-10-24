
package pe.unjfsc.fsi.java8.model;

import java.util.HashSet;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;

public interface CIRetiroAFP25HashSet {
    public void saveRetiroDimensional(CESaldoAfiliado poData);
    public void updateRetiroDimensional(CESaldoAfiliado poData);
    public void deleteRetiroDimensional(int pId);
    
    public HashSet<CESaldoAfiliado> consultAllRetiroDimensional();
    public CESaldoAfiliado consultaByIdRetiroDimensional(int pId);
}
