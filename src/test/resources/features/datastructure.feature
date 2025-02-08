
@DataStructuresPage
Feature: Data Structure Navigation
 
  Background:
    Given the user signs in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to Data Structures-Introduction page
    Given The user is in the Home page after Sign in
    When  user clicks the Get started button in  Data Structures - Introduction panel
    Then  the user is directed to the Data Structures-Introduction  Page

	Scenario: Verify that the user is able to navigate to Time Complexity page
    Given the user is on the Data Structures - Introduction page
    When  the user clicks Time Complexity button
    Then  the user should be redirected to Time Complexity of Data Structures - Introduction
    
  Scenario: Verify that the user is able to navigate to try Editor page of Time Complexity page
    Given the user is on the Time Complexity page 
    When  the user clicks Try Here button of Time Complexity page
    Then  the user is redirected to a page having a try Editor with a Run button for datastructure
    
    Scenario Outline: Output Testing with different sets of invalid data in Time Complexity page
     Given The user is in the tryEditor page of Time Complexity
     When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then  The user should able to see an error message in the alert window of time complexity.
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor |     2 | 
      | TryEditor |     3 | 
      
  	Scenario Outline: Output Testing with different sets of valid data in Time Complexity
     Given The user is in the tryEditor page of Time Complexity
     When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then  The user should able to see output in the console
     
       Examples: 
      | SheetName  | RowNumber |
      | TryEditor |     4			 | 
  
    
   Scenario: Verify that the user should be redirected back to Data Structures - Introduction page
    Given The user is in the tryEditor page of Time Complexity
    When The user click on the Back arrow on top of Time Complexity
    Then the user should be redirected to Time Complexity page
    
   Scenario: Verify that the user is able to navigate to Practice Questions page
    Given the user is on the Time Complexity page
    When the user clicks  Practice Questions link of datastructure
    Then the user should be redirected to Practice Questions page of datastructure
    
   Scenario: Verify that the user should be redirected back to Time Complexity page
    Given the user is in  practice questions page of datastructure
    When The user click on the Back arrow on top of datastructure
    Then the user should be redirected to Time Complexity page