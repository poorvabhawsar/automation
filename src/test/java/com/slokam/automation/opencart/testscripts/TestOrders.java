package com.slokam.automation.opencart.testscripts;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminDashboardPage;
import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.commons.pages.AdminOrdersPage;
import com.slokam.automation.opencart.commons.pages.AdminReportsPage;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestOrders extends TestBase{

	@Test
	public void test1() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user", "user123");
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnOrders();
		
		AdminOrdersPage adminOrdersPage = new AdminOrdersPage(driver);
		String orderTitle = adminOrdersPage.verifyTitle();
		System.out.println(orderTitle);
		
	}
}
