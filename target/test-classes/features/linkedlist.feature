@Linkedlist
Feature: Linked List
 Background :The user sign in to dsAlgo Portal

 
  Scenario: Verify that user is able to navigate to Linked List page 
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in the Linked List panel 
    Then The user be directed to Linked List Data Structure Page
 
  Scenario: Verify that user is able to navigate to Introduction page
    Given The user clicks Introduction in Linked List HyperLink
    When  The user should be redirected to Introduction in Linked List page 
    Then  The user  be redirected to Introduction in Linked List page
    
  Scenario: Verify that user is able to navigate to try Editor page for Introduction page
    Given The user is on the Introduction page
    When   The user clicks Try Here button in Introduction page
    Then   The user should be redirected to a page having an try Editor with a Run button to test Introduction page
    
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Introduction page
    Given The user is in the tryEditor page of Linked List
     When The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window for invalid data for Introduction 
      Examples: 
      | SheetName   |  RowNumber   | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
  Scenario Outline: Verify that user is able to see output for valid python code for Introduction page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Introduction page
     
        Examples: 
      | SheetName   |  RowNumber   | 
      
      |  TryEditor  |   4          |  
  
 Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page of Linked List
    When  The user click on the Back arrow on top of travesal page
    Then  The user should be redirected to Linked List page 
    
 #Creating Linked List
  
 Scenario: Verify that user is able to navigate to Creating Linked LIst data structure page
    Given The user clicks creating Linked List in Linked List
    When  The user clicks Try Here button in Linked List
    Then  The user should be redirected to a page having an try Editor with a Run button to test the Creating Linked List
 
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Creating Linked LIst page
    Given The user is in the tryEditor page of Linked List
     When The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Creating Linked List
         Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
 Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page of Linked List
     When The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Creating Linked List
       
       Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |   4          |  
  
  Scenario: Verify that the user shoud be back to travesal page
    Given  The user is in the tryEditor page of Linked List
    When   The user click on the Back arrow on top of travesal page
    Then   The user should be redirected to Linked List page
    
  #Types of Linked list
  Scenario: Verify that user is able to navigate to Types of Linked list data structure page
    Given The user clicks Types of Linked list link
    When  The user clicks Try Here button in Linked List
    Then  The user should be redirected to a page having an try Editor with a Run button to test for Types of Linked list 
  
   
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Types of Linked list page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Types of Linked list
          Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
      
  
  Scenario Outline: Verify that user is able to see output for valid python code for "Types of Linked List"page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Types of Linked list
  
         Examples: 
      | SheetName   |  RowNumber     |
       
      |  TryEditor  |   4            |  
  
  
  Scenario: Verify that the user shoud be back to Linked List page
    Given The user is on the Types of Linked List page
    When  The user click on the Back arrow on top of Types of Linked List 
    Then  The user should be redirected to Linked List page 
    
   #Implement Linked List in Python
  Scenario: Verify that user is able to navigate to Implement Linked List in Python data structure page
    Given The user clicks Implement Linked list in Python link
    When  The user clicks Try Here button in Linked List
    Then  The user should be redirected to a page having an try Editor with a Run button to test Implement Linked List in Python
    
     
  
  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Implement Linked List in Python page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window for Implement Linked List in Python
       Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Implement Linked List in python page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Implement Linked List in Python
  
         Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |   4          |  
  
    Scenario: Verify that the user shoud be back to Linked List page
    GivenThe user is in the tryEditor page of Linked List
    When  The user click on the Back arrow on top of Implement Linked List in python  
    Then  The user should be redirected to Linked List page
    
  #Traversal 
  Scenario: Verify that user is able to navigate to Traversal data structure page
    Given The user clicks Traversal link
    When  The user clicks Try Here button in Linked List page
    Then  The user should be redirected to a page having an try Editor with a Run button to test of Traversal page
    
     
  Scenario: Verify that user receives error when click on Run button without entering code for Traversal  page
    Given The user is in the tryEditor page of Linked List 
    When The user clicks the Run button without entering the code in the Editor for Traversal 
    Then   The user should able to see an error message in alert window in Traversal 
    
     
  Scenario Outline: Verify that user receives error for invalid python code for Traversal page
    Given The user is in the tryEditor page of Linked List
    When   The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window in Traversal 
       Examples: 
      
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page of Traversal 
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Traversal 
  Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |   4          |  
  
  
  Scenario: Verify that the user shoud be back to travesal page
    Given The user is in the tryEditor page of Linked List
    When  The user click on the Back arrow on top of Traversal 
    Then  The user should be redirected to Linked List page 
    
  #Deletion 
  Scenario: Verify that user is able to navigate to Deletion data structure page
    Given The user clicks Deletion link
    When  The user clicks Try Here button in Linked List
    Then  The user should be redirected to a page having an try Editor with a Run button to test in Deletion 
    
     
  Scenario: Verify that user receives error when click on Run button without entering code for Deletion page
    Given The user is in the tryEditor page of Linked List
    When  The user clicks the Run button without entering the code in the Editor of Deletion page
    Then  The user should able to see an error message in alert window in Deletion 
    
     
  Scenario Outline: Verify that user receives error for invalid python code for Deletion page
    Given The user is in the tryEditor page of Deletion 
    When  The user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window in Deletion 
       Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Deletion page
    Given The user is in the tryEditor page in Deletion 
    When  The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Deletion page
  
   Examples: 
      | SheetName   |  RowNumber   |
       
      |  TryEditor  |   4          | 
      
    Scenario: Verify that the user shoud be back to Deletion page
    Given The user is in the tryEditor page of Linked List
    When  The user click on the Back arrow on top of Deletion page
    Then  The user should be redirected to Deletion page
  
  #Practice Question   
  Scenario: Verify that user is able to navigate to Practice Questions Page for Linked List page
  Given  The user is in the Deletion page 
  When   The user clicks Practice Questions button for Deletion
  Then   The user should be redirected to Practice page for Deletion 
  
  Scenario: Verify that the user shoud be back to Deletion page
    Given The user is in the tryEditor page of Linked List
    When  The user click on the Back arrow on top of Deletion page
    Then  The user should be redirected to Deletion page
    