package saucedemo.pom.TestRunnerforwebpages;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.LogingPageObjects;

public class LogingPageTestRunner {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		driver= UtilitiesHelper.getDriver();
		
		
		LogingPageObjects lp = new LogingPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		lp.enterusernamefield("standard_user");
		lp.enterpasswordfield("secret_sauce");
		lp.liginbutton();
		Thread.sleep(3);
		
		UtilitiesHelper.takescreenshot("successfullogin");
		UtilitiesHelper.closebrowsersession();
		 

	}

}
