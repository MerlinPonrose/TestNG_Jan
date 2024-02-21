package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_cancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


				driver.get("https://demo.automationtesting.in/Alerts.html");
				
	
				driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
				
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
			Alert alert = driver.switchTo().alert();
			
			Thread.sleep(5000);
			
			alert.dismiss();
	}

}
