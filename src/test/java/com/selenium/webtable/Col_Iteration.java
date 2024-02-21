package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Col_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
		
		int col_count = col.size();
		
		for(int i=1;i<=col_count;i++)
		{
			WebElement coll = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td["+i+"]"));
			System.out.println(coll.getText());
		}

	}

}
