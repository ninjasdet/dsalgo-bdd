package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import pageObjects.TreePage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Helper;
import utilities.LoggerLoad;

public class TreeStepDefinition {
	TreePage treePage = new TreePage();

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Helper helper = new Helper();
	StackPage stackpage = new StackPage();
	ExcelReader excelUtils;

	@Given("For Tree Datastructure the user signs into dsAlgo Portal")
	public void the_user_signs_into_ds_algo_portal() {
		loginPage.getHomeURL();
		loginPage.getLoginBtn();
		stackpage.performLogin("SignInDetails", 7);
	}

	@When("the user clicks the Get Started button in the Tree Panel or the user selects Tree item from the drop-down menu")
	public void the_user_clicks_the_get_started_button_in_the_tree_panel_or_the_user_selects_tree_item_from_the_drop_down_menu() {
		treePage.clickGetstartedTree();

	}

	@Then("the user directed to the Tree Data Structure Page")
	public void the_user_directed_to_the_tree_data_structure_page() {
		treePage.isTreePageHeading();
		LoggerLoad.info("redirecting to Tree data Structure");
	}

	@Given("The user is in the Tree Data Structure page")
	public void the_user_is_in_the_tree_data_structure_page() {
		loginPage.getHomeURL();
		treePage.clickGetstartedTree();
		LoggerLoad.info("user is in the Tree data structure");
	}

	@When("The user clicks the Overview of Trees link")
	public void the_user_clicks_the_overview_of_trees_link() {
		treePage.clickOverviewOfTree();
		LoggerLoad.info("clicking Overview of Trees link");
	}

	@Then("The user is directed to Overview of Trees Page")
	public void the_user_is_directed_to_overview_of_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("overview-of-trees"),
				"Page is not navigated to overview of trees page");
		LoggerLoad.info("redirecting to overview of Trees page");
	}

	@Given("The user is in the Overview of Trees page")
	public void the_user_is_in_the_overview_of_trees_page() {
		treePage.getOverviewOfPage();
	}

	@When("The user clicks Try here button in Overview of Trees page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_page() {
		treePage.clickOverViewTryeditor();
		LoggerLoad.info("tryhere button clicking of overview of Trees page");
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button of Tree")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_of_tree() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"),
				"page is not navigated to overviewoftrees tryeditor page");
		LoggerLoad.info("tryEditor page of run button ");
	}

	@Given("The user is in the tryEditor page of Tree")
	public void the_user_is_in_the_try_editor_page_of_tree() {
		treePage.getOverviewOfPage();
		treePage.tryherePage();
		LoggerLoad.info("user is in try editor page of Trees page");
	}

	@When("For tree the user clicks the Run button after entering {int} from {string}")
	public void for_tree_the_user_clicks_the_run_button_after_entering_from(Integer RowNumber, String sheet) {
		try {

			excelUtils = new ExcelReader(ConfigReader.getProperty("excelPath"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet = "TryEditor";
		String invalidCode = excelUtils.getCellData(sheet, RowNumber - 1, 0);

		stackpage.enterCode(invalidCode);

		stackpage.clickRunButton();
		LoggerLoad.info("user clicked the Run button");
	}

	@Then("The user should able to see an error message in alert window of Tree")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_tree() {
		try {

			stackpage.alert();
			String actualAlertText = stackpage.alert().getText();
			Assert.assertFalse(actualAlertText.isEmpty(), "Console output should not be empty, but it is.");

			stackpage.alert().accept();
		} catch (TimeoutException e) {

			Assert.fail("Expected an alert with an error message, but no alert appeared.");
		}
	}

	@Then("The user should able to see output in the console of Tree")
	public void the_user_should_able_to_see_output_in_the_console_of_tree() {
		String output = stackpage.getConsoleOutput();
		Assert.assertFalse(output.isEmpty(), "Console output should not be empty, but it is.");
		LoggerLoad.info("output in the console of Tree");

	}

	@Given("The user is on the Tryeditor Overview of Trees page")
	public void the_user_is_on_the_tryeditor_overview_of_trees_page() {
		treePage.getOverviewOfPage();
		treePage.clickOverViewTryeditor();
		LoggerLoad.info("user is on the Tryeditor Overview of Trees page");

	}

	@When("The user click on the Back arrow on top tryeditor Overview of Trees page")
	public void the_user_click_on_the_back_arrow_on_top_overview_of_trees_page() {
		treePage.getOverviewOfPage();
	}

	@Then("The user should be redirected back to Overview of Trees page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("overview-of-trees"),
				"Page is not navigated to Overview of Trees page ");
	}

	@When("The user clicks the Terminologies link")
	public void the_user_clicks_the_terminologies_link() {
		treePage.clickTerminoligiesLnk();
		LoggerLoad.info("clicking the Terminologies link page");
	}

	@Then("The user is directed to Terminologies Page")
	public void the_user_is_directed_to_terminologies_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("terminologies"),
				"page is not navigated to terminologies");
		LoggerLoad.info("redirecting to Terminologies page");
	}

	@Given("The user is in the Terminologies page")
	public void the_user_is_in_the_terminologies_page() {
		treePage.terminologiesPage();
		LoggerLoad.info("user is in terminologies page");
	}

	@When("The user clicks Try here button in Terminologies page")
	public void the_user_clicks_try_here_button_in_terminologies_page() {
		treePage.tryherePage();
		LoggerLoad.info("clicking Try here button in Terminologies page");
	}

	@Given("The user is on the Tryeditor Terminologies page")
	public void the_user_is_on_the_tryeditor_terminologies_page() {
		treePage.terminologiesPage();
		treePage.tryherePage();
		LoggerLoad.info("user is on the Tryeditor Terminologies page");
	}

	@When("The user click on the Back arrow on top of Terminologies page")
	public void the_user_click_on_the_back_arrow_on_top_of_terminologies_page() {
		treePage.terminologiesPage();
	}

	@Then("The user should be redirected back to Terminologies page")
	public void the_user_should_be_redirected_to_terminologies_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("terminologies"),
				"Page is not navigated to tryeditorpage");
	}

	@Given("The user is in Tree DataStructure page")
	public void the_user_is_in_tree_data_structure_page() {
		loginPage.getHomeURL();
		treePage.clickGetstartedTree();
	}

	@When("The user clicks the Types of Trees link")
	public void the_user_clicks_the_types_of_trees_link() {
		treePage.clickTypeOfTrees();
		LoggerLoad.info("clicks the Types of Trees link");

	}

	@Then("The user is directed to Types of Trees Page")
	public void the_user_is_directed_to_types_of_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("types-of-trees"),
				"page is not navigated to TypesofTrees");
		LoggerLoad.info("redirecting to Types of tree page");
	}

	@Given("The user is in the Types of Trees page")
	public void the_user_is_in_the_types_of_trees_page() {
		treePage.typesOfTreePage();
		LoggerLoad.info("user is in the Types of Trees page");
	}

	@When("The user clicks Try here button in Types of Trees page")
	public void the_user_clicks_try_here_button_in_types_of_trees_page() {
		treePage.tryherePage();
		LoggerLoad.info("redirecting to Types of tree page");
	}

	@Given("The user is on the Tryeditor Types of Trees")
	public void the_user_is_on_the_tryeditor_types_of_trees() {
		treePage.typesOfTreePage();
		treePage.tryherePage();

	}

	@When("The user click on the Back arrow on top of Types of Trees")
	public void the_user_click_on_the_back_arrow_on_top_of_types_of_trees() {
		treePage.typesOfTreePage();

	}

	@Then("The user should be redirected to Types of Trees page")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("types-of-trees"),
				"page is not navigating back to the types of tree page");
	}

	@When("The user clicks the Tree Traversals link")
	public void the_user_clicks_the_tree_traversals_link() {
		treePage.clickTreTraversals();
		LoggerLoad.info("user clicks the Tree Traversals link");
	}

	@Then("The user is directed to Tree Traversals Page")
	public void the_user_is_directed_to_tree_traversals_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tree-traversals"),
				"page not navigated to Tree Traversals page");
		LoggerLoad.info("user is directed to Tree Traversals Page");
	}

	@Given("The user is in the Tree Traversals page")
	public void the_user_is_in_the_tree_traversals_page() {
		treePage.treTraversalsPage();
		LoggerLoad.info("The user is in the Tree Traversals page");
	}

	@When("The user clicks Try here button in Tree Traversals page")
	public void the_user_clicks_try_here_button_in_tree_traversals_page() {
		treePage.tryherePage();
		LoggerLoad.info("user clicks Try here button in Tree Traversals page");
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tryEditor"),
				"page is not navigated to TypesOfTree tryeditorpage");
		LoggerLoad.info("user redirected to a page having a try Editor with a Run button");
	}

	@Given("The user is on the Tryeditor Tree Traversals page")
	public void the_user_is_on_the_tryeditor_tree_traversals_page() {
		treePage.treTraversalsPage();
		treePage.tryherePage();
		LoggerLoad.info("user is on the Tryeditor Tree Traversals page");
	}

	@When("The user click on the Back arrow on top of Tree Traversals page")
	public void the_user_click_on_the_back_arrow_on_top_of_tree_traversals_page() {
		treePage.treTraversalsPage();
		LoggerLoad.info("The user click on the Back arrow on top of Tree Traversals page");
	}

	@Then("The user should be redirected to Tree Traversals page")
	public void the_user_should_be_redirected_to_tree_traversals_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("tree-traversals"),
				"page is not navigating back to tree traversals page");
	}

	@When("The user clicks the Traversals-Illustration link")
	public void the_user_clicks_the_traversals_illustration_link() {
		treePage.clickTraversalsIllustration();
	}

	@Then("The user is directed to Traversals-Illustration Page")
	public void the_user_is_directed_to_traversals_illustration_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("traversals-illustration"),
				"Page is not navigated to Traversals-Illustration Page ");
	}

	@Given("The user is in the Traversals-Illustration page")
	public void the_user_is_in_the_traversals_illustration_page() {
		treePage.traversalsIllustrationPage();
	}

	@When("The user clicks Try here button in Traversals-Illustration page")
	public void the_user_clicks_try_here_button_in_traversals_illustration_page() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Traversals-Illustration page")
	public void the_user_is_on_the_tryeditor_traversals_illustration_page() {
		treePage.traversalsIllustrationPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top of Traversals-Illustration page")
	public void the_user_click_on_the_back_arrow_on_top_of_traversals_illustration_page() {
		treePage.traversalsIllustrationPage();
	}

	@Then("The user should be redirected to Traversals-Illustration page")
	public void the_user_should_be_redirected_to_traversals_illustration_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("traversals-illustration"),
				"page is not navigated to traversal illustration");
	}

	@When("The user clicks the Binary Trees link")
	public void the_user_clicks_the_binary_trees_link() {
		treePage.clickBinaryTrees();
	}

	@Then("The user is directed to Binary Trees Page")
	public void the_user_is_directed_to_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-trees"),
				"page not navigated to Binary Trees page");
		LoggerLoad.info("The user is directed to Binary Trees Page");
	}

	@Given("The user is in the Binary Trees page")
	public void the_user_is_in_the_binary_trees_page() {
		treePage.binaryTreesPage();
	}

	@When("The user clicks Try here button in Binary Trees page")
	public void the_user_clicks_try_here_button_in_binary_trees_page() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Binary Trees page")
	public void the_user_is_on_the_tryeditor_binary_trees_page() {
		treePage.binaryTreesPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top of Binary Trees page")
	public void the_user_click_on_the_back_arrow_on_top_of_binary_trees_page() {
		treePage.binaryTreesPage();
	}

	@Then("The user should be redirected to Binary Trees page")
	public void the_user_should_be_redirected_to_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-trees"),
				"page is not navigated back to binarytrees page");
		LoggerLoad.info("The user should be redirected to Binary Trees page");
	}

	@When("The user clicks the Types of Binary Trees link")
	public void the_user_clicks_the_types_of_binary_trees_link() {
		treePage.clickTypesofBinaryTrees();
	}

	@Then("The user is directed to Types of Binary Trees Page")
	public void the_user_is_directed_to_types_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("types-of-binary-trees"),
				"page is not navigated to Types of Binary Trees Page ");
	}

	@Given("The user is in the Types of Binary Trees page")
	public void the_user_is_in_the_types_of_binary_trees_page() {
		treePage.typesofBinaryTreesPage();
	}

	@When("The user clicks Try here button in Types of Binary Trees page")
	public void the_user_clicks_try_here_button_in_types_of_binary_trees_page() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Types of Binary Trees page")
	public void the_user_is_on_the_tryeditor_types_of_binary_trees_page() {
		treePage.typesofBinaryTreesPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Binary Trees page")
	public void the_user_click_on_the_back_arrow_on_top_binary_trees_page() {
		treePage.typesofBinaryTreesPage();
	}

	@Then("The user should be redirected to Types of Binary Trees page")
	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("types-of-binary-trees"),
				"page is not navigated to Types of Binary Trees page");

	}

	@When("The user clicks the Implementation in python link")
	public void the_user_clicks_the_implementation_in_python_link() {
		treePage.implementationinPythonPage();
	}

	@Then("The user is directed to Implementation in python Page")
	public void the_user_is_directed_to_implementation_in_python_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-in-python"),
				"page is not navigated to implementation in python page");
		LoggerLoad.info("user is directed to Implementation in python Page");
	}

	@Given("The user is in the Implementation in python page")
	public void the_user_is_in_the_implementation_in_python_page() {
		treePage.implementationinPythonPage();
	}

	@When("The user clicks Try here button in Implementation in python")
	public void the_user_clicks_try_here_button_in_implementation_in_python() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Implementation in python page")
	public void the_user_is_on_the_tryeditor_implementation_in_python_page() {
		treePage.implementationinPythonPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Implementation in python page")
	public void the_user_click_on_the_back_arrow_on_top_implementation_in_python_page() {
		treePage.implementationinPythonPage();
	}

	@Then("The user should be redirected to Implementation in python page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-in-python"),
				"page is not navigated back to implementation in python page");
	}

	@When("The user clicks the Binary Tree Traversals link")
	public void the_user_clicks_the_binary_tree_traversals_link() {
		treePage.clickBinaryTreeTraversals();
	}

	@Then("The user is directed to Binary Tree Traversals Page")
	public void the_user_is_directed_to_binary_tree_traversals_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-tree-traversals"),
				"page is not navigated to BinaryTree Traversals");

	}

	@Given("The user is in the Binary Tree Traversals page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
		treePage.binaryTreeTraversalsPage();
	}

	@When("The user clicks Try here button in Binary Tree Traversals")
	public void the_user_clicks_try_here_button_in_binary_tree_traversals() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Binary Tree Traversals")
	public void the_user_is_on_the_tryeditor_binary_tree_traversals() {
		treePage.binaryTreeTraversalsPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Binary Tree Traversals")
	public void the_user_click_on_the_back_arrow_on_top_binary_tree_traversals() {
		treePage.binaryTreeTraversalsPage();
	}

	@Then("The user should be redirected to Binary Tree Traversals page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-tree-traversals"),
				"page is not navigated back to BinaryTree Traversals");
		LoggerLoad.info("user redirected to Binary Tree Traversals page");
	}

	@When("The user clicks the Implementation of Binary Trees link")
	public void the_user_clicks_the_implementation_of_binary_trees_link() {
		treePage.clickImplementationofBinaryTrees();
	}

	@Then("The user is directed to Implementation of Binary Trees Page")
	public void the_user_is_directed_to_implementation_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-of-binary-trees"),
				"Page is not navigated to Implementation of Binary Trees Page");
	}

	@Given("The user is in the Implementation of Binary Trees page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
		treePage.implementationofBinaryTreesPage();
	}

	@When("The user clicks Try here button in Implementation of Binary Trees")
	public void the_user_clicks_try_here_button_in_implementation_of_binary_trees() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Implementation of Binary Trees")
	public void the_user_is_on_the_tryeditor_implementation_of_binary_trees() {
		treePage.implementationofBinaryTreesPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Implementation of Binary Trees")
	public void the_user_click_on_the_back_arrow_on_top_implementation_of_binary_trees() {
		treePage.implementationofBinaryTreesPage();
	}

	@Then("The user should be redirected to a Implementation of Binary Trees page")
	public void the_user_should_be_redirected_to_a_implementation_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-of-binary-trees"),
				"Page is not navigated back to Implementation of Binary Trees Page");
	}

	@When("The user clicks the Applications of Binary Trees link")
	public void the_user_clicks_the_applications_of_binary_trees_link() {
		treePage.clickApplicationsofBinarytrees();
	}

	@Then("The user is directed to Applications of Binary Trees Page")
	public void the_user_is_directed_to_applications_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("applications-of-binary-trees"),
				"page is not navigated to Applocation Of BinaryTress Page");
		LoggerLoad.info("The user is directed to Applications of Binary Trees Page");

	}

	@Given("The user is in the Applications of Binary Trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
		treePage.applicationsofBinarytreesPage();
	}

	@When("The user clicks Try here button in Applications of Binary Trees")
	public void the_user_clicks_try_here_button_in_applications_of_binary_trees() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Applications of Binary Trees")
	public void the_user_is_on_the_tryeditor_applications_of_binary_trees() {
		treePage.applicationsofBinarytreesPage();
		treePage.tryherePage();

	}

	@When("The user click on the Back arrow on top Applications of Binary Trees")
	public void the_user_click_on_the_back_arrow_on_top_applications_of_binary_trees() {
		treePage.applicationsofBinarytreesPage();
	}

	@Then("The user should  redirected to  Applications of Binary Trees page")
	public void the_user_should_redirected_to_applications_of_binary_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("applications-of-binary-trees"),
				"Page is not navigated to Application of binary trees");
		LoggerLoad.info("The user should  redirected to  Applications of Binary Trees page");
	}

	@When("The user clicks the Binary Search Trees link")
	public void the_user_clicks_the_binary_search_trees_link() {
		treePage.clickBinarySearchTrees();
	}

	@Then("The user is directed to Binary Search Trees Page")
	public void the_user_is_directed_to_binary_search_trees_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-search-trees"),
				"page is not navigated to Binarysearch trees");
	}

	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
		treePage.binarySearchTreesPage();
	}

	@When("The user clicks Try here button in Binary Search Trees")
	public void the_user_clicks_try_here_button_in_binary_search_trees() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Binary Search Trees")
	public void the_user_is_on_the_tryeditor_binary_search_trees() {
		treePage.binarySearchTreesPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Binary Search Trees")
	public void the_user_click_on_the_back_arrow_on_top_binary_search_trees() {
		treePage.binarySearchTreesPage();
	}

	@Then("The user should be redirected to the Binary Search Trees of tree page")
	public void the_user_should_be_redirected_to_the_binary_search_trees_of_tree_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("binary-search-trees"),
				"page is not navigated to Binarysearch trees");
	}

	@When("The user clicks the Implementation Of BST link")
	public void the_user_clicks_the_implementation_of_bst_link() {
		treePage.clickImplementationOfBST();
	}

	@Then("The user is directed to Implementation Of BST Page")
	public void the_user_is_directed_to_implementation_of_bst_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-of-bst"),
				"page is not navigated to ImplOfBst Page");
	}

	@Given("The user is in the Implementation Of BST page")
	public void the_user_is_in_the_implementation_of_bst_page() {
		treePage.implementationOfBSTPage();
	}

	@When("The user clicks Try here button in Implementation Of BST")
	public void the_user_clicks_try_here_button_in_implementation_of_bst() {
		treePage.tryherePage();
	}

	@Given("The user is on the Tryeditor Implementation Of BST")
	public void the_user_is_on_the_tryeditor_implementation_of_bst() {
		treePage.implementationOfBSTPage();
		treePage.tryherePage();
	}

	@When("The user click on the Back arrow on top Implementation Of BST")
	public void the_user_click_on_the_back_arrow_on_top_implementation_of_bst() {
		treePage.implementationOfBSTPage();
	}

	@Then("The user should be redirected a Implementation Of BST page")
	public void the_user_should_be_redirected_a_implementation_of_bst_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("implementation-of-bst"),
				"page is not navigated back to ImplOfBst Page");
	}

	@Given("The user is in the Tree page")
	public void the_user_is_in_the_tree_page() {
		treePage.treTraversalsPage();
	}

	@When("the user clicks the Practice Questions link")
	public void the_user_clicks_the_Practice_Questions_link() {
		treePage.clickpracticeQuestions();
		LoggerLoad.info("user clicks the Practice Questions link");
	}

	@Then("the user should be redirected to the Practice Questions page")
	public void the_user_should_be_redirected_to_the_practice_questions_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("practice"), "Page is not navigated to PracticeQuestions");
	}

	@Given("the user is in  practice questions page")
	public void the_user_is_in_practice_questions_page() {
		treePage.getPracticequestionsPage();
	}

	@When("the user clicks on the Back arrow at the top")
	public void the_user_clicks_on_the_back_arrow_at_the_top() {
		treePage.getOverviewOfPage();
	}

	@Then("the user should be redirected to the Tree page")
	public void the_user_should_be_redirected_to_the_tree_page() {
		Assert.assertTrue(loginPage.getCurrentUrl().contains("overview-of-trees"),
				"page is not navigated back to overviewof tree page");
		LoggerLoad.info("user should be redirected to the Tree page");
	}

}
