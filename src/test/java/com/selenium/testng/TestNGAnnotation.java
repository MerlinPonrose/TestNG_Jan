package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotation extends BaseClass{
	

	
	
	
	@Test
	public void getText()
	{
		System.out.println("Inside test case 2");
		
			
	}
	
	@Test
	public void fileupload()
	{
		System.out.println("Inside test case 1");

	}
	
	@Test
	public void apple()
	{
		System.out.println("Inside apple");
	}
}
