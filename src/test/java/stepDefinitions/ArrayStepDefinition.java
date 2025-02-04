
package stepDefinitions;
 
 import io.cucumber.java.en.Given; import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;
 
 public class ArrayStepDefinition {
 
 CommonStepDefinitions commonMethods = new CommonStepDefinitions();

   //manuall
    public void homepageSignIn() {
        commonMethods.the_user_is_in_the_home_page_after_sign_in();
    }

    @When("The user clicks the {string} button in Array Panel OR The user select Array item from the drop down menu")
    public void the_user_clicks_the_button_in_array_panel_or_the_user_select_array_item_from_the_drop_down_menu(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user be directed to {string} Data Structure Page")
    public void the_user_be_directed_to_data_structure_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is in the {string} page after Sign in")
    public void the_user_is_in_the_page_after_sign_in(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks {string} button")
    public void the_user_clicks_button(String string) {
        throw new io.cucumber.java.PendingException();
    }

    //manual created
    public void userRedirectedPage(String string) {
        commonMethods.the_user_should_be_redirected_to_page(string);
    }

    @Given("The user is on the {string} page")
    public void the_user_is_on_the_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks {string} button in Arrays in Python page")
    public void the_user_clicks_button_in_arrays_in_python_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be redirected to a page having an try Editor with a Run button to test")
    public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user clicks {string} link")
    public void the_user_clicks_link(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks {string} button in Introduction page")
    public void the_user_clicks_button_in_introduction_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    public void clickRunforInvalid(Integer int1, String string) {
        commonMethods.the_user_clicks_the_run_button_after_entering_from(int1, string);
    }

    public void arrayoutput_console() {
        commonMethods.the_user_should_able_to_see_output_in_the_console();
    }

    public void backArrowclick(String string) {
        commonMethods.the_user_click_on_the_arrow_on_top(string);
    }

    @Then("The user should be redirected to the {string} page")
    public void the_user_should_be_redirected_to_the_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    public void theuserpage(String string) {
        commonMethods.the_user_is_in_the_page(string);
    }

    @When("The user clicks the Submit Button after entering {int} from {string}")
    public void the_user_clicks_the_submit_button_after_entering_from(Integer int1, String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should able to see Error occurred during submission")
    public void the_user_should_able_to_see_error_occurred_during_submission() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be redirected back to {string} page")
    public void the_user_should_be_redirected_back_to_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should redirected back to the {string} page.")
    public void the_user_should_redirected_back_to_the_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be redirected again to {string} page")
    public void the_user_should_be_redirected_again_to_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

//    @Then("The user should able to see an error message in alert window")
//    public void the_user_should_able_to_see_an_error_message_in_alert_window() {
//        throw new io.cucumber.java.PendingException();
//    }
//
//    //manuall
//    public void theuserintryeditor() {
//        commonMethods.the_user_is_in_the_try_editor_page();
//    }

    @Given("The user is in the tryEditor page of Arrays in Python")
    public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks the Run Button after entering {int} from TryEditor")
    public void the_user_clicks_the_run_button_after_entering_from_try_editor(Integer int1) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user able to redirected to {string} page")
    public void the_user_able_to_redirected_to_page(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is in the tryEditor page of Array Application")
    public void the_user_is_in_the_try_editor_page_of_array_application() {
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks the Submit Button after entering {int} from TryEditor")
    public void the_user_clicks_the_submit_button_after_entering_from_try_editor(Integer int1) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should redirected to {string} page")
    public void the_user_should_redirected_to_page(String string) {
        throw new io.cucumber.java.PendingException();
    }
}
 