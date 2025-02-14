package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class GraphPage {
	


	// Hooks hooks=new Hooks();
	LoginPage loginPage = new LoginPage();

	String currentUrl;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement getStarted;

	@FindBy(xpath = "//a[normalize-space()='Graph']")
	WebElement dropdownGraph;

	@FindBy(xpath = "//h4[normalize-space()='Graph']")
	WebElement graphPageHeader;

	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Graph']")
	WebElement insidegraphLink;

	@FindBy(xpath = "//div[@class='col-sm']//p[@class='bg-secondary text-white'][normalize-space()='Graph']")
	WebElement insideGraphPageHeader;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;

	@FindBy(xpath = "//button[@type='button']")
	WebElement run;

	@FindBy(xpath = "//a[normalize-space()='Graph Representations']")
	WebElement grapReprlink;

	@FindBy(xpath = "//p[normalize-space()='Graph Representations']")
	WebElement graphRepresenation;

	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	WebElement practiceQues;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div") // Assuming the editor has an ID
	WebElement editorTextArea1;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[1]/textarea")//div[@class='CodeMirror-scroll']")//div[@class='input']//textarea"
	WebElement textareaelement;
	//div[@class='CodeMirror-scroll']

	@FindBy(xpath="//div[@class='input']")
	WebElement input;
	
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;
	
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[1]/textarea") // Assuming the editor has an ID
	WebElement editorTextArea;

	@FindBy(id = "output") // Assuming console output appears in <pre> tag
	WebElement consoleOutput;

	private ExcelReader excelReader;
	
	public WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	
	// Method to load the tryEditor page
    public void loadTryEditorPage() {
        driver.get("URL_of_TryEditor"); // Replace with the actual URL
    }

    // Method to enter code and click Run button
    public void enterCodeAndRun(String code) {
    	editorTextArea.clear();
    	editorTextArea.sendKeys(code);
        runButton.click();
    }

    
	// constructor creation
	public GraphPage() {
		PageFactory.initElements(driver, this);
		// Initialize ExcelReader
        try {
            this.excelReader = new ExcelReader(ConfigReader.getProperty("excelPath")); // Excel file path
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	// Method to enter code into the editor and click the Run button
    public void enterCodeAndRun(String sheetName, int rowNumber) {
        try {
            // Fetch data from Excel using ExcelReader
            String codeToEnter = excelReader.getCellData(sheetName, rowNumber - 1, 0); // Assuming column 0

            WebElement textarea=wait.until(ExpectedConditions.elementToBeClickable(textareaelement));
            // Enter the code into the editor
            textarea.clear();
            textarea.sendKeys(codeToEnter);

            // Click the Run button
            runButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    //method to test valid scenario
//    public void validinputcode()
//    {
//    	WebElement textarea=wait.until(ExpectedConditions.elementToBeClickable(textareaelement));
//    	
//    	//textarea.sendKeys("print \"hello\"");
//    }
    
    
    
 // Method to get the output from the console
    public String getConsoleOutput() {
        return consoleOutput.getText();
    }
 

	// getting base url
	public void getbaseURl() {
		driver.get(ConfigReader.getProperty("baseUrl"));
	}

	// getstarted button of graph click
	public void clickGetStartedGraph() {

		wait.until(ExpectedConditions.elementToBeClickable(getStarted)).click();
		LoggerLoad.info("clicking the getStarted Graph");
	}

	// method to verifygraph page displayed
	public boolean isGraphPageDisplayed() {
		return graphPageHeader.isDisplayed();
	}

	// method inside graph
	public void insideGraphpageDispalyed() {

		wait.until(ExpectedConditions.elementToBeClickable(insidegraphLink)).click();

	}

	public boolean insideGraphPage() {
		return insideGraphPageHeader.isDisplayed();
	}

	public void insideGrpahRepresentationPage() {
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickGraphRepresenation();
	}

	// inside grapglink naviagation
	public void clickInsideGraph() {

		// Thread.sleep(2000);
		insidegraphLink.click();
	}

//	 public boolean graphPage()
//	 {
//		// login.getHomeURL();
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	        wait.until(ExpectedConditions.visibilityOf(navigateGraph));
//	        return navigateGraph.isDisplayed();
//		
//	 }

	public void tryhereEditor() {
		tryhere.click();
	}
	public void gettryEditorPage()
	{
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickInsideGraph();
		tryhereEditor();
	}
	
	public void insideGrapghPage()
	{
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickInsideGraph();
	}

	public void gettryEditorURL() {

		// driver.get("https://dsportalapp.herokuapp.com/tryEditor"); //TBD
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickGraphRepresenation();
		
		// tryhereEditor();
	}

	public void enterCode(String code) {
		// wait.until(ExpectedConditions.elementToBeClickable(editorTextArea));
		// editorTextArea.clear();
		// wait.until(ExpectedConditions.elementToBeClickable(editorTextArea)).sendKeys(code);
		wait.until(ExpectedConditions.visibilityOf(editorTextArea)); // Wait for visibility
		editorTextArea.clear();
		editorTextArea.sendKeys(code);
		// editorTextArea.sendKeys(code);
	}

	public void clickRunButton() {
		runButton.click();
	}

	// method to select Graph from dropdown
	public void selectGraphFromDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(dropdownGraph)).click();
	}

//	// getting current url
//	public String getPageUrl() {
//		return driver.getCurrentUrl();
//	}
	// method to navigate GraphRepresentationLink
	public void clickGraphRepresenation() {

		wait.until(ExpectedConditions.elementToBeClickable(grapReprlink)).click();
	}

	public boolean isGraphRepresenationDisplayed() {
		return graphRepresenation.isDisplayed();
	}

	public void clickPracticeQuestion() {
		wait.until(ExpectedConditions.elementToBeClickable(practiceQues)).click();
		LoggerLoad.info("Practice questions page");
	}
	//method for valid input data
	
	public void getBackApplication() {
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickInsideGraph();

	}
	
	public void getGraphRepreBack()
	{
		loginPage.getHomeURL();
		clickGetStartedGraph();
		clickGraphRepresenation();
	}

}




