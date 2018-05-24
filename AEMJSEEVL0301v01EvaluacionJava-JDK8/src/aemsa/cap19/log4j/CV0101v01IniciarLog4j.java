/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap19.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



public class CV0101v01IniciarLog4j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        
        // A. Recuperar un loger
        Logger oLogRecupera = Logger.getRootLogger();
        System.out.println("A. Recuperar un loger :" + oLogRecupera);
        oLogRecupera.debug("oLogRecupera");
        
        // B. Asignar un nombre al logger
        Logger oLog = Logger.getLogger("LoggerCV01v01IniciarLog4j");
        System.out.println("B. Asignar un nombre al logger" + oLog);
        
        // C. Instanciar un loger
        Logger oLogInstanciar = Logger.getLogger(CV0101v01IniciarLog4j.class  );
        System.out.println("C. Instanciar un logger " + oLogInstanciar);
        
        // Los loggers pueden tener niveles asignados
        // Los niveles asignados de menor a mayor prioridad
        
        oLog.trace("Se usa para información más detallada que el nivel debug");
        oLog.debug("Se utiliza para mensajes de información detallada que son útiles para debugear una aplicación");
        oLog.info("Se utiliza para mensajes de información que resaltan el progreso de la aplicación de una forma general");
        oLog.warn("Se utiliza para situaciones que podrían ser potencialmente dañinas");
        oLog.error("Se usa para eventos de error que podrían permitir que la aplicación continúe ejecutándose.");
        oLog.fatal("Se usa para errores muy graves, que podrían hacer que la aplicación dejara de funcionar.");
        

        // D. El objeto Logger contiene una serie de métodos que nos permite saber si el logger está configurado
        // para un nivel de "TRACE", "DEBUG", o "INFO" (normalmente los niveles de WARN a FATAL siempre querremos mostrarlos
        // si es que ocurre algún problema)
        
        if (oLogInstanciar.isTraceEnabled()){
            oLogInstanciar.trace(oLogInstanciar.isTraceEnabled());
        }
        
        if (oLogInstanciar.isDebugEnabled()){
            oLogInstanciar.debug(oLogInstanciar.isDebugEnabled());
        }
        
        if (oLogInstanciar.isInfoEnabled()){
            oLogInstanciar.info(oLogInstanciar.isInfoEnabled());
        }
        
        // E. Ahora es necesario configurar log4j para realizar la asociación entre el logger que acabamos de crear, 
        // con los appenders a los que enviará los mensajes, y los layouts que usarán para mostrar estos mensajes.
        
    }
    
}
