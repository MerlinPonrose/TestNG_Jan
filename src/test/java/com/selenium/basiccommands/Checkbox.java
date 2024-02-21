package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		
WebDriver	driver	 = new ChromeDriver();
		
driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
WebElement Movie_checkbox =		driver.findElement(By.id("checkbox2"));

Movie_checkbox.click();

System.out.println(Movie_checkbox.isSelected());

Movie_checkbox.click();

System.out.println(Movie_checkbox.isSelected());

	}

}
