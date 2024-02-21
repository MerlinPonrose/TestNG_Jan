package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver	driver	 = new FirefoxDriver();
				
		driver.manage().window().maximize();


		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		int rowcount = row.size();
		
List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));
		
		int col_count = col.size();
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=1;j<=col_count;j++)
			{
				WebElement alldata = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));
				System.out.println(alldata.getText());
			}
		}

	}

}
