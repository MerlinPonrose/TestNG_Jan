package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_element {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://www.google.com/");
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Google']"));
File src =		image.getScreenshotAs(OutputType.FILE);

System.out.println(System.getProperty("user.dir"));
File dest = new File(System.getProperty("user.dir")+"\\screenshot\\picture"+System.currentTimeMillis()+".jpeg");

FileUtils.copyFile(src, dest);
	}

}
