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
public class ImagenTest {
    
    public ImagenTest() {
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
     * Test of setImageBoton method, of class Imagen.
     */
    @Test
    public void testSetImageBoton() {
        System.out.println("setImageBoton");
        int ancho = 200;
        int alto = 100;
        String n = "arbol.png";
        JButton c = null;
        Imagen instance = new Imagen();
        instance.setImageBoton(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setImageBotonDisabled method, of class Imagen.
     */
    @Test
    public void testSetImageBotonDisabled() {
        System.out.println("setImageBotonDisabled");
        int ancho = 0;
        int alto = 0;
        String n = "";
        JButton c = null;
        Imagen instance = new Imagen();
        instance.setImageBotonDisabled(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImageLabel method, of class Imagen.
     */
    @Test
    public void testSetImageLabel() {
        System.out.println("setImageLabel");
        int ancho = 0;
        int alto = 0;
        String n = "";
        JLabel c = null;
        Imagen instance = new Imagen();
        instance.setImageLabel(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIconBoton method, of class Imagen.
     */
    @Test
    public void testSetIconBoton() {
        System.out.println("setIconBoton");
        int[] num = null;
        String[] nom = null;
        JButton[] bot = null;
        int ancho = 0;
        int alto = 0;
        Imagen instance = new Imagen();
        instance.setIconBoton(num, nom, bot, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIconBotonDisabled method, of class Imagen.
     */
    @Test
    public void testSetIconBotonDisabled() {
        System.out.println("setIconBotonDisabled");
        int[] num = null;
        String[] nom = null;
        JButton[] bot = null;
        int ancho = 0;
        int alto = 0;
        Imagen instance = new Imagen();
        instance.setIconBotonDisabled(num, nom, bot, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIconLabel method, of class Imagen.
     */
    @Test
    public void testSetIconLabel() {
        System.out.println("setIconLabel");
        int[] num = null;
        String[] nom = null;
        JLabel[] lab = null;
        int ancho = 0;
        int alto = 0;
        Imagen instance = new Imagen();
        instance.setIconLabel(num, nom, lab, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberBoton method, of class Imagen.
     */
    @Test
    public void testSetNumberBoton() {
        System.out.println("setNumberBoton");
        int ancho = 0;
        int alto = 0;
        String n = "";
        JButton c = null;
        Imagen instance = new Imagen();
        instance.setNumberBoton(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextBoton method, of class Imagen.
     */
    @Test
    public void testSetTextBoton() {
        System.out.println("setTextBoton");
        int[] num = null;
        String[] nom = null;
        JButton[] bot = null;
        int ancho = 0;
        int alto = 0;
        Imagen instance = new Imagen();
        instance.setTextBoton(num, nom, bot, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIconGeneral method, of class Imagen.
     */
    @Test
    public void testSetIconGeneral() {
        System.out.println("setIconGeneral");
        JFrame fr = null;
        Imagen instance = new Imagen();
        instance.setIconGeneral(fr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
