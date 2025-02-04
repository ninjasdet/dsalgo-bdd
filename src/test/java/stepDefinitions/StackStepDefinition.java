package stepDefinitions;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ExcelReader;

public class StackStepDefinition {
CommonStepDefinitions commonMethods=new CommonStepDefinitions();
LoginPage loginPage = new LoginPage();	
HomePage homePage = new HomePage();
StackPage stackPage = new StackPage();
ExcelReader excelUtils;
@Given("The user signs in to the DS Algo portal")
public void the_user_signs_in_to_the_ds_algo_portal() {
  
	homePage.getbaseUrl();
}

@Given("The user clicks on the Get Started button")
public void the_user_clicks_on_the_get_started_button() {
	loginPage.getUStartedButtonClick();
}

@Given("The user is on the Home page after signing in")
public void the_user_is_on_the_home_page_after_signing_in() {
	loginPage.getHomeURL();
}

@When("The user clicks the Getting Started button in the Stack Panel Or The user selects the Stack item from the drop-down menu")
public void the_user_clicks_the_getting_started_button_in_the_stack_panel_or_the_user_selects_the_stack_item_from_the_drop_down_menu() {
    stackPage.getStartStack();
}



@Then("The user is directed to the Stack Data Structure Page")
public void the_user_is_directed_to_the_stack_data_structure_page() {
	Assert.assertTrue(stackPage.isStackPageDisplayed(), "Failed to navigate to the Stack Data Structure page.");
}

@Given("The user is in the Stack page after Sign in")
public void the_user_is_in_the_stack_page_after_sign_in() {
	loginPage.getHomeURL();
	stackPage.getStartStack();
}

@When("The user clicks Operations in Stack button")
public void the_user_clicks_operations_in_stack_button() {
	stackPage.getoptsSlackURL();
}

@Then("The user should be redirected to Operations in Stack page")
public void the_user_should_be_redirected_to_operations_in_stack_page() {
	
}

@Given("The user is on the Operations in Stack page")
public void the_user_is_on_the_operations_in_stack_page() {
	loginPage.getHomeURL();
	stackPage.getStartStack();
}

@When("The user clicks Try Here button in Operations in Stack page")
public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
	stackPage.clickTryHere(); //TBD
}

@Given("The user is in the tryEditor page of Stack")
public void the_user_is_in_the_try_editor_page_of_stack() {
	stackPage.gettryEditorURL();
}

//
@Then("The user should able to see an error message in alert window of Stack page")
public void the_user_should_able_to_see_an_error_message_in_alert_window_of_stack_page() {
   // Write code here that turns the phrase above into concrete actions
   System.out.println("testing");
   
//   Alert alert ;
//   alert = stackPage.alert();
//   String alertMessage = alert.getText();
//   Assert.assertTrue(alertMessage.contains("Error"), "Expected an error alert but got: " + alertMessage);
//   alert.accept();
}




	//
@Given("The user is on the Tryeditor of Operations in Stack page")
public void the_user_is_on_the_tryeditor_of_operations_in_stack_page() {
	stackPage.gettryEditorURL();
}
//
@When("The user click on the Back arrow on top")
public void the_user_click_on_the_back_arrow_on_top() {
	stackPage.getBackOPS();
}
//
@Then("The user should be redirected back to Operations in Stack page.")
public void the_user_should_be_redirected_back_to_operations_in_stack_page() {
	Assert.assertTrue(loginPage.getCurrentUrl().contains("operations-in-stack"), "operations_in_stack_page");
}
//
@When("The user clicks Implementation button")
public void the_user_clicks_implementation_button() {
	stackPage.Implementation();
}
//
@Then("The user should be redirected to Implementation page")
public void the_user_should_be_redirected_to_implementation_page() {
	Assert.assertTrue(loginPage.getCurrentUrl().contains(""), "implementation");
}
//implementation
@Given("The user is on the Implementation page")
public void the_user_is_on_the_implementation_page() {
	stackPage.Implementation();
}
//
@When("The user clicks Try Here button in Implementation page")
public void the_user_clicks_try_here_button_in_implementation_page() {
	stackPage.clickTryHere(); //TBD
}

@Given("The user is on the Tryeditor of Implementation page")
public void the_user_is_on_the_tryeditor_of_implementation_page() {
	stackPage.gettryEditorURL();
}
//
@Then("The user should be redirected back to Implementation page.")
public void the_user_should_be_redirected_back_to_implementation_page() {
	Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation"), "implementation");
}
@When("The user click on the Back arrow on top of Implementation page")
public void the_user_click_on_the_back_arrow_on_top_of_implementation_page() {
	stackPage.getBackImplementation();
}

@When("The user clicks Applications button")
public void the_user_clicks_applications_button() {
	stackPage.applications();
}
//
@Then("The user should be redirected to Applications page")
public void the_user_should_be_redirected_to_applications_page() {
	Assert.assertTrue(loginPage.getCurrentUrl().contains(""), "applications");
}

@Given("The user is on the Applications page")
public void the_user_is_on_the_applications_page() {
	stackPage.applications();
}
//
@When("The user clicks Try Here button in Applications page")
public void the_user_clicks_try_here_button_in_applications_page() {
	stackPage.clickTryHere(); //TBD
}

@When("The user click on the Back arrow on top of Applications page")
public void the_user_click_on_the_back_arrow_on_top_of_applications_page() {
	stackPage.getBackApplication();
}

@Given("The user is on the Tryeditor of Applications page")
public void the_user_is_on_the_tryeditor_of_applications_page() {
	stackPage.gettryEditorURL();
}

@Then("The user should be redirected back to Applications page.")
public void the_user_should_be_redirected_back_to_applications_page() {
	Assert.assertTrue(loginPage.getCurrentUrl().contains("applications"), "applications");
}

//@Given("The user is in the Stack page")
//public void the_user_is_in_the_stack_page() {
//	loginPage.getHomeURL();
//	stackPage.getStartStack();
//}
//
//@When("The user clicks Practice Questions button")
//public void the_user_clicks_practice_questions_button() {
//	 stackPage.clickPracticeQuestionsButton();
//}
//
//@Then("The user should be redirected to Practice page")
//public void the_user_should_be_redirected_to_practice_page() {
//	  Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"), "User is not redirected to the Practice page.");
//}

////common method manually created
	public void redirectingtotryeditor(){
//Write code here that turns the phrase above into concrete actions
		commonMethods.the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test();
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
	}

//manually created method
	public void clickRunforInvalid(Integer RowNumber, String SheetName) {
		// Write code here that turns the phrase above into concrete actions
		commonMethods.the_user_clicks_the_run_button_after_entering_from(RowNumber, SheetName);
		
	
		 String invalidCode = excelUtils.getCellData("TryEditor", RowNumber - 1, 0); 
		
		 stackPage.enterCode(invalidCode);
		 stackPage.clickRunButton();
        
	}

//common method in array nd stack
	public void stackoutput_onconsole()
		{
			commonMethods.the_user_should_able_to_see_output_in_the_console();
			String output = stackPage.getConsoleOutput();
	        Assert.assertFalse(output.isEmpty(), "Expected output in console, but found empty.");
	        System.out.println("Output: " + output);
		}
	

}
