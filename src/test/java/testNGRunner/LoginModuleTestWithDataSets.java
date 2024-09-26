package testNGRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.saucedemo.utility.UtilitiesHelper;

import saucedemo.PageobjectModel.webpages.LogingPageObjects;

public class LoginModuleTestWithDataSets {
WebDriver driver;
LogingPageObjects lp;


	
	@Test(dataProvider = "credentials")
	void logingmethod(String username, String passward) throws FileNotFoundException, IOException {
		
		driver = UtilitiesHelper.getDriver();
		lp = new LogingPageObjects(driver);
		lp.enterusernamefield(username);
		lp.enterpasswordfield(passward);
		lp.liginbutton();
		
		}
	
	
	
	
	@DataProvider(name = "credentials")

public Object[][] credentialprovider() {
	
		Object[][] usernameandpassword = { { "standard_user", "secret_sauce" },
											{ "locked_out_user", "secret_sauce" },
											{ "problem_user", "secret_sauce" }, 
											{ "performance_glitch_user", "secret_sauce" },
											{"",""}
																			};

				return usernameandpassword;

	}

}
