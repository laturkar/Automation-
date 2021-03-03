package com.csr.testRunners;

import com.csr.factory.DriverFactory;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features/SC3_AcademicPage.feature"},
		glue = {"stepDefinition", "apphooks"},
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "timeline:test-output-thread/" },
		//dryRun = true,
		monochrome = true
		)

public class MytestRunner {




}
