package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_TestNG {
	
	@Test(dataProvider="getData")
	public void dataprovider(String email, String password)
	{
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		
		driver	 = new FirefoxDriver();
			
		driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/SignIn.html");
			
			WebElement email_textbox = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
			email_textbox.sendKeys(email);
			
			WebElement password_textbox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password_textbox.sendKeys(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "test1@test.com";
		data[0][1] = "123";
		
		data[1][0] = "test2@test.com";
		data[1][1] = "456";
		
		return data;
		
	}

}
