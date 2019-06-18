/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.utility.CU0301v01ConversionGrados;

public class CV0301v01ConversionGradosFahrenheit {
    // Definición de constantes
    final static int LIMITEINFERIOR = -30;
    final static int LIMITESUPERIOR = 100;
    final static int INCREMENTO = 6;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        CU0301v01ConversionGrados oGrados = new CU0301v01ConversionGrados();
        
        int lIntGradosCentigrados = LIMITEINFERIOR;
        float lFltGradosFahrenheit = 0;
        
        while ( lIntGradosCentigrados <= LIMITESUPERIOR){
            oGrados.asignarGradosCentigrados(lIntGradosCentigrados);
            lFltGradosFahrenheit = oGrados.obtenerGradosFahrenheit();
            
            System.out.println( "Grados " + lIntGradosCentigrados + " centigrados \t es equivalente a " + lFltGradosFahrenheit + " Fahrenheit");
            
            lIntGradosCentigrados += INCREMENTO;
        }

    }

}
