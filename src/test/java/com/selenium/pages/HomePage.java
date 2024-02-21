package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pom.BaseClass;

public class HomePage extends BaseClass{
	
	public static By AddTCartButtn = By.xpath("(//button[text()='Add to cart'])[1]");
	
	public void verifyhmepagetite()
	{
		
		com.verifyPageTitle("demo store");
	}
	
	public void CickAddTCart()
	{
		com.clickElement(AddTCartButtn);
	
	}

}
