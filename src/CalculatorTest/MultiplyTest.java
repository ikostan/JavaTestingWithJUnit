package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator.Multiply;

public class MultiplyTest {

	@Test
	public void test() {
		
		Multiply multi = new Multiply();
		
		int result1 = multi.times(2, 3);	
		assertEquals(6, result1);
		
		int result2 = multi.times(2, -3);	
		assertEquals(-6, result2);
		
		int result3 = multi.times(2, 0);	
		assertEquals(0, result3);
	}
}
