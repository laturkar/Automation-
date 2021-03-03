package steps;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.loginPageAction;
import utils.SeleniumDriver;

public class LoginSteps {
	
	loginPageAction loginPageAction=new loginPageAction();

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		SeleniumDriver.openPage("http://192.168.205.11:9000/CP/scapp/security");

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		loginPageAction.doLogin(username,password);

	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

	}

	@Then("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page() throws Throwable {
		String ee=SeleniumDriver.getDriver().getTitle();
		System.out.println(ee);

	}

	@Then("^Page Titels should be \"([^\"]*)\"$")
	public void page_Titels_should_be(String arg1) throws Throwable {

	}

}
