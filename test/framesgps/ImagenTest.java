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
        JButton c = new JButton();
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
        int ancho = 200;
        int alto = 100;
        String n = "arbol.png";
        JButton c = new JButton();
        Imagen instance = new Imagen();
        instance.setImageBotonDisabled(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setImageLabel method, of class Imagen.
     */
    @Test
    public void testSetImageLabel() {
        System.out.println("setImageLabel");
        int ancho = 200;
        int alto = 100;
        String n = "arbol.png";
        JLabel c = new JLabel();
        Imagen instance = new Imagen();
        instance.setImageLabel(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIconBoton method, of class Imagen.
     */
    @Test
    public void testSetIconBoton() {
        System.out.println("setIconBoton");
        int[] num = {1,2,3,4,5};
        String[] nom = {"arbol.png","calcetines.jpg","cebolla.jpg","chile.jpg","cigarro.jpg"};
        JButton but1 = new JButton();
        JButton but2 = new JButton();
        JButton but3 = new JButton();
        JButton but4 = new JButton();
        JButton but5 = new JButton();
        JButton[] bot = {but1,but2,but3,but4,but5};
        int ancho = 200;
        int alto = 100;
        Imagen instance = new Imagen();
        instance.setIconBoton(num, nom, bot, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIconBotonDisabled method, of class Imagen.
     */
    @Test
    public void testSetIconBotonDisabled() {
        System.out.println("setIconBotonDisabled");
        int[] num =  {1,2,3,4,5};
        String[] nom = {"arbol.png","calcetines.jpg","cebolla.jpg","chile.jpg","cigarro.jpg"};
        JButton but1 = new JButton();
        JButton but2 = new JButton();
        JButton but3 = new JButton();
        JButton but4 = new JButton();
        JButton but5 = new JButton();
        JButton[] bot = {but1,but2,but3,but4,but5};
        int ancho = 200;
        int alto = 100;
        Imagen instance = new Imagen();
        instance.setIconBotonDisabled(num, nom, bot, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIconLabel method, of class Imagen.
     */
    @Test
    public void testSetIconLabel() {
        System.out.println("setIconLabel");
        int[] num =  {1,2,3,4,5};
        String[] nom = {"arbol.png","calcetines.jpg","cebolla.jpg","chile.jpg","cigarro.jpg"};
        JLabel lab1 = new JLabel();
        JLabel lab2 = new JLabel();
        JLabel lab3 = new JLabel();
        JLabel lab4 = new JLabel();
        JLabel lab5 = new JLabel();
        
        JLabel[] lab = {lab1,lab2,lab3,lab4,lab5};
        int ancho = 200;
        int alto = 100;
        Imagen instance = new Imagen();
        instance.setIconLabel(num, nom, lab, ancho, alto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberBoton method, of class Imagen.
     */
    @Test
    public void testSetNumberBoton() {
        System.out.println("setNumberBoton");
        int ancho = 200;
        int alto = 100;
        String n = "5";
        JButton c = new JButton();
        Imagen instance = new Imagen();
        instance.setNumberBoton(ancho, alto, n, c);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTextBoton method, of class Imagen.
     */
    @Test
    public void testSetTextBoton() {
        System.out.println("setTextBoton");
        int[] num = {2,3,1};
        String[] nom = {"1","2","3"};
        JButton bot1 = new JButton();
        JButton bot2 = new JButton();
        JButton bot3 = new JButton();
        
        JButton[] bot = {bot1,bot2,bot3};
        int ancho = 200;
        int alto = 100;
        Imagen instance = new Imagen();
        instance.setTextBoton(num, nom, bot, ancho, alto);
        
    }

    /**
     * Test of setIconGeneral method, of class Imagen.
     */
    @Test
    public void testSetIconGeneral() {
        System.out.println("setIconGeneral");
        JFrame fr = new JFrame();
        Imagen instance = new Imagen();
        instance.setIconGeneral(fr);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
