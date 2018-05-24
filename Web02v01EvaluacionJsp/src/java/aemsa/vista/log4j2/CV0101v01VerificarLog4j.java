package aemsa.vista.log4j2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author OFICINA
 */
public class CV0101v01VerificarLog4j {
    private static final Logger moLog = LogManager.getLogger(CV0101v01VerificarLog4j.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("A. Recuperar un loger :" + moLog);
        moLog.debug("oLogRecupera");
        
        System.out.println("Parametro de main "+ args.length);
        moLog.debug("trace");
        moLog.debug("DEBUG");
        moLog.warn("warn" );
        moLog.info("info");
        moLog.error("ERROR");
        moLog.fatal("FATAL");
    }
}
