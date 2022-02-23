package testcases;

import org.testng.annotations.Test;
import sessions.CodilitySession;


public class GotoOfficeBattle{
	
	@Test
	public void gotoOffice()  {
		
		CodilitySession session = new CodilitySession();
		session.
		init().
		openBrowser().//Implemented in LaunchPage
		navigateToHomePage().//Implemented in LaunchPage
		gotoStartPage().navigateToBattlePage().gotoOffice();
	}
		
	

}

