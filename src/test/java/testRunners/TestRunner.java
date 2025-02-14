package testRunners;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.DriverManager;



@CucumberOptions(plugin = { "pretty", "html:target/DsAlgoReports.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
// reporting purpose
monochrome = true, // console output color
tags="@H1",
features = { "src/test/resources/features" }, // location of feature files
glue = { "stepDefinitions", "hooks" }
)

public class TestRunner extends AbstractTestNGCucumberTests {

WebDriver driver;


@BeforeClass
@Parameters("browser") // Get browser name from TestNG XML
public void setup(@Optional("chrome") String browser) throws Exception {

// Ensure WebDriver is initialized
DriverManager.getDriver(); // Corrected method

}

@Override
@DataProvider(parallel = false)
public Object[][] scenarios() {

return super.scenarios();
}



}