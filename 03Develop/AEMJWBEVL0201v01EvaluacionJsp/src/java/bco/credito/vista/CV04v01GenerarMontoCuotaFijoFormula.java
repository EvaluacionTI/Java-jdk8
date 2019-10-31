
package bco.credito.vista;

import bco.credito.entidad.CECredito;
import bco.credito.logica.CLFinanciero;

public class CV04v01GenerarMontoCuotaFijoFormula {

    public static void main(String[] args) {
        double mTeaMensual = 0;
        
        CECredito oCredito = new CECredito();
        CLFinanciero oFormula = new CLFinanciero();
        
        oCredito.setmMontoCredito(120000);
        oCredito.setmNumeroCuotas(12);
        oCredito.setmTea(25);
        double lDividir = 1/12D;
        

        System.out.println("Conversión TEA a TEM " + Math.pow(12,-1)+ " " + lDividir );
        
        mTeaMensual = oFormula.convertirTeaTem(oCredito.getmTea());
        System.out.println("Conversión TEA a TEM " +mTeaMensual );
        
        System.out.println("Cuota Fija " + oFormula.montoCuotaFijoFormula(oCredito.getmTea(),oCredito.getmNumeroCuotas(),oCredito.getmMontoCredito()));
        

    }
}
