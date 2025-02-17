@Queuepage
Feature: Home Navigation

  As a user of the DS Algo portal,
  I want to navigate to different data structure pages,
  So that I can explore their functionalities.

  Background:
    Given For queue the user signs in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to Queue data structure page
 
    When The user clicks the Getting Started button in the Queue Panel Or The user selects the Queue item from the drop-down menu
    Then The user is directed to the Queue Data Structure Page
    
    Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation of Queue in Python button
    Then The user should be redirected to Implementation of Queue in Python page

   Scenario: Verify that user is able to navigate to try Editor page for Implementation of Queue in Python page
    Given The user is on the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Queue
 
    Scenario Outline: Output Testing with different sets of invalid data in Implementation of Queue in Python
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then In alert window of queue page The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
  
   Scenario Outline: Output Testing with different sets of valid data Implementation of Queue in Python
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of queue
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     | 
      
    Scenario: Verify that the user shoud be back to Implementation of Queue in Python page
    Given The user is on the Tryeditor of Implementation of Queue in Python page
    When The user click on the Back arrow of Implementation of Queue in Python page
    Then The user should be redirected back to Implementation of Queue in Python page.
    
    Scenario: Verify that user is able to navigate to Implementation using collections.deque page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using collections.deque page button
    Then The user should be redirected to Implementation using collections.deque page page 
    
     Scenario: Verify that user is able to navigate to try Editor page for Implementation using collections.deque page page
    Given The user is on the Implementation using collections.deque page page
    When The user clicks Try Here button in Implementation using collections.deque page page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Queue 
    
     Scenario Outline: Output Testing with different sets of invalid data in Implementation using collections.deque page page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then In alert window of queue page The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
   Scenario Outline: Output Testing with different sets of valid data in Implementation using collections.deque page page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of queue
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     | 
      
   Scenario: Verify that the user shoud be back to Implementation using collections.deque page 
    Given The user is on the Tryeditor of Implementation using collections.deque page 
    When the user clicks on the Back arrow of Implementation using collections.deque page  
    Then The user should be redirected back to Implementation using collections.deque page 
    
    Scenario: Verify that user is able to navigate to Implementation using array page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using array button
    Then The user should be redirected to Implementation using array page 
    
     Scenario: Verify that user is able to navigate to try Editor page for Implementation using array page
    Given The user is on the Implementation using array page
    When The user clicks Try Here button in Implementation using array page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Queue 
    
     Scenario Outline: Output Testing with different sets of invalid data in Implementation using array page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then In alert window of queue page The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
   Scenario Outline: Output Testing with different sets of valid data in Implementation using array page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of queue
     
       Examples: 
      | SheetName  | RowNumber |
      | TryEditor  |     4     | 
     
      
   Scenario: Verify that the user shoud be back to Implementation using array page
    Given The user is on the Tryeditor of Implementation using array page 
    When the user clicks on the Back arrow of Implementation using array page
    Then The user should be redirected back to Implementation using array page . 
    
      Scenario: Verify that user is able to navigate to Queue Operations page
    Given The user is in the Queue page after Sign in
    When The user clicks Queue Operations button
    Then The user should be redirected to Queue Operations page 
    
     Scenario: Verify that user is able to navigate to try Editor page for Queue Operations page
    Given The user is on the Queue Operations page
    When The user clicks Try Here button in Queue Operations page
    Then The user should be redirected to a page having a try Editor with a Run button to test of Queue 
    
     Scenario Outline: Output Testing with different sets of invalid data in Queue Operations page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then In alert window of queue page The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
   Scenario Outline: Output Testing with different sets of valid data in Queue Operations page
     Given The user is in the tryEditor page of queue
     When For queue The user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of queue
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4 		 | 
      
   Scenario: Verify that the user shoud be back to Queue Operations page
    Given The user is on the Tryeditor of Queue Operations page
    When the user clicks on the Back arrow of Queue Operations page
    Then The user should be redirected back to Queue Operations page 
       
    Scenario: Verify that user is able to navigate to Practice Questions Page for Implementation of Queue in Python page
    Given The user is in the Queue page
    When the user clicks the Practice Questions link of queue
    Then the user should be redirected to the Practice Questions page of queue
    
