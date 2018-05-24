/*
  * Una clase de tests con junit 4.5 El metodo que queramos que se ejecute antes
 * de hacer el test, debemos anotarlo con @Before. El que queramos que se
 * ejecute despues de los test debemos anotarlo con @After. Los metodos de test
 * con @Test. Para poder usar los metodos assert, debemos hacer un
 * 
 */
package aemsa.test;

import aemsa.logica.pruebaunitaria.CLResta;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CTTestResta extends TestCase{
   private CLResta oCLresta;

    @Test
    public void aVerSiDecrementaBien() {
        assertEquals("Test decrementa", 1.0, oCLresta.decrementa(2.0), 1e-6);
    }

    @Test
    public void aVerSiRestaBien() {
        assertEquals("Test resta", 1.0, oCLresta.getDiferencia(2.0, 1.0), 1e-6);
    }

    @Before
    public void paraEjecutarAntes() throws Exception {
        oCLresta = new CLResta();
    }

    @After
    public void paraEjecutarDespues() throws Exception {
        // Liberar recursos
    }    
}
