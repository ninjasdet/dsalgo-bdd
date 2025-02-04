package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverManager;

public class QueuePage {
	public WebDriver driver=DriverManager.getDriver();
    LoginPage loginPage = new LoginPage();
	public QueuePage() {
   	PageFactory.initElements(driver, this);
   	 
	}@FindBy(xpath = "//a[@href='queue']")
	  WebElement getStartedQueue;
	
	 @FindBy(xpath = "//a[normalize-space()='Implementation of Queue in Python']") 
	    WebElement implementationQueuePythonButton;
	// Locators
	    @FindBy(xpath = "//a[normalize-space()='Implementation using collections.deque']") 
	    WebElement implementationCollectionsDequeButton;
	    @FindBy(xpath = "//a[normalize-space()='Implementation using array']") 
	    WebElement implementationUsingArrayButton;
	    @FindBy(xpath = "//a[normalize-space()='Queue Operations']") 
	    WebElement queueOperationsButton;
	   public void getStartQueue()
	    {
		   getStartedQueue.click();
		 
	    }
	   public void clickImplementationQueuePython() {
	        implementationQueuePythonButton.click();
	    }
	   public void getBackQueue()
	    {loginPage.getHomeURL();
	    getStartQueue();
	    	
	    	
	    }
	   public void clickImplementationCollectionsDeque() {
	        implementationCollectionsDequeButton.click();
	    }
	   public void clickImplementationUsingArray() {
	        implementationUsingArrayButton.click();
	    }
	   public void clickQueueOperationsButton() {
	        queueOperationsButton.click();
	    }
}
