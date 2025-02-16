package pageObjects;

    import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;

	public class RegisterPage {
		
		WebDriver driver;
		RegisterPage registerpage;
	    String registerUrl = ConfigReader.getProperty("registerUrl"); // You can use the URL from config file
	   
		 
		 ExcelReader excelUtils;
		 String currentUrl;
		 public RegisterPage() {
			    this.driver = DriverManager.getDriver(); // Use the default driver from DriverManager
			    PageFactory.initElements(driver, this);
			}

		
		public RegisterPage(WebDriver driver) { 
		    this.driver = driver;
		    PageFactory.initElements(driver, this);
		}
		
		// Locate the iframe
	    @FindBy(xpath = "//iframe[@id='iframe_id_or_index']")
	    WebElement iframe;

	    // Locate the Register link inside the iframe
	           @FindBy(xpath = "//a[text()='Register']")
	            WebElement registerLink;
	    @FindBy(xpath = "//a[normalize-space()='Register']")
		 WebElement btnRegisterLink;

	    
	    
		       @FindBy(xpath="'//a[normalize-space()='Register']")
			    WebElement btnregisterLink;
		       
			   @FindBy(xpath="//button[normalize-space()='Get Started']")
			    WebElement btnGetStarted;
			  
			   @FindBy(xpath="//input[@id='id_username']")
				WebElement txtusername;
			   
			   @FindBy(xpath="//input[@id='id_password1']")
				WebElement txtpassword1;
			   
			   @FindBy(xpath="//input[@id='id_password2']")
				WebElement txtpassword2;
			   
			   @FindBy(xpath="//input[@value='Register']")
				WebElement btnRegister;
			   
			   @FindBy(xpath="//div[@role='alert']")
				WebElement msgConfirmation;
			   @FindBy(xpath=" //div[@role='alert']")
			   WebElement txterrormessage;
			   @FindBy(id = "usernameError") 
			   WebElement usernameError; // Error for username field
			    @FindBy(id = "passwordError") 
			    WebElement passwordError; // Error for password field
			    @FindBy(id = "confirmPasswordError") 
			    WebElement confirmPasswordError; // Error for confirm password field
			    @FindBy( xpath= "//div[@role='alert']") 
			    WebElement messageElement; // Global error message
			   
			    public void getHomeURL() {
			    	
			    	driver.get(ConfigReader.getProperty("homeUrl"));
			    
			    }
			   
			   public void getRegisterURL() {
			    	
			    	driver.get(ConfigReader.getProperty("registerUrl"));
			    	
			    }
			   
			   public void clickGetStartedButton()
			    {
			    	btnGetStarted.click();
			    }
			   
			   public void switchToIframe() {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
			    }
			   public void clickRegisterLink() {
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				   btnRegisterLink.click();
			        //driver.switchTo().defaultContent(); // Switch back to the main page
			    }
			   public boolean isUserOnRegisterPage() {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			        return wait.until(ExpectedConditions.urlToBe("https://dsportalapp.herokuapp.com/register"));
			    }
			    public void setUsername(String uname)
			    {
			    
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf(txtusername));
		        txtusername.sendKeys(uname);
			    }
			    
			    public void setPassword(String pwd)
			    {
			    txtpassword1.sendKeys(pwd);
			    	
			    }
			    
			    public void setConfirmPassword(String pwdConfirm)
			    {
			    txtpassword2.sendKeys(pwdConfirm);
			    	
			    }
			    
			    public void clickRegister()
			    {
			    btnRegister.click();		    	
			    }
			    
			    
			    public String getconfirmation(){
			    	try {
			    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			            wait.until(ExpectedConditions.visibilityOf(msgConfirmation));
			    		return (msgConfirmation.getText());
			    	}catch (Exception e) {
			    		return "Error: " + e.getMessage();
			    	}
			    }
			    	// Method to get the global error message
			        public String getGlobalMessageText() {
			            return messageElement.getText();
			        }

			        // Method to get specific field error messages
			        public String getUsernameError() {
			            return usernameError.getText();
			        }

			        public String getPasswordError() {
			            return passwordError.getText();
			        }

			        public String getConfirmPasswordError() {
			            return confirmPasswordError.getText();
			        }
			    
			    

				public String getRegistrationMessage() {
					
					return null;
				}

				
			    
			    
	}
			   
			   
			   
			   





