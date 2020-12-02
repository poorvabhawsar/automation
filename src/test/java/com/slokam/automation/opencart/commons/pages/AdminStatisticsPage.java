package com.slokam.automation.opencart.commons.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminStatisticsPage {
	WebDriver driver;
	public AdminStatisticsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public List<String> getStatisticsTypes() {
		List<String> types = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		System.out.println(list.size());
		for (WebElement w : list) {
			types.add(w.getText());
		}
		return types;
	}
}
