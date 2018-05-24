/*=============================================================================
 * Proyecto         :	Código y Nombre del proyecto
 * Aplicación       :	Nombre de aplicación o módulo
 * Nombre archivo   :	CVISOLecturaDatos.java
 * Objetivo         :	Funcionalidad del archivo
 * Fecha            :	dd Nombre Mes aaaa
 * Autor            :	Nombre y Apellido
 * Descripción      :   Observaciones
=============================================================================*/

package aemsa.iso.vista;

import aemsa.iso.utilidad.conversion.CUISOEquivalencia;


public class CVISOLecturaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "ñâæÃÈÄóöó";
        
        CUISOEquivalencia oCUConversion = new CUISOEquivalencia();
        
        System.out.println(oCUConversion.convertirAsciiToEbcdic(cadena,"CP1047","ISO-8859-1"));
        
        cadena = "1SWCHD363";
        System.out.println(oCUConversion.convertirAsciiToEbcdic(cadena,"ISO-8859-1","CP1047"));
        
        cadena = "Procesos de Medios de Pago";
        System.out.println(oCUConversion.convertirAsciiToEbcdic(cadena,"ISO-8859-1","CP1047"));
               
        cadena = "×¢¢@@Ô¢@@×";
        System.out.println(oCUConversion.convertirAsciiToEbcdic(cadena,"CP1047","ISO-8859-1"));
        
    }
    
 
}
