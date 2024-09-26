package saucedemo.PageobjectModel.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[text()='CHECKOUT']")
	WebElement cartCheckoutButton;
	

	public CartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickcartCheckoutButton() {
		
		cartCheckoutButton.click();
	}
	
	public void addingproduct() {
		ProductPageObject pp = new ProductPageObject(driver);
		pp.clickButtonOfprodyctNumber(1);
		pp.clickcartButton();
		
	}
	

}
