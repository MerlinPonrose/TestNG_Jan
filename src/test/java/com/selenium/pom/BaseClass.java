package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.pages.HomePage;
import com.selenium.pages.RegisterPage;
import com.selenium.pages.SigInPage;
import com.selenium.utility.Selenium_Common;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static RegisterPage reg = new RegisterPage();
	
	public static SigInPage sigin = new SigInPage();
	
	public static HomePage hmpg = new HomePage();
	
	public static Selenium_Common com = new Selenium_Common();

	
	@BeforeMethod
	public void openApplication()
	{
		WebDriverManager.firefoxdriver().setup();
		
		driver	 = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
			
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
