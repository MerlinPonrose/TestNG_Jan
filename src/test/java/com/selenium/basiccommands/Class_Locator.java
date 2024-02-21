package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://www.firstcry.com/");
				
				Thread.sleep(15000);
				
	WebElement searchbox = 			driver.findElement(By.id("search_box"));
	searchbox.click();
	searchbox.sendKeys("dress");
	
WebElement searchicon =	driver.findElement(By.className("search-button"));
searchicon.click();
	}

}
