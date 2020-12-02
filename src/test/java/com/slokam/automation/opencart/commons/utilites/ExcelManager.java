package com.slokam.automation.opencart.commons.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.slokam.automation.opencart.commons.pojo.UserLoginDTO;

public class ExcelManager {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelManager() {
		
		File file = new File("./src/test/resources/Login.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Set<List<String>> getData() {
		Set<List<String>> set = new HashSet<List<String>>();
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);
		
		
		for(int i =2 ;i<totalRows+1;i++) {
			Row row  = sheet.getRow(i);
			Cell cell = row.getCell(2);
			String username1 = getCellData(cell);
			cell = row.getCell(3);
			String password1 = getCellData(cell);
			cell = row.getCell(4);
			String isLogedIn1 = getCellData(cell);
			
			List<String> row1 = new ArrayList<String>();
			row1.add(username1);
			row1.add(password1);
			row1.add(isLogedIn1);
			set.add(row1);
		}
		
		
		return set;
	}
 	
	public Set<UserLoginDTO> getDataAsUserDTO() {
		Set<UserLoginDTO> set = new HashSet<UserLoginDTO>();
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);
		
		
		for(int i =2 ;i<totalRows+1;i++) {
			Row row  = sheet.getRow(i);
			Cell cell = row.getCell(2);
			String username1 = getCellData(cell);
			cell = row.getCell(3);
			String password1 = getCellData(cell);
			cell = row.getCell(4);
			String isLogedIn1 = getCellData(cell);
			
			UserLoginDTO user = new UserLoginDTO();
			user.setUsername(username1);
			user.setPassword(password1);
			user.setIsLogedIn(isLogedIn1);
			set.add(user);
		}
		return set;
	}
	
	private String getCellData(Cell cell) {
		String value = "";
		switch (cell.getCellType()) {
		case STRING:
			value  = cell.getStringCellValue();
			break;
		case BLANK:
			value  = "";
			break;
			
		case BOOLEAN:
			value  = String.valueOf(cell.getBooleanCellValue());
			break;
			
		case NUMERIC:
			value  = String.valueOf((int)cell.getNumericCellValue());
			break;

		default:
			break;
		}
		
		return value;
	}
	public static void main(String[] args) {
		ExcelManager manager = new ExcelManager();
		Set<List<String>> set = manager.getData();
		
		for(List<String> li : set) {
			System.out.print(li.get(0)+ "  ");
			System.out.print(li.get(1)+ "  ");
			System.out.println(li.get(2));
			
		}
		
		
	}
}
