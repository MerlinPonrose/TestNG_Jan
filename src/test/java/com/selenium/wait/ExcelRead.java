package com.selenium.wait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File f = new File("C:\\neworkspace\\DataDrivenFramework_Jan\\src\\test\\java\\Resource\\dataa.xlsx");

System.out.println("After file");
		
		FileInputStream fis = new FileInputStream(f);
		
		System.out.println("After file read");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		System.out.println("after workbook");
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int lastRowNum = sheet.getLastRowNum()+1;
		
		System.out.println(lastRowNum);
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		
		
		

	}

}
