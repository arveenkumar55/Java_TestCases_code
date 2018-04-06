/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_lab4;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohamed Jubara Jubara
 */
public class jblink_statsTest {
    
    public jblink_statsTest() {
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
     * Test of averageNumbers method, of class jblink_stats.
     */
   @Test
    public void testAverageNumbers() {
        System.out.println("averageNumbers");
        double expResult = 10;
        
        ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(10,5,10,15,10,10,10,10,10));
        double result = jblink_stats.computeAverage(testData);
        assertEquals(expResult, result, 0.0);
        
        expResult = -1;
        testData = new ArrayList<>(Arrays.asList());
        result = jblink_stats.computeAverage(testData);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of sumNumbers method, of class jblink_stats.
     */
    @Test
    public void testSumNumbers() {
        System.out.println("sumNumbers");
        double expResult = 55;
        ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        double result = jblink_stats.computeSum(testData);
        assertEquals(expResult, result, 0.0);
        
        expResult = -1;
        testData = new ArrayList<>(Arrays.asList());
        result = jblink_stats.computeSum(testData);
        assertEquals(expResult, result, 0.0);
    
    
    }

    /**
     * Test of medianNumbers method, of class jblink_stats.
     */
    @Test
    public void testMedianNumbers() {
        System.out.println("medianNumbers");
        jblink_stats stat=new jblink_stats();
        ArrayList<Double> testData = new ArrayList<>(Arrays.asList(2.0, 90.0, 35.0, 32.0, 50.1));
        double expResult = 35.0;
        double result = jblink_stats.computeMedian(testData);
        assertEquals(expResult, result, 0.0);
        
         testData = new ArrayList<>(Arrays.asList(2.0, 90.0, 35.0, 32.0));
         expResult = 33.5;
         result = jblink_stats.computeMedian(testData);
        assertEquals(expResult, result, 0.0);
        
         testData = new ArrayList<>(Arrays.asList(7.0, 80.0, 50.0, 90.0,100.0));
         expResult = 80.0;
         result = jblink_stats.computeMedian(testData);
        assertEquals(expResult, result, 0.0);
        
        
         
         
       
       
    }

    /**
     * Test of standardDeviation method, of class jblink_stats.
     */
    @Test
    public void testStandardDeviation() {
        
        System.out.println("standardDeviation");
        ArrayList<Integer> testData1 = new ArrayList<>(Arrays.asList());
        double expResult = -1;
        double result = jblink_stats.computeStandardDeviation(testData1);
        assertEquals(expResult, result, 0.0);
        
         ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4));
         expResult = 2.893;
         result = jblink_stats.computeStandardDeviation(testData);
        assertEquals(expResult, result, 0.0);
        
            
       
    }

    
}
