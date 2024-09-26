package stepDefinitionsCucumber;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.saucedemo.utility.UtilitiesHelper;

import io.cucumber.java.en.*;
import saucedemo.PageobjectModel.webpages.LogingPageObjects;
import saucedemo.PageobjectModel.webpages.ProductPageObject;

public class StepDefinition {
	
	WebDriver driver;
	LogingPageObjects lp;
	ProductPageObject pp;
	
	@Given("user is into login page")
	public void user_is_into_login_page() throws FileNotFoundException, IOException {
	  // we need to go to login page
	// validate if that is a loging page
		
		
		driver = UtilitiesHelper.getDriver();
		 lp = new LogingPageObjects(driver);
		
		
	}

	@When("user enters vallid username")
	public void user_enters_vallid_username() {
	  // sendkeys---loging page object.sendkeys // username.sendkeys
		
		
		lp.enterusernamefield("standard_user");
	}

	@When("user enter vaild password")
	public void user_enter_vaild_password() {
		 // sendkeys---loging page object.sendkeys // username.sendkeys
		
	    lp.enterpasswordfield("secret_sauce");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	  //click button 
		
		lp.liginbutton();
		
	}

	@Then("user should be directed to products page")
	public void user_should_be_directed_to_products_page() {
	   //check product page 
		 pp = new ProductPageObject(driver);
		 pp.varifyproductPage();
		
	}
	
	@Then("user will see products image for products")
	public void user_will_see_products_image_for_products() {
	  boolean isImagepresent = pp.bagVisibility(); 
	  Assert.assertTrue(isImagepresent);
	}
///Scenario 2
	
	@When("user enters invallid username")
	public void user_enters_invallid_username() {
		lp.enterusernamefield("standard_userx");  
	}
	@When("user enter invaild password")
	public void user_enter_invaild_password() {
		lp.enterpasswordfield("secret_saucex");
	}
	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
	    
	    Assert.assertTrue(lp.checkErrorIsPresent(), "Error is present");
	}

	/////-----------------------------------------------//////////////
	


	
	
	
}

