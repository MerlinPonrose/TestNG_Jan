package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		
WebDriver	driver	 = new FirefoxDriver();
		
driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
	WebElement fileupload =	driver.findElement(By.id("imagesrc"));
	fileupload.sendKeys("d:\\Karen Amy\\Desktop\\Screen.png");
		
	}

}
