package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_Map {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File f = new File("C:\\neworkspace\\DataDrivenFramework_Jan\\src\\test\\java\\Resource\\dataa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		short colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		HashMap map = new HashMap();
		
		DataFormatter format = new DataFormatter();
		
		map.put(format.formatCellValue(sheet.getRow(0).getCell(0)), sheet.getRow(0).getCell(1));
		map.put(sheet.getRow(0).getCell(1), sheet.getRow(1).getCell(1));
		
		
		
		
		

	}

}
