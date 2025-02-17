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

//	private static WebDriver driver;
//
//	private static void initializeDriver(String browser)
//
//	{
//		//if (driver == null) {
//			//browser = ConfigReader.getProperty("browser");
//
//			boolean headless = Boolean.parseBoolean(ConfigReader.getProperty("headless"));
//
//			switch (browser.toLowerCase()) {
//			case "chrome":
//				//String chromeDriverPath = ConfigReader.getProperty("chromedriver.path");
//				WebDriverManager.chromedriver().setup();
//				//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//				ChromeOptions chromeOptions = new ChromeOptions();
//				if (headless) {
//					chromeOptions.addArguments("--headless");
//					chromeOptions.addArguments("--disable-gpu");
//					chromeOptions.addArguments("--window-size=1920,1080");
//				}
//				driver = new ChromeDriver(chromeOptions);
//				break;
//
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    FirefoxOptions firefoxOptions = new FirefoxOptions();
//                    if (headless) {
//                        firefoxOptions.addArguments("--headless");
//                        firefoxOptions.addArguments("--disable-gpu");
//                        firefoxOptions.addArguments("--window-size=1920,1080");
//                    }
//                    driver = new FirefoxDriver(firefoxOptions);
//                    break;
//			case "edge":
//				String firefoxDriverPath = ConfigReader.getProperty("msedgedriver.path");
//				 WebDriverManager.firefoxdriver().setup();
//				// String firefoxDriverPath=
//				// "C:\\Users\\sride\\eclipse-workspace\\SampleTestingBDD\\src\\test\\resources\\drivers\\geckodriver.exe";
//				System.setProperty("webdriver.edge.driver", firefoxDriverPath);
//				EdgeOptions edgeOptions = new EdgeOptions();
//				if (headless) {
//					edgeOptions.addArguments("--headless");
//					edgeOptions.addArguments("--disable-gpu");
//					edgeOptions.addArguments("--window-size=1920,1080");
//				}
//				driver = new EdgeDriver(edgeOptions);
//				break;
//			default:
//				throw new IllegalArgumentException("Browser not supported: " + browser);
//			}
//
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.manage().window().maximize();
//		}
//		//return driver;
//	
//	// Public method to get the driver
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            String browser = System.getProperty("browser", ConfigReader.getProperty("browser")); // Get browser from TestNG XML or config file
//            initializeDriver(browser);
//        }
//        return driver;
//    }
//	
////
////	public static WebDriver getDriver() {
////		return driver;
////	}
//
//	public static void quitDriver() {
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
//	}

}
