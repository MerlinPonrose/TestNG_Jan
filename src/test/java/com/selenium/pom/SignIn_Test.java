package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn_Test extends BaseClass{

	
	@Test
	public void signIn()
	{
	sigin.enteremail();
	
	sigin.enterpass();
	
	sigin.cicksubmit();
	
	hmpg.verifyhmepagetite();
	
	hmpg.CickAddTCart();
	
	}

}
