package com.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Enabled {

	
	
	WebDriver	driver;
	
	@BeforeMethod
	public void launchApplication()
	{
	WebDriverManager.firefoxdriver().setup();
		
		driver	 = new FirefoxDriver();
			
		driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Alerts.html");
				
	}
	
	
	@Test(priority=1,groups= {"sanity"})
	public void test1() throws InterruptedException
	{

		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	Alert alert = driver.switchTo().alert();
	
	Thread.sleep(5000);
	
	alert.dismiss();
		
			
	}
	
	@Test(priority=3,enabled=true)
	public void test2() throws InterruptedException
	{
	driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
	String text =	alert.getText();
	
	System.out.println(text);

	}
	
	@Test(priority=2,groups= {"sanity"})
	public void test3() throws InterruptedException
	{
		WebElement alert_button =		driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_button.click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
	alert.accept();
				
	}

	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
