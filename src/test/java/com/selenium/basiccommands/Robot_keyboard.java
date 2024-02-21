package com.selenium.basiccommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot_keyboard {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		final WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Actions act = new Actions(driver);
		act.contextClick(fname).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
	

	}

}
