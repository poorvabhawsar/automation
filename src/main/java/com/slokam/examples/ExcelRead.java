package com.slokam.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public void test1() {
		
		File file = new File("D://Login.xls");
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(file);
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			HSSFRow row = sheet.getRow(2);
			HSSFCell cell = row.getCell(2);
			String val = cell.getStringCellValue();
			System.out.println(val);
			
			HSSFCell cell1 = row.getCell(1);
			double  db = cell1.getNumericCellValue();
			System.out.println(db);
			int i = (int)db;
			System.out.println(i);
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public void test2() {
		
		File file = new File("D://Login.xlsx");
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(2);
			XSSFCell cell = row.getCell(2);
			String val = cell.getStringCellValue();
			System.out.println(val);
			
			XSSFCell cell1 = row.getCell(1);
			double  db = cell1.getNumericCellValue();
			System.out.println(db);
			int i = (int)db;
			System.out.println(i);
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ExcelRead read = new ExcelRead();
		read.test2();
	}
}
