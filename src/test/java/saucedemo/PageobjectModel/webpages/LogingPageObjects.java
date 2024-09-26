package saucedemo.PageobjectModel.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingPageObjects {
WebDriver driver;

@FindBy(xpath = "//input[@name='user-name']")
WebElement usernamefield;

@FindBy(xpath = "//input[@name='password']")
WebElement passwordfield;

@FindBy(xpath = "//input[@value='LOGIN']")
WebElement logingButton;

@FindBy(xpath = "//h3[@data-test='error']")
WebElement errorMassage;

@FindBy(xpath = "//img[@class='footer_robot']")
WebElement robotImage;

public LogingPageObjects(WebDriver driver) {

	this.driver = driver;
	
	PageFactory.initElements(driver, this);
}

public void enterusernamefield(String username ) {
	usernamefield.sendKeys(username);

}

public void enterpasswordfield(String password) {
	
	passwordfield.sendKeys(password);
}

public void liginbutton() {
	logingButton.click();

}

public boolean checkErrorIsPresent() {
	return errorMassage.isDisplayed();
	
}
	
	
	public boolean checkrobotImage() {
		return robotImage.isDisplayed();
	}
	
	
	
	
	
}
