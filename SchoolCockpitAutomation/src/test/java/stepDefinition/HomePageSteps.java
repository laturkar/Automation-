package stepDefinition;

import com.csr.factory.DriverFactory;
import com.csr.pages.AcademicPage;
import com.csr.pages.HomePage;
import com.csr.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class HomePageSteps{

    private String title;
    private AcademicPage academicPage;
    private HomePage homePage;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user has already logged in to application.")
    public void user_has_already_logged_in_to_application(DataTable credTable) throws InterruptedException {

        List<Map<String,String>> credList= credTable.asMaps();
        String username=credList.get(0).get("username");
        String password=credList.get(0).get("password");

        DriverFactory.getDriver().get("http://192.168.205.11:9000/CP/scapp/security");
        homePage= loginPage.login(username,password);


    }
    @Given("user is on Home Page")
    public void user_is_on_home_page() {

        title= homePage.getHomePageTitle();
        System.out.println("Page Title:" +title);
    }

    @And("user clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        homePage.clickCsrLink();
    }


}
