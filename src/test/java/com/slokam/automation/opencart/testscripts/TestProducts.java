package com.slokam.automation.opencart.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminDashboardPage;
import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.commons.pages.AdminProductsPage;
import com.slokam.automation.opencart.commons.utilites.AutomationUtils;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestProducts extends TestBase{

	
	@Test
	public void verifyProductDetails() {
		login();
		String expected = "Dashboard";
		String title = driver.getTitle();
		Assert.assertEquals(title, expected);

		// click catalog

		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();

		title = driver.getTitle();
		System.out.println(title);

		String productName = "iPhone";
		driver.findElement(By.xpath(
				"//td[text()='" + productName + "']//following-sibling::td//a[contains(@data-original-title,'Edit')]"))
				.click();

		driver.findElement(By.xpath("//a[text()='Data']")).click();

		String price = driver.findElement(By.name("price")).getAttribute("value");
		System.out.println(price);

		System.out.println(price);
		// wrapper classes

		double dp = Double.parseDouble(price);
		System.out.println(dp);
		dp = dp + 1;
		System.out.println(dp);
		price = String.valueOf(dp);
		driver.findElement(By.name("price")).sendKeys(price);
		driver.findElement(By.xpath("//button[contains(@data-original-title,'Save')]")).click();
		String successMessage = driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(successMessage);

		driver.get("https://localhost/opencart/");
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector(".fa-search")).click();
		driver.findElement(By.xpath("//img[@title='" + productName + "']")).click();

		String origPriceString = driver.findElement(By.xpath("//li[contains(text(),'Ex Tax:')]")).getText();
		System.out.println(origPriceString);
		String ar[] = origPriceString.split("$");

		String origPrice = ar[1];
		double dd = Double.parseDouble(origPrice);
		System.out.println(dd);
		System.out.println(price);
	}

	@Test
	public void verifyCreateProduct() {
		login();
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();

		driver.findElement(By.cssSelector(".fa-plus")).click();

		String product = AutomationUtils.randomAlphaNumeric(5);
		String metaTag = product + "-tag";
		String model = product + "- model";
		driver.findElement(By.cssSelector("#input-name1")).sendKeys(product);
		driver.findElement(By.cssSelector("#input-meta-title1")).sendKeys(metaTag);
		driver.findElement(By.xpath("//a[text()='Data']")).click();
		driver.findElement(By.cssSelector("#input-model")).sendKeys(model);

		WebElement selectTaxElement = driver.findElement(By.cssSelector("#input-tax-class"));
		Select select = new Select(selectTaxElement);
		select.selectByVisibleText("Taxable Goods");
		select.selectByValue("10");
		select.selectByIndex(1);

		Select selectOutofStock = new Select(driver.findElement(By.cssSelector("#input-stock-status")));
		WebElement ele = selectOutofStock.getFirstSelectedOption();
		System.out.println(ele.getText());
		driver.findElement(By.cssSelector(".fa-save")).click();

		String message = driver.findElement(By.cssSelector(".alert")).getText();
		System.out.println(message);
	}

	
	
	@Test
	public void updateImageTest() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user", "user123");
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnProducts();
		
		AdminProductsPage adminProductsPage = new AdminProductsPage(driver);
		adminProductsPage.editProduct("xyz");
		adminProductsPage.updateImage("sad");
		
		
	}

}
