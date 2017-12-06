/**
 * 
 */
package CalculatorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import TestSuite.SuiteTest2;

/**
 * @author superadmin
 *
 */

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
  DivideTest.class,
  MultiplyTest.class, 
  SubtractTest.class,
  SumTest.class,
  VariousTest.class
})		

public class CalculatortestSuite {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
}
