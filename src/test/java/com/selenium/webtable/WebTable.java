package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
	//	List<WebElement> row = table.findElements(By.tagName("tr"));
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		int rowcount = row.size();
		
		System.out.println(rowcount);
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
		
		System.out.println(col.size());

	}

}
