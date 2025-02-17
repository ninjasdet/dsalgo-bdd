package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utilities.ConfigReader;
//import stepDefinitions.Alert;
import utilities.DriverManager;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class StackPage {

	public WebDriver driver = DriverManager.getDriver();
	LoginPage loginPage = new LoginPage();
	ExcelReader excelUtils;

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
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement TryHere;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement editorTextArea;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runButton;
	@FindBy(id = "output")
	WebElement consoleOutput;

	@FindBy(xpath = "//a[normalize-space()='Implementation']")
	WebElement implementation;
	@FindBy(xpath = "//a[normalize-space()='Applications']")
	WebElement applications;
	@FindBy(xpath = "//a[@href='/stack/practice']")
	WebElement practiceQuestionsButton;
	@FindBy(xpath = "//*[@id=\"answer_form\"]")
	WebElement answerform;

	public void stack() {
		dropdownStack.click();

	}

	// Method to verify if Stack page is displayed
	public boolean isStackPageDisplayed() {
		return stackPageHeading.isDisplayed();
	}

	public void getStartStack() {
		getStartedStack.click();

	}

	public void getoptsSlackURL() {
		optsSlack.click();

	}

	public boolean isOperationsInStackPageDisplayed() {

		return operationsInStackHeading.isDisplayed();
	}

	public void clickTryHere() {
		TryHere.click();

	}

	public void gettryEditorURL() {

		loginPage.getHomeURL();
		getStartStack();
		getoptsSlackURL();
		clickTryHere();
	}

	public void enterCode(String code) {

		wait.until(ExpectedConditions.visibilityOf(answerform));

		
		editorTextArea.sendKeys(code);
		LoggerLoad.info("code entered!");
	}

	public void clickRunButton() {
		wait.until(ExpectedConditions.visibilityOf(runButton));
		runButton.click();
	}

	public Alert alert() {
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}

	public String getConsoleOutput() {
		//wait.until(ExpectedConditions.visibilityOf(answerform));
		return consoleOutput.getText();
	}

	public void getBackOPS() {
		loginPage.getHomeURL();
		getStartStack();
		getoptsSlackURL();

	}

	public void Implementation() {
		wait.until(ExpectedConditions.visibilityOf(implementation));
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
		LoggerLoad.info("PracticeQuestions clicked");
	}

	public void performLogin(String sheetName, int rowNumber) {

		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));

		} catch (IOException e) {

			e.printStackTrace();

		}

		// Fetch username and password from the Excel sheet

		String username = excelUtils.getCellData(sheetName, rowNumber - 1, 0); // Column 0 = Username

		String password = excelUtils.getCellData(sheetName, rowNumber - 1, 1); // Column 1 = Password

		loginPage.enterUsername(username);

		loginPage.enterPassword(password);

		// Click login button

		loginPage.clickLogin();
		LoggerLoad.info("login done!");
	}
}
