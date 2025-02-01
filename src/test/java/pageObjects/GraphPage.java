package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverManager;

public class GraphPage {
	
	String currentUrl;
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement getStarted;
	
	@FindBy(xpath="//a[normalize-space()='Graph']")
	WebElement dropdownGraph;

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Graph']")
	WebElement graphLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement tryhere;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement run;
	
	@FindBy(xpath="//a[normalize-space()='Graph Representations']")
	WebElement grapReprlink;
	
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']")
	WebElement practiceQues;
	
	 public WebDriver driver=DriverManager.getDriver();
	
	 //constructor creation 
	public GraphPage() {
		PageFactory.initElements(driver,this);
	}
	
	
}
