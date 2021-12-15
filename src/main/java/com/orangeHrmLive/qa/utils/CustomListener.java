package com.orangeHrmLive.qa.utils;

import org.testng.ITestListener;

import com.orangeHrmLive.qa.TestBase.TestBase;

import org.testng.ITestContext;

import org.testng.ITestResult;



public class CustomListener extends TestBase implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {

		logger.info("..........Test execution for " + result.getMethod().getMethodName() + " started...........");
	

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		logger.info("Test " + result.getMethod().getMethodName() + " Passed....");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		logger.info(
				"..........Test " + result.getMethod().getMethodName() + " Failed...........Taking Screen Shot!!!!!");

		Utils.failedTestScreenShot(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		logger.info("..........Test " + result.getMethod().getMethodName() + " Execution Skipped!!!!!");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}


}