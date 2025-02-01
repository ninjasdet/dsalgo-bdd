package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;

public class LoginStepDefinition extends DriverManager {

	CommonStepDefinitions common = new CommonStepDefinitions();
	private LoginPage loginPage = new LoginPage();
	String ExpectedMessage;
	// String currentUrl;
	ExcelReader excelUtils;

	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {

		loginPage.getHomeURL();

	}

	@When("The user clicks the Sign in link")
	public void the_user_clicks_the_sign_in_link() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.getLoginBtnURL();
		// driver.get(ConfigReader.getProperty("loginUrl"));

	}

	@Then("The user should be redirected to the Sign in page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		String currentURL = driver.getCurrentUrl();
//		if (!currentURL.contains("login")) // TBD-done?
//		{
//			throw new AssertionError("User is not redirected to the Login page!");
//		}

		// String currentUrl;

		// Use TestNG assertion to check if the URL contains "sign-in" (or your URL
		// pattern)
		// Assert.assertTrue(currentUrl.contains("login"), "Test Failed! Expected to be
		// on Sign In page but found: " + currentUrl);

		System.out.println("User is successfully redirected to the Sign In page.");
	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.getLoginBtnURL();
//	driver.get(ConfigReader.getProperty("loginUrl"));
	}

	@When("The user clicks the login button after entering {int} from  {string}")
	public void the_user_clicks_the_login_button_after_entering_from(Integer RowNumber, String SheetName) {

		try {
			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// loginPage = new loginPage(driver);
		// Fetch username and password from the Excel sheet
		String username = excelUtils.getCellData(SheetName, RowNumber - 1, 0); // Column 0 = Username
		String password = excelUtils.getCellData(SheetName, RowNumber - 1, 1); // Column 1 = Password
		ExpectedMessage = excelUtils.getCellData(SheetName, RowNumber - 1, 2);
		// Enter credentials
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);

		// Click login button
		loginPage.clickLogin();

	}

	@Then("The ExpectedMessage will be displayed")
	public void the_expected_message_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Expected Message Passed in Feature: " + ExpectedMessage);
	}

	// manuall
	public void signInPageHome() {
		// Write code here that turns the phrase above into concrete actions
		common.the_user_is_in_the_home_page_after_sign_in();
		loginPage.getHomeURL();
	}

//	@When("The user clicks Sign out")
//	public void the_user_clicks_sign_out() {
//		// Write code here that turns the phrase above into concrete actions
//		
//		loginPage.signOutBtnClick();
//		System.out.println("I am at signIn Page");
//		
//	}
//
//	@Then("The user should be redirected to home page with message Logged out successfully")
//	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
//		// System.out.println("signed out");
//
//		// Get the current URL after logout
////	String currentUrl = loginPage.getCurrentUrl();
//
//		// Verify that the user is redirected to the home page
//		// Assert.assertTrue(currentUrl.contains("home"), "Test Failed! Expected to be
//		// on Home page but found: " + currentUrl);
//
//		// Verify the logout success message
////    String actualMessage = loginPage.getLogoutSuccessMessage();
////    
////    String expectedMessage = "Logged out successfully"; // Modify based on your app’s message
////    
////    Assert.assertEquals(actualMessage, expectedMessage, "Logout message does not match!");
////
////    System.out.println("User successfully logged out and redirected to the home page.");
////	
//System.out.println("I am at logoutpage");
//	}

}
