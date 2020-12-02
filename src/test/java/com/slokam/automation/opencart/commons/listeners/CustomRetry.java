package com.slokam.automation.opencart.commons.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetry implements IRetryAnalyzer{

	int count = 4;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count==0) {
			return false;
		}else {
			count--;
			return true;
		}
	}

}
