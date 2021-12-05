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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of vol method, of class Player.
     */
    @Test
    public void testVol() {
        System.out.println("vol");
        Player instance = new Player();
        double expResult = 0.0;
        double result = instance.vol();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of click method, of class Player.
     */
    @Test
    public void testClick() {
        System.out.println("click");
        Player instance = new Player();
        instance.click();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of error method, of class Player.
     */
    @Test
    public void testError() {
        System.out.println("error");
        Player instance = new Player();
        instance.error();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acierto method, of class Player.
     */
    @Test
    public void testAcierto() {
        System.out.println("acierto");
        Player instance = new Player();
        instance.acierto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of victoria method, of class Player.
     */
    @Test
    public void testVictoria() {
        System.out.println("victoria");
        Player instance = new Player();
        instance.victoria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tecla method, of class Player.
     */
    @Test
    public void testTecla() throws Exception {
        System.out.println("tecla");
        Player instance = new Player();
        instance.tecla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
