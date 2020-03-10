package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	
	public WebDriver driver;
	By register= By.cssSelector("a[href*='profiles']");
	By firstname = By.id("profile_first_name");
	By lastname= By.id("profile_last_name");
	By address= By.id("profile_address");
	By contactno= By.id("profile_contact_no");
	
	public  RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement getRegister(){
		return driver.findElement(register);
		
	
	}
	
	public WebElement getFirstName(){
		return driver.findElement(firstname);
		
	
	}
	
	public WebElement getLastName(){
		return driver.findElement(lastname);
	
	}
	
	
	public WebElement getAddress(){
		return driver.findElement(address);
	
	}
	
	public WebElement getContactNo(){
		return driver.findElement(contactno);
	
	}
	
}
