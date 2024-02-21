package com.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_TimeOut {
	
	WebDriver driver;
	@BeforeMethod
	public void launchApplication()
	{
	WebDriverManager.firefoxdriver().setup();
		
		driver	 = new FirefoxDriver();
			
		driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Alerts.html");
				
	}
	
	
	@Test(timeOut=4000)
	public void test1() throws InterruptedException
	{

		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	Alert alert = driver.switchTo().alert();
	
	Thread.sleep(5000);
	
	alert.dismiss();
		
			
	}
	

}
