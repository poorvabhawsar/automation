package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCouponsPage {
	WebDriver driver;
	public AdminCouponsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void addCoupon() {
		driver.findElement(By.cssSelector(".fa-plus")).click();
		driver.findElement(By.name("name")).sendKeys("Coupon1");
		driver.findElement(By.name("code")).sendKeys("Coupon1");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		
	}
}
