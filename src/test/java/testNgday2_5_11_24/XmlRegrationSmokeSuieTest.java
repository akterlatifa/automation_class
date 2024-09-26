package testNgday2_5_11_24;

import org.testng.annotations.Test;

public class XmlRegrationSmokeSuieTest {
	
	@Test(groups = "smoke")
	void test01() {
		System.out.println("Test 01 smoke");
		
	}

	@Test(groups= "regression")
	void test02() {
		System.out.println("Test 02 regression");
	}
	
	
	@Test(groups = "smoke")
	void test03() {
		System.out.println("Test 03 smoke");
	}
	
	
	

}
