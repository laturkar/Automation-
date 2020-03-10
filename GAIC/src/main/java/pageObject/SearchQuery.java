package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchQuery {
	
	public WebDriver driver;
	By search=By.id("txtGlobalSearch");
	
	public  SearchQuery(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getSearchTextBox(){
		return driver.findElement(search);
		}
}
