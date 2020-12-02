package com.slokam.automation.opencart.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestDocumentation extends TestBase{

	@Test
	public void verifyDocumentHeading() {
		
		login();
		driver.findElement(By.cssSelector(".fa-caret-down")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Documentation')]")).click();
		
		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		String childHandle = "";
		for(String handle : handles) {
			if(!handle.equals(mainHandle)) {
				childHandle = handle;
			}
		}
		driver.switchTo().window(childHandle);
		String st = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(st);
	}
	
	@Test
	public void verifyDocumentHeadingInMultipleWindow() {
		
		login();
		driver.findElement(By.cssSelector(".fa-caret-down")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Documentation')]")).click();
		driver.findElement(By.cssSelector(".fa-caret-down")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Support Forum')]")).click();
		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		String childHandle = "";
		for(String handle : handles) {
			if(!handle.equals(mainHandle)) {
				driver.switchTo().window(handle);
				if(driver.getTitle().contains("OpenCart Documentation")) {
					childHandle = handle;
				}
			}
		}
		driver.switchTo().window(childHandle);
		String st = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(st);
		
		driver.switchTo().window(mainHandle);
	}
	@Test
	public void verifyDocumentHeadingNewWindow() {
		
		login();
		driver.findElement(By.cssSelector(".fa-caret-down")).click();
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Documentation')]"));
		Actions actions  = new Actions(driver);
		actions.sendKeys(Keys.SHIFT).click(element).build().perform();
	}
}
