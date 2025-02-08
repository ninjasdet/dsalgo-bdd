package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;
import utilities.ScreenshotUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    @Before
    public void setup() {
//    	String browser = ConfigReader.getProperty("browser");
//		
//		DriverManager.initializeDriver(browser);
    	DriverManager.getDriver();
    }

    @After
  //  public void tearDown() {
    	
    	public void tearDown(Scenario scenario) {
            if (scenario.isFailed()) {
                ScreenshotUtility.takeScreenshot(DriverManager.getDriver(), scenario.getName());
                System.out.println("❌ Test Failed: Screenshot Captured!");
            }
    	
    	DriverManager.quitDriver();
    }
    
    }


	

