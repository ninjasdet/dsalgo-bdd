package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class LinkedListStepDefinition {
	LoginPage loginPage = new LoginPage() ;
	 HomePage homePage =  new HomePage() ;
	 StackPage stackPage = new StackPage();
	 //Helper helper = new Helper();
	 //registerpage = new Register();
	 
	 ExcelReader excelUtils;
	 String currentUrl;
	 WebDriver driver;
	 LinkedListPage linkedlistpage = new LinkedListPage ();
	 //public LinkedListStepDefinition() {
	       // this.linkedlistpage = new LinkedListPage(Hooks.getDriver());  // Ensure driver is passed
	    //} 
	 
	 
	    @Given("For Linked List Datastructure the user signs into dsAlgo Portal")
		public void For_Linked_List_Datastructure_the_user_signs_into_dsAlgo_portal() {
	
	 loginPage.getHomeURL();
	loginPage.getLoginBtn();
	stackPage.performLogin("SignInDetails", 7);
	//linkedlistpage.getStartedlinkedlist();
	
		
		
	}
	 
	@When("The user clicks the Getting Started button in the Linked List panel")
	public void The_user_clicks_the_Getting_Started_button_in_the_Linked_List_panel() {
		linkedlistpage.getStartedlinkedlist();
		 
	    }
	

	@Then("The user be directed to Linked List Data Structure Page")
	public void The_user_be_directed_to_Linked_List_Data_Structure_page() {
		Assert.assertTrue(linkedlistpage.isLinkedListPageDisplayed(), "Failed to navigate to the Linked List Data Structure page.");
		LoggerLoad.info("Redirected to Linked List page");
	}

	@Given("The user is in the Linked List Data Structure Page")
	public void The_user_is__in_the_Linked_List_Data_Structure_Page() {
		loginPage.getHomeURL();
		linkedlistpage.getStartedlinkedlist();
		linkedlistpage.clickGetstartedIntroduction();
		
	}

	@When("The user clicks the Introduction link")
	public void The_user_clicks_the_Introduction_link() {
		linkedlistpage.clickGetstartedIntroduction();
		LoggerLoad.info("redirecting toIntroduction page");
	}
	

	@Then("The user be redirected to Introduction in Linked List page")
	public void The_user_be_redirected_to_Introduction_in_Linked_List_page() {
		Assert.assertTrue(linkedlistpage.isIntroductionPageDisplayed(), "Page is not navigated to the Linked List Data Structure page.");
		LoggerLoad.info("Redirected to Linked List page");
	}

	@Given("The user is on the Introduction page")
	public void The_user_is_on_the_Introduction_page() {
		linkedlistpage.navigateToIntroductionPage();
		Assert.assertTrue(linkedlistpage.isIntroductionPageDisplayed());
}
	
	
	@When ("The user clicks Try Here button in Introduction page")
	public void The_user_clicks_Try_Here_button_in_Introduction_page() {
		linkedlistpage.Tryhere();
		
	}
	@Then("The user should be redirected to a page having an try Editor with a Run button to test Introduction page")
	public void The_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_Run_button_to_test_Introduction_page() {
		Assert.assertTrue(linkedlistpage.isTryEditorPageDisplayed());
}

	

	@Given("The user is in the tryEditor page of Introduction")
	public void The_user_is_in_the_tryEditor_page_of_Introduction() {
		linkedlistpage.getStartedlinkedlist();
		linkedlistpage.clickGetstartedIntroduction();
		linkedlistpage.gettryEditorURL();
		
		
    }
//	@When("For Linked List the user clicks the Run button after entering {int} from {string}")
//	public void for_Linked_list_the_user_clicks_the_Run_button_after_entering_from(Integer RowNumber, String sheet) {
//		try {
//
//			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//		sheet = "TryEditor";
//		String invalidCode = excelUtils.getCellData(sheet, RowNumber - 1, 0);
//		
//		stackPage.enterCode(invalidCode);
//			
//		stackPage.clickRunButton();
//		LoggerLoad.info("user clicked the Run button");
//
//	}

//	@Then("The user should able to see an error message in alert window for invalid data for Introduction")
//	public void The_user_should_able_to_see_an_error_message_in_alert_window_for_invalid_data_for_Introduction() {
//		  try {
//		    	
//		    	stackPage.alert();
//			    String actualAlertText = stackPage.alert().getText();
//			    Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
//			   
//			   // String expectedAlertText = "SyntaxError: bad input on line 1"; 
//
//			    stackPage.alert().accept();
//		    } catch (TimeoutException e) {
//		        
//		        Assert.fail("Expected an alert with an error message, but no alert appeared.");
//		    }
//		}
	
	@Then("The user should able to see an error message in alert window for Linked List")
	public void The_user_should_able_to_see_an_error_message_in_alert_window_for_invalid_data_for_Deletion() {
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
	

//	@Then("The user should able to see output in the console of Introduction page")
//	public void The_user_should_able_to_see_output_in_the_console_of_Introduction_page() {
//		String output = linkedlistpage.getConsoleOutput();
//		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
//		LoggerLoad.info("output in the console of Introduction page ");
//	}

	@When("The user click on the Back arrow on top of travesal page")
	public void The_user_click_on_the_Back_arrow_on_top_of_travesal_page() {
		linkedlistpage.getBackOPS();
		
		LoggerLoad.info("clicked on the Back arrow");

	}

	@Then("The user should be redirected to Linked List page")
	public void The_user_should_be_redirected_to_Linked_List_page() {
		
		Assert.assertTrue(loginPage.getCurrentUrl().contains("applications"), "not in applications");
		LoggerLoad.info("redirected back to Applications page");
	}

	@Given("The user clicks creating Linked List in Linked List")
	public void The_user_clicks_creating_Linked_List_in_Linked_List() {
		loginPage.getHomeURL();
		linkedlistpage.getStartedlinkedlist();
		linkedlistpage.CreatingLinkedList();
		
		
		
		LoggerLoad.info("Clicked the creating Linked List button");
	}

	@When("The user clicks Try Here button in Linked List")
	public void the_user_clicks_try_here_button_in_Deletion() {
		Assert.assertFalse(loginPage.getCurrentUrl().contains("Try Here"), "User is not on Try Here page of ");
		
		LoggerLoad.info("clicked Try Here button in Linked List");
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test the Creating Linked List")
	public void The_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_Run_button_to_test_the_Creating_Linked_List() {
		Assert.assertFalse(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
		LoggerLoad.info("redirected to a page having a try Editor");
	}

	@Then("The user should able to see an error message in alert window of Creating Linked List")
	public void The_user_should_able_to_see_an_error_message_in_alert_window_of_creating_Linked_List() {
		
			System.out.println("testing");
	}

//	@Then("The user should able to see output in the console of Creating Linked List")
//	public void the_user_should_able_to_see_output_in_the_console_of_creating_linked_list() {
//		String output = linkedlistpage.getConsoleOutput();
//		// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
//		// empty.");
//		System.out.println("Output: " + output);
//	}

	@Given("The user clicks Types of Linked list link")
	public void The_user_clicks_Types_of_Linked_List_Link() {
		linkedlistpage.TypesofLinkedList();
		LoggerLoad.info("clicked Types of Linked list link");
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test for Types of Linked list")
	public void The_user_should_be_redirected_to_a_page_having_an_try_Editor_with_a_Run_button_to_test_for_Types_of_Linked_list() {
		Assert.assertFalse(loginPage.getCurrentUrl().contains("tryEditor"), "page is not navigated to try Editor page ");
		LoggerLoad.info("Redirected to tryeditor page");

	}

	@Then("The user should able to see an error message in alert window of Types of Linked list")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_types_of_linked_list() {
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
		
		
	

//	@Then("The user should able to see output in the console of Types of Linked list")
//	public void the_user_should_able_to_see_output_in_the_console_of_types_of_linked_list() {
//		String output = stackPage.getConsoleOutput();
//		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
//		LoggerLoad.info("output in the console of Types of Linked list");
//
//
//	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		loginPage.getHomeURL();
		linkedlistpage.getStartedlinkedlist();
		linkedlistpage.TypesofLinkedList();
		LoggerLoad.info("on the Types of Linked List page");

		
	}

	@When("The user click on the Back arrow on top of Types of Linked List")
	public void the_user_click_on_the_back_arrow_on_top_of_types_of_linked_list() {
		linkedlistpage.getBackOPS();
		linkedlistpage.getIntroductionURL();
		LoggerLoad.info("clicked on the Back arrow");

	}

	@Given("The user clicks Implement Linked list in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		linkedlistpage.ImplementLinkedListinPython();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test Implement Linked List in Python")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_implement_linked_list_in_python() {
		Assert.assertFalse(loginPage.getCurrentUrl().contains("tryEditor"), "page is not navigated to an try Editor with a Run button to test Implement Linked List in Python ");
		LoggerLoad.info("Redirected to tryEditor page");

	}

	@Then("The user should able to see an error message in alert window for Implement Linked List in Python")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_implement_linked_list_in_python() {
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
    
	

//	@Then("The user should able to see output in the console of Implement Linked List in Python")
//	public void the_user_should_able_to_see_output_in_the_console_of_implement_linked_list_in_python() {
//		String output = stackPage.getConsoleOutput();
//		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
//		LoggerLoad.info("output in the console of Implement Linked List in Python");
//
//	}

	@When("The user click on the Back arrow on top of Implement Linked List in python")
	public void the_user_click_on_the_back_arrow_on_top_of_implement_linked_list_in_python() {
		linkedlistpage.getBackOPS();
		linkedlistpage.getIntroductionURL();
		LoggerLoad.info("clicked on the Back arrow");

	}

	@Given("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		linkedlistpage.Traversal();
	}

	@When("The user clicks Try Here button in Linked List page")
	public void the_user_clicks_try_here_button_in_linked_list_page() {
		linkedlistpage.Tryhere();
		LoggerLoad.info("clicked Try Here button in Linked List");
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test of Traversal page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_of_traversal_page() {
		Assert.assertTrue(linkedlistpage.isTryEditorPageDisplayed(), "Try Editor or Run button is not displayed.");
	}
	@Given("The user is in the tryEditor page of Linked List")
	public void The_user_is_in_the_tryEditor_page_of_Linked_List(){
		linkedlistpage.gettryEditorURL();
	}
	

	@When("The user clicks the Run button without entering the code in the Editor for Traversal")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_traversal() {
		linkedlistpage.Run();
	}

//	@Then("The user should able to see an error message in alert window in Traversal")
//	public void the_user_should_able_to_see_an_error_message_in_alert_window_in_traversal() {
//		try {
//
//			stackPage.alert();
//			String actualAlertText = stackPage.alert().getText();
//			Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
//
//			stackPage.alert().accept();
//		} catch (TimeoutException e) {
//
//			Assert.fail("Expected an alert with an error message, but no alert appeared.");
//		}
//	}	    
//		
	

	@Given("The user is in the tryEditor page of travesal")
	public void the_user_is_in_the_try_editor_page_of_traversal() {
		Assert.assertTrue(linkedlistpage.isTryEditorPageDisplayed(), "Try Editor or Run button is not displayed.");
	}

	@Then("The user should able to see output in the console of Linked List")
	public void the_user_should_able_to_see_output_in_the_console_of_traversal() {
		String output = stackPage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of console of Traversal");

	}
	

	@When("The user click on the Back arrow on top of Traversal")
	public void the_user_click_on_the_back_arrow_on_top_of_traversal() {
		linkedlistpage.getBackOPS();
		linkedlistpage.getIntroductionURL();
		LoggerLoad.info("clicked on the Back arrow");
	}

	@Given("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		linkedlistpage.Deletion();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in Deletion")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_deletion() {
		Assert.assertTrue(linkedlistpage.isTryEditorPageDisplayed());

	}

	@When("The user clicks the Run button without entering the code in the Editor of Deletion page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_deletion_page() {
		linkedlistpage.Run();
	}

//	@Then("The user should able to see an error message in alert window in Deletion")
//	public void the_user_should_able_to_see_an_error_message_in_alert_window_in_deletion() {
//		try {
//
//			stackPage.alert();
//			String actualAlertText = stackPage.alert().getText();
//			Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
//
//			stackPage.alert().accept();
//		} catch (TimeoutException e) {
//
//			Assert.fail("Expected an alert with an error message, but no alert appeared.");
//		}
//	}	    

	@Given("The user is in the tryEditor page of Deletion")
	public void the_user_is_in_the_try_editor_page_of_deletion() {
		loginPage.getHomeURL();
		linkedlistpage.getStartedlinkedlist();
		linkedlistpage.Deletion();
	}

//	@Given("The user is in the tryEditor page in Deletion")
//	public void the_user_is_in_the_try_editor_page_in_deletion() {
//		Assert.assertTrue(linkedlistpage.isTryEditorPageDisplayed(), "Try Editor or Run button is not displayed.");
//	}

	@Then("The user should able to see output in the console of Deletion page")
	public void the_user_should_able_to_see_output_in_the_console_of_deletion_page() {
		String output = stackPage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of Deletion page ");

	}

	@When("The user click on the Back arrow on top of Deletion page")
	public void the_user_click_on_the_back_arrow_on_top_of_deletion_page() {
		linkedlistpage.getBackOPS();
		linkedlistpage.getIntroductionURL();
		LoggerLoad.info("clicked on the Back arrow");
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("Deletion"), "User is not redirected to Queue Operations");
		LoggerLoad.info("redirected back to Deletion page");
	}

	@Given("The user is in the Deletion page")
	public void The_user_is_in_the_Deletion_page() {
		linkedlistpage.Deletion();
	}

	@When("The user clicks Practice Questions button for Deletion")
	public void The_user_clicks_practice_Questions_button_for_Deletion() {
		linkedlistpage.PracticeQuestions();
		LoggerLoad.info("clicked Practice Questions button");
		LoggerLoad.info("clicked the Practice Questions ");
	}

	@Then("The user should be redirected to Practice page for Deletion")
	public void the_user_should_be_redirected_to_practice_page_for_deletion() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),"User is not redirected to the Practice page.");
		LoggerLoad.info("redirected to Practice page");
	}





//@When("The user clicks the Run button after entering {int} from {string}")
//public void the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String string) {
//	try {
//
//		excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
//	} catch (IOException e) {
//
//		e.printStackTrace();
//	}
//	String invalidCode = excelUtils.getCellData("TryEditor", RowNumber - 1, 0);
//
//	stackPage.enterCode(invalidCode);
//	stackPage.clickRunButton();
//	LoggerLoad.info("user clicked the Run button");
//
//}

@When("For Linked List the user clicks the Run button after entering {int} from {string}")
public void For_Linked_List_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
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


@When("For Linked List page the user clicks Practice Questions button for Deletion")
public void for_Linked_List_page_the_user_clicks_practice_Questions_button_for_Deletion() {
	linkedlistpage.PracticeQuestions();
	LoggerLoad.info("user clicked on the Practice Questions button");
	
}




}
