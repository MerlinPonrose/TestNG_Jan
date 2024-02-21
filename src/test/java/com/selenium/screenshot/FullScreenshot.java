package com.selenium.screenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenshot {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://www.google.com/");
		
		Robot r = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage src = r.createScreenCapture(rect);
		
		File dest = new File("C:\\neworkspace\\Selenium7PM\\screenshot\\pic.png");
		
		ImageIO.write(src, "png", dest);
		
	}

}
