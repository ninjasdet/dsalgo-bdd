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
@DataStructuresPage
Feature: Data Structure Navigation

 
  Background:
    Given the user signs in to dsAlgo Portal

	
  Scenario: Verify that user is able to navigate to"Data Structures-Introduction" page
    Given the user is on Home page after signing in
    When user clicks the "Get started" button in  Data Structures - Introduction panel
    Then the user is directed to the "Data Structures-Introduction"  Page

	Scenario: Verify that the user is able to navigate to "Time Complexity" page
    Given the user is on the "Data Structures - Introduction" page
    When the user clicks "Time Complexity" button
    Then the user should be redirected to "Time Complexity" of Data Structures - Introduction
    
  Scenario: Verify that the user is able to navigate to "try Editor" page of "Time Complexity" page
    Given the user is on the "Time Complexity" page
    When the user clicks "Try Here" button
    Then the user is redirected to a page having a try Editor with a Run button to test
    
    Scenario Outline: Output Testing with different sets of invalid data in Time Complexity page
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see an error message in alert window
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor |     2 | 
      | TryEditor |     3 | 
      
  	Scenario Outline: Output Testing with different sets of valid data in Time Complexity
     Given The user is in the tryEditor page
     When The user clicks the Run button after entering <RowNumber> from  "<SheetName>"
     Then The user should able to see output in the console
     
       Examples: 
      | SheetName  | RowNumber |
      | TryEditor |     4			 | 
  
    
   Scenario: Verify that the user should be redirected back to "Data Structures - Introduction" page
    Given the user is on the "Try Editor" of "Time Complexity" page
    When the user clicks  the "Back" arrow on top
    Then the user should be redirected to "Time Complexity" page
    
   Scenario: Verify that the user is able to navigate to "Practice Questions" page
    Given the user is in "Time Complexity" page
    When the user clicks  "Practice Questions" link
    Then the user should be redirected to "Practice Questions" page
    
   Scenario: Verify that the user should be redirected back to "Time Complexity" page
    Given the user is on the "practice questions" page
    When the user clicks  the "Back" arrow at the top
    Then the user should be redirected to "Time Complexity" page