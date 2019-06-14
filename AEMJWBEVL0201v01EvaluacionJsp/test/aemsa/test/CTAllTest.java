/*
 * Basta hacer una clase cualquiera, aunque no tenga codigo, como esta, con dos
 * anotcaciones.
 * 
 * @RunWith(Suite.class) para indicar que esta clase debe ejecutarse como una
 *                       Suite de test de Junit
 * 
 * @SuiteClasses( { CTTestResta.class, CTTestSuma.class }) con todas las clases de
 *                test que queremos que se ejecuten.
 */
package aemsa.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { CTTestResta.class, CTTestSuma.class })
public class CTAllTest {
    
}
