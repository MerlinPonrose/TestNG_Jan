package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriverManager.firefoxdriver().setup();
		
WebDriver	driver	 = new FirefoxDriver();
		
driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		WebElement skill_dropdown = driver.findElement(By.id("Skills"));
		
		Select dropdown = new Select(skill_dropdown);
		
	//	dropdown.selectByIndex(7);
		
	//	dropdown.selectByVisibleText("Certifications");

		dropdown.selectByValue("CSS");
	}

}
