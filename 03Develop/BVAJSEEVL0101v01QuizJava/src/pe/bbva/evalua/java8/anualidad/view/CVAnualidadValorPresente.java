
package pe.bbva.evalua.java8.anualidad.view;

import pe.bbva.evalua.java8.anualidad.logical.CL0101v01AnualidadValorPresenteFuturo;

public class CVAnualidadValorPresente {
    
    public static void main(String[] poArg){
      
        System.out.println();
    }
    
    public class Calculo{
        private CL0101v01AnualidadValorPresenteFuturo oValorPresente;
        
        private double Resultado(){
            oValorPresente  =new CL0101v01AnualidadValorPresenteFuturo();
            
            double dResult = oValorPresente.valueValorPresenteCuota(100, 12, 540, 180);
            return dResult;
        }
    }
}
