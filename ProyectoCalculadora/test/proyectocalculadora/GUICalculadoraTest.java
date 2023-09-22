/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectocalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPALACIOR
 */
public class GUICalculadoraTest {
    
    public GUICalculadoraTest() {
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
     * Test of on method, of class GUICalculadora.
     */
    @Test
    public void testOn() {
        System.out.println("on");
        GUICalculadora instance = new GUICalculadora();
        instance.on();
    }

    /**
     * Test of off method, of class GUICalculadora.
     */
    @Test
    public void testOff() {
        System.out.println("off");
        GUICalculadora instance = new GUICalculadora();
        instance.off();
    }

    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5+5"
     */
    @Test
    public void testResulFinal() {
        System.out.println("resulFinal");
        String cad = "5+5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "10.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5*5"
     */
    @Test
    public void testResulFinal2() {
        System.out.println("resulFinal");
        String cad = "5*5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "25.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5/5"
     */
    @Test
    public void testResulFinal3() {
        System.out.println("resulFinal");
        String cad = "5/5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "1.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5"
     */
    @Test
    public void testResulFinal4() {
        System.out.println("resulFinal");
        String cad = "5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "5.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5^2"
     */
    @Test
    public void testResulFinal5() {
        System.out.println("resulFinal");
        String cad = "5^2";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "25.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "1+2*3^(8/2)-5"
     */
    @Test
    public void testResulFinal6() {
        System.out.println("resulFinal");
        String cad = "1+2*3^(8/2)-5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "158.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5-5"
     */
    @Test
    public void testResulFinal7() {
        System.out.println("resulFinal");
        String cad = "5-5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "0.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5+(-5)"
     */
    @Test
    public void testResulFinal8() {
        System.out.println("resulFinal");
        String cad = "5+(-5)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "0.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(-10)*(-5)"
     */
    @Test
    public void testResulFinal9() {
        System.out.println("resulFinal");
        String cad = "(-10)*(-5)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "50.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "25^(1/2)"
     */
    @Test
    public void testResulFinal10() {
        System.out.println("resulFinal");
        String cad = "25^(1/2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "5.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(-10)^2"
     */
    @Test
    public void testResulFinal11() {
        System.out.println("resulFinal");
        String cad = "(-10)^2";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "100.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "55 * /(-3)"
     */
    @Test
    public void testResulFinal12() {
        System.out.println("resulFinal");
        String cad = "55*/(-3)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "11..2+5"
     */
    @Test
    public void testResulFinal13() {
        System.out.println("resulFinal");
        String cad = "11..2+5";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(-1.2)-*8"
     */
    @Test
    public void testResulFinal14() {
        System.out.println("resulFinal");
        String cad = "(-1.2)-*8";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5^(-1)"
     */
    @Test
    public void testResulFinal15() {
        System.out.println("resulFinal");
        String cad = "5^(-1)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "0.2";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "111111.2*(2.3"
     */
    @Test
    public void testResulFinal16() {
        System.out.println("resulFinal");
        String cad = "111111.2*(2.3";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "69+(-3)/6^2"
     */
    @Test
    public void testResulFinal17() {
        System.out.println("resulFinal");
        String cad = "69+(-3)/6^2";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "68.91666666666667";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(-2)*(-2)/(-2)"
     */
    @Test
    public void testResulFinal18() {
        System.out.println("resulFinal");
        String cad = "(-2)*(-2)/(-2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "-2.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "8/5+9-3^(2)"
     */
    @Test
    public void testResulFinal19() {
        System.out.println("resulFinal");
        String cad = "8/5+9-3^(2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "1.5999999999999996";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada ".....(-"
     */
    @Test
    public void testResulFinal20() {
        System.out.println("resulFinal");
        String cad = ".....(-";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5^2^2"
     */
    @Test
    public void testResulFinal21() {
        System.out.println("resulFinal");
        String cad = "5^2^2";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "625.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "5^(2^2)"
     */
    @Test
    public void testResulFinal22() {
        System.out.println("resulFinal");
        String cad = "5^(2^2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "625.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "666^66/666^66"
     */
    @Test
    public void testResulFinal23() {
        System.out.println("resulFinal");
        String cad = "666^66/666^66";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "1.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "988*(-1^2)"
     */
    @Test
    public void testResulFinal24() {
        System.out.println("resulFinal");
        String cad = "988*(-1^2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "988.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(-0.3)(.^"
     */
    @Test
    public void testResulFinal25() {
        System.out.println("resulFinal");
        String cad = "(-0.3)(.^";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "8745.01+(0.09)"
     */
    @Test
    public void testResulFinal26() {
        System.out.println("resulFinal");
        String cad = "8745.01+(0.09)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "8745.1";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "9+(-2)"
     */
    @Test
    public void testResulFinal27() {
        System.out.println("resulFinal");
        String cad = "9+(-2)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "7.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "(((2+2)))"
     */
    @Test
    public void testResulFinal28() {
        System.out.println("resulFinal");
        String cad = "(((2+2)))";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "4.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "+-* /^"
     */
    @Test
    public void testResulFinal29() {
        System.out.println("resulFinal");
        String cad = "+-*/^";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "ERROR";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    /**
     * Test del método resulFinal, de la claseGUICalculadora.
     * Con la entrada "9(+9)"
     */
    @Test
    public void testResulFinal30() {
        System.out.println("resulFinal");
        String cad = "9(+9)";
        GUICalculadora instance = new GUICalculadora();
        String expResult = "18.0";
        String result = instance.resulFinal(cad);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of main method, of class GUICalculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GUICalculadora.main(args);
    }
    
}