package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.covidgame.base.pages.BasePageClass;
import com.covidgame.base.pages.BasePageInterface;


public class DataProvide extends BasePageClass{
    
	@Test(dataProvider = "getData")
	public BasePageInterface submitWarriorName(String Browser, String WarriorName)
	{
		
		return this;
		
	}
	
	@DataProvider
	public static Object[][] getData(){
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Firefox";
		data[0][1]="Test";
		return data;
		
	}
}
