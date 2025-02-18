@ArrayPage
Feature: Array Data Structure Navigation 
Background:
    Given For Array Datastructure the user signs into dsAlgo Portal
  
 Scenario: Verify that user is able to navigate to Array data structure page
    #Given The user is in the Home page after Sign in
    When  The user clicks the Getting Started button in Array Panel OR The user select Array item from the drop down menu
    Then The user be directed to ARRAY Data Structure Page

    Scenario:  Verify that user is able to navigate to Arrays in Python page
    Given The user is in the Array page 
    When  The user clicks Arrays in Python button
    Then The user should be redirected to arrays in python page
 
    Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
    Given The user is on the Arrays in Python page
    When  The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario Outline: Verify that user receives error for invalid python code for Arrays in Python page
    Given The user is in the tryEditor page of Arrays in Python
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName   |  RowNumber   | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Arrays in Python page
    Given The user is in the tryEditor page of Arrays in Python
    When   For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of array
  
         Examples: 
      | SheetName 	|  RowNumber     | 
      
      |  TryEditor  |   4          	 | 
      
   
 
   Scenario: Verify that user is able to navigate to Arrays Using List data structure page
    Given The user clicks Arrays Using List link
    When  For Array the user clicks Try Here button in Arrays Using List link
    Then  The user should be redirected to a page having an try Editor with a Run button to test
       
  Scenario Outline: Verify that user receives error for invalid python code for Arrays Using List page
    Given The user is in the tryEditor page of Arrays in Python
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of array
       Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Arrays Using List page
    Given The user is in the tryEditor page of Arrays in Python
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of array
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
      
    #Scenario: Verify that the user shoud be back to Arrays Using List page
    #Given The user is in the tryEditor page of Arrays Using List page
    #When  The user click on the Back arrow on top of Arrays Using List
    #Then  The user should be redirected to the Arrays Using List page

  Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page
    When  The user clicks Try Here button in Basic Operations in Lists
    Then The user should be redirected to a page having an try Editor with a Run button to test Basic Operations in Lists
@ArrayPage1  
  Scenario Outline: Verify that user receives error for invalid python code for Basic Operations in Lists page
    Given The user is in the tryEditor page of Basic Operations in Lists page
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window  for array
       Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Basic Operations in Lists page
    Given The user is in the tryEditor page of Basic Operations in Lists page
    When    For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of array
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 

  Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page
    Given The user is on the Applications of Array page
    When  The user clicks Try Here button in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test for Applications of Array page
  
  Scenario Outline: Verify that user receives error for invalid python code for Applications of Array page
    Given The user is in the tryEditor page of Applications of Array page
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window  for array 
       Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for Applications of Array page
    Given The user is in the tryEditor page of Applications of Array page
    When  For Arrays the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of array
  
         Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |   4          | 
      
 
 #Practice Question   
 

  Scenario: Verify that user is able to navigate to Practice Questions Page for Applications of Array page
  Given  The user is in the Applications of Array page 
  When   The user clicks Practice Questions button for Applications of Array  
  Then   The user should be redirected to the Practice page of Applications of Array 
 
  Scenario Outline: Verify that user receives error for invalid python code for Practice questions in Applications of Array page
    Given The user is in the tryEditor page of Applications of Array page 
    When  For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Array 
       Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 

    Scenario Outline: Verify that user receives error for invalid python code for Practice questions in Applications of Array page
    Given The user is in the tryEditor page of Applications of Array page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission of invalid python code for Applications of Array
       Examples: 
      | SheetName |  RowNumber     | 
      
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   

   Scenario Outline: Verify that user is able to see output for valid python code for Practice questions in Applications of Array page
    Given  The user is in the tryEditor page of Applications of Array page
    When   For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Applications of Array 
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 

  
 
  Scenario: Verify that user is able to navigate to Practice Questions Page for Max Consecutive Ones page
  Given  The user is in the Max Consecutive Ones page
  When   The user able see Max Consecutive Ones page
  Then   The user should be redirected to the Practice page of Max Consecutive Ones page
  

 Scenario Outline: Verify that user receives error for invalid python code for Practice questions in Applications of Max Consecutive Ones page
    Given The user is in the question page of Max Consecutive Ones page
    When    For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Max Consecutive Ones page
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
 
    Scenario Outline: Verify that user receives error for invalid python code for Practice questions in Applications of Max Consecutive Ones page
    Given The user is in the question page of Max Consecutive Ones page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission invalid python code for Max Consecutive Ones page      
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    
   Scenario Outline: Verify that user is able to see output for valid python code for Practice questions in Applications of Max Consecutive Ones page
    Given The user is in the question page of Max Consecutive Ones page
    When  For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Max Consecutive Ones page
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
   
 Scenario Outline: Verify that user is able to see output for valid python code for Practice questions in Applications of Max Consecutive Ones page
    Given The user is in the question page of Max Consecutive Ones page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Applications of Max Consecutive Ones page
  
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
 

  Scenario: Verify that user is able to navigate to Practice Questions Page for Max Consecutive Ones page
  Given  The user is in the Practice Questions page 
  When   The user clicks Find Numbers with Even Numbers of Digits button
  Then   The user should be redirected to the Practice page of Find Numbers with Even Numbers of Digits button
  

 Scenario Outline: Verify that user receives error for invalid python code for Practice questions for Applications of Find Numbers with Even Numbers of Digits page
    Given The user is in the question page of Find Numbers with Even Numbers of Digits page
    When  For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Find Numbers with Even Numbers of Digits page
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
  
    Scenario Outline: Verify that user receives error for invalid python code for Practice questions for Applications of Find Numbers with Even Numbers of Digits page
    Given The user is in the question page of Find Numbers with Even Numbers of Digits page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission of invalid python code for Find Numbers with Even Numbers of Digits page       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   

   Scenario Outline: Verify that user is able to see output for valid python code for Practice questions for Applications of Find Numbers with Even Numbers of Digits page
    Given The user is in the question page of Find Numbers with Even Numbers of Digits page
    When  For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Find Numbers with Even Numbers of Digits page
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
      
 Scenario Outline: Verify that user is able to see output for valid python code for Practice questions for Applications of Find Numbers with Even Numbers of Digits page
    Given The user is in the question page of Find Numbers with Even Numbers of Digits page 
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Find Numbers with Even Numbers of Digits page
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
 
  
  Scenario: Verify that user is able to navigate to Practice Questions Page for Squares of a Sorted Array page
  Given  The user is in the Practice Questions for Squares of a Sorted Array page
  When   The user is on the Squares of a Sorted Array button
  Then   The user should be redirected again to Practice page of Squares of a Sorted Array page

 Scenario Outline: Verify that user receives error for invalid python code for Practice questions for Applications of Squares of a Sorted Arrays page
    Given The user is in the Practice Questions for Squares of a Sorted Array page
    When  For Array the user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window of Squares of a Sorted Array page
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 

  
    Scenario Outline: Verify that user receives error for invalid python code for Practice questions for Applications of Squares of a Sorted Array page
    Given The user is in the Practice Questions for Squares of a Sorted Array page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission of invalid python code of Applications of Squares of a Sorted Array page
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 

   Scenario Outline: Verify that user is able to see output for valid python code for Practice questions for Applications of Squares of a Sorted Array page
    Given The user is in the Practice Questions for Squares of a Sorted Array page
    When  The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see output in the console of Squares of a Sorted Array page
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 Scenario Outline: Verify that user is able to see output for valid python code for Practice questions for Applications of Find Numbers with Even Numbers of Digits page
    Given The user is in the tryEditor page of Applications of Squares of a Sorted Array page
    When   The user clicks the Submit button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console of Squares of a Sorted Array page
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
      
 
 