package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderandCheckout extends BasePage{

	WebDriver driver;

	public OrderandCheckout(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}
	public void orderPhone() {
			driver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]/span")).click();
			sleep(2);
			driver.findElement(By.cssSelector("#cart-total")).click();
			driver.findElement(By.xpath("//strong[contains(text(),' Checkout')]")).click();
			//driver.findElement(By.name("account")).click();
			driver.findElement(By.id("button-account")).click();
			driver.findElement(By.id("input-payment-firstname")).sendKeys("Person1");
			driver.findElement(By.id("input-payment-lastname")).sendKeys("P");
			driver.findElement(By.id("input-payment-email")).sendKeys("abc.aashdgertsaj@gmail.com");
			driver.findElement(By.id("input-payment-telephone")).sendKeys("9874561023");
			driver.findElement(By.id("input-payment-password")).sendKeys("password");
			driver.findElement(By.id("input-payment-confirm")).sendKeys("password");
			driver.findElement(By.id("input-payment-address-1")).sendKeys("Hyd");
			driver.findElement(By.id("input-payment-city")).sendKeys("Hyderabad");
			driver.findElement(By.id("input-payment-postcode")).sendKeys("500018");
			Select select = new Select(driver.findElement(By.id("input-payment-country")));
			select.selectByVisibleText("India");
			Select select1 = new Select(driver.findElement(By.id("input-payment-zone")));
			select1.selectByVisibleText("Andhra Pradesh");
			//driver.findElement(By.id("button-guest")).click();
			driver.findElement(By.name("agree")).click();
			sleep(2);
			driver.findElement(By.xpath("//*[@id=\"button-register\"]")).click();
			driver.findElement(By.name("comment")).sendKeys("commetestnt");
			driver.findElement(By.id("button-shipping-method")).click();
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.id("button-shipping-method")).click();
			
			
			
			
			
				


			
	}
}
