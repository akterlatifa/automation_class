package saucedemo.PageobjectModel.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPageObject {
	
	WebDriver driver;

	
	@FindBy(xpath = "//div[text()='Products']")
	WebElement productTittle;
	
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	WebElement productbutton;
	
	
	@FindBy(xpath = "//button[text()='REMOVE']")
	WebElement removeButton;
	
	@FindBy(xpath = "//a[@href='./cart.html']")
	WebElement cartButton;
	 
	// dropdown with select element, soring by textvalue
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement sortselect;
	
	//testng Assertion 
	
	@FindBy(xpath = "//img[@src='./img/sauce-backpack-1200x1500.jpg']")
	WebElement backpackImage;
	
	public ProductPageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* tittle cheking is doing by testng now
	public void varifyproductPage() {
		
		String tittle = productTittle.getText();
		System.out.println(tittle);
		
		
	}
	*/
	
	//look this code--testNG

	public String varifyproductPage() {
		
		String tittle = productTittle.getText();
		return tittle;
		
		
	}
	
	
	public void clickAddtocart() {
		productbutton.click();
	}
	
	
	public void clickremoveButton() {
		
		removeButton.click();
	}
	
	// dinamic way passing index valu of list element
	
	public void clickButtonOfprodyctNumber(int productNumber) {
		WebElement productbutton = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])["+productNumber+"]"));
		productbutton.click();
	}
	public void clickcartButton() {
		cartButton.click();
		
	}
	
// add all product together:
	public void addAllproductTogether() {
		List<WebElement> productbutton =driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		for(int i=0; i<productbutton.size();i++) {
			productbutton.get(i).click();
		                }
		}
		
		
		public void SortingTest(String howtosort){
			
			Select sc = new Select(sortselect);
			
			sc.selectByVisibleText(howtosort);
		}
		
	
	public boolean bagVisibility() {
		return backpackImage.isDisplayed();
	
	}	
		
	

}
