package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest3 {

	@BeforeClass
	public void init() {

		System.out.println("in before class");
	}

	@AfterClass
	public void tearDown() {

		System.out.println("in aftr class");
	}

	@Test
	public void f1() {
		System.out.println("in f1");
	}

	@Test
	public void f2() {
		System.out.println("in f2");
	}

	@BeforeMethod
	public void beforeTest() {
		System.out.println("in before test");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("in after test");
	}

}
