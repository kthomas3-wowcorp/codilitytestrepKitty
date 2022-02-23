package com.covidgame.web;

import org.testng.asserts.SoftAssert;

public  abstract class Validations implements Webconnector{
	
	@Override
	public void warriorCreation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Webconnector validateText(String ExpectedText) {
	
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue((ExpectedText.chars().count()<=10), "WarriorName exceeds 10 characters");
		softAssert.assertAll();
		return new Codilitydriver();
	}

	

}
