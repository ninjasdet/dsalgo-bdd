
@linkedlist
Feature: Linked List
 Background :The user sign in to dsAlgo Portal

 
  Scenario: Verify that user is able to navigate to "Linked List" data structure page 
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in the Linked List panel Or The user selects the Linked List from the drop-down menu
    Then The user be directed to "Linked List" Data Structure Page
 
  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user clicks "Introduction in Linked List" HyperLink
    When  The user should be redirected to "Introduction in Linked List" page 
    Then  The user  be redirected to "Introduction in Linked List" page
    
  Scenario: Verify that user is able to navigate to "try Editor" page for "Introduction" page
    Given The user is on the "Introduction" page
    When   The user clicks "Try Here" button in Introduction page
    Then   The user should be redirected to a page having an try Editor with a Run button to test
    
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for "Introduction" page
    Given The user is in the tryEditor page
     When The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
  Scenario Outline: Verify that user is able to see output for valid python code for"Introduction"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
     
        Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |  
  
 Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page
    When   The user click on the "Back" arrow on top 
    Then   The user should be redirected to "Introduction" page
    
 #Creating Linked List
  
 Scenario: Verify that user is able to navigate to "Creating Linked LIst" data structure page
    Given The user clicks "creating Linked LIst in Linked List" link
    When   The user clicks "Try Here" button in Introduction page
    Then   The user should be redirected to a page having an try Editor with a Run button to test
 
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for "Creating Linked LIst" page
    Given The user is in the tryEditor page
     When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
 Scenario Outline: Verify that user is able to see output for valid python code for"Creating Linked List"page
    Given The user is in the tryEditor page
     When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |  
  
  Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page
    When   The user click on the "Back" arrow on top 
    Then   The user should be redirected to "Creating Linked List" page
    
  #Types of Linked list
  Scenario: Verify that user is able to navigate to "Types of Linked list" data structure page
    Given The user clicks "Types of Linked list" link
    When  The user clicks "Try Here" button in Introduction page 
    Then  The user should be redirected to a page having an try Editor with a Run button to test 
  
   
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for "Types of Linked list" page
    Given The user is in the tryEditor page
     When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see an error message in alert window
          Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
  Scenario Outline: Verify that user is able to see output for valid python code for "Types of Linked List"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |  
  
  
  Scenario: Verify that the user shoud be back to travesal page
    Given The user is on the "Types of Linked List" traversal page
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Traversal" page
    
   #Implement Linked List in Python
  Scenario: Verify that user is able to navigate to "Implement Linked List in Python" data structure page
    Given The user clicks "Implement Linked list in Python" link
    When  The user clicks "Try Here" button in Introduction page
    Then  The user should be redirected to a page having an try Editor with a Run button to test
    
     
  
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for "Implement Linked List in Python" page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Implement Linked List in python"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |  
  
    Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Implement Linked List in python" page
    
  #Traversal 
  Scenario: Verify that user is able to navigate to "Traversal" data structure page
    Given The user clicks "Traversal" link
    When  The user clicks "Try Here" button in Introduction page
    Then  The user should be redirected to a page having an try Editor with a Run button to test
    
     
  Scenario: Verify that user receives error when click on Run button without entering code for "Implement Linked List" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then   The user should able to see an error message in alert window
    
     
  Scenario Outline: Verify that user receives error for invalid python code for "Traversal" page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Traversal"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |  
  
  
  Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Insertion" page
    
  #Deletion 
  Scenario: Verify that user is able to navigate to "Deletion" data structure page
    Given The user clicks "Deletion" link
    When  The user clicks "Try Here" button in Introduction page
    Then  The user should be redirected to a page having an try Editor with a Run button to test
    
     
  Scenario: Verify that user receives error when click on Run button without entering code for "Deletion" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then   The user should able to see an error message in alert window
    
     
  Scenario Outline: Verify that user receives error for invalid python code for "Deletion" page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Deletion"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
   Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
      
    Scenario: Verify that the user shoud be back to "Deletion" page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Deletion" page
  
  #Practice Question   
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Linked List" page
  Given  The user is in the "Deletion" page 
  When   The user clicks "Practice Questions" button
  Then   The user should be redirected to "Practice" page
  
  Scenario: Verify that the user shoud be back to "Deletion" page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Deletion" page