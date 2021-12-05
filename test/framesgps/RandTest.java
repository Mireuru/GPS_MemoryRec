/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package framesgps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mgarc
 */
public class RandTest {
    
    public RandTest() {
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
     * Test of getCadenaRandom method, of class Rand.
     */
    @Test
    public void testGetCadenaRandom() {
        System.out.println("getCadenaRandom");
        Rand instance = new Rand();
        String expResult = "";
        String result = instance.getCadenaRandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadenaRecortada method, of class Rand.
     */
    @Test
    public void testGetCadenaRecortada() {
        System.out.println("getCadenaRecortada");
        String cad = "";
        Rand instance = new Rand();
        String[] expResult = null;
        String[] result = instance.getCadenaRecortada(cad);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeros method, of class Rand.
     */
    @Test
    public void testGetNumeros() {
        System.out.println("getNumeros");
        int lim = 0;
        Rand instance = new Rand();
        int[] expResult = null;
        int[] result = instance.getNumeros(lim);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerosFaltantes method, of class Rand.
     */
    @Test
    public void testGetNumerosFaltantes() {
        System.out.println("getNumerosFaltantes");
        int[] ra = null;
        int falt = 0;
        Rand instance = new Rand();
        int[] expResult = null;
        int[] result = instance.getNumerosFaltantes(ra, falt);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
