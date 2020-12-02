package com.slokam.automation.opencart.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.enums.Navigation;
import com.slokam.automation.opencart.commons.pages.AdminDashboardPage;
import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.commons.pages.AdminStatisticsPage;
import com.slokam.automation.opencart.commons.utilites.DataManager;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestStatistics extends TestBase{

	@Test
	public void VerifyStatasticsName() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login(username, password);
		
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.clickOnNavigationOption(Navigation.STATISTICS);
		
		AdminStatisticsPage adminStatisticsPage = new AdminStatisticsPage(driver);
		List<String> actualTypes = adminStatisticsPage.getStatisticsTypes();
		List<String> expected = new ArrayList<String>();
		expected.add("Order Sales");
		expected.add("Orders Processing");
		expected.add("Orders Complete");
		expected.add("Orders Other");
		expected.add("Returns");
		expected.add("Out of stock products");
		expected.add("Pending Reviews");
		
		boolean result = DataManager.compareLists(actualTypes, expected);
		Assert.assertTrue(result);
		
	}
	
	
}
