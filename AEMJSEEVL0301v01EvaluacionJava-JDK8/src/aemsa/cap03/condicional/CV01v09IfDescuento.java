package aemsa.cap03.condicional;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;

public class CV01v09IfDescuento
{
  public static void main(String[] args) throws IOException
  {
    int ar, cc;
    float pu, desc;
  
    CO06v01LeerTipoDato oValorEntero = new CO06v01LeerTipoDato();
        
    System.out.print("Código artículo....... ");
    ar = oValorEntero.datoInt();
    System.out.print("Cantidad comprada..... ");
    cc = CO06v01LeerTipoDato.datoInt();
    System.out.print("Precio unitario....... ");
    pu = CO06v01LeerTipoDato.datoFloat();
    System.out.println();

    if (cc > 100)
      desc = 40F;      // descuento 40%
    else if (cc >= 25)
      desc = 20F;      // descuento 20%
    else if (cc >= 10)
      desc = 10F;      // descuento 10%
    else
      desc = 0.0F;     // descuento 0%
    System.out.println("Descuento............. " + desc + "%");
    System.out.println("Total................. " +
                       cc * pu * (1 - desc / 100));
  }
}
