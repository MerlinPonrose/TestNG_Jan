package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pom.BaseClass;

public class SigInPage extends BaseClass{
	
	public static By Email = By.id("Email");
	
	public static By Pass = By.id("Password");
	
	public static By Submit = By.xpath("(//button[@type='submit'])[2]");
	
	
	public void enteremail()
	{
			com.enterValue(Email, "test@gmail.com");
	}
	
	public void enterpass()
	{
		com.enterValue(Pass, "123456");
	}
	
	public void cicksubmit()
	{
		com.clickElement(Submit);
	}
	

}
