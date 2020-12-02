package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.slokam.automation.opencart.commons.enums.Navigation;

public class AdminDashboardPage {
	public static final String SALES="Sales";
	public static final String REPORTS="Reports";
	public static final String STATISTICS="Statistics";
	WebDriver driver;
	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnOrders() {
		driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
	}
	public void clickOnCategories() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
	}
	
	public void clickOnStatistics() {
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Statistics')]")).click();
	}

	public void clickOnAttributes() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Attributes')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Attributes')]//li[2]")).click();
	}
	public void clickOnCoupons() {
		driver.findElement(By.xpath("//a[contains(text(),'Marketing')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
	}


	public void clickOnProducts() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
	
	
/*	public void clickOnNavigationOption(String item,String subItem) {
		driver.findElement(By.xpath("//a[contains(text(),'"+item+"')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+subItem+"')]")).click();
	}*/
	
	public void clickOnNavigationOption(Navigation navi) {
		driver.findElement(By.xpath("//a[contains(text(),'"+navi.getItem()+"')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+navi.getSubItem()+"')]")).click();
	}
}
