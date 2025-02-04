package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import utilities.DriverManager;

public class GraphStepDefinition extends DriverManager {

	CommonStepDefinitions commonMethods = new CommonStepDefinitions();
	GraphPage graphPage=new GraphPage();

	@Given("the user signs in to dsAlgo Portal")
	public void the_user_signs_in_to_ds_algo_portal() {

	}

	// manuall
	public void homepageAftersignIn() {
		// Write code here that turns the phrase above into concrete actions
		commonMethods.the_user_is_in_the_home_page_after_sign_in();
	}

	// manually created method
		public void clickRunButton(Integer int1, String string) {
			// Write code here that turns the phrase above into concrete actions
			commonMethods.the_user_clicks_the_run_button_after_entering_from(int1, string);
		}
		
	@When("the user clicks the {string} button in the Graph Panel or the user selects {string} item from the drop-down menu")
	public void the_user_clicks_the_button_in_the_graph_panel_or_the_user_selects_item_from_the_drop_down_menu(
			String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user is directed to the {string} Data Structure Page")
	public void the_user_is_directed_to_the_data_structure_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("the user is in the Graph data structure page")
	public void the_user_is_in_the_graph_data_structure_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user navigates to the {string}")
	public void the_user_navigates_to_the(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("the user is in the {string} Page")
	public void the_user_is_in_the_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// common method maually created.
	public void redirectPageRun() {
		// Write code here that turns the phrase above into concrete actions
		commonMethods.the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test();
	}

//	@Given("The user is in the tryEditor page")
//	public void the_user_is_in_the_try_editor_page() {
//
//	}

	

//	@Then("The user should able to see an error message in alert window")
//	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

	@Given("the user is on the {string} of Graph page")
	public void the_user_is_on_the_of_graph_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// manuall
	public void theuserclickBack(String string) {
		// Write code here that turns the phrase above into concrete actions
		commonMethods.the_user_click_on_the_arrow_on_top(string);
	}

	@Then("the user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("the user is in the {string} data structure page")
	public void the_user_is_in_the_data_structure_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("the user is on the {string} of the {string} page")
	public void the_user_is_on_the_of_the_page(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

//	@When("the user clicks on the {string} arrow at the top")
//	public void the_user_clicks_on_the_arrow_at_the_top(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

	@Given("the user is in  {string} page")
	public void the_user_is_in_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the tryEditor page of Graph")
	public void the_user_is_in_the_try_editor_page_of_graph() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

//	@Given("the user is in {string} page")
//	public void the_user_is_in_page(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("the user should be redirected to a page having a try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Run button after entering {int} from a {string}")
	public void the_user_clicks_the_run_button_after_entering_from_a_try_editor(Integer int1, String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see an error message in  alert window of graph")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_graph() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see the output in a console")
	public void the_user_should_able_to_see_the_output_in_a_console() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output in the console of graph representation")
	public void the_user_should_able_to_see_output_in_the_console_of_graph_representation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
