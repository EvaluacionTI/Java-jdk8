package pe.aemsa.evalua.java.cap08.clases.view;



//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java.cap08.clases.view.CO1901v01Hanoi;
import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;

// Torres de Hanoi
//
public class CV1901v01TestHanoi
{
  public static void main(String[] args) throws IOException
  {
    int n_discos, movimientos;
    System.out.print("N�mero de discos: ");
    n_discos = CO06v01LeerTipoDato.datoInt();
    movimientos = CO1901v01Hanoi.mover(n_discos, 'A', 'B', 'C');
    System.out.println("\nmovimientos efectuados: " + movimientos);
  }
}
//////////////////////////////////////////////////////////////////
