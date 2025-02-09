@Stackpage
Feature: Stack Data Structure Navigation

 Background:
    Given For stack the user signs in to dsAlgo Portal
    
  Scenario: Verify that user is able to navigate to Stack data structure page
    Given For stack the user is in the Home page after Sign in
    When The user clicks the Getting Started button in the Stack Panel Or The user selects the Stack item from the drop-down menu
    Then The user is directed to the Stack Data Structure Page
    
	Scenario: Verify that user is able to navigate to Operations in Stack page
    Given The user is in the Stack page after Sign in
    When The user clicks Operations in Stack button
    Then The user should be redirected to Operations in Stack page
    
   Scenario: Verify that user is able to navigate to try Editor page for Operations in Stack page
    Given The user is on the Operations in Stack page
    When The user clicks Try Here button in Operations in Stack page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Stack page
    
    Scenario Outline: Output Testing with different sets of invalid data in Operations in Stack page
    Given The user is in the tryEditor page of Stack
     When For stack the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Stack page
     
       Examples: 
      | SheetName     | RowNumber |
      
      | TryEditor     |     1 		| 
      | TryEditor     |     2 		| 
      
   Scenario Outline: Output Testing with different sets of valid data Operations in Stack page
     Given The user is in the tryEditor page of Stack
     When The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Stack 
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     3     | 
      
    Scenario: Verify that the user shoud be back to Operations in Stack page
    Given The user is on the Tryeditor of Operations in Stack page
    When The user click on the Back arrow on top Operations in Stack page
    Then The user should be redirected back to Operations in Stack page.
    
    Scenario: Verify that user is able to navigate to Implementation page
    Given The user is in the Stack page after Sign in
    When The user clicks Implementation button
    Then The user should be redirected to Implementation page 
    
     Scenario: Verify that user is able to navigate to try Editor page for Implementation page
    Given The user is on the Implementation page
    When The user clicks Try Here button in Implementation page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Stack page
    
     Scenario Outline: Output Testing with different sets of invalid data in Implementation page
     Given The user is in the tryEditor page of Stack
     When The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Stack page
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     1     | 
      | TryEditor  |     2     | 
      
   Scenario Outline: Output Testing with different sets of valid data in Implementation page
     Given The user is in the tryEditor page of Stack
     When The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Stack 
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     3     | 
      
   Scenario: Verify that the user shoud be back to Implementation page
    Given The user is on the Tryeditor of Implementation page
    When The user click on the Back arrow on top of Implementation page
    Then The user should be redirected back to Implementation page. 
    
      Scenario: Verify that user is able to navigate to Applications page
    Given The user is in the Stack page after Sign in
    When The user clicks Applications button
    Then The user should be redirected to Applications page 
    
     Scenario: Verify that user is able to navigate to try Editor page for Applications page
    Given The user is on the Applications page
    When The user clicks Try Here button in Applications page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Stack page 
    Scenario Outline: Output Testing with different sets of invalid data in Applications page
     Given The user is in the tryEditor page of Stack
     When The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Stack page
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     1     | 
      | TryEditor  |     2     | 
      
   Scenario Outline: Output Testing with different sets of valid data in Applications page
     Given The user is in the tryEditor page of Stack
     When The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Stack
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     3     | 
    Scenario: Verify that the user shoud be back to Applications page
    Given The user is on the Tryeditor of Applications page
    When The user click on the Back arrow on top of Applications page
    Then The user should be redirected back to Applications page.
    
    Scenario: Verify that user is able to navigate to Practice Questions Page for Operations in Stack page
    Given The user is in the Stack page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    