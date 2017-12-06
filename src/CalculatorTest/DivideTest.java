package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator.Divide;


public class DivideTest {

	@Test
	public void test() {
		
		Divide divide = new Divide();
		
		int result = divide.quotient(12, 2);
		assertEquals("The test is failed!", 6, result);
		
		int result2 = divide.quotient(12, 0);
		assertEquals("The test is failed!", 0, result2);
		
		int result3 = divide.quotient(12, -2);
		assertEquals("The test is failed!", -6, result3);
	}
	
	//Exception Handling
	@Test(expected = ArithmeticException.class)
	public void testDevideByZero(){
			
		int x = 10/0;
	}
}
