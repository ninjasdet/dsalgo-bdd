package testRunners;

import org.openqa.selenium.WebDriver;
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
tags="@Register or @LoginPage or @DataStructuresPage or @GraphDatastructure or @ArrayPage or @TreeDataStructure or @Linkedlist or @Stackpage or @Queuepage",
features = { "src/test/resources/features" }, // location of feature files
glue = { "stepDefinitions", "hooks" },
dryRun = true)

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


//@AfterClass
//public void tearDown() {
//// Close the driver after the test
//
//DriverManager.closeDriver();
//
////or @Homepage or @register or @DataStructuresPage or not @Array or @linkedlist or @Stackpage or @Queuepage or @Queuepage or @TreeDataStructure or @GraphDatastructure",
//}


}

