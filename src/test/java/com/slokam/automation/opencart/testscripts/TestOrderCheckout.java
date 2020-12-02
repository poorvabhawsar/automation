package com.slokam.automation.opencart.testscripts;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.OrderandCheckout;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestOrderCheckout extends TestBase {

	@Test
	public void verifyIphone() {

		OrderandCheckout orderandCheckout = new OrderandCheckout(driver);
		orderandCheckout.orderPhone();
	}
}
