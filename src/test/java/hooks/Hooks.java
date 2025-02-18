package hooks;

import java.util.Properties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ScreenshotUtility;

import io.cucumber.java.Scenario;

public class Hooks {

	private static Properties prop;
	
    @Before
    public void beforeScenario() throws Throwable {
        prop = ConfigReader.initializeProp();
        String browser = ConfigReader.getBrowserType();

		

		//Initialize driver from driver factory

		
//        String browser = System.getProperty("browser");
//       if (browser == null || browser.isEmpty()) {
//            browser = ConfigReader.getProperty("browser");
//       }
        DriverManager.initializeDriver(browser);
       
        DriverManager.getDriver().get(prop.getProperty("baseUrl"));
    }

    @After(order = 0)
    public void quitBrowser() {
        if (DriverManager.getDriver() != null) {
		LoggerLoad.info("browser quitting");
        	
            DriverManager.quitDriver();
        }
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtility.takeScreenshot(DriverManager.getDriver(), scenario.getName());
             LoggerLoad.info("❌ Test Failed: Screenshot Captured!");
        }
   }


}
