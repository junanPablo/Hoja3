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
public class ArchivoNumTest {
    
    public ArchivoNumTest() {
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
     * Test of listaNumeros method, of class ArchivoNum.
     */
    @Test
    public void testListaNumeros() {
        System.out.println("listaNumeros");
        int cant = 0;
        ArchivoNum instance = new ArchivoNum();
        int[] expResult = null;
        int[] result = instance.listaNumeros(cant);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of miArchivo method, of class ArchivoNum.
     */
    @Test
    public void testMiArchivo() throws Exception {
        System.out.println("miArchivo");
        String arch = "";
        int cant = 0;
        ArchivoNum instance = new ArchivoNum();
        String[] expResult = null;
        String[] result = instance.miArchivo(arch, cant);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
