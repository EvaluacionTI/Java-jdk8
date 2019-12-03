
package pe.bbva.evalua.java8.anualidad.view;

import pe.bbva.evalua.java8.anualidad.logical.CLAnualidadValorPresente;

public class CVAnualidadValorPresente {
    
    public static void main(String[] poArg){
      
        System.out.println();
    }
    
    public class Calculo{
        private CLAnualidadValorPresente oValorPresente;
        
        private double Resultado(){
            oValorPresente  =new CLAnualidadValorPresente();
            
            double dResult = oValorPresente.valueValorPresenteCuota(100, 12, 540, 180);
            return dResult;
        }
    }
}
