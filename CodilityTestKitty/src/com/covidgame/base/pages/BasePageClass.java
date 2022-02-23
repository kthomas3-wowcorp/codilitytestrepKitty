package com.covidgame.base.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import com.covidgame.web.Webconnector;
import sessions.CodilitySession;

public class BasePageClass implements BasePageInterface{

	
	public BasePageClass()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	@Override
	public BasePageInterface openBrowser() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public BasePageInterface submitWarriorName(String WarriorName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Webconnector validator() {
		// TODO Auto-generated method stub
		return null;
	}
  
	@Override
	public BasePageInterface navigateToHomePage() {
		
		return null;
	}
	
	@Override
	public BasePageInterface gotoStartPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BasePageInterface navigateToBattlePage() {
		// TODO Auto-generated method stub
	 return null;
	}


	@Override
	public void takeBus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gotoOffice() {
		// TODO Auto-generated method stub
		
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
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

}
