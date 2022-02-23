package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.covidgame.base.pages.BasePageClass;
import com.covidgame.base.pages.BasePageInterface;
import com.covidgame.web.Codilitydriver;
import com.covidgame.web.Webconnector;

import constants.Constants;


public class HomePage extends BasePageClass{

	
	@FindBy(id=Constants.UserName)
	private WebElement UserName;
	@FindBy(id=Constants.CreateWarriorLink)
	private WebElement CreateWarriorLink;
	
	public BasePageInterface gotoStartPage()
	{   
		Webconnector con = new Codilitydriver();
		con.validateText(Constants.WarriorName);
		UserName.sendKeys(Constants.WarriorName);
		CreateWarriorLink.click();
		return new StartPage();
	}
}
