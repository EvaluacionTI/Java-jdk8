/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.prueba.logica;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CL0101v01EvaluarNumerosTest {
    
    public CL0101v01EvaluarNumerosTest() {
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

    @Test
    public void testNumeroMayorTresNumeros() {
        System.out.println("numeroMayorTresNumeros");
        int piNumero1 = 0;
        int piNumero2 = 0;
        int piNumero3 = 0;
        CL0101v01EvaluarNumeros instance = new CL0101v01EvaluarNumeros();
        int iResultadoEsperado = 0;
        int iResultado = instance.numeroMayorTresNumeros(piNumero1, piNumero2, piNumero3);
        assertEquals(iResultadoEsperado, iResultado,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testNumeroMayorCaso1(){
        System.out.println("numeroMayorTresNumeros Caso 1");
        int piNumero1 = 7;
        int piNumero2 = 5;
        int piNumero3 = 3;

        CL0101v01EvaluarNumeros instance = new CL0101v01EvaluarNumeros();
        
        int iResultadoEsperado = 7;
        int iResultado = instance.numeroMayorTresNumeros(piNumero1, piNumero2, piNumero3);
        assertEquals(iResultadoEsperado, iResultado);
    }

    @Test
    public void testNumeroMayorCaso2(){
        System.out.println("numeroMayorTresNumeros Caso 2");
        int piNumero1 = 7;
        int piNumero2 = 5;
        int piNumero3 = 9;

        CL0101v01EvaluarNumeros instance = new CL0101v01EvaluarNumeros();
        
        int iResultadoEsperado = 9;
        int iResultado = instance.numeroMayorTresNumeros(piNumero1, piNumero2, piNumero3);
        assertEquals(iResultadoEsperado, iResultado);
    }

    @Test
    public void testNumeroMayorCaso3(){
        System.out.println("numeroMayorTresNumeros Caso 3");
        int piNumero1 = 7;
        int piNumero2 = 11;
        int piNumero3 = 9;

        CL0101v01EvaluarNumeros instance = new CL0101v01EvaluarNumeros();
        
        int iResultadoEsperado = 11;
        int iResultado = instance.numeroMayorTresNumeros(piNumero1, piNumero2, piNumero3);
        assertEquals(iResultadoEsperado, iResultado);
    }    
}
