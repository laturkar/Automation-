package mapSYNQ;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObject.RegistrationPage;
import resource.Base;

public class ValidateRegistrationForm extends Base {
	


	private static Logger log= LogManager.getLogger(Base.class.getName());

	public WebDriver driver;	
	
	@Test
	public void validateRegistration() throws IOException 
	{
		driver= InitializeDriver();
		driver.get(prop.getProperty("url"));
		RegistrationPage rp= new RegistrationPage(driver);
		rp.getRegister().click();
		log.info("opened registration form");
		rp.getFirstName().sendKeys("Ambika");
		rp.getLastName().sendKeys("Laturkar");
		Select s= new Select(driver.findElement(By.id("profile_country")));
		s.selectByValue("India");
		rp.getAddress().sendKeys("Shastrinagar");
		rp.getContactNo().sendKeys("9762288356");
		driver.findElement(By.id("profile_gender_F")).click();
		driver.findElement(By.id("profile_email")).sendKeys("ambikalaturkar@gmail.com");
		driver.findElement(By.id("profile_dob")).click();
		
		Select s1= new Select(driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")));
		s1.selectByValue("4");
		
		Select s2= new Select(driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-year']")));
		s2.selectByValue("1994");
		
		List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
		int count=driver.findElements(By.className("ui-state-default")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("identity[password_confirmation]")).sendKeys("Password123");
	//	driver.findElement(By.id("profile_subscribe_to_newsletter")).click();
		//Assert.assertFalse(driver.findElement(By.id("profile_subscribe_to_newsletter")).isSelected());
		driver.findElement(By.id("chk_agree")).click();
      Assert.assertTrue(driver.findElement(By.id("chk_agree")).isSelected());
		driver.findElement(By.name("commit")).click();
	}
	
	/*@AfterTest
	public void teardown()
	{
		driver.close();
		
	}*/

}

	
	
