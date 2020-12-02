package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage extends BasePage{

	WebDriver driver;
	public AdminLoginPage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	public boolean login(String username,String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
		
		return !isElementPresent(By.cssSelector(".alert.alert-danger"));
	}
}
