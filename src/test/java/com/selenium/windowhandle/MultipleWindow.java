package com.selenium.windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		
		
		String parentId = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		System.out.println(list.size());
		
		driver.switchTo().window(list.get(2));
		
	}

}
