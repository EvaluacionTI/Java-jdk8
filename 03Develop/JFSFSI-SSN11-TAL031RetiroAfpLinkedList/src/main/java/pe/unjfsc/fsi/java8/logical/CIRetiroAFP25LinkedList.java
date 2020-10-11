package pe.unjfsc.fsi.java8.logical;

import java.util.LinkedList;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;

public interface CIRetiroAFP25LinkedList {
	
	public void saveRetiroLinkedList(CESaldoAfiliado poCESaldoAfiliado);
	public void updateRetiroLinkedList(CESaldoAfiliado poCESaldoAfiliado);
	public void deleteRetiroLinkedList(int pId);

	public LinkedList<CESaldoAfiliado> consultaAllRetiroLinkedList();
	public CESaldoAfiliado consultaByIdRetiroLinkedList(int pId);
        public String[][] convertLinkedListToMatriz(LinkedList<CESaldoAfiliado> poLista);
}
