package stepDefinitionsCucumber;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.saucedemo.utility.UtilitiesHelper;

import io.cucumber.java.en.*;
import saucedemo.PageobjectModel.webpages.ProductPageObject;

public class ProductsStepDefinition {
WebDriver driver;

ProductPageObject pp;
	
@Given("the user will be on product page")
public void the_user_will_be_on_product_page() throws FileNotFoundException, IOException {
    
	driver = UtilitiesHelper.getDriver();
    UtilitiesHelper.successfullogin();
	
	
}

@When("I click one product")
public void i_click_one_product() {
	
	pp = new ProductPageObject(driver);
    pp.clickButtonOfprodyctNumber(1);
}

@Then("one product will be added to the cart")
public void one_product_will_be_added_to_the_cart() {
   // validate product  added or not  // valida by:  you can see the number or not in side cart like 1/2/3
	//boolean isProductNumVisibile = driver.findElement(By.xpath("//span[text()='1']")).isDisplayed();
	//assertTrue(isProductNumVisibile, "1");	
	
}

@Then("I will be able to go to the cart page")
public void i_will_be_able_to_go_to_the_cart_page() {
	// 
    pp.clickcartButton();
} 
	
	
	
	
	
}
