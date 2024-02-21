package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Row_Col_DynamicWebTable {

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
				WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));
				String value = data.getText();
				
				if(value.equalsIgnoreCase("Marico Ltd."))			
				{
					System.out.println("row="+i);
					System.out.println("col="+j);
				}
			}
		}

	}

}
