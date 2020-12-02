package com.slokam.automation.opencart.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestReviews extends TestBase{

	
	
	@Test
	public void verifyReviews() {
		login(); 
		String expected = "Dashboard";
		String title = driver.getTitle();
		Assert.assertEquals(title, expected);

		// click catalog

		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Reviews')]")).click();
		String message  = driver.findElement(By.xpath("//form[@id='form-review']//tbody/tr/td")).getText();
		Assert.assertEquals(message, "No results!");
	}
}
