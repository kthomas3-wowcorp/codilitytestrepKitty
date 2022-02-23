package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.covidgame.base.pages.BasePageClass;
import constants.Constants;

public class BattlePage extends BasePageClass{
	
	Actions actions = new Actions(getDriver());
	@FindBy(id=Constants.TakeBusLink)
	private WebElement TakeBusLink;
	@FindBy(id=Constants.StartBusTimer)
	private WebElement StartBusTimer;
	@FindBy(xpath=Constants.BusAnswer1)
	private WebElement BusAnswer1;
	@FindBy(id=Constants.LeaderBoardLink)
	private WebElement LeaderBoardLink;
	@FindBy(id=Constants.GotoOfficeLink)
	private WebElement GotoOfficeLink;
	@FindBy(xpath=Constants.GotoOfficeTimer)
	private WebElement GotoOfficeTimer;
	@FindBy(id=Constants.GotoOfficeAnswer1)
	private WebElement GotoOfficeAnswer1;
	
		
	public void takeBus(){  
		TakeBusLink.click();
		StartBusTimer.click();
		actions.moveToElement(BusAnswer1).click().perform();
		//LeaderBoardLink.click();	
	}
	
	public void gotoOffice(){
		GotoOfficeLink.click();
		GotoOfficeTimer.click();
		actions.moveToElement(GotoOfficeAnswer1).click().perform();
		//LeaderBoardLink.click();
	}

}
