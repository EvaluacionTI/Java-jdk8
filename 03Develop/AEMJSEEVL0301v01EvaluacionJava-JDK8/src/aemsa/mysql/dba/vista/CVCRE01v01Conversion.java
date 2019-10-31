
package aemsa.mysql.dba.vista;

import aemsa.mysql.logica.CLCREConversionTasa;

public class CVCRE01v01Conversion {

    public static void main(String[] args) {
        // TODO code application logic here
        
        CLCREConversionTasa oCLConvertir = new CLCREConversionTasa();
        
        System.out.println("Diario = " + oCLConvertir.convertirTEADiario(10));
        System.out.println("Mensual = " + oCLConvertir.convertirTEAMensual(10));
        
    }
    
}
