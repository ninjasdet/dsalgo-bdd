package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
//import stepDefinitions.Alert;
import utilities.DriverManager;
import utilities.ExcelReader;

public class StackPage {

	
	public WebDriver driver=DriverManager.getDriver();
    LoginPage loginPage = new LoginPage();
	public StackPage() {
   	PageFactory.initElements(driver, this);
   	 
   	
	}
	  @FindBy(xpath = "//a[normalize-space()='Stack']")
	  WebElement dropdownStack;
	   // Locator for Stack Page heading
	  @FindBy(xpath = "//h4[@class='bg-secondary text-white']")
	  WebElement stackPageHeading;
	  @FindBy(xpath = "//a[@href='stack']")
	  WebElement getStartedStack;
	  @FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	  WebElement optsSlack;
	  @FindBy(xpath = "//p[normalize-space()='Operations in Stack']")
	   WebElement operationsInStackHeading;
	  @FindBy(xpath  = "/html/body/div[2]/div/div[2]/a")
	   WebElement TryHere;
	 @FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[1]/textarea") // Assuming the editor has an ID
	    WebElement editorTextArea;

	    @FindBy(xpath = "//button[text()='Run']")
	    WebElement runButton;
	    @FindBy(id = "output") // Assuming console output appears in <pre> tag
	    WebElement consoleOutput;
	    
	    @FindBy(xpath = "//a[normalize-space()='Implementation']")
		  WebElement implementation;
	    @FindBy(xpath = "//a[normalize-space()='Applications']")
		  WebElement applications;
	    @FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']") // Adjust based on actual HTML
	    WebElement practiceQuestionsButton;
	  public void stack()
	  {
		  dropdownStack.click();
		  
	  }
	  // Method to verify if Stack page is displayed
	    public boolean isStackPageDisplayed() {
	        return stackPageHeading.isDisplayed();
	    }
	    public void getStartStack()
	    {
	    	getStartedStack.click();
	    	
	    }
	  
	 
		public void getoptsSlackURL() {
			optsSlack.click();
			
		}
		public boolean isOperationsInStackPageDisplayed() {
		
			return operationsInStackHeading.isDisplayed();
		}
	
		public void clickTryHere() {
			//TryHere.click();
			//driver.get("https://dsportalapp.herokuapp.com/tryEditor");//TBD
			gettryEditorURL();
			
		}		
		public void gettryEditorURL()
		{
		
			driver.get("https://dsportalapp.herokuapp.com/tryEditor"); //TBD
		}
		
		 public void enterCode(String code) {
		        editorTextArea.clear();
		        editorTextArea.sendKeys(code);
		    }

		    public void clickRunButton() {
		        runButton.click();
		    }
		    
		  
		    
		    public Alert alert() {
		    	// TODO Auto-generated method stub
		    	return  driver.switchTo().alert();
		    }
		    
		    public String getConsoleOutput() {
		        return consoleOutput.getText();
		    }
		    public void getBackOPS()
		    {loginPage.getHomeURL();
		    	getStartStack();
		    	getoptsSlackURL();
		    	
		    }
		    public void Implementation() {
		    	implementation.click();
		    }
		    public void applications() {
		    applications.click();
		    }
		    public void getBackImplementation() {
		    	loginPage.getHomeURL();
		    	getStartStack();
		    	Implementation();
		    	
		    }
		    public void getBackApplication() {
		    	loginPage.getHomeURL();
		    	getStartStack();
		    	applications();
		    	
		    }
			public void clickPracticeQuestionsButton() {
				practiceQuestionsButton.click();
				
			}
		    
		    
}     
