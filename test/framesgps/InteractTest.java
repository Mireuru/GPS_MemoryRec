/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package framesgps;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class InteractTest {
    
    public InteractTest() {
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
     * Test of back method, of class Interact.
     */
    @Test
    public void testBack() {
        System.out.println("back");
        JFrame men = new JFrame();
        JFrame loc = new JFrame();
        Interact instance = new Interact();
        instance.back(men, loc);
        // TODO review the generated test code and remove the default call to fail.
        instance.back(men, loc);
    }

    /**
     * Test of getPareja method, of class Interact.
     */
    @Test
    public void testGetPareja_4args() {
        System.out.println("getPareja");
        String[] val1 = {"1","2","3","4"};
        String[] val2 = {"4","2","1","3"};
        String bot1 = "2";
        String bot2 = "2";
        Interact instance = new Interact();
        boolean expResult = true;
        boolean result = instance.getPareja(val1, val2, bot1, bot2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPareja method, of class Interact.
     */
    @Test
    public void testGetPareja_int_int() {
        System.out.println("getPareja");
        int val1 = 1;
        int val2 = 14;
        Interact instance = new Interact();
        boolean expResult = true;
        boolean result = instance.getPareja(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getColorCorr method, of class Interact.
     */
    @Test
    public void testGetColorCorr() {
        System.out.println("getColorCorr");
        int val1 = 0;
        int val2 = 5;
        Interact instance = new Interact();
        boolean expResult = false;
        boolean result = instance.getColorCorr(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSem method, of class Interact.
     */
    @Test
    public void testGetSem() {
        System.out.println("getSem");
        int val1 = 1;
        int val2 = 6;
        Interact instance = new Interact();
        boolean expResult = false;
        boolean result = instance.getSem(val1, val2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSabor method, of class Interact.
     */
    @Test
    public void testGetSabor() {
        System.out.println("getSabor");
        int val1 = 3;
        String sab = "Picante";
        Interact instance = new Interact();
        boolean expResult = true;
        boolean result = instance.getSabor(val1, sab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of accPareja method, of class Interact.
     */
    @Test
    public void testAccPareja() {
        System.out.println("accPareja");
        boolean par = false;
        JButton bot1 = new JButton();
        JButton bot2 = new JButton();
        Interact instance = new Interact();
        instance.accPareja(par, bot1, bot2);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Es pareja: "+par);
    }

    /**
     * Test of getPosBoton method, of class Interact.
     */
    @Test
    public void testGetPosBoton() {
        System.out.println("getPosBoton");
        JButton bot1 = new JButton();
        JButton bot2 = new JButton();
        JButton bot3 = new JButton();
        JButton[] bots = {bot1,bot2,bot3};
        JButton pres = bot2;
        Interact instance = new Interact();
        int expResult = 1;
        int result = instance.getPosBoton(bots, pres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPosLabel method, of class Interact.
     */
    @Test
    public void testGetPosLabel() {
        System.out.println("getPosLabel");
        JLabel lab1 = new JLabel();
        JLabel lab2 = new JLabel();
        JLabel lab3 = new JLabel();
        JLabel[] labs = {lab1,lab2,lab3};
        JLabel act = lab1;
        Interact instance = new Interact();
        int expResult = 0;
        int result = instance.getPosLabel(labs, act);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSuma method, of class Interact.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        String val1 = "1";
        String val2 = "3";
        int val3 = 4;
        Interact instance = new Interact();
        boolean expResult = true;
        boolean result = instance.getSuma(val1, val2, val3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRanking method, of class Interact.
     */
    @Test
    public void testSetRanking() {
        System.out.println("setRanking");
        String key = "Colores";
        int errores = 12;
        Interact instance = new Interact();
        instance.setRanking(key, errores);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRanking method, of class Interact.
     */
    @Test
    public void testGetRanking() {
        System.out.println("getRanking");
        String key = "Colores";
        Interact instance = new Interact();
        int expResult = 12;
        int result = instance.getRanking(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
