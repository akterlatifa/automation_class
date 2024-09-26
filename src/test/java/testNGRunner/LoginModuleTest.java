package testNGRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.LogingPageObjects;

public class LoginModuleTest {
	
	WebDriver driver;
	LogingPageObjects lp;
	
	@Test
	void validTest() throws InterruptedException, FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		lp = new LogingPageObjects(driver);
		lp.enterusernamefield("standard_user");
		lp.enterpasswordfield("secret_sauce");
		lp.liginbutton();
		UtilitiesHelper.successfulLogOut();
	
	}
	
	@Test
	void lockedoutTest() throws InterruptedException, FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		lp = new LogingPageObjects(driver);
		lp.enterusernamefield("locked_out_user");
		lp.enterpasswordfield("secret_sauce");
		lp.liginbutton();
		boolean errorstatus =lp.checkErrorIsPresent();
		Assert.assertEquals(errorstatus, true);
		
	}

@Test
	void ProblemUserTest() throws InterruptedException, FileNotFoundException, IOException {
		driver = UtilitiesHelper.getDriver();
		lp = new LogingPageObjects(driver);
		lp.enterusernamefield("problem_user");
		lp.enterpasswordfield("secret_sauce");
		lp.liginbutton();
		boolean errorstatus =lp.checkrobotImage();
		Assert.assertEquals(errorstatus, true);
		UtilitiesHelper.successfulLogOut();
		
	}
	
	

}
