package com.selenium.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pom.BaseClass;

public class Selenium_Common extends BaseClass{
	
	public void clickElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void enterValue(By locator,String text)
	{
		WebElement element = driver.findElement(locator);
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	public void verifyPageTitle(String expectedTitle)
	{
		String Actualtitle = driver.getTitle();
		if(Actualtitle.contains(expectedTitle))
		{
			System.out.println("Landed in correct page");
		}
		else
		{
			System.out.println("It is a diffrent page !!!");
		}
	}

}
