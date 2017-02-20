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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juan Pablo Merck
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({HojadeTrabajo.ArchivoNumTest.class, HojadeTrabajo.MainTest.class, HojadeTrabajo.OrdenamientosTest.class, HojadeTrabajo.NodoNumTest.class})
public class HojadeTrabajoSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
