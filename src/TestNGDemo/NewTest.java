package TestNGDemo;

import org.testng.annotations.Test;

public class NewTest {

	MyCalculator c = new MyCalculator();

	@Test(expectedExceptions = ArithmeticException.class, groups = "sanity")
	public void testDivision() {
		int result = c.division(2, 0);
	}

}
