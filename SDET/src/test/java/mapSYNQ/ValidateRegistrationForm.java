package mapSYNQ;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
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
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		
	}

}

	
	
