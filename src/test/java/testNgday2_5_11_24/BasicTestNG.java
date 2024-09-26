package testNgday2_5_11_24;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG {

	@BeforeMethod
	void abc() {
		System.out.println("before method");
	}

	@AfterMethod
	void def() {
		System.out.println("after method");
	}

	@Test
	void test01() {
		System.out.println("Test 01");
	}

	@Test
	void test02() {
		System.out.println("Test 02");
	}

	@AfterClass
	void afterclass() {
		System.out.println("after class");
	}

	@BeforeClass
	void beforeclass() {
		System.out.println("before class");
	}

	@AfterTest
	void afterTest() {
		System.out.println("after Test");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("before Test");
	}

	@AfterGroups
	void afterGrops() {
		System.out.println("after Grops");
	}

	@BeforeGroups
	void beforegrops() {
		System.out.println("before Grops");
	}

	@AfterSuite
	void afterSuite() {
		System.out.println("after Suite");
	}

	@BeforeSuite
	void beforeSuite() {
		System.out.println("before Suite");
	}

}
