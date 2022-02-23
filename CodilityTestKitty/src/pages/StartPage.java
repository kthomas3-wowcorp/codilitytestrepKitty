package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.covidgame.base.pages.BasePageClass;
import com.covidgame.base.pages.BasePageInterface;

import constants.Constants;


public class StartPage extends BasePageClass{
	

@FindBy(id=Constants.StartJourneyLink)
private WebElement StartJourneyLink;
	
	
	public BasePageInterface navigateToBattlePage() {
		StartJourneyLink.click();
		return new BattlePage();
		
	}
	

}
