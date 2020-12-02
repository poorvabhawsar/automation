package com.slokam.automation.opencart.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestP  {

	WebDriver driver;
	// @Test
	public void verifyCreateProduct() {
		//login();
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();

		driver.findElement(By.cssSelector(".fa-plus")).click();

		String product = "mnl";
		String metaTag = product + "-tag";
		String model = product + "- model";
		driver.findElement(By.cssSelector("#input-name1")).sendKeys(product);
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys(metaTag);
		driver.findElement(By.xpath("//a[text()='Data']")).click();
		driver.findElement(By.cssSelector("#input-model")).sendKeys(model);
		driver.findElement(By.cssSelector(".fa-save")).click();

		String message = driver.findElement(By.cssSelector(".alert")).getText();
		System.out.println(message);
	}

	// @Test
	public void verifyCreateProduct2() {
		//login();
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		driver.findElement(By.cssSelector(".fa-plus")).click();
		String product = "abc";
		String metaTag = product + "-tag";
		String model = product + "- model";
		driver.findElement(By.cssSelector("#input-name1")).sendKeys(product);
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys(metaTag);
		driver.findElement(By.xpath("//a[text()='Data']")).click();
		driver.findElement(By.cssSelector("#input-model")).sendKeys(model);
		driver.findElement(By.cssSelector(".fa-save")).click();
		String message = driver.findElement(By.cssSelector(".alert")).getText();
		System.out.println(message);
	}

	// @Test
	public void verifyCreateProduct3() {
		//login();
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		driver.findElement(By.cssSelector(".fa-plus")).click();
		String product = "xyz";
		String metaTag = product + "-tag";
		String model = product + "- model";
		driver.findElement(By.cssSelector("#input-name1")).sendKeys(product);
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys(metaTag);
		driver.findElement(By.xpath("//a[text()='Data']")).click();
		driver.findElement(By.cssSelector("#input-model")).sendKeys(model);
		driver.findElement(By.cssSelector(".fa-save")).click();
		String message = driver.findElement(By.cssSelector(".alert")).getText();
		System.out.println(message);
	}

	@Test(dataProvider = "productDP")
	public void verifyCreateProductDataProvider(String product, String metaTag, String model) {

		System.out.print(product);
		System.out.print("  " + metaTag);
		System.out.println("  " + model);
		// login();
		// driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		// driver.findElement(By.cssSelector(".fa-plus")).click();
		// driver.findElement(By.cssSelector("#input-name1")).sendKeys(product);
		// driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys(metaTag);
		// driver.findElement(By.xpath("//a[text()='Data']")).click();
		// driver.findElement(By.cssSelector("#input-model")).sendKeys(model);
		// driver.findElement(By.cssSelector(".fa-save")).click();
		//
		// String message = driver.findElement(By.cssSelector(".alert")).getText();
		// System.out.println(message);
	}

	@DataProvider(name = "productDP")
	public Object[][] dp() {
		
		init();
		int rows = getNumberOfRows();
		Object[][] obj = new Object[rows][3];
		for (int i = 0; i < rows; i++) {
			obj[i][0] = readData(i + 1, 1);
			obj[i][1] = readData(i + 1, 2);
			obj[i][2] = readData(i + 1, 3);
		}

		return obj;
	}

	public int getNumberOfRows() {
		int total = sheet.getPhysicalNumberOfRows();
		return total-1;
	}

	XSSFSheet sheet = null;
	XSSFWorkbook workbook = null;
	
	public void init() {
		File file = new File("C:\\Bharath\\product.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public String readData(int rowNum, int columnNum) {
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(columnNum);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		int cells = row.getPhysicalNumberOfCells();
		return value;
	}
	
	

	public static void main(String[] args) {
		TestP t = new TestP();
		t.readData(2, 1);
	}
}
