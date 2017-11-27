package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		
		Divide divide = new Divide();
		int result = divide.quotient(12, 2);
		
		assertEquals("The test is failed!", 6, result);
	}
	
	@Test
	public void devideByZero() {
		
		Divide divide = new Divide();
		int result = divide.quotient(12, 0);
		
		assertEquals("The test is failed!", 0, result);
	}
}
