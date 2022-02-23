package sessions;

import org.testng.Reporter;
import com.covidgame.base.pages.BasePageInterface;
import com.covidgame.web.Codilitydriver;
import com.covidgame.web.Webconnector;
import pages.LaunchPage;


public class CodilitySession {
	
	Webconnector con;
	public CodilitySession()
	{
		con=new Codilitydriver();
	}
	public BasePageInterface init() {	
   
		  if(Reporter.getCurrentTestResult().getTestContext().getAttribute("session")==null)
		    Reporter.getCurrentTestResult().getTestContext().setAttribute("session",this);		  
		  
		  BasePageInterface page = new LaunchPage();
		  return page;		
	}	
	
	public Webconnector getCon() {
		return con;
	}

}
