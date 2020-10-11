package pe.unjfsc.fsi.java8.logical;

import java.util.Stack;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;

public interface CIRetiroAFP25Stack {
	
	public void saveRetiroStack(CESaldoAfiliado poCESaldoAfiliado);
	public void updateRetiroStack(CESaldoAfiliado poCESaldoAfiliado);
	public void deleteRetiroStack(int pId);

	public Stack<CESaldoAfiliado> consultaAllRetiroStack();
	public CESaldoAfiliado consultaByIdRetiroStack(int pId);
        public String[][] convertStackToMatriz(Stack<CESaldoAfiliado> poLista);
}
