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
        String result = instance.getCadenaRandom();
        System.out.println(result);
    }

    /**
     * Test of getCadenaRecortada method, of class Rand.
     */
    @Test
    public void testGetCadenaRecortada() {
        System.out.println("getCadenaRecortada");
        String cad = "ABCDEFGHIJKL";
        Rand instance = new Rand();
        String[] result = instance.getCadenaRecortada(cad);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * Test of getNumeros method, of class Rand.
     */
    @Test
    public void testGetNumeros() {
        System.out.println("getNumeros");
        int lim = 8;
        Rand instance = new Rand();
        int[] result = instance.getNumeros(lim);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * Test of getNumerosFaltantes method, of class Rand.
     */
    @Test
    public void testGetNumerosFaltantes() {
        System.out.println("getNumerosFaltantes");
        int[] ra = {5,3,1,2,4};
        int falt = 3;
        Rand instance = new Rand();
        int[] result = instance.getNumerosFaltantes(ra, falt);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
}
