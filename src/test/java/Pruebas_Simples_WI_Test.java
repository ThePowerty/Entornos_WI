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
public class Pruebas_Simples_WI_Test {

    public Pruebas_Simples_WI_Test() {
    }

    static int[] matrizPositivos = {5, 3, 1, 4, 2};
    static int[] matrizNegativos = {-3,-4,-1,-5,-2};
    static int [] matrizAmbos = {-1,2,-2,1,0};

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeAll");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterAll");
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
    @Test
    public void testOrdenaArrayPositivos() {
        System.out.println("ordenaArrayPositivos");
        int[] arrayEnteros = {1, 2, 3, 4, 5};
        Entornos_WI.ordenaArray(matrizPositivos);
        assertArrayEquals(arrayEnteros, matrizPositivos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOrdenaArrayNegativos() {
        System.out.println("ordenaArrayNegativos");
        int[] arrayEnteros = {-5,-4,-3,-2,-1};
        Entornos_WI.ordenaArray(matrizNegativos);
        assertArrayEquals(arrayEnteros, matrizNegativos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOrdenaArray() {
        System.out.println("ordenaArray");
        int[] arrayEnteros = {-2,-1,0,1,2};
        Entornos_WI.ordenaArray(matrizAmbos);
        assertArrayEquals(arrayEnteros, matrizAmbos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
