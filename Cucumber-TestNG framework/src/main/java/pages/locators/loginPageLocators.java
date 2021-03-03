package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageLocators {
	
	@FindBy(how=How.ID,using="loginName")
	public WebElement loginName;
	
	@FindBy(how=How.ID,using="password")
	public WebElement passWord;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tblLogin\"]/tbody/tr[6]/td[3]/img")
	public WebElement loginButton;
	
	
}
