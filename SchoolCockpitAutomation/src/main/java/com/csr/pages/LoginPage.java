package com.csr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By loginId = By.id("loginName");
	private By password = By.id("password");
	private By loginIdButton = By.xpath("//*[@id=\"tblLogin\"]/tbody/tr[6]/td[3]/img");
	

public LoginPage(WebDriver driver) {
	this.driver = driver;
}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd){
		System.out.println("Login with" +un + "and" +pwd);
		driver.findElement(loginId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginIdButton).click();
		return new HomePage(driver);

	}

	


}

