package stepDefinition;


import com.csr.factory.DriverFactory;
import com.csr.pages.AcademicPage;
import com.csr.pages.HomePage;
import com.csr.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class AcademicPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private  String title;
    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private AcademicPage academicPage;


    @Given("user is on Academic Page")
    public void user_is_on_academic_page() throws InterruptedException {
        academicPage=homePage.clickCsrLink();
         title=academicPage.getAcademicPageTitle();
        System.out.println("Page Title is :" +title);
    }

    @Then("Page Title of academic page should be {string}")
    public void page_title_of_academic_page_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @When("user click on Assessment Framework dropdown")
    public void user_click_on_assessment_framework_dropdown() {
        academicPage.AssessmentFramework();
    }


    @When("select Qualitative descriptors by Student option")
    public void select_qualitative_descriptors_by_student_option() {
        academicPage.QualitativeDescriptorByStudent();
    }
    @Then("select class")
    public void select_class() {

    }
    @And("select Student")
    public void select_student() {

    }
    @And(" select Assessment")
    public void select_assessment() {

    }
    @Then("select LO1, LO2, LO3, LO4 for few subjects")
    public void select_lo1_lo2_lo3_lo4_for_few_subjects() {

    }
    @And("click on Save button")
    public void click_on_save_button() {

    }
    @Then("click on SC+ icon")
    public void click_on_sc_icon() {

    }
    @And("click on logout menu")
    public void click_on_logout_menu() {

    }







}
