package com.covidgame.base.pages;

import com.covidgame.web.Webconnector;

public interface BasePageInterface extends CovidGameGeneric,CovidGameSession {
    
	//NormalBrowser operations
	BasePageInterface openBrowser();
	void quit();
	void getTotalWindows();
	
	//CovidGame generic operations
	BasePageInterface  submitWarriorName(String WarriorName);
	BasePageInterface navigateToHomePage();
	BasePageInterface gotoStartPage();
	BasePageInterface navigateToBattlePage();
	Webconnector validator();	
	
	//CovidGame session based operations
	void takeBus();
	void gotoOffice();
	
	
	
}
