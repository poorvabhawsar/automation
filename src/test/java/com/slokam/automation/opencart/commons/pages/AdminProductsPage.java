package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.slokam.automation.opencart.commons.utilites.AutoItUtil;
import com.slokam.automation.opencart.commons.utilites.AutomationUtils;

public class AdminProductsPage extends BasePage{

	WebDriver driver ;
	public AdminProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	public void editProduct(String productName) {
		String xpath = "//td[text()='"+productName+"']/following-sibling::td/a[@data-original-title='Edit']";
		
		boolean flag = true;
		while(flag) {
			if(isElementPresent(By.xpath(xpath))) {
				driver.findElement(By.xpath(xpath)).click();
				break;
			}else {
				if(isElementPresent(By.xpath("//a[text()='>']"))) {
					driver.findElement(By.xpath("//a[text()='>']")).click();
				}else {
					System.out.println(productName + " is not available");
				}
			}
		}
	}
	
	public void updateImage(String imagePath) {
		driver.findElement(By.xpath("//a[text()='Image']")).click();
		driver.findElement(By.cssSelector("#thumb-image")).click();
		driver.findElement(By.cssSelector("#button-image .fa-pencil")).click();
		driver.findElement(By.cssSelector("#button-upload")).click();
		AutoItUtil au = new AutoItUtil();
		au.uploadFile("C:\\Users\\bkristip\\Pictures\\a.png");
		AutomationUtils.sleep(5);
		driver.switchTo().alert().accept();
	}
	
}
