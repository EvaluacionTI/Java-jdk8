package pe.bbva.evalua.java8.anualidad.view;

import com.sun.istack.internal.logging.Logger;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pe.bbva.evalua.java8.anualidad.logical.CL0101v01AnualidadValorPresente;

public class CVAnualidadValorPresenteTest {
    private final Logger MOLOG = Logger.getLogger(CVAnualidadValorPresenteTest.class);
    private final CL0101v01AnualidadValorPresente oValorPresente;
    
    public CVAnualidadValorPresenteTest() {
        oValorPresente = new CL0101v01AnualidadValorPresente();
        MOLOG.info("[EVL] Instancia class : " + oValorPresente);
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    public void testValuePresentCuota_double() {
        double dExpected = 83.96;
        double dResult = oValorPresente.valueValorPresenteCuota(100, 0.12, 540, 180);

        assertEquals(dExpected, dResult, 0.01);
    }

    //@Test
    public void testValuePresentCuotaDouble() {
        double dExpected = 94.33;
        double dResult = oValorPresente.valorPresenteCuota(100D, 0.12, 180, 180);

        assertEquals(dExpected, dResult, 0.01);
    }

    //@Test
    public void testValuePresentDouble() {
        double dExpected = 10000.00;
        double dResult = oValorPresente.valuePresent(11010.86, 0.12, 7200, 30);

        assertEquals(dExpected, dResult, 0.01);
    }

    @Test
    public void testValuePresentCuote() {
        double dExpected = 1010.8614532761;
        double dResult = 0.0;
        
        BigDecimal bdResult = oValorPresente.valuePresentCuote(11010.86, 0.12, 7200, 30);

        String sResult = bdResult.toString();
        dResult = Double.parseDouble(sResult);
        assertEquals(dExpected, dResult, 0.01);
    }    
}
