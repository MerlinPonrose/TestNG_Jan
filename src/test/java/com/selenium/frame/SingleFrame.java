package com.selenium.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.automationtesting.in/Frames.html");
		
	//	driver.switchTo().frame("singleframe");
		
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		
		driver.switchTo().frame(iframe);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		textbox.click();
		textbox.clear();
		textbox.sendKeys("Helo");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	}

}
