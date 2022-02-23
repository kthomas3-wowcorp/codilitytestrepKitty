package com.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.covidgame.web.Webconnector;

import sessions.CodilitySession;

public class CodilityListener extends AbstractWebDriverEventListener{
	
	WebDriverWait wait = new WebDriverWait(getDriver(),20);
	public CodilityListener()
	{
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public CodilitySession getSession()
	{
		return (CodilitySession)(Reporter.getCurrentTestResult().getTestContext().getAttribute("session"));
	}
	public Webconnector getConnection()
	{
		return getSession().getCon();
	}
	
	public EventFiringWebDriver getDriver()
	{
		return getConnection().getDriver();
	}
	
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("BeforeFindBy"+arg0);
		//wait.until(ExpectedConditions.presenceOfElementLocated(arg0));
		//wait.until(ExpectedConditions.elementToBeClickable(arg1));
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}
}
