@GraphDatastructure
Feature: Graph Data Structure Navigation

 
  Background:
    Given the user signs in to dsAlgo Portal
  	
  Scenario: Verify that user is able to navigate to the Graph data structure page
    Given The user is in the Home page after Sign in
    When the user clicks the Get Started button in the Graph Panel or the user selects Graph item from the drop-down menu
    Then the user is directed to the Graph Data Structure Page
 
  Scenario: Verify that user is able to navigate to the Graph page after clicking Graph link
    Given the user is in the Graph data structure page
    When the user clicks the Inside Graph link
    Then the user navigates to the Graph page
 

  Scenario: Verify that the user can navigate to the Try Editor page for the Graph page
    Given the user is in the Graph Page
    When the user clicks the Try here button of Graph page
    Then the user should be redirected to a page having a try Editor with a Run button to test for graph


	Scenario Outline: Output Testing with different sets of invalid data in Graph page
     Given The user is in the tryEditor page of Graph
     When The user clicks the Run button after entering <RowNumber> from a "<SheetName>"
     Then The user should able to see an error message in  alert window of graph
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor |     2 | 
      | TryEditor |     3 | 
      
  Scenario Outline: Output Testing with different sets of valid data in Graph Page
     Given The user is in the tryEditor page of Graph
     When The user clicks the Run button after entering <RowNumber> from a "<SheetName>"
     Then The user should able to see the output in a console for graph 
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4 		 | 

 
  Scenario: Verify that the user should be back to Graph page
    Given the user is on the Tryeditor of Graph page
    When The user click on the Back arrow on top of Graph page
    Then the user should be redirected to the Graph page


  Scenario: Verify that user can navigate to the Graph Representations page
    Given the user is in the Graph data structure page
    When the user clicks the Graph Representations link
    Then the user should be redirected to the Graph Representations page


  Scenario: Verify that the user can navigate to the Try Editor page for the Graph Representations page
    Given the user is in the Graph Representations Page
    When the user clicks the Try here button of Graph page 
    Then the user should be redirected to a page having a try Editor with a Run button to test for graph

 	Scenario Outline: Output Testing with different sets of invalid data in Graph Representations page
     Given The user is in the tryEditor page of Graph
     When The user clicks the Run button after entering <RowNumber> from a "<SheetName>"
     Then The user should able to see an error message in  alert window of graph
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Graph Representations page
     Given The user is in the tryEditor page of Graph
     When The user clicks the Run button after entering <RowNumber> from a "<SheetName>"
     Then The user should able to see output in the console of graph representation
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4		 |
 
   
 	Scenario: Verify that the user can navigate back to the Graph Representations page
	  Given the user is on the Tryeditor of the Graph Representations page
	  When the user clicks on the Back arrow at the top of Graph Representations page
	  Then the user should be redirected to the Graph Representations page
	  
	  
  Scenario: Verify that the user can navigate to the Practice Questions page of Graph page
    Given the user is in the Graph Page
    When the user clicks the Practice Questions link
    Then the user should be redirected to the Practice Questions page of Graph page
    
  Scenario: Verify that the user can navigate back to the Graph page
    Given the user is in  practice questions page of Graph page
    When the user clicks on the Back arrow at the top of Graph page
    Then the user should be redirected to the Graph page
 
 