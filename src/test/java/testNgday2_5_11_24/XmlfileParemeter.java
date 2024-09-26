package testNgday2_5_11_24;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlfileParemeter {
	
	@Parameters({"userName","password"})
	@Test
	void test01(String username, String password) {
		System.out.println("Test 01");
		System.out.println(username);
		System.out.println(password);
	}

	@Test
	void test02() {
		System.out.println("Test 02");
	}
	
}
