package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	
	public WebDriver driver;
	By register= By.cssSelector("a[href*='profiles']");
	
	
	public  RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement getRegister(){
		return driver.findElement(register);
		
	
	}
}
