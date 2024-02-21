package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://demoqa.com/buttons");
				
				WebElement doubleclick_button = driver.findElement(By.id("doubleClickBtn"));
				
				Actions act = new Actions(driver);
				
				act.doubleClick(doubleclick_button).build().perform();
				

	}

}
