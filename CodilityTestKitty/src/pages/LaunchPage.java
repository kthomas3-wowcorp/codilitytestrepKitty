package pages;

import com.covidgame.base.pages.BasePageClass;
import com.covidgame.base.pages.BasePageInterface;
import constants.Constants;

public class LaunchPage extends BasePageClass{
	
	
	
		public BasePageInterface openBrowser(){
			getConnection().openBrowser(Constants.Browser);
			return this;
		}
		
		public BasePageInterface navigateToHomePage(){
			getConnection().navigateTo("https://responsivefight.herokuapp.com/");
			return new HomePage();
		}


}