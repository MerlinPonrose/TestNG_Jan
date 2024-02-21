package com.selenium.basiccommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		final WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("helo");
		fname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		fname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		

	}

}
