/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap19.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CV0301v01IniciarLog4jXML {

    private static final Logger oLogInstanciar = Logger.getLogger(CV0301v01IniciarLog4jXML.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        
        System.out.println("Instanciar un logger : " + oLogInstanciar + "  " + oLogInstanciar.getName());
        
        // Los loggers pueden tener niveles asignados
        // Los niveles asignados de menor a mayor prioridad
        
        oLogInstanciar.trace("Se usa para información más detallada que el nivel debug");
        oLogInstanciar.debug("Se utiliza para mensajes de información detallada que son útiles para debugear una aplicación");
        oLogInstanciar.info("Se utiliza para mensajes de información que resaltan el progreso de la aplicación de una forma general");
        oLogInstanciar.warn("Se utiliza para situaciones que podrían ser potencialmente dañinas");
        oLogInstanciar.error("Se usa para eventos de error que podrían permitir que la aplicación continúe ejecutándose.");
        oLogInstanciar.fatal("Se usa para errores muy graves, que podrían hacer que la aplicación dejara de funcionar.");
        

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
