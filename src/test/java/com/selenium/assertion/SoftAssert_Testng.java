package com.selenium.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert_Testng {

	@Test
	public void softassert()
	{
		
		WebDriver driver;
	WebDriverManager.firefoxdriver().setup();
		
		driver	 = new FirefoxDriver();
			
		driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			
			WebElement header = driver.findElement(By.tagName("h1"));
			
			String header_text = header.getText();
			
			System.out.println(header_text);
			
		//	Assert.assertEquals(header_text, "Automation Demo ","Two values are not equal");
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(header_text, "Automation Demo ","Two values are not equal");
			
			System.out.println("next line");
			
			soft.assertAll();
			
			
	}
}
