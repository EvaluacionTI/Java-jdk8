/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap19.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ALDV
 */
public class CV0101v01ValidarLog4j2Xml {

    private static Logger oLog = LogManager.getLogger(CV0101v01ValidarLog4j2Xml.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        oLog.trace("trace");
	oLog.debug("debug");
	oLog.info("info");
	oLog.warn("warn");
	oLog.error("error");
	oLog.fatal("fatal");
    }
    
}
