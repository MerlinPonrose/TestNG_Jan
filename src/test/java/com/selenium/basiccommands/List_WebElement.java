package com.selenium.basiccommands;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://www.google.com/");
				
				
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	Iterator<WebElement> it = links.iterator();
	
	while(it.hasNext())
	{
	WebElement link = 	it.next();
	System.out.println(link.getText());
	if(link.getText().equalsIgnoreCase("Gmail"))
	{
		System.out.println("Gmail link is available");
	}
	
	}

	}

}
