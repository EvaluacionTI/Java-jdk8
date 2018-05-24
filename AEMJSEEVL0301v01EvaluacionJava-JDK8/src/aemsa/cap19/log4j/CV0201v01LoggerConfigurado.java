/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap19.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class CV0201v01LoggerConfigurado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger oLogInstanciar = Logger.getLogger("Evalua JSE");
        System.out.println("Asignar un nombre al logger : " + oLogInstanciar.getName());
        
        oLogInstanciar.info("INFO");

        if (oLogInstanciar.isTraceEnabled()){
            oLogInstanciar.trace(oLogInstanciar.isTraceEnabled());
        }
        
        if (oLogInstanciar.isDebugEnabled()){
            oLogInstanciar.debug(oLogInstanciar.isDebugEnabled());
        }
        
        if (oLogInstanciar.isInfoEnabled()){
            oLogInstanciar.info(oLogInstanciar.isInfoEnabled());
        }
    }
    
}
