package com.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();

				driver.get("https://demo.automationtesting.in/Register.html");
				
				WebElement RegisterLink = driver.findElement(By.xpath("//a[text()='WebTable']"));
				
				Actions act = new Actions(driver);
				act.click(RegisterLink).build().perform(); //Build and perform is to complie and run actions class

	}

}
