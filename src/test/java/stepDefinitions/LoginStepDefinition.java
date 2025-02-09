package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class LoginStepDefinition {
	LoginPage loginPage = new LoginPage();
	String ExpectedMessage;
	ExcelReader excelUtils;
	String actualMessage;
	String expectedMessage;
	StackPage stackPage = new StackPage();

	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		loginPage.getHomeURL();
		LoggerLoad.info("Entered dsalgo portal");

	}

	@When("The user clicks the Sign in link")
	public void the_user_clicks_the_sign_in_link() {

		loginPage.getLoginBtnURL();
		LoggerLoad.info("Clicked the sign in link");

	}

	@Then("The user should be redirected to the Sign in page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {

		Assert.assertTrue(loginPage.getCurrentUrl().contains("login"), "User is in the loginPage");
		LoggerLoad.info("redirected to the Sign in page");

	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {

		loginPage.getLoginBtnURL();
		LoggerLoad.info("on the DS Algo Sign in Page");
	}

	@When("The user clicks the login button after entering {int} from  {string}")
	public void the_user_clicks_the_login_button_after_entering_from(Integer RowNumber, String SheetName) {
		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Fetch username and password from the Excel sheet
		String username = excelUtils.getCellData(SheetName, RowNumber - 1, 0); // Column 0 = Username
		String password = excelUtils.getCellData(SheetName, RowNumber - 1, 1); // Column 1 = Password
		ExpectedMessage = excelUtils.getCellData(SheetName, RowNumber - 1, 2);
		// Enter credentials
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);

		// Click login button
		loginPage.clickLogin();
		LoggerLoad.info("Login button clicked");

	}

	@Then("The ExpectedMessage will be displayed")
	public void the_expected_message_will_be_displayed() {
		System.out.println(ExpectedMessage); // TBD
		LoggerLoad.info("Message will be displayed");

	}

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackPage.performLogin("SignInDetails", 7);
		LoggerLoad.info("in the Home page after Sign in");
	}

	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {
		loginPage.signOutBtnClick();
		LoggerLoad.info("Clicked sign out");
	}

	@Then("The user should be redirected to home page with message Logged out successfully")
	public void the_user_should_be_redirected_to_home_page_with_message_logged_out_successfully() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("home"),
				"Test Failed! Expected to be on Home page but found: " + loginPage.getCurrentUrl());
		// Verify the logout success message
		actualMessage = loginPage.getLogoutSuccessMessage();
		expectedMessage = "Logged out successfully"; // Modify based on your app’s message
		Assert.assertEquals(actualMessage, expectedMessage, "Logout message does not match!");
		// System.out.println("Needs assertion");
		LoggerLoad.info("The user should be redirected to home page");

	}

}
