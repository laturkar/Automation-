package stepDefinition;

import com.csr.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.csr.factory.DriverFactory;
import com.csr.pages.LoginPage;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	WebDriver driver;
	private static String title,title1;
	private HomePage homePage;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("http://192.168.205.11:9000/CP/scapp/security");
	    String loginTitle = loginPage.getPageTitle();
	    System.out.println(loginTitle);
	
	}

	@When("user pass home page using")
	public void user_pass_home_page_using_csr005000001_and_password1() {
		loginPage.login("CSR005000001","password1");
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getPageTitle();
		System.out.println("Page Title is:" +title);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be_school_cockpit_application(String expectedTitleName) throws InterruptedException {

		Assert.assertTrue(title.contains(expectedTitleName));

	}
}
