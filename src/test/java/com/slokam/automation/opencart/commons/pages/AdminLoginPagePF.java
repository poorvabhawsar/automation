package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPagePF extends BasePage{

	WebDriver driver;
	public AdminLoginPagePF(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id="input-username")
	WebElement usernameEle;
	
	@FindBy(name="password")
	WebElement passwordEle;
	
	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	WebElement button;
	
	
	
	public boolean login(String username,String password) {
		usernameEle.sendKeys(username);
		passwordEle.sendKeys(password);
		button.click();
		
		return !isElementPresent(By.cssSelector(".alert.alert-danger"));
	}
}
