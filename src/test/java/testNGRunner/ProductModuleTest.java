package testNGRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.ProductPageObject;

public class ProductModuleTest {
	WebDriver driver;
	ProductPageObject pp;

	
	
	@Test
	void titlecheck() throws FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		UtilitiesHelper.successfullogin();
		pp = new ProductPageObject(driver);
		String ptitle = pp.varifyproductPage();
		Assert.assertEquals(ptitle, "Products");

	}

	@Test
	void sortingTest() throws FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		UtilitiesHelper.successfullogin();
		pp = new ProductPageObject(driver);
		pp.SortingTest("Price (high to low)");
		pp.SortingTest("Price (low to high)");
	}

	@Test
	void addingtoCartTest() throws FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		UtilitiesHelper.successfullogin();
		pp = new ProductPageObject(driver);
		pp.clickAddtocart();
		pp.clickcartButton();

	}

	@Test
	void removingFromCart() {

	}

}
