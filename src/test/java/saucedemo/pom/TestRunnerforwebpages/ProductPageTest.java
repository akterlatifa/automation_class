package saucedemo.pom.TestRunnerforwebpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.ProductPageObject;

public class ProductPageTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		driver = UtilitiesHelper.getDriver();
		
		UtilitiesHelper.successfullogin();

		// productpage creating

		ProductPageObject pp = new ProductPageObject(driver);
		pp.varifyproductPage();
		Thread.sleep(4);
		
		/*
		 * Adding all product by calling addAllproductTogether()
		 * pp.addAllproductTogether();
		 */
		pp.clickButtonOfprodyctNumber(1);

		Thread.sleep(4);
		pp.clickButtonOfprodyctNumber(2);
		//pp.clickremoveButton();
		pp.SortingTest("Price (low to high)");
		Thread.sleep(4);
		pp.SortingTest("Price (high to low)");
		pp.clickcartButton();
		
		Thread.sleep(4);
		
		UtilitiesHelper.takescreenshot("productpage");
		Thread.sleep(4);
		UtilitiesHelper.closebrowsersession();

	}

}
