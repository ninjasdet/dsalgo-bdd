package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class RegisterStepDefinition {
	LoginPage loginPage = new LoginPage();
	 HomePage homePage = new HomePage();
	 RegisterPage registerpage = new RegisterPage();
	 ExcelReader excelUtils;
	 String currentUrl;
	 WebDriver driver;
	@Given("The user is on the user Registration page")
	public void the_user_is_on_the_user_registration_page() {
		loginPage.getHomeURL();
		registerpage.clickRegisterLink();
		
			}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
		registerpage.clickRegisterLink();
		System.out.println(" User able to click Register link");
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("register"), "not in register");
		LoggerLoad.info("redirected to register");
	    } 
		//String expectedURL = "https://dsportalapp.herokuapp.com/register";
        //assertEquals("User is not on the Register Page!",expectedURL, currentUrl);
    
	    
	

	@When("The user clicks the Register button after entering {int} from {string}")
	public void the_user_clicks_the_register_button_after_entering_from(int RowNumber, String sheet ) {

		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet = "Register";
		
		
		String username = excelUtils.getCellData(sheet, RowNumber - 1, 0);
                String password= excelUtils.getCellData(sheet, RowNumber - 1, 1);
                String passwordconfirmation= excelUtils.getCellData(sheet, RowNumber - 1, 2);
                String errormessage= excelUtils.getCellData(sheet, RowNumber - 1, 3);

                registerpage.setUsername(username);
                registerpage.setPassword(password);
                registerpage.setConfirmPassword(passwordconfirmation);
               // registerpage.
    		    // Click login button
                registerpage.clickRegister();
	}
	@Then("The user should able to see error message")
	public void the_user_should_able_to_see_error_message() {
		LoggerLoad.info("error message");
	}

	@When("For register the user clicks Register button after entering  <RowNumber> from \"<SheetName>\" in related textboxes")
	public void For_register_the_user_clicks_Register_button_after_entering_from_in_related_textboxes(int RowNumber, String SheetName) {
		
		
		    try {
		        // Load Excel file from the specified path
		        ExcelReader excelUtils = new ExcelReader("C:\\Users\\nkuncham\\Documents\\DsAlgoBDD_AutomationBots\\dsalgo-bdd\\src\\test\\resources\\testData\\SignInDetailsExcel.xlsx");

		        // Fetching data from row 13 (zero-based index is 12)
		        int targetRow = 13; // Row 13 in Excel (0-based index)

		        String username = excelUtils.getCellData(SheetName, targetRow, 0); // Column 0 = Username
		        String password = excelUtils.getCellData(SheetName, targetRow, 1); // Column 1 = Password
		        String confirmPassword = excelUtils.getCellData(SheetName, targetRow, 2); // Column 2 = Password Confirmation
		        String expectedMessage = excelUtils.getCellData(SheetName, targetRow, 3); // Column 3 = Expected Message
		       
		        if (username != null && !username.isEmpty()) {
		        	registerpage.setUsername(username);
		        }
		        // Entering values in registration form
		        registerpage.setUsername(username); // Enter username
		        registerpage.setPassword(password); // Enter password
		        registerpage.setConfirmPassword(confirmPassword); // Enter confirmation password

		        // Click Register button
		        registerpage.clickRegister();
		        LoggerLoad.info("Register button clicked");

		        // Capture actual response message
		        String actualMessage = registerpage.getGlobalMessageText();

		        // Validate the success/error message
		        Assert.assertEquals(actualMessage, expectedMessage);
		        LoggerLoad.info("Expected message displayed: " + actualMessage);

		    } catch (IOException e) {
		        e.printStackTrace();
		        throw new RuntimeException("Failed to load Excel file", e);
		    }
		

		
		
//		//ExcelReader excelUtils = null;
//		    try {
//		        //excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
//		    	excelUtils = new ExcelReader("C:\\Users\\nkuncham\\Documents\\DsAlgoBDD_AutomationBots\\dsalgo-bdd\\src\\test\\resources\\testData\\SignInDetailsExcel .xlsx");
//		    } catch (IOException e) {
//		        e.printStackTrace();
//		        throw new RuntimeException("Failed to load Excel file", e);
//		    }
//
//		    // Fetching data from the last row (Row 12, zero-based index is 11)
//		    String username = excelUtils.getCellData(SheetName, RowNumber - 1, 0); // Column 0 = Username
//
//		    String password = excelUtils.getCellData(SheetName, RowNumber - 1, 1); // Column 1 = Password
//		    String confirmPassword = excelUtils.getCellData(SheetName, RowNumber - 1, 2); // Column 2 = Password Confirmation
//		    String expectedMessage = excelUtils.getCellData(SheetName, RowNumber - 1, 3); // Column 3 = Expected Message
//		    // Entering values in registration form
//		    registerpage.setUsername(username); // Enter username
//		    registerpage.setPassword(password); // Enter password
//		    registerpage.setConfirmPassword(confirmPassword); // Enter confirmation password
//
//		    // Click Register button
//		    registerpage.clickRegister();
//		    LoggerLoad.info("Register button clicked");
//		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		    WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
//
//		    // Capture actual response message
//		    String actualMessage = registerpage.getGlobalMessageText();
//
//		    // Validate the success/error message
//		    Assert.assertEquals(actualMessage, expectedMessage);
//		    LoggerLoad.info("Expected message displayed: " + actualMessage);
		}

	

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created You are logged in")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in() {
		
		    // Capture the actual success message displayed on the page
		    String actualMessage = registerpage.getGlobalMessageText();

		    // Expected success message
		    String expectedMessage = "New Account Created."; 
		    Assert.assertTrue(actualMessage.contains(expectedMessage),"Registration fail");
		    
		    Assert.assertTrue(loginPage.getCurrentUrl().contains("home"), "not in home");
			LoggerLoad.info("New account created");

//		    // Validate that the expected message matches the displayed message
//		    Assert.assertEquals(actualMessage, expectedMessage);
//		    LoggerLoad.info("Success message verified: " + actualMessage);
//
//		    // Verify redirection to the Home Page
//		    String expectedUrl = "https://dsportalapp.herokuapp.com/home"; // Update if URL is different
//		    String actualUrl = driver.getCurrentUrl(); // Fetch the current URL
//
//		    Assert.assertEquals(actualUrl, expectedUrl);
//		    LoggerLoad.info("User successfully redirected to Home Page: " + actualUrl);
		}

	}


