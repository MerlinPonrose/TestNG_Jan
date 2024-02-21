package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter_TestNG {
	
	@Test
	@Parameters({"Email","Password"})
	public void login(String email, String password)
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

}
