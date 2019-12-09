/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap03.condicional;

/**
 *
 * @author background21
 */
public class CV01v04TestIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String str1 = "La provincia de Santander es muy bonita";
            String str2 = "La provincia de SANTANDER es muy bonita";
            String strtemp;
            int resultado;
            resultado = str1.compareToIgnoreCase(str2);
            resultado = str1.compareTo(str2);
            // Depende de la comparaci�n que realizemos.
            if( resultado > 0 )
              strtemp = "mayor que ";
            else if( resultado < 0 )
              strtemp = "menor que ";
            else
              strtemp = "igual a ";
            System.out.println( str1 + " es " + strtemp + str2 );
        }catch(Exception ex){}
            

    }
}
