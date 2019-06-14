/*
* Una clase de tests con junit 4.5 El metodo que queramos que se ejecute antes
 * de hacer el test, debemos anotarlo con @Before. El que queramos que se
 * ejecute despues de los test debemos anotarlo con @After. Los metodos de test
 * con @Test. Para poder usar los metodos assert, debemos hacer un
 * 
 */
package aemsa.test;

import aemsa.logica.pruebaunitaria.CLSuma;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CTTestSuma extends TestCase{
    
    private CLSuma oCLSuma;
    
   @Test
    public void aVerSiIncrementaBien() {
        assertEquals("Test incrementa", 2.0, oCLSuma.incrementa(1.0), 1e-6);
    }

    @Test
    public void aVerSiSumaBien() {
        assertEquals("Test suma", 2.0, oCLSuma.getSuma(1.0, 1.0), 1e-6);
    }

    @Before
    public void paraEjecutarAntes() throws Exception {
        oCLSuma = new CLSuma();
    }

    @After
    public void paraEjecutarDespues() throws Exception {
        // Fin de test. Aqui liberar recursos o borrar rastros del test
    }
   
}

 


