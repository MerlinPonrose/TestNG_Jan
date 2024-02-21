package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.selenium.pages.RegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration extends BaseClass{
	
	
	
	
	@Test
	public void registerform()
	{
	
	reg.enterFname();
	reg.enterlname();
	reg.enteraddr();
	reg.enteremai();
	reg.Phnenum();
	
	}

}
