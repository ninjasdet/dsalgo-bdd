@LinkedList
Feature: Linked List Structure Navigation

  Background: 
    Given For Linked List Datastructure the user signs into dsAlgo Portal

  Scenario: Verify that user is able to navigate to Linked List page
    #Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in the Linked List panel
    Then The user be directed to Linked List Data Structure Page

  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the Linked List Data Structure Page
    When The user clicks the Introduction link
    Then The user be redirected to Introduction in Linked List page

  Scenario: Verify that user is able to navigate to try Editor page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test Introduction page

  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Introduction page
    Given The user is in the tryEditor page of Introduction
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for Introduction page
    Given The user is in the tryEditor page of Introduction
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  Scenario: Verify that user is able to navigate to Creating Linked List data structure page
    Given The user clicks creating Linked List in Linked List
    When The user clicks Try Here button in Linked List
    Then The user should be redirected to a page having an try Editor with a Run button to test the Creating Linked List

  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Creating Linked LIst page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  Scenario: Verify that user is able to navigate to Types of Linked list data structure page
    Given The user clicks Types of Linked list link
    When The user clicks Try Here button in Linked List
    Then The user should be redirected to a page having an try Editor with a Run button to test for Types of Linked list

  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Types of Linked list page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for "Types of Linked List"page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  #Implement Linked List in Python
  Scenario: Verify that user is able to navigate to Implement Linked List in Python data structure page
    Given The user clicks Implement Linked list in Python link
    When The user clicks Try Here button in Linked List
    Then The user should be redirected to a page having an try Editor with a Run button to test Implement Linked List in Python

  Scenario Outline: Verify that user receives error when click on Run button with different set of invalid data for Implement Linked List in Python page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for Implement Linked List in python page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  Scenario: Verify that user is able to navigate to Traversal data structure page
    Given The user clicks Traversal link
    When The user clicks Try Here button in Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test of Traversal page

  Scenario Outline: Verify that user receives error for invalid python code for Traversal page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page of Linked List
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  Scenario: Verify that user is able to navigate to Deletion data structure page
    Given The user clicks Deletion link
    When The user clicks Try Here button in Linked List
    Then The user should be redirected to a page having an try Editor with a Run button to test in Deletion

  Scenario Outline: Verify that user receives error for invalid python code for Deletion page
    Given The user is in the tryEditor page of Deletion
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see an error message in alert window for Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code for Deletion page
    Given The user is in the tryEditor page of Deletion
    When For Linked List the user clicks the Run button after entering <RowNumber> from "<SheetName>"
    Then The user should able to see output in the console of Linked List

    Examples: 
      | SheetName | RowNumber |
      | TryEditor |         4 |

  Scenario: Verify that user is able to navigate to Practice Questions Page for Linked List page
    Given The user is in the Deletion page
    When For Linked List page the user clicks Practice Questions button for Deletion
    Then The user should be redirected to Practice page for Deletion
