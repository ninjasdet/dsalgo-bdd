package testRunners;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
import utilities.DriverManager;
//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"


@CucumberOptions(plugin = { "pretty", "html:target/DsAlgoReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true, // console output color
tags="@DataStructuresPage",
features = { "src/test/resources/features" }, // location of feature files
glue = { "stepDefinitions", "hooks" }
)

public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	@Parameters({"browser"}) // Get browser name from TestNG XML
	public void setup(@Optional("chrome") String browser) throws Exception {
		ConfigReader.setBrowserType(browser);
		System.out.println("browser tyep:"+browser);
		DriverManager.initializeDriver(browser);
	}
	


@Override
@DataProvider(parallel = true)
public Object[][] scenarios() {

return super.scenarios();
}

}