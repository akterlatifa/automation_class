package saucedemo.pom.TestRunnerforwebpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.CartPage;

public class CartRunnerTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver;
		driver= UtilitiesHelper.getDriver();
		
		Thread.sleep(3);
		
		UtilitiesHelper.successfullogin();
		UtilitiesHelper.takescreenshot("successfullogin");
		Thread.sleep(3);
		
		
		CartPage cp = new CartPage(driver);
		cp.addingproduct();
		Thread.sleep(3);
		cp.clickcartCheckoutButton();
		Thread.sleep(3);
		UtilitiesHelper.takescreenshot("cartpage");
		UtilitiesHelper.closebrowsersession();

	}

}
