/*
 * Ejemplo de como se arranca una suite de test. Desde linea de comando, con el
 * classpath configurado, se haria
 * 
 * Con el classpath adecuado
 * 
 * set CLASSPATH=path/junit.jar;path/mi.jar
 * 
 * se ejecuta con
 * 
 * java org.junit.runner.JUnitCore aemsa.logica.pruebaunitaria
 */
package aemsa.test;

import org.junit.runner.JUnitCore;


public class CTLineaComando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JUnitCore.main("aemsa.logica.pruebaunitaria");
    }
    
}
