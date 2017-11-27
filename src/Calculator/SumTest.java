package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {

		Sum sum = new Sum();
		int result = sum.summation(new int[]{1,2,3});
		assertEquals(6, result);
	}
}
