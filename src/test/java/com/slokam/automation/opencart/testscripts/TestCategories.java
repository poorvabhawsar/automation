package com.slokam.automation.opencart.testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestCategories extends TestBase{

	@Test(groups= {"regression"})
	public void verifyAllcategories() {
		login();
		String expected = "Dashboard";
		String title = driver.getTitle();
		Assert.assertEquals(title, expected);
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		String cat = driver.findElement(By.xpath("//form[@id='form-category']//tbody/tr/td[2]")).getText();
		Assert.assertEquals(cat, "Cameras");
		
		List<WebElement> list = driver.findElements(By.xpath("//form[@id='form-category']//tbody/tr/td[2]"));
		System.out.println(list.size());
		for(WebElement w : list) {
			System.out.println(w.getText());
		}
	}
}
