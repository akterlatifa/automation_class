package testNGRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.ProductPageObject;

public class ProductpageUpdateWithTestNGDay2 {
	WebDriver driver;
	ProductPageObject pp;

	@BeforeClass(alwaysRun = true)
	void intidriverandpageObject() throws FileNotFoundException, IOException{
		driver = UtilitiesHelper.getDriver();
		UtilitiesHelper.successfullogin();
		pp = new ProductPageObject(driver);
		
		
	}
	
	@AfterMethod
	void letsTakeScreenShot() throws IOException {
		UtilitiesHelper.takescreenshot("screenshot");
	}
	
	@Test(priority = 1,groups = "smoke")
	void titlecheck() throws FileNotFoundException, IOException {
		
		String ptitle = pp.varifyproductPage();
		Assert.assertEquals(ptitle, "Products");
		boolean actualBagPresence = pp.bagVisibility();
		Assert.assertTrue(actualBagPresence);
	
	}
	
	@Test(priority = 2)
	void productImageTest() {
		
		boolean actualBagPresence = pp.bagVisibility();
		Assert.assertTrue(actualBagPresence);
	}

	@Test(priority = 3,groups = {"smoke","regression"})
	void sortingTest() throws FileNotFoundException, IOException {
		
		pp.SortingTest("Price (high to low)");
		pp.SortingTest("Price (low to high)");
	}

	@Test(priority = 4)
	void addingtoCartTest() throws FileNotFoundException, IOException {
		
		pp.clickAddtocart();
		pp.clickcartButton();

	}

	@Test(priority = 5)
	void removingFromCart() {

	}

	@Test(priority = 6)
	void checkSingleProducts() {
		
	}
	
	@AfterClass
	void AterTestDone() throws InterruptedException{
		UtilitiesHelper.successfulLogOut();
	}
	
	
	
}
