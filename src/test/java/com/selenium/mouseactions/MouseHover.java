package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
			
			WebDriver	driver	 = new FirefoxDriver();
					
			driver.manage().window().maximize();

					driver.get("https://www.firstcry.com/");
					
					WebElement boysFashion_link = driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
					
					Actions act = new Actions(driver);
					
					act.moveToElement(boysFashion_link).build().perform();
					
					Thread.sleep(15000);
					
					WebElement tshirt = driver.findElement(By.xpath("(//a[text()='Jeans & Trousers'])[2]"));
					tshirt.click();
					

	}

}
