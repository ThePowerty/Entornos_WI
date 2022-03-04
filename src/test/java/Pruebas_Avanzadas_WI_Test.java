/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paqueteExamen.Entornos_WI;

/**
 *
 * @author Alumno Tarde
 */
public class Pruebas_Avanzadas_WI_Test {
    
    public Pruebas_Avanzadas_WI_Test() {
    }
    
    static int[] miMatriz = new int[5000];
    
    @BeforeClass
    public static void setUpClass() {
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i] = i;
        }
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
     * Test of ordenaArray method, of class Entornos_WI.
     */
    @Test(timeout = 1)
    public void testOrdenaArray() {
        System.out.println("ordenaArrayTimeOut");
        int[] arrayEnteros = miMatriz;
        Entornos_WI.ordenaArray(arrayEnteros);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
