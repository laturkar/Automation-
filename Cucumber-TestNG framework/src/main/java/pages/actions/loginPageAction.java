package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.loginPageLocators;
import utils.SeleniumDriver;

public class loginPageAction {
	
	loginPageLocators loginPageLocators=null;
	
	public  loginPageAction()
	{
		//this.driver=driver;
		this.loginPageLocators= new loginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
	}
	
	

	public void doLogin(String username, String password) throws InterruptedException {
		
		
		loginPageLocators.loginName.sendKeys(username);
		loginPageLocators.passWord.sendKeys(password);
		loginPageLocators.loginButton.click();
		Thread.sleep(2000);
	}
	

}
