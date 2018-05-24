/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.prueba.logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CL0201v01OperacionNumerosTest {
    
    public CL0201v01OperacionNumerosTest() {
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

    /**
     * Test of sumarDosNumeros method, of class CL0201v01OperacionNumeros.
     */
    @Test
    public void testRevisarOperacion() {
        System.out.println("Revisar Operacion");
        char cTipoOperacion = ' ';
        double piPrimerSumando = 0;
        double piSegundoSumado = 0;
        
        CL0201v01OperacionNumeros instance = new CL0201v01OperacionNumeros();
         double iResultadoEsperado = 0;
        double iResultado = instance.operacionBasica(cTipoOperacion, piPrimerSumando, piSegundoSumado);
        assertEquals(iResultadoEsperado, iResultado, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSumarDosNumeros() {
        System.out.println("sumar Dos Numeros");
        char cTipoOperacion = 'S';
        double piPrimerSumando = 15.0;
        double piSegundoSumado = 17.0;
        
        CL0201v01OperacionNumeros instance = new CL0201v01OperacionNumeros();
         double iResultadoEsperado = 32.0;
        double iResultado = instance.operacionBasica(cTipoOperacion, piPrimerSumando, piSegundoSumado);
        assertEquals(iResultadoEsperado, iResultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRestaDosNumeros() {
        System.out.println("Restar Dos Numeros");
        char cTipoOperacion = 'R';
        double piPrimerSumando = 15;
        double piSegundoSumado = 17;
        
        CL0201v01OperacionNumeros instance = new CL0201v01OperacionNumeros();
         double iResultadoEsperado = -2;
        double iResultado = instance.operacionBasica(cTipoOperacion, piPrimerSumando, piSegundoSumado);
        assertEquals(iResultadoEsperado, iResultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicarDosNumeros() {
        System.out.println("Multiplicar Dos Numeros");
        char cTipoOperacion = 'M';
        double piPrimerSumando = 10;
        double piSegundoSumado = 10;
        
        CL0201v01OperacionNumeros instance = new CL0201v01OperacionNumeros();
         double iResultadoEsperado = 100;
        double iResultado = instance.operacionBasica(cTipoOperacion, piPrimerSumando, piSegundoSumado);
        assertEquals(iResultadoEsperado, iResultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDividirDosNumeros() {
        System.out.println("Dividir Dos Numeros");
        char cTipoOperacion = 'D';
        double piPrimerSumando = 15;
        double piSegundoSumado = 3;
        
        CL0201v01OperacionNumeros instance = new CL0201v01OperacionNumeros();
         double iResultadoEsperado = 5;
        double iResultado = instance.operacionBasica(cTipoOperacion, piPrimerSumando, piSegundoSumado);
        assertEquals(iResultadoEsperado, iResultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }       
}
