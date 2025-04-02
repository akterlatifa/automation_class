package com.saucedemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import saucedemo.PageobjectModel.webpages.LogingPageObjects;


public class UtilitiesHelper {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	//updating below method after class testNg 2
	
	public static WebDriver getDriver() throws FileNotFoundException, IOException {
		
		if(getConfigValue("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (getConfigValue("browser").equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}else if(getConfigValue("browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
		 
		 
		 driver.get(getConfigValue("url"));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
	
	
	
	
	
	/*
	public static WebDriver getDriver() {
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/v1/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
	public static void successfullogin() {
		LogingPageObjects lp = new LogingPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		lp.enterusernamefield("standard_user");
		lp.enterpasswordfield("secret_sauce");
		lp.liginbutton();	
		
	} */
	//using config file
	
	public static void successfullogin() throws FileNotFoundException, IOException {
		LogingPageObjects lp = new LogingPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		lp.enterusernamefield(getConfigValue("userName"));
		lp.enterpasswordfield(getConfigValue("password"));
		lp.liginbutton();}	
	

	
	public static void successfulLogOut() throws InterruptedException  {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(3);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	
	public static void takescreenshot(String screenshotName) throws IOException {
		// taking screenshot is done by selenium
		// saving by common io
		driver.manage().window().fullscreen();
	File screenshot =	 ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	FileUtils.copyFile(screenshot, new File("screenshot/"+screenshotName+".png"));	
		
	}
	public static void closebrowsersession() {
		driver.quit();
		
	}

	//file congigration testng class 2 
	
	public static String getConfigValue(String propertykey) throws FileNotFoundException, IOException {
		// we need to read the file
		//file input stream
		
		
		
		prop = new Properties();
		prop.load(new FileInputStream("src/test/resources/config.properties"));
		return prop.getProperty(propertykey);
		
		
	}
	
	
}
