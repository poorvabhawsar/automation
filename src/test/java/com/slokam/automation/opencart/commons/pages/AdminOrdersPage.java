package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.WebDriver;

public class AdminOrdersPage {

	WebDriver driver;
	public AdminOrdersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
}
