package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop = new Properties();
	 private static String browserType;
	 
	 public static void setBrowserType(String browser) {

			browserType = browser;

		}

		public static String getBrowserType() throws Throwable {

			if (browserType != null)

				return browserType;

			else

				throw new RuntimeException("browser not specified in the testng.xml");

		}
	 
	 static {
	        initializeProp();
	    }
	public static Properties initializeProp() {
	    try (FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties")) {
	         prop.load(fis);
	    } catch (IOException e) {
	        throw new RuntimeException("Failed to load config properties file.", e);
	    }
	    return prop; 
	}
	
	public static String getProperty(String key) {
		//return browserType != null ? browserType : getProperty("browser");
		return prop.getProperty(key);
	}

//	 public static void setBrowserType(String browser) {
//		 browserType = browser;
//	        prop.setProperty("browser", browser);
//	    }
//	static {
//		try {
//			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
//			properties.load(fis);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static String getProperty(String key) {
//		return properties.getProperty(key);
//	}
//
//	public static Properties initializeProp() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
