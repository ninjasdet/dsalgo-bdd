package testRunners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.DriverManager;

@CucumberOptions(plugin = { "pretty", "html:target/sridevi.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
		// reporting purpose
		monochrome = true, // console output color
		tags="@Homepage or @LoginPage or @Stackpage or @Queuepage",
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinitions", "hooks" })
//tags="@Homepage or @LoginPage",

public class TestRunner extends AbstractTestNGCucumberTests {

	WebDriver driver;

	
	@BeforeClass 
	@Parameters("browser") // Get browser name from TestNG XML
	public void setup(@Optional("chrome") String browser) throws Exception {

		// Setup the driver based on the browser parameter passed from TestNG XML
		driver = DriverManager.initializeDriver(browser); // Calls DriverManager class to initialize WebDriver
		
	}

	@AfterClass
	public void tearDown() {
		// Close the driver after the test

		DriverManager.closeDriver();

	//or @Homepage or @register or @DataStructuresPage or not @Array or @linkedlist or @Stackpage or @Queuepage or @Queuepage or @TreeDataStructure or @GraphDatastructure",
	}

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
