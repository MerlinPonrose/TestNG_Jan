package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://demo.guru99.com/test/drag_drop.html");
				
				WebElement amount = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));
				
				WebElement amount_textarea = driver.findElement(By.id("amt7"));
				
				Actions act = new Actions(driver);
				act.dragAndDrop(amount, amount_textarea).build().perform();
				

	}

}
