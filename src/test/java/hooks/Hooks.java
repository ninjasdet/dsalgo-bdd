package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverManager;

public class Hooks {

	    @Before
	    public void setup() {
	    	String browser = ConfigReader.getProperty("browser");
			
			DriverManager.initializeDriver(browser);
	    }

	    @After
	    public void tearDown() {
	    	
	    	DriverManager.closeDriver();
	    	// Take screenshot if scenario fails
//			  if (scenario.isFailed()) {
//		            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		            try {
//		                // You can change the file path to match your setup
//		                File destination = new File("C:/test/screenshots/" + scenario.getName() + ".png");
//		                FileUtils.copyFile(screenshot, destination);
//		                System.out.println("Screenshot saved: " + destination.getAbsolutePath());
//		            } catch (IOException e) {
//		                e.printStackTrace();
//		            }
//			  }
		
	    }
	}

