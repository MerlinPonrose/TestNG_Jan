package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In before suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("In before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("In befor class");
	}
	
	@BeforeMethod
	public void launchbrowser()
	{
		System.out.println("In before method");
		
	}
	

	@AfterMethod
	public void closebrowser()
	{
		System.out.println("In after method");
		
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("In after class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("In after test");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("In after suite");
	}


}
