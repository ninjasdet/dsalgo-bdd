package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class QueueStepDefinition {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	StackPage stackPage = new StackPage();
	ExcelReader excelUtils;
	QueuePage queuePage = new QueuePage();

	@Given("For queue the user signs in to dsAlgo Portal")
	public void for_queue_the_user_signs_in_to_ds_algo_portal() {

		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackPage.performLogin("SignInDetails", 7);
		LoggerLoad.info("user signs in to portal for queue");
	}

	@When("The user clicks the Getting Started button in the Queue Panel Or The user selects the Queue item from the drop-down menu")
	public void the_user_clicks_the_getting_started_button_in_the_queue_panel_or_the_user_selects_the_queue_item_from_the_drop_down_menu() {
		queuePage.getStartQueue();
		LoggerLoad.info("user clicked get started button");

	}

	@Then("The user is directed to the Queue Data Structure Page")
	public void the_user_is_directed_to_the_queue_data_structure_page() {

		Assert.assertTrue(loginPage.getCurrentUrl().contains("queue"), "not In Queue page");

		LoggerLoad.info("Redirected to Queue page");

	}

	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {

		loginPage.getHomeURL();
		queuePage.getStartQueue();
		LoggerLoad.info("in Queue page");
	}

	@Then("The user should be redirected to Implementation of Queue in Python page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-lists"),
				"User is not redirected to Implementation of Queue in Python page.");
		LoggerLoad.info("redirected to implementation of queue in python");
	}

	@Given("The user is on the Implementation of Queue in Python page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() {
		loginPage.getHomeURL();
		queuePage.getStartQueue();
		queuePage.clickImplementationQueuePython();
		LoggerLoad.info("on the implentation of queue in python page");
	}

	@When("The user clicks Try Here button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {

		stackPage.clickTryHere();
		LoggerLoad.info("Try here button clicked");
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test of Queue")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_of_queue() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
		LoggerLoad.info("redirected to a page having a try Editor");
	}

	@Given("The user is in the tryEditor page of queue")
	public void the_user_is_in_the_try_editor_page_of_queue() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("in the tryeditor page of queue");
	}

	@When("For queue The user clicks the Run button after entering {int} from {string}")
	public void for_queue_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
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

	

	@Then("In alert window of queue page The user should able to see an error message in alert window")
	public void in_alert_window_of_queue_page_the_user_should_able_to_see_an_error_message_in_alert_window() {

	    try {
	    	
	    	stackPage.alert();
		    String actualAlertText = stackPage.alert().getText();
		    Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
		  
		    stackPage.alert().accept();
	    } catch (TimeoutException e) {
	        
	        Assert.fail("Expected an alert with an error message, but no alert appeared.");
	    }
	}
	

	@Given("The user is on the Tryeditor of Implementation of Queue in Python page")
	public void the_user_is_on_the_tryeditor_of_implementation_of_queue_in_python_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("on the tryeditor page of implementation of queue in python page");
	}

	@When("The user click on the Back arrow of Implementation of Queue in Python page")
	public void the_user_click_on_the_back_arrow_of_implementation_of_queue_in_python_page() {
		queuePage.getBackQueue();
		queuePage.clickImplementationQueuePython();
		LoggerLoad.info("clicked the back arrow");
	}

	@Then("The user should be redirected back to Implementation of Queue in Python page.")
	public void the_user_should_be_redirected_back_to_implementation_of_queue_in_python_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-lists"),
				"User is not redirected to Implementation of Queue in Python page.");
		LoggerLoad.info("redirected back to implementation of queue in python");
	}

	@When("The user clicks Implementation using collections.deque page button")
	public void the_user_clicks_implementation_using_collections_deque_page_button() {
		queuePage.clickImplementationCollectionsDeque();
		LoggerLoad.info("clicked implementations using collections.deque page");

	}

	@Then("The user should be redirected to Implementation using collections.deque page page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-collections"),
				"User is not redirected to Implementation using collections.deque page page");
		LoggerLoad.info("redirected to implementation using collections.deque");
	}

	@Given("The user is on the Implementation using collections.deque page page")
	public void the_user_is_on_the_implementation_using_collections_deque_page_page() {
		loginPage.getHomeURL();
		queuePage.getStartQueue();
		queuePage.clickImplementationCollectionsDeque();
		LoggerLoad.info("user is on implementation using collections.deque");

	}

	@When("The user clicks Try Here button in Implementation using collections.deque page page")
	public void the_user_clicks_try_here_button_in_implementation_using_collections_deque_page_page() {
//		queuePage.gettryEditorURLqueue();
//		queuePage.clickImplementationCollectionsDeque();
//		stackPage.clickTryHere();
		stackPage.clickTryHere();
		LoggerLoad.info("Try here button clicked");
	}

	@Given("The user is on the Tryeditor of Implementation using collections.deque page")
	public void the_user_is_on_the_tryeditor_of_implementation_using_collections_deque_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("on the try editor of implentation using collections deque");
	}

	@When("the user clicks on the Back arrow of Implementation using collections.deque page")
	public void the_user_clicks_on_the_back_arrow_of_implementation_using_collections_deque_page() {
		queuePage.getBackQueue();
		queuePage.clickImplementationCollectionsDeque();
		LoggerLoad.info("clicked on the back arrow");
	}

	@Then("The user should be redirected back to Implementation using collections.deque page")
	public void the_user_should_be_redirected_back_to_implementation_using_collections_deque_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-collections"),
				"User is not redirected to Implementation using collections.deque page page");
		LoggerLoad.info("redirected back to Implementation using collections.deque");
	}

	@When("The user clicks Implementation using array button")
	public void the_user_clicks_implementation_using_array_button() {
		queuePage.clickImplementationUsingArray();
		LoggerLoad.info("clicked Implementation using array button");
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("Implementation-array"),
				"User is not redirected to Implementation using array");
		LoggerLoad.info("redirected to Implementation using array page");
	}

	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_implementation_using_array_page() {
		loginPage.getHomeURL();
		queuePage.getStartQueue();
		queuePage.clickImplementationUsingArray();
		LoggerLoad.info("on the Implementation using array page");
	}

	@When("The user clicks Try Here button in Implementation using array page")
	public void the_user_clicks_try_here_button_in_implementation_using_array_page() {
//		queuePage.gettryEditorURLqueue();
//		queuePage.clickImplementationCollectionsDeque();
//		queuePage.clickImplementationUsingArray();
		stackPage.clickTryHere();
		LoggerLoad.info("clicked Try Here button");
	}

	@Given("The user is on the Tryeditor of Implementation using array page")
	public void the_user_is_on_the_tryeditor_of_implementation_using_array_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("on the Tryeditor of Implementation using array page");
	}

	@When("the user clicks on the Back arrow of Implementation using array page")
	public void the_user_clicks_on_the_back_arrow_of_implementation_using_array_page() {
		queuePage.getBackQueue();
		queuePage.clickImplementationUsingArray();
		LoggerLoad.info("clicked Back arrow");
	}

	@Then("The user should be redirected back to Implementation using array page .")
	public void the_user_should_be_redirected_back_to_implementation_using_array_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("Implementation-array"),
				"User is not redirected to Implementation using array");
		LoggerLoad.info("redirected back to Implementation using array page");
	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		queuePage.clickQueueOperationsButton();
		LoggerLoad.info("clicked Queue Operations button");

	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("QueueOp"),
				"User is not redirected to Queue Operations page");
		LoggerLoad.info("redirected to Queue Operations page");
	}

	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {
		loginPage.getHomeURL();
		queuePage.getStartQueue();
		queuePage.clickQueueOperationsButton();
		LoggerLoad.info("on the Queue Operations page");
	}

	@When("The user clicks Try Here button in Queue Operations page")
	public void the_user_clicks_try_here_button_in_queue_operations_page() {

		stackPage.clickTryHere();
		LoggerLoad.info("clicked Try Here button");
	}

	@Then("The user should able to see output in the console of queue")
	public void the_user_should_able_to_see_output_in_the_console_of_queue() {
		String output = stackPage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of queue");
	}

	@Given("The user is on the Tryeditor of Queue Operations page")
	public void the_user_is_on_the_tryeditor_of_queue_operations_page() {
		stackPage.gettryEditorURL();
		LoggerLoad.info("Tryeditor of Queue Operations page");
	}

	@When("the user clicks on the Back arrow of Queue Operations page")
	public void the_user_clicks_on_the_back_arrow_of_queue_operations_page() {
		queuePage.getBackQueue();
		queuePage.clickQueueOperationsButton();
		LoggerLoad.info("clicked on the Back arrow");
	}

	@Then("The user should be redirected back to Queue Operations page")
	public void the_user_should_be_redirected_back_to_queue_operations_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("QueueOp"), "User is not redirected to Queue Operations");
		LoggerLoad.info("redirected back to Queue Operations page");
	}

	@Given("The user is in the Queue page")
	public void the_user_is_in_the_queue_page() {
		loginPage.getHomeURL();
		queuePage.getStartQueue();
		queuePage.clickQueueOperationsButton();
		LoggerLoad.info("in the Queue page");
	}

	@When("the user clicks the Practice Questions link of queue")
	public void the_user_clicks_the_practice_questions_link_of_queue() {
		queuePage.clickPracticeQuestionsButtonQueue();
		LoggerLoad.info("clicked Practice Questions button");
		LoggerLoad.info("clicked the Practice Questions ");
	}

	@Then("the user should be redirected to the Practice Questions page of queue")
	public void the_user_should_be_redirected_to_the_practice_questions_page_of_queue() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),
				"User is not redirected to the Practice page.");
		LoggerLoad.info("redirected to Practice page");

	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
		queuePage.clickImplementationQueuePython();
		LoggerLoad.info("in implementation of queue in python");
	}

}
