package com.slokam.automation.opencart.commons.listeners;

import java.util.Set;

import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start of test cases");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution completed");
		
		 Set<ITestResult> skippedTests  = context.getSkippedTests().getAllResults();
		 Set<ITestResult> failedTests  = context.getFailedTests().getAllResults();
		 
		 for (ITestResult temp : failedTests) {
	            ITestNGMethod method = temp.getMethod();
	            String failClassName = method.getRealClass().getName();
	            try {
	                for (ITestResult iTestResult : skippedTests) {
	                    String skipClassName = iTestResult.getMethod().getRealClass().getName();
	                    if ((skipClassName + iTestResult.getMethod().getMethodName()).equals(failClassName + method.getMethodName())) {
	                        skippedTests.remove(iTestResult);
	                    }
	                }
	            } catch (Exception e) {
	            }
	        }

	        for (ITestResult temp : skippedTests) {
	            ITestNGMethod method = temp.getMethod();
	            if (context.getSkippedTests().getResults(method).size() > 1) {
	                skippedTests.remove(temp);
	            } else {
	                if (context.getPassedTests().getResults(method).size() > 0) {
	                    skippedTests.remove(temp);
	                }
	            }
	        }
	}

	

}
