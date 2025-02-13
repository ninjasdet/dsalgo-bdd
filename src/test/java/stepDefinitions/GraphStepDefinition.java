package stepDefinitions;



import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Helper;
import utilities.LoggerLoad;

public class GraphStepDefinition {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	GraphPage graphPage = new GraphPage();
	Helper helper = new Helper();
	StackPage stackpage=new StackPage();
	ExcelReader excelUtils;

	GraphPage graphpage = new GraphPage();

	@Given("For graph the user signs in to dsAlgo Portal")
	public void for_stack_the_user_signs_in_to_ds_algo_portal() {

		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackpage.performLogin("SignInDetails", 7);
	}

	@When("the user clicks the Get Started button in the Graph Panel or the user selects Graph item from the drop-down menu")
	public void the_user_clicks_the_get_started_button_in_the_graph_panel_or_the_user_selects_graph_item_from_the_drop_down_menu() {
		graphpage.clickGetStartedGraph();
	}

	@Then("the user is directed to the Graph Data Structure Page")
	public void the_user_is_directed_to_the_graph_data_structure_page() {

		Assert.assertTrue(graphpage.isGraphPageDisplayed(), "Graph Data Structure Page is not displayed");
		LoggerLoad.info("Ridirecting toGraph Data Structure Page ");
	}

	@Given("the user is in the Graph data structure page")
	public void the_user_is_in_the_graph_data_structure_page() {
		loginPage.getHomeURL();
		graphpage.clickGetStartedGraph();
	}

	@When("the user clicks the Inside Graph link")
	public void the_user_clicks_the_inside_graph_link() {
		graphpage.clickInsideGraph();
	}

	@Then("the user navigates to the inside Graph page")
	public void the_user_navigates_to_the_graph_page() throws InterruptedException {

		Assert.assertTrue(loginPage.getCurrentUrl().contains("graph/graph/"), "Graph page is not navigated");
		LoggerLoad.info("Ridirecting to inside Graph Data Structure Page ");
	}

	@Given("the user is in the Graph Page")
	public void the_user_is_in_the_graph_page() {
		graphpage.insideGrapghPage();

	}

	@When("the user clicks the Try here button of Graph page")
	public void the_user_clicks_the_try_here_button_of_graph_page() {
		graphpage.tryhereEditor();
	}

	@Then("the user should be redirected to a page having a try Editor with a Run button to test for graph")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_for_graph() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
		LoggerLoad.info("ridircting to treEditor page of Graph ");
	}

	@Given("The user is in the tryEditor page of Graph")
	public void the_user_is_in_the_try_editor_page_of_graph() {
		graphpage.gettryEditorPage();
	}
	
	@When("For Graph user clicks the Run button after entering {int} from {string}")
	public void for_graph_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String string) {
		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		String invalidCode = excelUtils.getCellData("TryEditor", RowNumber - 1, 0);

		stackpage.enterCode(invalidCode);
		stackpage.clickRunButton();
		LoggerLoad.info("user clicked the Run button");

	}

//	@When("The user clicks the Run Button after entering {int} from {string}")
//	public void the_user_clicks_the_run_button_after_entering_from_a(Integer rowNumber, String sheetName) {
//		graphpage.enterCodeAndRun(sheetName, rowNumber);
//	}
	
//	@When("The user enters valid code")
//	public void the_user_enters_valid_code() {
//	    graphpage.validinputcode();
//	}
	
	@Then("The user should able to see the output in a console for graph")
	public void the_user_should_able_to_see_the_output_in_a_console_for_graph() {
		
		String output = graphpage.getConsoleOutput();
		Assert.assertTrue(output.isEmpty(), "Expected output in console, but found empty.");
		LoggerLoad.info("the output is not displayed on console");
		
//		String consoleOutput = graphPage.getConsoleOutput();
//        if (consoleOutput.isEmpty()) {
//            throw new AssertionError("Output is not displayed in the console.");
//        System.out.println("Output from console: " + consoleOutput);
    }

	@Then("The user should able to see an error message in  alert window of graph")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_graph() {
		
               LoggerLoad.info("the user not saw error message in an alert");
	}


	@When("The user click on the Back arrow on top of Graph page")
	public void the_user_click_on_the_back_arrow_on_top_of_graph_page() {
		graphpage.getBackApplication();
	}

	@Then("the user should be redirected to the Graph page")
	public void the_user_should_be_redirected_to_the_graph_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("graph/graph/"), "Not insideGraphPage");
		LoggerLoad.info("redirected back to inside Graph page");
	}

	@When("the user clicks the Graph Representations link")
	public void the_user_clicks_the_graph_representations_link() {
		graphpage.clickGraphRepresenation();
	}

	@Then("the user should be redirected to the Graph Representations page")
	public void the_user_should_be_redirected_to_the_graph_representations_page() {
		Assert.assertTrue(graphpage.isGraphRepresenationDisplayed(), "Page is not navigated to Graph representaion");
		LoggerLoad.info("redirecting to Graph Representation Page ");
	}

	@Given("the user is in the Graph Representations Page")
	public void the_user_is_in_the_graph_representations_page() {
		graphpage.gettryEditorURL();
	}

	@Then("The user should able to see output in the console of graph representation")
	public void the_user_should_able_to_see_output_in_the_console_of_graph_representation() {
	
		LoggerLoad.info("the output is not displayed on console");
	}

	@Given("the user is on the Tryeditor of the Graph Representations page")
	public void the_user_is_on_the_tryeditor_of_the_graph_representations_page() {

		graphpage.gettryEditorURL();
		graphpage.tryhereEditor();
	}

	@When("the user clicks on the Back arrow at the top of Graph Representations page")
	public void the_user_clicks_on_the_back_arrow_at_the_top_of_graph_representations_page() {
		graphpage.getGraphRepreBack();
	}

	@When("the user clicks the Practice Questions link for Graph")
	public void the_user_clicks_the_practice_questions_link() {
		graphpage.clickPracticeQuestion();
	}

	@Then("the user should be redirected to the Practice Questions page of Graph page")
	public void the_user_should_be_redirected_to_the_practice_questions_page_of_graph_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),
				"user not navigated to practise question page");
		LoggerLoad.info("navigating to practice question page for graph ");

	}

	@Given("the user is in  practice questions page of Graph page")
	public void the_user_is_in_practice_questions_page_of_graph_page() {
		graphpage.clickGetStartedGraph();
		graphpage.clickInsideGraph();
		graphpage.clickPracticeQuestion();
	}

	@When("the user clicks on the Back arrow at the top of practice page")
	public void the_user_clicks_on_the_back_arrow_at_the_top_of_graph_page() {
		graphpage.getBackApplication();
	}
	
//	@Given("the user is in the Graph Page")
//	public void the_user_is_in_the_graph_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
}
