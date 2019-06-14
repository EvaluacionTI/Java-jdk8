/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap09.clase.vista;

import pe.aemsa.cap09.clase.CO04v01Grados;

public class CV03v01ConversionGrados {
    // Definición de constantes
    final static int LIMITEINFERIOR = -30;
    final static int LIMITESUPERIOR = 100;
    final static int INCREMENTO = 6;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        CO04v01Grados oGrados = new CO04v01Grados();
        
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
