@ignore
@Array
Feature: DsAlgo Array page 
  
 Background: The user is signed in to the dsAlgo Portal 
  
    Scenario: Verify that user is able to navigate to "Array" data structure page
    Given The user is in the Home page after Sign in
    When  The user clicks the "Getting Started" button in Array Panel OR The user select Array item from the drop down menu
    Then The user be directed to "ARRAY" Data Structure Page
   
    Scenario:  Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the "Array" page after Sign in
    When  The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page
    
    Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When  The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
   Scenario: Verify that user is able to navigate to "Arrays in Python" data structure page
    Given The user clicks "Arrays in Python" link
    When  The user clicks "Try Here" button in Introduction page
    Then  The user should be redirected to a page having an try Editor with a Run button to test
    
     

     
  Scenario Outline: Verify that user receives error for invalid python code for "Arrays in Python" page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Arrays in Python"page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
      
    Scenario: Verify that the user shoud be back to "Arrays in Python" page
    Given The user is in the tryEditor page of Arrays in Python
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to "Arrays in Python" page
  
   Scenario: Verify that user is able to navigate to "Arrays Using List" data structure page
    Given The user clicks "Arrays Using List" link
    When  The user clicks "Try Here" button in Introduction page
    Then  The user should be redirected to a page having an try Editor with a Run button to test
       
  Scenario Outline: Verify that user receives error for invalid python code for "Arrays Using List" page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Arrays Using List"page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
      
    Scenario: Verify that the user shoud be back to "Arrays Using List" page
    Given The user is in the tryEditor page of Arrays in Python
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to the "Arrays Using List" page
  
  Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
    Given The user is on the "Basic Operations in Lists" page
    When  The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test
  
  Scenario Outline: Verify that user receives error for invalid python code for "Basic Operations in Lists" page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Basic Operations in Lists"page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 Scenario: Verify that the user shoud be back to "Basic Operations in Lists" page
    Given The user is in the tryEditor page of Arrays in Python
    When  The user click on the "Back" arrow on top  
    Then  The user able to redirected to "Basic Operations in Lists" page
  
  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
    Given The user is on the "Applications of Array" page
    When  The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test
  
  Scenario Outline: Verify that user receives error for invalid python code for "Applications of Array" page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
   Scenario Outline: Verify that user is able to see output for valid python code for "Applications of Array"page
    Given The user is in the tryEditor page of Arrays in Python
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 Scenario: Verify that the user shoud be back to "Applications of Array" page
    Given The user is in the tryEditor page of Arrays in Python
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected to the "Applications of Array" page
    
 #Practice Question   
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications of Array" page
  Given  The user is in the "Applications of Array" page 
  When   The user clicks "Practice Questions" button
  Then   The user should be redirected to the "Practice" page
  
  Scenario Outline: Verify that user receives error for invalid python code for "Practice questions in Applications of Array" page
    Given The user is in the tryEditor page of Array Application
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    Scenario Outline: Verify that user receives error for invalid python code for "Practice questions in Applications of Array" page
    Given The user is in the tryEditor page of Array Application
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    
   Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions in Applications of Array"page
    Given The user is in the tryEditor page of Array Application
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 
  Scenario: Verify that the user shoud be back to "Data Structure" page
    Given The user is in the tryEditor page 
    When  The user click on the "Back" arrow on top  
    Then  The user should be redirected back to "Data Structure" page
    
   
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Max Consecutive Ones" page
  Given  The user is in the "Data Structure" page 
  When   The user clicks "Max Consecutive Ones" button
  Then   The user should be redirected to the "Practice" page
  
 
 Scenario Outline: Verify that user receives error for invalid python code for "Practice questions in Applications of Max Consecutive Ones" page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    Scenario Outline: Verify that user receives error for invalid python code for "Practice questions in Applications of Max Consecutive Ones" page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    
   Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions in Applications of Max Consecutive Ones"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions in Applications of Max Consecutive Ones"page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
 
 Scenario: Verify that the user shoud be back to "Data Structure" page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should redirected to "Data Structure" page
    
   
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Max Consecutive Ones" page
  Given  The user is in the "Data Structure" page 
  When   The user clicks " Find Numbers with Even Numbers of Digits" button
  Then   The user should be redirected to the "Practice" page
  
 
 Scenario Outline: Verify that user receives error for invalid python code for "Practice questions for Applications of Find Numbers with Even Numbers of Digits " page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    Scenario Outline: Verify that user receives error for invalid python code for "Practice questions for Applications of Find Numbers with Even Numbers of Digits" page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    
   Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions for Applications of Find Numbers with Even Numbers of Digits"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions for Applications of Find Numbers with Even Numbers of Digits"page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
 
 Scenario: Verify that the user shoud be back to "Data Structure" page
    Given The user is in the tryEditor page
    When  The user click on the "Back" arrow on top  
    Then  The user should redirected back to the "Data Structure" page.
    
   
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Squares of a Sorted Array" page
  Given  The user is in the "Data Structure" page 
  When   The user clicks " Squares of a Sorted Array" button
  Then   The user should be redirected again to "Practice" page
  
 
 Scenario Outline: Verify that user receives error for invalid python code for "Practice questions for Applications of Squares of a Sorted Arrays " page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see an error message in alert window 
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    Scenario Outline: Verify that user receives error for invalid python code for "Practice questions for Applications of Squares of a Sorted Array" page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then  The user should able to see Error occurred during submission       
       Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |    2         | 
      |  TryEditor  |    3         | 
   
    
   Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions for Applications of Squares of a Sorted Array"page
    Given The user is in the tryEditor page
    When   The user clicks the Run Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          | 
 
 
 Scenario Outline: Verify that user is able to see output for valid python code for "Practice questions for Applications of Find Numbers with Even Numbers of Digits"page
    Given The user is in the tryEditor page
    When   The user clicks the Submit Button after entering <RowNumber> from "<SheetName>"
    Then   The user should able to see output in the console
  
         Examples: 
      | SheetName |  RowNumber     | 
      |  TryEditor  |   4          |
      
 
 