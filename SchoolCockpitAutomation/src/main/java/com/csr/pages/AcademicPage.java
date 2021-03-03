package com.csr.pages;

import com.csr.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AcademicPage extends DriverFactory{

    private WebDriver driver;

   private By assessmentFramework = By.cssSelector("#mainHeader > div > div > div:nth-child(3)");
   private By byStudent = By.cssSelector("#megaMenu-management2 > div > div > div.mega-menu-row.noscroll > div:nth-child(2) > ul > li:nth-child(2) > a");

    public AcademicPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAcademicPageTitle() {
        return driver.getTitle();
    }

    public void AssessmentFramework(){
       driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        driver.findElement(assessmentFramework).click();
    }

    public void QualitativeDescriptorByStudent(){
        driver.findElement(byStudent).click();
    }


    }








