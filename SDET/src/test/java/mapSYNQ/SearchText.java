package mapSYNQ;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.SearchQuery;
import resource.Base;


public class SearchText extends Base{

	private static Logger log= LogManager.getLogger(Base.class.getName());

	public WebDriver driver;
	
	@Test
	public void validateSearching() throws IOException 
	{
	driver= InitializeDriver();
	driver.get(prop.getProperty("url"));
	SearchQuery sq= new SearchQuery(driver);
	sq.getSearchTextBox().sendKeys("Singapore");
	log.info("Entered query in search text box");
	
}

 @AfterTest
public void teardown()
{
	driver.close();
	
}

}
