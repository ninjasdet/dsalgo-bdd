#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@GraphDatastructure
Feature: Graph Data Structure Navigation

 
  Background:
    Given the user signs in to dsAlgo Portal
	
  Scenario: Verify that user is able to navigate to the "Graph" data structure page
    Given the user is on the Home page after signing in
    When the user clicks the "Get Started" button in the Graph Panel or the user selects "Graph" item from the drop-down menu
    Then the user is directed to the "Graph" Data Structure Page

 
  Scenario: Verify that user is able to navigate to the "Graph page" after clicking "Graph" link
    Given the user is in the Graph data structure page
    When the user clicks the "Graph" link
    Then the user navigates to the "Graph page"

  

  Scenario: Verify that the user can navigate to the "Try Editor" page for the "Graph" page
    Given the user is in the "Graph" Page
    When the user clicks the "Try here" button
    Then the user should be redirected to a page having a try Editor with a Run button to test


	Scenario Outline: Output Testing with different sets of invalid data in Graph page
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor |     2 | 
      | TryEditor |     3 | 
      
  Scenario Outline: Output Testing with different sets of valid data in Graph Page
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see output in the console
     
       Examples: 
      | SheetName  | RowNumber |
      | TryEditor |     4 | 

 
  Scenario: Verify that the user should be back to Graph page
    Given the user is on the "Tryeditor" of Graph page
    When the user clicks on the "Back" arrow on top
    Then the user should be redirected to the "Graph" page


  Scenario: Verify that user can navigate to the "Graph Representations" page
    Given the user is in the "Graph" data structure page
    When the user clicks the "Graph Representations" link
    Then the user should be redirected to the "Graph Representations" page


  Scenario: Verify that the user can navigate to the "Try Editor" page for the "Graph Representations" page
    Given the user is in the "Graph Representations" Page
    When the user clicks the "Try here" button
    Then the user should be redirected to a page having a try Editor with a Run button to test

 	Scenario Outline: Output Testing with different sets of invalid data in Graph Representations page
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor |     2 | 
      | TryEditor |     3 | 
      
  Scenario Outline: Output Testing with different sets of valid data in Graph Representations page
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see output in the console
     
       Examples: 
      | SheetName  | RowNumber |
      | TryEditor |     4			 | 
 
   
 	Scenario: Verify that the user can navigate back to the "Graph Representations" page
	  Given the user is on the "Tryeditor" of the "Graph Representations" page
	  When the user clicks on the "Back" arrow at the top
	  Then the user should be redirected to the "Graph Representations" page
	  
	  
  Scenario: Verify that the user can navigate to the "Practice Questions" page of "Graph" page
    Given the user is in "Graph" page
    When the user clicks the "Practice Questions" link
    Then the user should be redirected to the "Practice Questions" page
    
  Scenario: Verify that the user can navigate back to the "Graph" page
    Given the user is in  "practice questions" page
    When the user clicks on the "Back" arrow at the top
    Then the user should be redirected to the "Graph" page
 
 