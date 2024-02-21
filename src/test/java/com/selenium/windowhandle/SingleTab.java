package com.selenium.windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		//To get Parent window id
		String parentwindowid = driver.getWindowHandle();
		
		
		//return id of all opened window
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
			
		{
		String id = 	it.next();
		if(!parentwindowid.equalsIgnoreCase(id))
		{
			driver.switchTo().window(id);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		}
		
		}
		
		
		

	}

}
