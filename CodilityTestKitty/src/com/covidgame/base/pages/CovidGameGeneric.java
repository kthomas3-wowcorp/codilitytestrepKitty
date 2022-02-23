package com.covidgame.base.pages;

import com.covidgame.web.Webconnector;

public interface CovidGameGeneric {

	//CovidGame generic operations
		BasePageInterface  submitWarriorName(String WarriorName);
		BasePageInterface navigateToHomePage();
		BasePageInterface gotoStartPage();
		BasePageInterface navigateToBattlePage();
		Webconnector validator();		
		
}
