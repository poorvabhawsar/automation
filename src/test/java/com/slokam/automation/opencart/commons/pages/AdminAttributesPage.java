package com.slokam.automation.opencart.commons.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminAttributesPage {
	WebDriver driver;

	public AdminAttributesPage(WebDriver driver) {
		this.driver = driver;

	}

	

	public List<String> getAttributesList() {
		List<String> types = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table-bordered table-hover']/tbody/tr/td[2]"));
		System.out.println(list.size());
		for (WebElement w : list) {
			types.add(w.getText());
		}
		return types;
	}
}
