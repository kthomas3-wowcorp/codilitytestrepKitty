package testcases;



import org.testng.annotations.Test;
import sessions.CodilitySession;


public class TaketheBusBattle {
	
	@Test
	public void takeBus()  {
		
	     
	
		CodilitySession session = new CodilitySession();
		session.
		init().
		openBrowser().//Implemented in LaunchPage
		navigateToHomePage().//Implemented in LaunchPage
		gotoStartPage().navigateToBattlePage().takeBus();
		
		
		
		
	}
		
	

}
