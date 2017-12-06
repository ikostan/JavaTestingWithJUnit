package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator.Subtract;

public class SubtractTest {

	@Test
	public void test() {
		
		Subtract subtract = new Subtract();
		
		int result1 = subtract.minus(12, 6);
		assertEquals(6, result1);
		
		int result2 = subtract.minus(12, 12);
		assertEquals(0, result2);
		
		int result3 = subtract.minus(12, 0);
		assertEquals(12, result3);
	}
}
