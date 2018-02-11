/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecalculator;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author radibarq
 */
public class ModelTest {
    
    public ModelTest() {
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
     * Test of addData method, of class Model.
     */
    @Test
    public void testAddData() {
        System.out.println("addData");
        String buttonText = "";
        Model instance = new Model();
        instance.addData(buttonText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSequence method, of class Model.
     */
    @Test
    public void testGetSequence() {
        System.out.println("getSequence");
        Model instance = new Model();
        ArrayList<Model.Data> expResult = null;
        ArrayList<Model.Data> result = instance.getSequence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Model.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Model instance = new Model();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDataType method, of class Model.
     */
    @Test
    public void testFindDataType() {
        System.out.println("findDataType");
        String buttonText = "";
        Model instance = new Model();
        int expResult = 0;
        int result = instance.findDataType(buttonText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResult method, of class Model.
     */
    @Test
    public void testCalculateResult() {
        System.out.println("calculateResult");
        Model instance = new Model();
        String expResult = "";
        String result = instance.calculateResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastInput method, of class Model.
     */
    @Test
    public void testGetLastInput() {
        System.out.println("getLastInput");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getLastInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of squareRoot method, of class Model.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot");
        Model instance = new Model();
        String expResult = "";
        String result = instance.squareRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetLastInput method, of class Model.
     */
    @Test
    public void testResetLastInput() {
        System.out.println("resetLastInput");
        Model instance = new Model();
        instance.resetLastInput();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editLatestInput method, of class Model.
     */
    @Test
    public void testEditLatestInput() {
        System.out.println("editLatestInput");
        String text = "";
        Model instance = new Model();
        instance.editLatestInput(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
