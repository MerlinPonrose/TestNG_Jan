package com.selenium.basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		WebDriverManager.chromedriver().setup();
		
WebDriver	driver	 = new ChromeDriver();
		
driver.manage().window().maximize();

		driver.get("https://www.amazon.in/ref=nav_logo");
		
	String title =	driver.getTitle();
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
		
	
	System.out.println(driver.getPageSource());
		driver.close();
		
		
	}

}
