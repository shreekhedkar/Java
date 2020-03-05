package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	MyCalculator c;

	@BeforeClass
	public void init() {
		c = new MyCalculator();
	}

	@Test(dataProvider = "testData")
	public void testAddition(int no1, int no2, int expectedResult) {
		int result = c.addition(no1, no2);
		Assert.assertEquals(result, expectedResult);
	}

	@DataProvider
	public Object[][] testData() {

		Object data[][] = new Object[4][3];

		data[0][0] = 10;
		data[0][1] = 20;
		data[0][2] = 30;

		data[1][0] = -10;
		data[1][1] = -20;
		data[1][2] = -30;

		data[2][0] = -10;
		data[2][1] = 20;
		data[2][2] = 10;

		data[3][0] = 0;
		data[3][1] = 0;
		data[3][2] = 0;

		return data;

	}

}
