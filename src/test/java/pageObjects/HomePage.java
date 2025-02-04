package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.DriverManager;

public class HomePage {
  
	
	public WebDriver driver=DriverManager.getDriver();
	public HomePage() {
   	PageFactory.initElements(driver, this);
   	 
   	
	}
	@FindBy(xpath = "//p[normalize-space()='You are at the right place']")  // Example element, modify as per actual page element
    WebElement portalLabel;
	
	@FindBy(xpath  ="//a[@class='nav-link dropdown-toggle']")
    WebElement dataStructuresDropdown;
	
	public WebElement getDropdownOption(String option) {
     
		 return driver.findElement(By.xpath("//a[normalize-space()='" + option +"']"));
	
   }

	// Click on any dropdown option dynamically
    public void selectDropdownOption(String option) {
        getDropdownOption(option).click();
    }
	@FindBy(xpath = "//div[@role='alert']")  // Example element, modify as per actual page element
    WebElement notLoggedInMessage;
	public void getbaseUrl() {
		
		driver.get(ConfigReader.getProperty("baseUrl"));
	}

	public boolean isOnDSAlgoPortal() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl().contains("dsportalapp");  // Check if "dsalgo" is part of the URL;
	}
	
	// Method to check if portal page is visible
    public boolean isPortalPageVisible() {
        return portalLabel.isDisplayed();
    }
  
    public boolean isNotLoggedInMessageDisplayed() {
        return notLoggedInMessage.isDisplayed();
    }
    // Click on Data Structures dropdown
    public void clickDataStructuresDropdown() {
        dataStructuresDropdown.click();
    }
 // Get Started button for different options (Dynamic)
    public WebElement getGetStartedButton(String option) {
    
    	return driver.findElement(By.xpath("//a[@href='" + option + "']"));
    }
 // Click Get Started button dynamically
    public void clickGetStartedButton(String getStartedOption) {
        getGetStartedButton(getStartedOption).click();
    }
}
