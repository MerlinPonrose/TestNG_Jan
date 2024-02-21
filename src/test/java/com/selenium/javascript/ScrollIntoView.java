package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();



				driver.get("https://www.amazon.in/ref=nav_logo");
				
				WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
				searchbox.click();
				searchbox.clear();
				searchbox.sendKeys("Mobiles");
				searchbox.sendKeys(Keys.ENTER);
				
				Thread.sleep(3000);
				
				WebElement poco_mobile = driver.findElement(By.xpath("//span[text()='POCO C55 (Cool Blue, 6GB RAM, 128GB Storage)']"));

				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", poco_mobile);
				
				Thread.sleep(5000);
				
				WebElement BuyAgain_link = driver.findElement(By.xpath("//a[text()='Buy Again']"));
				
				JavascriptExecutor js1 = (JavascriptExecutor)driver;
				js1.executeScript("arguments[0].scrollIntoView();", BuyAgain_link);
	}

}
