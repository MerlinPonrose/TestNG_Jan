package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pom.BaseClass;

public class RegisterPage extends BaseClass{
	
	public static String fname = "//input[@placeholder='First Name']";
	
	public static By address = By.tagName("textarea");
	
	public static By lastname = By.xpath("//input[@placeholder='Last Name']");
	
	public static By Email = By.xpath("//input[@type='email']");
	
	public static By phone = By.xpath("//input[@type='tel']");
	
	
	
	public void enterFname()
	{
		WebElement fname = driver.findElement(By.xpath(reg.fname));
		fname.click();
		fname.clear();
		fname.sendKeys("hi");
		
	}
	

	public void enterlname()
	{
		WebElement lname = driver.findElement(reg.lastname);
		lname.click();
		lname.clear();
		lname.sendKeys("hi");
		
	}
	

	public void enteraddr()
	{

		WebElement addr = driver.findElement(reg.address);
		addr.click();
		addr.clear();
		addr.sendKeys("Chennai");
		
	}
	

	public void enteremai()
	{
		WebElement email = driver.findElement(reg.Email);
		email.click();
		email.clear();
		email.sendKeys("test@text.com");
		
	}
	
	public void Phnenum()
	{
		
		WebElement phone = driver.findElement(reg.phone);
		phone.click();
		phone.clear();
		phone.sendKeys("Chennai");
		
	}

}
