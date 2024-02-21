package com.selenium.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTrue {
	
	@Test
	public void validateAssertTrue()
	{
		/*WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://demo.automationtesting.in/Register.html");
				
			WebElement MaleRadioButton =	driver.findElement(By.xpath("//input[@value='Male']"));
		//	MaleRadioButton.click();
			
			boolean selected = MaleRadioButton.isSelected();
			*/
			Assert.assertTrue(validateoddoreven());
			
		
	}
	
	public boolean validateoddoreven()
	{
		int num = 14;
		
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
