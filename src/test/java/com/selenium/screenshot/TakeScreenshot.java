package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://www.google.com/");
		
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
	File src =	screenshot.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\neworkspace\\Selenium7PM\\screenshot\\image"+System.currentTimeMillis()+".png");
	
	FileUtils.copyFile(src, dest);

	}

}
