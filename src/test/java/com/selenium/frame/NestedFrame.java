package com.selenium.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
	
		
		//Getting frame count of web page
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frameCount.size());
		
		//switched to outerframe
		
		WebElement outerIframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerIframe);
		
		//getting frame count of outerframe
		
		List<WebElement> outerframe_count = driver.findElements(By.tagName("iframe"));
		
		System.out.println(outerframe_count.size());
		
		driver.switchTo().frame(0);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		textbox.click();
		textbox.clear();
		textbox.sendKeys("Heloo");
		
		driver.switchTo().parentFrame();
		

		List<WebElement> outerframe_count1 = driver.findElements(By.tagName("iframe"));
		
		System.out.println(outerframe_count1.size());
	}

}
