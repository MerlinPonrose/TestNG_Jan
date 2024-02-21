package com.selenium.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
			
			WebDriver	driver	 = new FirefoxDriver();
					
			driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2500,0)", "");
		

		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(-2500,0)", "");
		
	}

}
