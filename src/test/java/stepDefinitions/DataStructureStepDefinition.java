package stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Helper;
import utilities.LoggerLoad;

public class DataStructureStepDefinition {
	DataStructurePage dataStructurePage = new DataStructurePage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Helper helper = new Helper();
	StackPage stackpage=new StackPage();
	ExcelReader excelUtils;

	@Given("For DataStructure the user signs in to dsAlgo Portal")
	public void the_user_signs_in_to_ds_algo_portal() {
		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackpage.performLogin("SignInDetails", 7);
	}

//	@Given("the user is in the Home page after signing in")
//	public void the_user_is_in_the_home_page_after_signing_in() {
//		loginPage.getHomeURL();
//	}

	@When("user clicks the Get started button in  Data Structures - Introduction panel")
	public void user_clicks_the_get_started_button_in_data_structures_introduction_panel() {
		dataStructurePage.clickGetStarted();
	}

	@Then("the user is directed to the Data Structures-Introduction  Page")
	public void the_user_is_directed_to_the_data_structures_introduction_page() {
		Assert.assertTrue(dataStructurePage.isDataStructurePageDisplayed(), "Data Structure Page is not displayed");
		LoggerLoad.info("navigating to Data Structure Introduction page");
	}

	@Given("the user is on the Data Structures - Introduction page")
	public void the_user_is_on_the_data_structures_introduction_page() {

		loginPage.getHomeURL();
		dataStructurePage.clickGetStarted();
	}

	@When("the user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
		dataStructurePage.clickTimeComplexity();
	}

	@Then("the user should be redirected to Time Complexity of Data Structures - Introduction")
	public void the_user_should_be_redirected_to_time_complexity_of_data_structures_introduction() {
		Assert.assertTrue(dataStructurePage.istimecomplixityPageDisplayed(),
				"User is not Navigating to Time complexity page");
		LoggerLoad.info("Navigating to Time complexity page");

	}

	@Given("the user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		dataStructurePage.getTimeComplixityPage();
	}

	@When("the user clicks Try Here button of Time Complexity page")
	public void the_user_clicks_try_here_button_of_time_complexity_page() {
		dataStructurePage.clickTryHere();
	}

	@Then("the user is redirected to a page having a try Editor with a Run button for datastructure")
	public void the_user_is_redirected_to_a_page_having_a_try_editor_with_a_run_button_for_datastructure() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"),
				"user not navigated to tryeditorpage of TimeComplixity");
		LoggerLoad.info("navihating to Tryeditor page having run button");
	}

	@Given("The user is in the tryEditor page of Time Complexity")
	public void the_user_is_in_the_try_editor_page_of_time_complexity() {
		dataStructurePage.getTimeComplixityPage();
		dataStructurePage.clickTryHere();
	}
	
	@When("For Datastructure the user clicks the Run button after entering {int} from {string}")
	public void for_datastructure_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet = "TryEditor";
		String invalidCode = excelUtils.getCellData(sheet, RowNumber - 1, 0);

		stackpage.enterCode(invalidCode);

		stackpage.clickRunButton();
		LoggerLoad.info("user clicked the Run button");
	}


	@Then("The user should able to see an error message in the alert window of time complexity.")
	public void the_user_should_able_to_see_an_error_message_in_the_alert_window_of_time_complexity() {
		try {

			stackpage.alert();
			String actualAlertText = stackpage.alert().getText();
			Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");

			stackpage.alert().accept();
		} catch (TimeoutException e) {

			Assert.fail("Expected an alert with an error message, but no alert appeared.");
		}
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		String output = stackpage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of DataStructure");
	}

	@When("The user click on the Back arrow on top of Time Complexity")
	public void the_user_click_on_the_back_arrow_on_top_of_time_complexity() {
		dataStructurePage.getTimeComplixityPage();
	}

	@Then("the user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("time-complexity"), "user is not back to timcomplexity");
	}

	@When("the user clicks  Practice Questions link of datastructure")
	public void the_user_clicks_practice_questions_link_of_datastructure() {
		dataStructurePage.clickPracticeQuestions();
	}

	@Then("the user should be redirected to Practice Questions page of datastructure")
	public void the_user_should_be_redirected_to_practice_questions_page_of_datastructure() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),
				"page is not navigated to practice questionspage of datastructure");
		LoggerLoad.info("redircting to practice questions page");
	}

	@Given("the user is in  practice questions page of datastructure")
	public void the_user_is_in_practice_questions_page_of_datastructure() {
		dataStructurePage.getPracticequestionPage();
	}

	@When("The user click on the Back arrow on top of datastructure")
	public void the_user_click_on_the_back_arrow_on_top_of_datastructure() {
		dataStructurePage.getTimeComplixityPage();
	}
}
