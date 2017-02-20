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
public class OrdenamientosTest {
    
    public OrdenamientosTest() {
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
     * Test of InsertionSort method, of class Ordenamientos.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("InsertionSort");
        NodoNum[] laLista = null;
        Ordenamientos instance = new Ordenamientos();
        NodoNum[] expResult = null;
        NodoNum[] result = instance.InsertionSort(laLista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class Ordenamientos.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        NodoNum[] laLista = null;
        Ordenamientos instance = new Ordenamientos();
        String expResult = "";
        String result = instance.bubbleSort(laLista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
