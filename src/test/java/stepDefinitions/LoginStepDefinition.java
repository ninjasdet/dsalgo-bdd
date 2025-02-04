package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;


//public class LoginStepDefinition extends DriverManager {
public class LoginStepDefinition {
	// WebDriver driver = DriverFactory.getDriver(); // Assuming a WebDriver utility
	CommonStepDefinitions common = new CommonStepDefinitions();
	 LoginPage loginPage = new LoginPage();
	String ExpectedMessage;
	
	//String currentUrl = loginPage.getCurrentUrl();
	
	ExcelReader excelUtils;
	String actualMessage;
	String expectedMessage;
   	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {

		loginPage.getHomeURL();
		 //String currentUrl = loginPage.getCurrentUrl();
		//Assert.assertTrue(currentUrl.contains("home"), "User is not on Home Page");
	}

	@When("The user clicks the Sign in link")
	public void the_user_clicks_the_sign_in_link() {
		
		loginPage.getLoginBtnURL();
		
	}

	@Then("The user should be redirected to the Sign in page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {
	//String currentUrl = loginPage.getCurrentUrl();
	Assert.assertTrue(loginPage.getCurrentUrl().contains("login"), "User is in the loginPage");
	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		
		loginPage.getLoginBtnURL();

	}

	@When("The user clicks the login button after entering {int} from  {string}")
	public void the_user_clicks_the_login_button_after_entering_from(Integer RowNumber, String SheetName) {

		try {
		
		excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		  // Fetch username and password from the Excel sheet
        String username = excelUtils.getCellData(SheetName, RowNumber - 1, 0); // Column 0 = Username
	    String password = excelUtils.getCellData(SheetName, RowNumber - 1, 1); // Column 1 = Password
	    ExpectedMessage =  excelUtils.getCellData(SheetName, RowNumber - 1, 2);
	    // Enter credentials
	    loginPage.enterUsername(username);
	    loginPage.enterPassword(password);

	    // Click login button
	    loginPage.clickLogin();
		

	}

	@Then("The ExpectedMessage will be displayed")
	public void the_expected_message_will_be_displayed() {
		System.out.println(ExpectedMessage);
	}

//	// manuall
	public void signInPageHome() {
	// Write code here that turns the phrase above into concrete actions
	common.the_user_is_in_the_home_page_after_sign_in();
	 // Assuming the user is already signed in, we verify home page access
      Assert.assertTrue(loginPage.getCurrentUrl().contains("home"), "User is not on Home Page");
	}

//	@When("The user clicks Sign out")
//	public void the_user_clicks_sign_out() {
//		loginPage.signOutBtnClick();
//	}
//
//	@Then("The user should be redirected to home page with message Logged out successfully")
//	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
//		 Assert.assertTrue(loginPage.getCurrentUrl().contains("home"), "Test Failed! Expected to be on Home page but found: " + loginPage.getCurrentUrl());
//		    // Verify the logout success message
//		    actualMessage = loginPage.getLogoutSuccessMessage();   
//		    expectedMessage = "Logged out successfully"; // Modify based on your app’s message  
//		  Assert.assertEquals(actualMessage, expectedMessage, "Logout message does not match!");
//	}

}
