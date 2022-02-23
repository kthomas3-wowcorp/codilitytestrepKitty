package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		System.out.println("Test Name:"+ result.getName());
	;
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
		System.out.println("Test Status:"+result.getStatus());
		System.out.println(result.getStatus());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println("Test Name:"+ result.getName());
		System.out.println("Test Status:"+result.getStatus());
		System.out.println(result.getThrowable().getMessage());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
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
