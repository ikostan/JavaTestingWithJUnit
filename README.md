# Java: Testing with JUnit

## Introduction:
Unit testing is a critical part of any software development process. JUnit is an open-source testing tool specialized for Java, 
and it should be part of every Java developer's toolbox. One of the benefits of JUnit is that the tests are done so that they do not require human judgment to interpret. When we create a test, we identify the expected result. Then we compare that to the actual result. If they're the same, then we know the test worked. If they're different, then we know we have an error that we need to go back and fix. Another benefit is it's easy to run many test cases at the same time (Test Suite).

## Topics include:

* Comparing values with assertions 
* Using JUnit with different Java IDEs 
* Creating basic unit tests 
* Testing for exception handling 
* Creating parameterized tests

### Screenshot #1:
![GUI](https://github.com/ikostan/JavaTestingWithJUnit/blob/master/img/ok.PNG?raw=true "GUI screenshot")

### Screenshot #2:
![GUI](https://github.com/ikostan/JavaTestingWithJUnit/blob/master/img/failure.PNG?raw=true "GUI screenshot")

## Basic Unit Test:
- As a general rule, a test name should explain what the test does. If that is done correctly, reading the action implementation code can be avoided. When you do need to create a unit test, you can follow these simple steps. Annotate a method with @Test.

- Make sure to import org.junit.Assert.* and then add your assert statements to test the program logic. An example might be the assert equals, which takes two values, the expected value and the result of testing the program class.

### Step by step:
* Annotate a method with @Test
* Import org.junit.Assert.*;
* Add assert statement to test program logic

### Example:
```
import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		
		Divide divide = new Divide();
		
		int result = divide.quotient(12, 2);
		assertEquals("The test is failed!", 6, result);
		
		int result2 = divide.quotient(12, 0);
		assertEquals("The test is failed!", 0, result2);
	}
}

```

## Test Suite:
If you have several test classes you can combine them and run them all at once, by combining them into a test suite. Running a test suite execute all test classes in that suite in the specified order. A test suite can also contain other test suites. See example bellow:
```
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Producer
 */
@RunWith(Suite.class)				
@Suite.SuiteClasses({				
  SuiteTest1.class,
  SuiteTest2.class,  			
})		

public class TestSuiteTest {
    
    public TestSuiteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TestSuite.
     */
    @Test
    public void testMain() {
   
    }   
}
```

### Source: https://www.lynda.com/Java-tutorials/Welcome/520534/548571-4.html?
 
