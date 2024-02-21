package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demoqa.com/sortable");
		
		WebElement three = driver.findElement(By.xpath("(//div[text()='Three'])[1]"));
		
		WebElement one = driver.findElement(By.xpath("(//div[text()='One'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(three).release(one).build().perform();

	}

}
