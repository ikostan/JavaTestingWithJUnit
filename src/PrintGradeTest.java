import static org.junit.Assert.*;

import org.junit.Test;

public class PrintGradeTest {

	@Test
	public void test() {
		
		PrintGrade printGrades = new PrintGrade(); //Class to test
	    String result = printGrades.print(95);     //Variable that holds the result
	    assertEquals("Incorrect message was received", "You got an A!", result);  //Testing the result
	}

}
