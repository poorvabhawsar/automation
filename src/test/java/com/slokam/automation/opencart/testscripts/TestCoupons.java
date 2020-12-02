package com.slokam.automation.opencart.testscripts;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminCouponsPage;
import com.slokam.automation.opencart.commons.pages.AdminDashboardPage;
import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestCoupons extends TestBase {
	
	@Test
	public void VerifyStatasticsName() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login(username, password);
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnCoupons();
		AdminCouponsPage adminCouponsPage = new AdminCouponsPage(driver);
		adminCouponsPage.addCoupon();
	}
}
