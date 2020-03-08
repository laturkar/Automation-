package mapSYNQ;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

import org.testng.annotations.DataProvider;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.Base;

public class HomePage extends Base {
	
	

private static Logger log= LogManager.getLogger(Base.class.getName());
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password) throws IOException {
		
		driver= InitializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		log.info("Entered log in information");
		 		
	}
	 	 
	 @DataProvider
	 public Object[][] getData()
	 {
		 
		Object[][] data = new Object[2][2]; 
	    
		data[0][0]="ambika@gmail.com";
		data[0][1]="1234";
		
		data[1][0]="abhay@gmail.com";
		data[1][1]="123456";
	
		return data;
		
	 }
	 
	
	 @AfterTest
		public void teardown()
		{
			driver.close();
			driver=null;
		}	


}
