package com.covidgame.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import sessions.CodilitySession;

public class Codilitydriver extends Validations{

	
	EventFiringWebDriver driver;
	
	@Override
	public void openBrowser(String browser) {
		
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new com.listener.CodilityListener());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Java\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new EventFiringWebDriver(new FirefoxDriver());
			driver.register(new com.listener.CodilityListener());
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
	}

	@Override
	public void navigateTo(String Url) {
		driver.get(Url);
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
	public CodilitySession getSession(){
		return (CodilitySession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
		
}

	@Override
	public EventFiringWebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}





	
}
