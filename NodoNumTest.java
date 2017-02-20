/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HojadeTrabajo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Pablo Merck
 */
public class NodoNumTest {
    
    public NodoNumTest() {
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
     * Test of setNum method, of class NodoNum.
     */
    @Test
    public void testSetNum() {
        System.out.println("setNum");
        int numero = 0;
        NodoNum instance = new NodoNum();
        instance.setNum(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum method, of class NodoNum.
     */
    @Test
    public void testGetNum() {
        System.out.println("getNum");
        NodoNum instance = new NodoNum();
        int expResult = 0;
        int result = instance.getNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class NodoNum.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        NodoNum miNum = null;
        NodoNum instance = new NodoNum();
        int expResult = 0;
        int result = instance.compareTo(miNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
