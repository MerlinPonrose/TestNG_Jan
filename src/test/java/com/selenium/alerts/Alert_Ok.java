package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Ok {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


				driver.get("https://demo.automationtesting.in/Alerts.html");
				
		WebElement alert_button =		driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_button.click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
	alert.accept();
				

	}

}
