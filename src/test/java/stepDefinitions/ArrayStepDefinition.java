
package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Arraypage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class ArrayStepDefinition {
 
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Arraypage arraypage = new Arraypage();
	ExcelReader excelUtils;
	
	StackPage stackPage = new StackPage();
	//Helper helper = new Helper();
	 
	@Given("For Array Datastructure the user signs into dsAlgo Portal")
	public void For_Array_Datastructure_the_user_signs_into_dsAlgo_portal() {
		loginPage.getHomeURL();
		loginPage.getLoginBtn();
	    stackPage.performLogin("SignInDetails", 7);
		LoggerLoad.info("user signs in to portal for queue");
	}
	
	
	
	@When("The user clicks the Getting Started button in Array Panel OR The user select Array item from the drop down menu")
	 public void the_user_clicks_the_getting_started_button_in_array_panel_or_the_user_select_array_item_from_the_drop_down_menu() {
		 		arraypage.clickGetStartedArray();
		 		LoggerLoad.info("clicked the getting started method");
	}  

	 @Then("The user be directed to ARRAY Data Structure Page")
	 public void the_user_be_directed_to_array_data_structure_page() {
		 Assert.assertTrue(arraypage.isArrayPageDisplayed(), "Failed to navigate to the Stack Data Structure page.");
			LoggerLoad.info("Redirected to stack page");
	 }

	 @Given("The user is in the Array page")
	 public void the_user_is_in_the_array_page() {
		 
		 arraypage.clickGetStartedArray();
		 LoggerLoad.info("in Array page");
	 }

	 @When("The user clicks Arrays in Python button")
	 public void the_user_clicks_arrays_in_python_button() {
		 arraypage.clickArraysinPython();
		 LoggerLoad.info("Arrays in Python button clicked");
	 }

	 @Then("The user should be redirected to arrays in python page")
	 public void The_user_should_be_redirected_to_arrays_in_python_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("arrays-in-python"), "not in arrays in python");
			LoggerLoad.info("redirected to arrays in python page");

	 }

	 @Given("The user is on the Arrays in Python page")
	 public void the_user_is_on_the_arrays_in_python_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 LoggerLoad.info("on the Arrays in Python page");
	 }

	 @When("The user clicks Try Here button in Arrays in Python page")
	 public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		 arraypage.clickTryhere();
		 LoggerLoad.info("Try here button clicked");
	 }

	 @Then("The user should be redirected to a page having an try Editor with a Run button to test")
	 public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
			LoggerLoad.info("redirected to a page having a try Editor");
	 }

	 @Given("The user clicks Arrays in Python link")
	 public void the_user_clicks_arrays_in_python_link() {
		 arraypage.clickArraysinPython();
		 LoggerLoad.info(" Arrays in Python page clicked");
	 }

	 //@When("The user clicks Try Here button in Introduction page")
	 //public void the_user_clicks_try_here_button_in_introduction_page() {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new io.cucumber.java.PendingException();
	 //}

	 @Given("The user is in the tryEditor page of Arrays in Python")
	 public void the_user_is_in_the_try_editor_page_of_arrays_in_python() {
		 loginPage.getHomeURL();
		 
		 arraypage.clickGetStartedArray();
		 
		 arraypage.clickArraysinPython();
		 arraypage.clickTryhere();
		 
		 
	 }
	 
	 @When("For Arrays the user clicks the Run button after entering {int} from {string}")
	 public void For_Arrays_the_user_clicks_the_Run_button_after_entering_from(Integer RowNumber, String sheet) {
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

	 @Then("The user should able to see an error message in alert window")
	 public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		 try {
		    	
		    	stackPage.alert();
			    String actualAlertText = stackPage.alert().getText();
			    Assert.assertTrue(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");
			   
			   // String expectedAlertText = "SyntaxError: bad input on line 1"; 

			    stackPage.alert().accept();
		    } catch (TimeoutException e) {
		        
		        Assert.fail("Expected an alert with an error message, but no alert appeared.");
		    }
		}
		    
		 
	     	 

	 @Then("The user should able to see output in the console of array")
	 public void the_user_should_able_to_see_output_in_the_console_of_array() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

//	 @When("The user click the Back arrow on top for array")
//	 public void the_user_click_the_back_arrow_on_top_for_array() {
//		 arraypage.getBackOPS();
//		 arraypage.getainpArrayURL();
//			LoggerLoad.info("clicked on the Back arrow");
//	 }

	 @Given("The user clicks Arrays Using List link")
	 public void the_user_clicks_arrays_using_list_link() {
		 loginPage.getHomeURL();
		 
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysUsingList();
		 LoggerLoad.info("Arrays Using List clicked");
	 }
	 
	 @When("For Array the user clicks Try Here button in Arrays Using List link")
	 public void For_Array_the_user_clicks_Try_here_button_in_Introduction_page() {
		 arraypage.clickTryhere();
		 
	 }

	 @Given("The user is in the tryEditor page of Arrays Using List page")
	 public void the_user_is_in_the_try_editor_page_of_arrays_using_list_page() {
		 loginPage.getHomeURL();
		 arraypage.clickArraysUsingList();
		 arraypage.clickTryEditorLink();
	 }

	 @When("The user click on the Back arrow on top of Arrays Using List")
	 public void the_user_click_on_the_back_arrow_on_top_of_arrays_using_list() {
		 arraypage.getBackOPS();
		 arraypage.getainpArrayURL();
			LoggerLoad.info("clicked on the Back arrow");
	 }

	 @Then("The user should be redirected to the Arrays Using List page")
	 public void the_user_should_be_redirected_to_the_arrays_using_list_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("arrays-using-list"), "User is not on Arrays Using List ");
			LoggerLoad.info("redirected to a page having Arrays Using List ");
	 }

	 @Given("The user is on the Basic Operations in Lists page")
	 public void The_user_is_on_the_Basic_Operations_in_Lists_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickBasicOperationsinLists();
		 LoggerLoad.info("on the Basic Operations in Lists page");
	 }

	 @When("The user clicks Try Here button in Basic Operations in Lists")
	 public void the_user_clicks_try_here_button_in_basic_operations_in_lists() {
		 arraypage.clickTryhere();
			LoggerLoad.info("clicked Try Here button in Basic Operations in Lists");
	 }

	 @Then("The user should be redirected to a page having an try Editor with a Run button to test Basic Operations in Lists")
	 public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_basic_operations_in_lists() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
			LoggerLoad.info("redirected to a page having a try Editor");
	 }

	 @Given("The user is in the tryEditor page of Basic Operations in Lists page")
	 public void the_user_is_in_the_try_editor_page_of_basic_operations_in_lists_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickBasicOperationsinLists();
		 arraypage.clickTryhere();
	 }

	 @Then("The user should able to see an error message in alert window  for array")
	 public void the_user_should_able_to_see_an_error_message_in_alert_window_for_array() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

	 @When("The user click on the Back arrow on top of Basic Operations in Lists")
	 public void the_user_click_on_the_back_arrow_on_top_of_basic_operations_in_lists() {
		 arraypage.getBackOPS();
		 arraypage.clickBasicOperationsinLists();
			LoggerLoad.info("clicked on the Back arrow");
	 }

	 @Then("The user able to redirected to Basic Operations in Lists page")
	 public void the_user_able_to_redirected_to_basic_operations_in_lists_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("operations-in-Lists"), "operations_in_Lists_page");
			LoggerLoad.info("redirected to Operations in Lists page");
	 }

	 @Given("The user is on the Applications of Array page")
	 public void the_user_is_on_the_applications_of_array_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickApplicationsofArray();
			LoggerLoad.info("on the Applications of Array page");
	 }

	 @When("The user clicks Try Here button in Applications of Array page")
	 public void the_user_clicks_try_here_button_in_applications_of_array_page() {
		 arraypage.clickTryhere();
			LoggerLoad.info("clicked Try Here button in Applications of Array");
	 }

	 @Then("The user should be redirected to a page having an try Editor with a Run button to test for Applications of Array page")
	 public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_for_applications_of_array_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"), "User is not on tryEditor page of ");
			LoggerLoad.info("redirected to a page having a try Editor");
	 }

	 @Given("The user is in the tryEditor page of Applications of Array page")
	 public void the_user_is_in_the_try_editor_page_of_applications_of_array_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickApplicationsofArray();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickSearchthearray();
		 
	 }

	 @When("The user click on the Back arrow on top of Applications of Array page")
	 public void the_user_click_on_the_back_arrow_on_top_of_applications_of_array_page() {
		 arraypage.getBackOPS();
		 arraypage.clickApplicationsofArray();
			LoggerLoad.info("clicked on the Back arrow");
	 }

	 @Then("The user should be redirected to the Applications of Array page")
	 public void the_user_should_be_redirected_to_the_applications_of_array_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("Applications of Array"), "User is not on Arrays Using List ");
			LoggerLoad.info("redirected to a page having Applications of Array ");
	 }

	 @Given("The user is in the Applications of Array page")
	 public void the_user_is_in_the_applications_of_array_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickApplicationsofArray();
			LoggerLoad.info("on the Applications of Array page");
	 }

	 @When("The user clicks Practice Questions button for Applications of Array")
	 public void the_user_clicks_practice_questions_button_for_applications_of_array() {
		 arraypage.clickPracticeQuestions();
			LoggerLoad.info("clicked Practice Questions button");
	 }

	 @Then("The user should be redirected to the Practice page of Applications of Array")
	 public void the_user_should_be_redirected_to_the_practice_page_of_applications_of_array() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"),"User is not redirected to the Practice page.");
			LoggerLoad.info("redirected to Practice page");
	 }

	 @When("The user clicks the Run Button after entering {int} from {string}")
	 public void the_user_clicks_the_run_button_after_entering_from(Integer int1, String string) {
		 try {

				excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
			} catch (IOException e) {

				e.printStackTrace();
			}
			//String invalidCode = excelUtils.getCellData("TryEditor", rowNumber - 1, 0);

			//arraypage.enterCode(invalidCode);
			arraypage.clickRun();
			LoggerLoad.info("user clicked the Run button");
	 }

	 @Then("The user should able to see an error message in alert window of Array")
	 public void the_user_should_able_to_see_an_error_message_in_alert_window_of_array() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }
	 

	 @When("The user clicks the Submit button after entering {int} from {string}")
	 public void the_user_clicks_the_submit_button_after_entering_from(Integer int1, String string) {
		 arraypage.clickSubmit();
		 LoggerLoad.info("user clicked the Submit button");
	 }

	 @Then("The user should able to see Error occurred during submission of invalid python code for Applications of Array")
	 public void the_user_should_able_to_see_error_occurred_during_submission_of_invalid_python_code_for_applications_of_array() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);

	 }
	 @Then("The user should able to see output in the console of Applications of Array")
	 public void the_user_should_able_to_see_output_in_the_console_of_applications_of_array() {
		 String output = stackPage.getConsoleOutput();
			Assert.assertTrue(output.isEmpty(), "Console output should not be empty, but it is.");
			LoggerLoad.info("output in the console of Applications of Array");

	 }

	 @Given("The user is in the tryEditor page of Practice Questions page")
	 public void The_user_is_in_the_tryEditor_page_of_Practice_Questions_page() {
		arraypage.clickTryEditorLink();
		Assert.assertTrue(arraypage.isDataStructuresDisplayed());
	 }

	 @When("The user click on the Back arrow on top of tryEditor")
	 public void The_user_click_on_the_Back_arrow_on_top_of_tryEditor() {
		 arraypage.getBackOPS();
		 arraypage.clickFindNumberswithEvenNumberofDigits();
			LoggerLoad.info("clicked on the Back arrow");
	 }

	 @Then("The user should redirected to Practice Questions page")
	 public void The_user_should_redirected_to_Practice_Questions_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("Practice Questions"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");
	 }

	 @Given("The user is in the Max Consecutive Ones page")
	 public void The_user_is_in_the_Max_Consecutive_Ones_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickMaxConsecutiveOnes();
		 LoggerLoad.info("on the Max Consecutive Ones page ");
	 }

	 @When("The user able see Max Consecutive Ones page")
	 public void The_user_clicks_max_Consecutive_Ones_button() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("question/2"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");
		 LoggerLoad.info("clicks the Max Consecutive Ones page ");
	 }

	 @Then("The user should be redirected to the Practice page of Max Consecutive Ones page")
	 public void The_user_should_be_redirected_to_the_practice_page_of_Max_consecutive_ones_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("question/2"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");
		 LoggerLoad.info("clicks the Max Consecutive Ones page ");
	 }

	 @Given("The user is in the question page of Max Consecutive Ones page")
	 public void the_user_is_in_the_tryEditor_page_of_Max_Consecutive_Ones_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickMaxConsecutiveOnes();
		 
			
	 }

	 @Then("The user should able to see an error message in alert window of Max Consecutive Ones page")
	 public void The_user_should_able_to_see_an_error_message_in_alert_window_of_Max_Consecutive_Ones_page() {
		String output = arraypage.getConsoleOutput();
		// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
		// empty.");
		System.out.println("Output: " + output);
	 }

	 @Then("The user should able to see Error occurred during submission invalid python code for Max Consecutive Ones page")
	 public void The_User_should_able_to_see_Error_occurred_during_submission_invalid_python_code_for_Max_Consecutive_Ones_page() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

	 @Then("The user should able to see output in the console of Max Consecutive Ones page")
	 public void The_user_should_able_to_see_output_in_the_console_of_Max_Consecutive_Ones_page() {
		 String output = stackPage.getConsoleOutput();
			Assert.assertTrue(output.isEmpty(), "Console output should not be empty, but it is.");
			LoggerLoad.info("output in the console of Max Consecutive Ones");

	 }

	 @Given("The user is in the tryEditor page of Applications of Max Consecutive Ones page")
	 public void The_user_is_in_the_tryEditor_page_of_applications_of_Max_Consecutive_ones_page() {
		 arraypage.clickTryEditorLink();
			Assert.assertTrue(arraypage.isDataStructuresDisplayed());
	 }

	 @Then("The user should able to see output in the console of Applications of Max Consecutive Ones page")
	 public void The_user_should_able_to_see_output_in_the_console_of_Applications_of_Max_Consecutive_Ones_page() {
		 String output = stackPage.getConsoleOutput();
			Assert.assertTrue(output.isEmpty(), "Console output should not be empty, but it is.");
			LoggerLoad.info("output in the console of Max Consecutive Ones");
	 }

	 @When("The user click on the Back arrow on top of Data Structure page")
	 public void The_user_click_on_the_Back_arrow_on_top_of_Data_Structure_page() {
		 arraypage.getBackOPS();
		 
			LoggerLoad.info("clicked on the Back arrow");
 }

	 @Then("The user should redirected to Data Structure page")
	 public void The_user_should_redirected_to_Data_Structure_page() {
		 
			 Assert.assertTrue(loginPage.getCurrentUrl().contains("Data Structure"), "Data_Structure_page");
				LoggerLoad.info("redirected to Datastructure");
     
	 }

	 @Given("The user is in the Practice Questions page")
	 public void The_user_is_in_the_Practice_Questions_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"), "Practice Questions page");
			LoggerLoad.info("redirected to Practice Questions");
		 	 }

	 @When("The user clicks Find Numbers with Even Numbers of Digits button")
	 public void The_user_clicks_Find_Numbers_with_Even_Numbers_of_Digits_button() {
		 arraypage.clickFindNumberswithEvenNumberofDigits();
	 }

	 @Then("The user should be redirected to the Practice page of Find Numbers with Even Numbers of Digits button")
	 public void The_user_should_be_redirected_to_the_practice_page_of_Find_Numbers_with_Even_Numbers_of_Digits_button() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("question/3"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");
	 }

	 @Given("The user is in the question page of Find Numbers with Even Numbers of Digits page")
	 public void The_user_is_in_the_tryEditor_page_of_Find_Numbers_with_Even_Numbers_of_Digits_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickFindNumberswithEvenNumberofDigits();
	 }

	 @Then("The user should able to see an error message in alert window of Find Numbers with Even Numbers of Digits page")
	 public void The_user_should_able_to_see_an_error_message_in_alert_window_of_Find_Numbers_with_Even_Numbers_of_Digits_page() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

	 @Then("The user should able to see Error occurred during submission of invalid python code for Find Numbers with Even Numbers of Digits page")
	 public void The_user_should_able_to_see_Error_occurred_during_submission_of_invalid_python_code_for_Find_Numbers_with_Even_Numbers_of_Digits_page() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

	 @Then("The user should able to see output in the console of Find Numbers with Even Numbers of Digits page")
	 public void The_user_should_able_to_see_output_in_the_console_of_Find_Numbers_with_Even_Numbers_of_Digits_page() {
		 String output = stackPage.getConsoleOutput();
			Assert.assertTrue(output.isEmpty(), "Console output should not be empty, but it is.");
			LoggerLoad.info("output in the console of Max Consecutive Ones");
	 }
	 @Given("The user is in the tryEditor page Applications of Find Numbers with Even Numbers of Digits")
	 public void The_user_is_in_the_tryEditor_page_Applications_of_Find_numbers_with_Even_Numbers_of_Digits() {
		 arraypage.clickTryEditorLink();
			Assert.assertTrue(arraypage.isDataStructuresDisplayed());
	 }

	 @When("The user click on the Back arrow on top of")
	 public void The_user_click_on_the_back_arrow_on_top_of() {
		 arraypage.getBackOPS();
		
			LoggerLoad.info("clicked on the Back arrow");
	 }
	 

	 @Then("The user should redirected back to the Data Structure page.")
	 public void the_user_should_redirected_back_to_the_data_structure_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("Data Structure"), "Data_Structure_page");
			LoggerLoad.info("redirected to Datastructure");
	 }
	 
	 @Given("The user is in the Practice Questions for Squares of a Sorted Array page")
	 public void The_user_is_in_the_Practice_Questions_for_Squares_of_a_Sorted_Array_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickSquaresof();
		 
	
	 }

	 @When("The user is on the Squares of a Sorted Array button")
	 public void The_user_clicks_Squares_of_a_Sorted_Array_button() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("question/4"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");

	 }

	 @Then("The user should be redirected again to Practice page of Squares of a Sorted Array page")
	 public void The_user_should_be_redirected_again_to_practice_page_of_squares_of_a_Sorted_Array_page() {
		 Assert.assertTrue(loginPage.getCurrentUrl().contains("question/4"), "Practice_Questions_page");
			LoggerLoad.info("redirected to Practice Questions");
	 }
	 

	 @Given("The user is in the tryEditor page of Squares of a Sorted Array page")
	 public void The_user_is_in_the_tryEditor_page_of_Squares_of_a_Sorted_Array_page() {
		 arraypage.clickTryEditorLink();
			Assert.assertTrue(arraypage.isDataStructuresDisplayed());
	 }

	 @Then("The user should able to see an error message in alert window of Squares of a Sorted Array page")
	 public void the_user_should_able_to_see_an_error_message_in_alert_window_of_squares_of_a_sorted_array_page() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }

	 @Then("The user should able to see Error occurred during submission of invalid python code of Applications of Squares of a Sorted Array page")
	 public void The_user_should_able_to_see_Error_occurred_during_submission_of_invalid_python_code_of_applications_of_Squares_of_a_Sorted_Array_page() {
		 String output = arraypage.getConsoleOutput();
			// Assert.assertTrue(output.isEmpty(), "Expected output in console, but found
			// empty.");
			System.out.println("Output: " + output);
	 }


	 @Given("The user is in the tryEditor page of Applications of Squares of a Sorted Array page")
	 public void The_user_is_in_the_tryEditor_page_of_Applications_of_Squares_of_a_Sorted_Array_page() {
		 loginPage.getHomeURL();
		 arraypage.clickGetStartedArray();
		 arraypage.clickArraysinPython();
		 arraypage.clickPracticeQuestions();
		 arraypage.clickFindNumberswithEvenNumberofDigits();
			
	 }

	 @Then("The user should able to see output in the console of Squares of a Sorted Array page")
	 public void the_user_should_able_to_see_output_in_the_console_of_squares_of_a_sorted_array_page() {
		 String output = stackPage.getConsoleOutput();
			Assert.assertTrue(output.isEmpty(), "Console output should not be empty, but it is.");
			LoggerLoad.info("output in the console of Squares of a Sorted Array");
	 }
	 





@When("For Array the user clicks the Run Button after entering {int} from {string}")
public void For_array_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
	try {

		excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
	} catch (IOException e) {

		e.printStackTrace();
	}
	sheet = "ArrayQuestions";
	String invalidCode = excelUtils.getCellData(sheet, RowNumber - 1, 0);
	
	arraypage.enterCode(invalidCode);
		
	arraypage.clickSubmit();
	
	LoggerLoad.info("user clicked the Submit button");

}


@Then("The user should be redirected back to Data Structure page")
public void The_user_should_be_redirected_back_to_Data_Structure_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




  
}
 
 
