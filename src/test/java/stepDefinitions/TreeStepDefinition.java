package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDefinition {

CommonStepDefinitions commonMethod=new CommonStepDefinitions();

@Given("the user signs into dsAlgo Portal")
public void the_user_signs_into_ds_algo_portal() {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in the Home page after signing in")
public void the_user_is_in_the_home_page_after_signing_in() {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks the {string} button in the Tree Panel or the user selects {string} item from the drop-down menu")
public void the_user_clicks_the_button_in_the_tree_panel_or_the_user_selects_item_from_the_drop_down_menu(String string, String string2) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user directed to the {string} Data Structure Page")
public void the_user_directed_to_the_data_structure_page(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/*Scenario: Verify that the user is able to navigate to "Overview of Trees"*
  this is commomn code for all linkfof tree.use parametrized concept */
@Given("The user is in the {string} Data Structure page")
public void the_user_is_in_the_data_structure_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks the {string} link")
public void the_user_clicks_the_link(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user is directed to {string} Page")
public void the_user_is_directed_to_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//Scenario: Verify that user is able to navigate to TryEditor page for "Overview of Trees"

//manually created
public void userPage(String string) {
	// Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_is_in_the_page(string);
    
}

@When("The user clicks {string} button in Overview of Trees page")
public void the_user_clicks_button_in_overview_of_trees_page(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

// Verify that user should receives error when click on run button without entering code for"Overview of Trees" 
@Given("The user is in {string} page of {string}")
public void the_user_is_in_page_of(String string, String string2) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks the {string} button without entering the code in the Editor")
public void the_user_clicks_the_button_without_entering_the_code_in_the_editor(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should able to see error message in the window")
public void the_user_should_able_to_see_error_message_in_the_window() {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//Verify that user should receives error when click on run button with entering invalid input  for
@When("The user clicks the {string} button with entering the invalid code in the Editor")
public void the_user_clicks_the_button_with_entering_the_invalid_code_in_the_editor(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should able to see error message in the alert window")
public void the_user_should_able_to_see_error_message_in_the_alert_window() {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//Verify that user should receives output on console when click on run button with entering valid input of Overview of Trees

@When("The user clicks the {string} button with entering the valid code in the Editor")
public void the_user_clicks_the_button_with_entering_the_valid_code_in_the_editor(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
//manual method creation

public void treeoutput_console() {
	// Write code here that turns the phrase above into concrete actions
	commonMethod.the_user_should_able_to_see_output_in_the_console();
}

// Scenario: Verify that the user shoud be back to Overview of Trees
@Given("The user is on the {string} Overview of Trees page")
public void the_user_is_on_the_overview_of_trees_page(String string) {
	// Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//manually created method for tree
public void clickBackArrow(String string) {
	// Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_click_on_the_arrow_on_top(string);
}

//manuall
public void theuserRedirected(String string) {
	// Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_should_be_redirected_to_page(string);
}

//manually created
public void redirectpage() {
    // Write code here that turns the phrase above into concrete actions
	commonMethod.the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test();
}

@When("The user clicks {string} button in Terminologies page")
public void the_user_clicks_button_in_terminologies_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Terminologies page")
public void the_user_is_on_the_terminologies_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is in {string} DataStructure page")
public void the_user_is_in_data_structure_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Types of Trees page")
public void the_user_clicks_button_in_types_of_trees_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//manual creation
public void userclicksRunbutton(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_clicks_the_run_button_after_entering_from(int1, string);
}

@Given("The user is on the {string} Types of Trees")
public void the_user_is_on_the_types_of_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Tree Traversals page")
public void the_user_clicks_button_in_tree_traversals_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Tree Traversals page")
public void the_user_is_on_the_tree_traversals_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Traversals-Illustration page")
public void the_user_clicks_button_in_traversals_illustration_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Traversals-Illustration page")
public void the_user_is_on_the_traversals_illustration_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Binary Trees page")
public void the_user_clicks_button_in_binary_trees_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Binary Trees page")
public void the_user_is_on_the_binary_trees_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Types of Binary Trees page")
public void the_user_clicks_button_in_types_of_binary_trees_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Types of Binary Trees page")
public void the_user_is_on_the_types_of_binary_trees_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Implementation in python")
public void the_user_clicks_button_in_implementation_in_python(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Implementation in python page")
public void the_user_is_on_the_implementation_in_python_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Binary Tree Traversals")
public void the_user_clicks_button_in_binary_tree_traversals(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Binary Tree Traversals")
public void the_user_is_on_the_binary_tree_traversals(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Implementation of Binary Trees")
public void the_user_clicks_button_in_implementation_of_binary_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Implementation of Binary Trees")
public void the_user_is_on_the_implementation_of_binary_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Applications of Binary Trees")
public void the_user_clicks_button_in_applications_of_binary_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Applications of Binary Trees")
public void the_user_is_on_the_applications_of_binary_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Binary Search Trees")
public void the_user_clicks_button_in_binary_search_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Binary Search Trees")
public void the_user_is_on_the_binary_search_trees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks {string} button in Implementation Of BST")
public void the_user_clicks_button_in_implementation_of_bst(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the {string} Implementation Of BST")
public void the_user_is_on_the_implementation_of_bst(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be redirected to a page having a try Editor with a Run button")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//manuall
public void userinTryEditor() {
    // Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_is_in_the_try_editor_page();
}

@Then("The user should be redirected to a {string} page")
public void the_user_should_be_redirected_to_a_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should  redirected to  {string} page")
public void the_user_should_redirected_to_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be redirected to the {string} of tree page")
public void the_user_should_be_redirected_to_the_of_tree_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be redirected a {string} page")
public void the_user_should_be_redirected_a_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//manuall
public void theuserclicksRun(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
    commonMethod.the_user_clicks_the_run_button_after_entering_from(int1, string);
}

@Given("The user is in the tryEditor page of Tree")
public void the_user_is_in_the_try_editor_page_of_tree() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
//manuall
public void userclicksRun(Integer int1, String string) {
    // Write code here that turns the phrase above into concrete actions
   commonMethod.the_user_clicks_the_run_button_after_entering_from(int1, string);
}

//manuall
public void userinTreepage(String string) {
	// Write code here that turns the phrase above into concrete actions
	commonMethod.the_user_is_in_the_page(string);
}

//manuall
public void clicksRunbutton(Integer int1, String string) {
	// Write code here that turns the phrase above into concrete actions
	commonMethod.the_user_clicks_the_run_button_after_entering_from(int1, string);
}


}
