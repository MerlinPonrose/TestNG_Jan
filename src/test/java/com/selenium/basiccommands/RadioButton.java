package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.firefoxdriver().setup();
		
WebDriver	driver	 = new FirefoxDriver();
		
driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
	WebElement MaleRadioButton =	driver.findElement(By.xpath("//input[@value='Male']"));
	MaleRadioButton.click();
/*System.out.println(	MaleRadioButton.isSelected());


	WebElement FemaleRadioButton = driver.findElement(By.xpath("//input[@value='FeMale']"));
	System.out.println(FemaleRadioButton.isSelected());
	*/
	
	if(MaleRadioButton.isSelected())
	{
		System.out.println("Male radio is selected");
	}
	else
	{
		System.out.println("not selected");
	}

	}

}
