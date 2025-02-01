package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver;

	public static WebDriver initializeDriver(String browser)

	{
		if (driver == null) {
			browser = ConfigReader.getProperty("browser");
			boolean headless = Boolean.parseBoolean(ConfigReader.getProperty("headless"));

			switch (browser.toLowerCase()) {
			case "chrome":
				//String chromeDriverPath = ConfigReader.getProperty("chromedriver.path");
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				ChromeOptions chromeOptions = new ChromeOptions();
				if (headless) {
					chromeOptions.addArguments("--headless");
					chromeOptions.addArguments("--disable-gpu");
					chromeOptions.addArguments("--window-size=1920,1080");
				}
				driver = new ChromeDriver(chromeOptions);
				break;

//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                    break;
			case "edge":
				String firefoxDriverPath = ConfigReader.getProperty("msedgedriver.path");
				// WebDriverManager.firefoxdriver().setup();
				// String firefoxDriverPath=
				// "C:\\Users\\sride\\eclipse-workspace\\SampleTestingBDD\\src\\test\\resources\\drivers\\geckodriver.exe";
				System.setProperty("webdriver.edge.driver", firefoxDriverPath);
				EdgeOptions edgeOptions = new EdgeOptions();
				if (headless) {
					edgeOptions.addArguments("--headless");
					edgeOptions.addArguments("--disable-gpu");
					edgeOptions.addArguments("--window-size=1920,1080");
				}
				driver = new EdgeDriver(edgeOptions);
				break;
			default:
				throw new IllegalArgumentException("Browser not supported: " + browser);
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
