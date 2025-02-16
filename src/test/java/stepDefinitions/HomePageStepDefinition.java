package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.LoggerLoad;
public class HomePageStepDefinition {
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	@Given("The user opens the browser")
	public void the_user_opens_the_browser() {
	
		
		
	}

	@When("The user enters the correct DSAlgo portal URL")
	public void the_user_enters_the_correct_ds_algo_portal_url() {
		homePage.getbaseUrl();
		LoggerLoad.info("Entered dsalgo portal");}

	@Then("The user should be able to land on the DSAlgo portal")
	public void the_user_should_be_able_to_land_on_the_ds_algo_portal() {
		 Assert.assertTrue(homePage.isOnDSAlgoPortal(), "User is not on the DSAlgo portal");
		 LoggerLoad.info("Landed on dsalgo portal");
	}

	@Given("The user should be able to see the portal page")
	public void the_user_should_be_able_to_see_the_portal_page() {
		homePage.getbaseUrl();
		LoggerLoad.info("Able to see portal page");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_get_started_button() {
		loginPage.getUStartedButtonClick();
		LoggerLoad.info("Get started button is clicked");
	}

	@Then("The user should be able to land on the DSAlgo web application")
	public void the_user_should_be_able_to_land_on_the_ds_algo_web_application_() {
		// Assert.assertTrue(loginPage.getCurrentUrl().contains("home"), "User did not land on DSAlgo web application!");
		Assert.assertTrue(loginPage.getCurrentUrl().contains("dsportalapp"), "User did not land on DSAlgo web application!");
		LoggerLoad.info("able to land on the DSAlgo web application");
	}

	@Given("The user is on the Home page without Sign in")
	public void the_user_is_on_the_home_page_without_sign_in() {
	loginPage.getHomeURL();
	LoggerLoad.info("In the homepage");
	}

	@When("The user clicks on dropdown {string}")
	public void user_clicks_on_dropdown(String option) {
		 homePage.clickDataStructuresDropdown();  // Open dropdown
	     homePage.selectDropdownOption(option);   // Click option dynamically
	     LoggerLoad.info("clicks on dropdown");
	}

	@Then("The user should be able to see You are not logged in message")
	public void the_user_should_be_able_to_see_you_are_not_logged_in_message() {
	 Assert.assertTrue(homePage.isNotLoggedInMessageDisplayed(), "Error: 'You are not logged in' message is NOT displayed.");
	 LoggerLoad.info("Got the log out message");
	}

	@When("The user clicks on the Get Started button of any {string}")
	public void the_user_clicks_on_the_get_started_button_of_any(String getStartedOption) {
		  homePage.clickGetStartedButton(getStartedOption); 
		  LoggerLoad.info("Get started button clicked");
	}

}
