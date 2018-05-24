package aemsa.vista;

import aemsa.logica.credito.CLConversionTasa;

public class CV01v01ConvertirATasaEfectivaMensual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dTasa;
        
        CLConversionTasa oTasa = new CLConversionTasa();
        
        dTasa = oTasa.convertirTEAMensual(25);
        
        System.out.println(dTasa * 100);
    }
    
}
