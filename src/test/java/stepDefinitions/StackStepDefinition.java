package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class StackStepDefinition {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	StackPage stackPage = new StackPage();
	ExcelReader excelUtils;

	@Given("For stack the user signs in to dsAlgo Portal")
	public void for_stack_the_user_signs_in_to_ds_algo_portal() {

		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackPage.performLogin("SignInDetails", 7);
	}


	@When("The user clicks the Getting Started button in the Stack Panel Or The user selects the Stack item from the drop-down menu")
	public void the_user_clicks_the_getting_started_button_in_the_stack_panel_or_the_user_selects_the_stack_item_from_the_drop_down_menu() {
		stackPage.getStartStack();
		LoggerLoad.info("clicked the getting started method");
	}

	@Then("The user is directed to the Stack Data Structure Page")
	public void the_user_is_directed_to_the_stack_data_structure_page() {
		Assert.assertTrue(stackPage.isStackPageDisplayed(), "Failed to navigate to the Stack Data Structure page.");
		LoggerLoad.info("Redirected to stack page");
	}

	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {
		loginPage.getHomeURL();
		stackPage.getStartStack();
		LoggerLoad.info("in stack page");
	}

	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
		stackPage.getoptsSlackURL();
		LoggerLoad.info("Operations in Stack button clicked");
	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("operations-in-stack"), "not in operations_in_stack_page");
		LoggerLoad.info("redirected to Operations in Stack page");
	}

	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		loginPage.getHomeURL();
		stackPage.getStartStack();
		stackPage.getoptsSlackURL();
		LoggerLoad.info("on the Operations in Stack page");
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
		stackPage.clickTryHere();
		LoggerLoad.info("Try here button clicked");
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test of Stack page")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_of_stack_page() {

		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
		LoggerLoad.info("redirected to a page having a try Editor");
	}

	@Given("The user is in the tryEditor page of Stack")
	public void the_user_is_in_the_try_editor_page_of_stack() {
		stackPage.gettryEditorURL();
	}

	@When("For stack the user clicks the Run button after entering {int} from {string}")
	public void for_stack_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet = "TryEditor";
		String invalidCode = excelUtils.getCellData(sheet, RowNumber - 1, 0);
		
		stackPage.enterCode(invalidCode);
			
		stackPage.clickRunButton();
		LoggerLoad.info("user clicked the Run button");

	}

	@Then("The user should able to see an error message in alert window of Stack page")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_stack_page() {
		
	    
		
	    try {
	    	
	    	stackPage.alert();
		    String actualAlertText = stackPage.alert().getText();
		    Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
		   
		   // String expectedAlertText = "SyntaxError: bad input on line 1"; 

		    stackPage.alert().accept();
	    } catch (TimeoutException e) {
	        
	        Assert.fail("Expected an alert with an error message, but no alert appeared.");
	    }
	}
	    
	

	@Then("The user should able to see output in the console of Stack")
	public void the_user_should_able_to_see_output_in_the_console_of_stack() {
		String output = stackPage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of queue");

	}

	@Given("The user is on the Tryeditor of Operations in Stack page")
	public void the_user_is_on_the_tryeditor_of_operations_in_stack_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("on the Tryeditor of Operations in Stack page");

	}

	@When("The user click on the Back arrow on top Operations in Stack page")
	public void the_user_click_on_the_back_arrow_on_top_operations_in_stack_page() {
		stackPage.getBackOPS();
		stackPage.getoptsSlackURL();
		LoggerLoad.info("clicked on the Back arrow");
	}

	@Then("The user should be redirected back to Operations in Stack page.")
	public void the_user_should_be_redirected_back_to_operations_in_stack_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("operations-in-stack"), "not in operations_in_stack_page");
		LoggerLoad.info("redirected back to Operations in Stack page");
	}

	@When("The user clicks Implementation button")
	public void the_user_clicks_implementation_button() {
		stackPage.Implementation();
		LoggerLoad.info("Clicked the Implementation button");
	}

	@Then("The user should be redirected to Implementation page")
	public void the_user_should_be_redirected_to_implementation_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation"), "not in implementation");
		LoggerLoad.info("redirected to Implementation page");
	}

	@Given("The user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
		loginPage.getHomeURL();
		stackPage.getStartStack();
		stackPage.Implementation();
		LoggerLoad.info("on the Implementation page");

	}

	@When("The user clicks Try Here button in Implementation page")
	public void the_user_clicks_try_here_button_in_implementation_page() {
		stackPage.clickTryHere();
		LoggerLoad.info("clicked Try Here button in Implementation page");
	}

	@Given("The user is on the Tryeditor of Implementation page")
	public void the_user_is_on_the_tryeditor_of_implementation_page() {

		stackPage.gettryEditorURL();
		LoggerLoad.info("on the Tryeditor of Implementation page");

	}

	@When("The user click on the Back arrow on top of Implementation page")
	public void the_user_click_on_the_back_arrow_on_top_of_implementation_page() {
		stackPage.getBackImplementation();
		LoggerLoad.info("clicked on the Back arrow on top of Implementation page");
	}

	@Then("The user should be redirected back to Implementation page.")
	public void the_user_should_be_redirected_back_to_implementation_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation"), "not in implementation");
		LoggerLoad.info("redirected back to Implementation page");
	}

	@When("The user clicks Applications button")
	public void the_user_clicks_applications_button() {
		stackPage.applications();
		LoggerLoad.info("clicked Applications button");
	}

	@Then("The user should be redirected to Applications page")
	public void the_user_should_be_redirected_to_applications_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("applications"), "not in applications");
		LoggerLoad.info("Redirected to Applications page");
	}

	@Given("The user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
		loginPage.getHomeURL();
		stackPage.getStartStack();
		stackPage.applications();
		LoggerLoad.info("On the Applications page");
	}

	@When("The user clicks Try Here button in Applications page")
	public void the_user_clicks_try_here_button_in_applications_page() {
		stackPage.clickTryHere();  
		LoggerLoad.info("On the Applications page");
	}

	@Given("The user is on the Tryeditor of Applications page")
	public void the_user_is_on_the_tryeditor_of_applications_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("on the Tryeditor of Applications page");
	}

	@When("The user click on the Back arrow on top of Applications page")
	public void the_user_click_on_the_back_arrow_on_top_of_applications_page() {
		stackPage.getBackApplication();
		LoggerLoad.info("clicked on the Back arrow on top of Applications page");
	}

	@Then("The user should be redirected back to Applications page.")
	public void the_user_should_be_redirected_back_to_applications_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("applications"), "not in applications");
		LoggerLoad.info("redirected back to Applications page");
	}

	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {
		loginPage.getHomeURL();
		stackPage.getStartStack();
		stackPage.applications();
		LoggerLoad.info("in the Stack page");
	}

	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {
		stackPage.clickPracticeQuestionsButton();
		LoggerLoad.info("clicked Practice Questions button");

	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),"User is not redirected to the Practice page.");
		LoggerLoad.info("redirected to Practice page");
	}

}
