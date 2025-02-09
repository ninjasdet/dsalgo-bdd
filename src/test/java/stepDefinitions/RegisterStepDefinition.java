package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;

import utilities.ExcelReader;

public class RegisterStepDefinition {

	ExcelReader excelUtils;
	StackPage stackPage = new StackPage();

	@Given("The user is on the user Registration page")
	public void the_user_is_on_the_user_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Run button after entering {int} from {string}")
	public void the_user_clicks_the_run_button_after_entering_from(int RowNumber , String SheetName)
	{

	}

	@Then("The user should able to see error message")
	public void the_user_should_able_to_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Register button after entering  {int} from {string} in related textboxes")
	public void the_user_clicks_register_button_after_entering_from_in_related_textboxes(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created You are logged in")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
