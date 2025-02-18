package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static WebDriver initializeDriver(String browser) {
		if (browser == null || browser.isEmpty()) {
			throw new IllegalArgumentException("Browser name must not be null or empty.");
		}

//		 boolean headless =
//		 Boolean.parseBoolean(ConfigReader.getProperty("headless"));

		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				// WebDriverManager.chromedriver().setup();
//				 ChromeOptions chromeOptions = new ChromeOptions();
//                    if (headless) {
//                        chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
//                    }
				tlDriver.set(new ChromeDriver());
				break;
			case "firefox":
				// WebDriverManager.firefoxdriver().setup();
//                    FirefoxOptions firefoxOptions = new FirefoxOptions();
//                    if (headless) {
//                        firefoxOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
//                    }
				tlDriver.set(new FirefoxDriver());
				break;
			case "edge":
				// WebDriverManager.edgedriver().setup();
//                    EdgeOptions edgeOptions = new EdgeOptions();
//                    if (headless) {
//                        edgeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
//                    }
				tlDriver.set(new EdgeDriver());
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}
		} catch (Exception e) {
			System.out.println("Error initializing browser: " + e.getMessage());
			throw e;
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		WebDriver driver = tlDriver.get();
		if (driver == null) {
			// throw new IllegalStateException("webdriver is not initialized");
			String browser = System.getProperty("browser", ConfigReader.getProperty("browser"));
			initializeDriver(browser);
		}
		return tlDriver.get();
	}

	public static void quitDriver() {
		WebDriver driver = tlDriver.get();
		if (driver != null) {
			driver.quit();
			tlDriver.remove();
		}
	}



}
