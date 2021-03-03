package com.csr.pages;

import com.csr.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage {
    String username,password;
    private WebDriver driver;
    private AcademicPage academicPage;
    private HomePage homePage;
    private LoginPage loginPage;

    private By csrLink = By.linkText("Curriculum, Subject and Results (CSR)");

    public HomePage(LoginPage page){
        this.loginPage = page;
    }
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public AcademicPage clickCsrLink() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
        driver.switchTo().defaultContent();
        WebElement frameElement = driver.findElement(By.id("frmMain"));
        driver.switchTo().frame(frameElement);
        driver.switchTo().frame("SCApplicationiframe");
        driver.findElement(csrLink).click();
        return new AcademicPage(driver);

    }
}
