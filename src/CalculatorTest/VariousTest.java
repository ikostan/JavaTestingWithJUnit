package CalculatorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;


public class VariousTest {

	//Exception Handling
	@Test(expected = IndexOutOfBoundsException.class)
	public void testException(){
		
		new ArrayList<Object>().get(0);
	}
	
	//How to ignore test
	@Ignore
	@Test
	public void test() {
		
		fail("Not yet implemented");
	}
	
	//How to ignore test
	@Ignore
	@Test
	public void testFalse(){
		
		assertFalse(true);
	}
	
	//Parameterized test
	//@RunWith(value = Parameterized.class)
	//public void
}
