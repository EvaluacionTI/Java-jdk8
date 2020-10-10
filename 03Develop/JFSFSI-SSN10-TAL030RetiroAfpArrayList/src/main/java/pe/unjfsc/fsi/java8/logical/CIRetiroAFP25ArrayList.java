package pe.unjfsc.fsi.java8.logical;

import java.util.ArrayList;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;

public interface CIRetiroAFP25ArrayList {
	
	public void saveRetiroArrayList(CESaldoAfiliado poCESaldoAfiliado);
	public void updateRetiroArrayList(CESaldoAfiliado poCESaldoAfiliado);
	public void deleteRetiroArrayList(int pId);

	public ArrayList<CESaldoAfiliado> consultaAllRetiroArrayList();
	public CESaldoAfiliado consultaByIdRetiroArrayList(int pId);
        public String[][] convertArrayListToMatriz(ArrayList<CESaldoAfiliado> poLista);
}
