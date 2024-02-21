package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.firefoxdriver().setup();
			
			WebDriver	driver	 = new FirefoxDriver();
					
			driver.manage().window().maximize();



					driver.get("https://demo.nopcommerce.com/");
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(0,2500)", "");
					
					Thread.sleep(5000);
					
					WebElement computer = driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
					
					JavascriptExecutor js1 = (JavascriptExecutor)driver;
					js1.executeScript("arguments[0].scrollIntoView();", computer);
					
	}

}
