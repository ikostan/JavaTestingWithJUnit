package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculator.Sum;

public class SumTest {

	@Test
	public void test() {

		Sum sum = new Sum();
		
		int result1 = sum.summation(new int[]{1,2,3});
		assertEquals(6, result1);
		
		int result2 = sum.summation(new int[]{1,2,-3});
		assertEquals(0, result2);
	}
}
