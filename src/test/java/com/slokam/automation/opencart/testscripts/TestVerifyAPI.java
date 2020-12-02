package com.slokam.automation.opencart.testscripts;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestVerifyAPI extends TestBase{

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test
	public void verifyAPIStatus() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("sdf", "sdfds");
	}
	
	@Test
	public void test3() {
		System.out.println("I am test3");
	}
	
	@Test
	public void test4() {
		System.out.println("I am test4");
	}
}
