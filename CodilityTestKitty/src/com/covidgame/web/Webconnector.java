package com.covidgame.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public interface Webconnector extends CovidWebConnector{
	
	EventFiringWebDriver getDriver();
	void openBrowser(String browser);
	void navigateTo(String Url);
	void quit();
	
	//Covid WebConnector
	void warriorCreation();
	Webconnector validateText(String ExpectedText);
	

}
