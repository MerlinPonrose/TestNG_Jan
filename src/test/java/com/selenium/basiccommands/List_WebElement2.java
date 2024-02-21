package com.selenium.basiccommands;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://demo.automationtesting.in/Register.html");
				
	List<WebElement>	labels =		driver.findElements(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']"));
	
	
	System.out.println(labels.size());
	
	
	Iterator<WebElement> it = labels.iterator();
	
	while(it.hasNext())
	{
	WebElement reg_label =	it.next();
	System.out.println(reg_label.getText());
	}
	
	}

}
