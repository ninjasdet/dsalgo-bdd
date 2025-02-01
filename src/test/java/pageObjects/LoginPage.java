package pageObjects;
//import static utilities.DriverManager.driver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.ConfigReader;
import utilities.DriverManager;
//import utilities.DriverManager;
//import utilities.ExcelSheetHandling;

public class LoginPage {
	   // public  WebDriver driver;
	String currentUrl;
	  // Using Page Factory annotations
	    @FindBy (xpath = "//button[@class='btn']")
	    private WebElement getStartedBtn;
	    
	    @FindBy (xpath = "//a[normalize-space()='Sign in']")
	    private WebElement loginBtn;
	    @FindBy(name = "username") 
	    private WebElement usernameField;

	    @FindBy(name = "password")
	    private WebElement passwordField;

	    @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	    private WebElement loginButton;
	
	   // @FindBy(xpath="//a[normalize-space()='Sign out']")
	    @FindBy(xpath="//a[@href='/logout']")
	    private WebElement signOutBtn;
	    
	    @FindBy(xpath="//div[@role='alert']")
	    private WebElement signOutMsg;
	    public WebDriver driver=DriverManager.getDriver();
	    
	    public LoginPage() {
	    	  PageFactory.initElements(driver, this);
		}
     
		public void getHomeURL() {
	    	
	    	driver.get(ConfigReader.getProperty("homeUrl"));
	    	
	    }
	    public void getUStartedButtonClick()
	    {
	    	getStartedBtn.click();
	    	
	    }
	    public void getLoginBtn()
	    {
	    	loginBtn.click();
	    	
	    }
	    public void getLoginBtnURL()
	    {  
	    	driver.get(ConfigReader.getProperty("baseUrl"));
	    	getUStartedButtonClick();
	    	getLoginBtn();
	    }
	    
	    
	    public void enterUsername(String username) {
	        usernameField.clear();
	        usernameField.sendKeys(username);
	    }
	    public void enterPassword(String password) {
	        passwordField.clear();
	        passwordField.sendKeys(password);
	    }
	    
	    public void clickLogin() {
	  
	        loginButton.click();
	    }
        
	   
		public void signOutBtnClick() {
			signOutBtn.click();
			
		}
        public String getLogoutSuccessMessage()
        {
        	return signOutMsg.getText();
        	
        }	
     

		public String getCurrentUrl() {
		
			 return driver.getCurrentUrl();
		}

	
}
