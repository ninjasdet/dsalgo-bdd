@TreeDataStructure
Feature: Tree Data Structure Navigation

 
  Background:
    Given For Tree Datastructure the user signs into dsAlgo Portal
    
  Scenario: Verify that the user is able to navigate into dsAlgo Portal of Tree Data structure Page. 
    #Given The user is in the Home page after Sign in
    When the user clicks the Get Started button in the Tree Panel or the user selects Tree item from the drop-down menu
    Then the user directed to the Tree Data Structure Page
  
  Scenario: Verify that the user is able to navigate to Overview of Trees
    Given The user is in the Tree Data Structure page 
    When  The user clicks the Overview of Trees link
    Then  The user is directed to Overview of Trees Page
   
  Scenario: Verify that user is able to navigate to TryEditor page for Overview of Trees
  Given The user is in the Overview of Trees page
  When The user clicks Try here button in Overview of Trees page
  Then The user should be redirected to a page having a try Editor with a Run button of Tree
  
  Scenario Outline: Output Testing with different sets of invalid data in Overview of Trees page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
 
  Scenario Outline: Output Testing with different sets of valid data in Overview of Trees page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     | 
  
  Scenario: Verify that the user should be back to Overview of Trees
  Given The user is on the Tryeditor Overview of Trees page
  When The user click on the Back arrow on top tryeditor Overview of Trees page 
  Then The user should be redirected back to Overview of Trees page
  
# Terminologies
  Scenario: Verify that the user is able to navigate to Terminologies page
	  Given The user is in the Tree Data Structure page
	  When  The user clicks the Terminologies link
	  Then  The user is directed to Terminologies Page
  
  Scenario: Verify that user is able to navigate to TryEditor page for Terminologies
  Given The user is in the Terminologies page
  When The user clicks Try here button in Terminologies page
  Then The user should be redirected to a page having a try Editor with a Run button of Tree
   
  Scenario Outline: Output Testing with different sets of invalid data in Terminologies page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
     
  Scenario Outline: Output Testing with different sets of valid data in Terminologies page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     | 
  
 
  Scenario: Verify that the user shoud be back to Terminologies
	  Given The user is on the Tryeditor Terminologies page
	  When The user click on the Back arrow on top of Terminologies page
	  Then The user should be redirected back to Terminologies page
  
 # Types of Trees
  Scenario: Verify that the user is able to navigate to Types of Trees page
	  Given The user is in Tree DataStructure page
	  When  The user clicks the Types of Trees link
	  Then The user is directed to Types of Trees Page
  
  Scenario: Verify that user is able to navigate to TryEditor page for Types of Trees
	  Given The user is in the Types of Trees page
	  When The user clicks Try here button in Types of Trees page
	  Then The user should be redirected to a page having a try Editor with a Run button of Tree
  
  Scenario Outline: Output Testing with different sets of invalid data in Types of Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2 		 | 
      | TryEditor  |     3		 | 
      
  Scenario Outline: Output Testing with different sets of valid data in Types of Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
      Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4		 | 	 
 
  Scenario: Verify that the user should be back to Types of Trees
	  Given The user is on the Tryeditor Types of Trees 
	  When The user click on the Back arrow on top of Types of Trees
	  Then The user should be redirected to Types of Trees page 
	  
 #Tree Traversals
  Scenario: Verify that the user is able to navigate to Tree Traversals page
	  Given The user is in Tree DataStructure page
	  When  The user clicks the Tree Traversals link
	  Then The user is directed to Tree Traversals Page
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Tree Traversals
	  Given The user is in the Tree Traversals page
	  When The user clicks Try here button in Tree Traversals page
	  Then The user should be redirected to a page having a try Editor with a Run button 
	  
	  Scenario Outline: Output Testing with different sets of invalid data in Tree Traversals page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
   
  Scenario Outline: Output Testing with different sets of valid data in Tree Traversals page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     | 
  
  Scenario: Verify that the user shoud be back to Types of Tree Traversals
	  Given The user is on the Tryeditor Tree Traversals page
	  When The user click on the Back arrow on top of Tree Traversals page
	  Then The user should be redirected to Tree Traversals page 
	
	#Traversals-Illustration  
	Scenario: Verify that the user is able to navigate to Traversals-Illustration page
	  Given The user is in Tree DataStructure page
	  When  The user clicks the Traversals-Illustration link
	  Then The user is directed to Traversals-Illustration Page  
	  
  Scenario: Verify that user is able to navigate to TryEditor page for Traversals-Illustration
	  Given The user is in the Traversals-Illustration page
	  When The user clicks Try here button in Traversals-Illustration page
	  Then The user should be redirected to a page having a try Editor with a Run button of Tree
 
 Scenario Outline: Output Testing with different sets of invalid data in Traversals-Illustration page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Traversals-Illustration page
     Given The user is in the tryEditor page of Tree 
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
   
  Scenario: Verify that the user shoud be back to Types of Traversals-Illustration 
	  Given The user is on the Tryeditor Traversals-Illustration page
	  When The user click on the Back arrow on top of Traversals-Illustration page 
	  Then The user should be redirected to Traversals-Illustration page 
	
	#Binary Trees  
	Scenario: Verify that the user is able to navigate to Binary Trees page
	  Given The user is in Tree DataStructure page
	  When  The user clicks the Binary Trees link
	  Then The user is directed to Binary Trees Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Binary Trees
	  Given The user is in the Binary Trees page
	  When The user clicks Try here button in Binary Trees page
	  Then The user should be redirected to a page having a try Editor with a Run button of Tree  
	  
	  
 Scenario Outline: Output Testing with different sets of invalid data in Binary Trees page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Binary Trees page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	 
	  Scenario: Verify that the user shoud be back to  Binary Trees 
	  Given The user is on the Tryeditor Binary Trees page
	  When The user click on the Back arrow on top of Binary Trees page
	  Then The user should be redirected to Binary Trees page   
	  
	  #Types of Binary Trees
	  Scenario: Verify that the user is able to navigate to Types of Binary Trees page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Types of Binary Trees link
		  Then The user is directed to Types of Binary Trees Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Types of Binary Trees
	  Given The user is in the Types of Binary Trees page
	  When The user clicks Try here button in Types of Binary Trees page
	  Then The user should be redirected to a page having a try Editor with a Run button of Tree  
	  
	  
 Scenario Outline: Output Testing with different sets of invalid data in Types of Binary Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Types of Binary Trees page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	  
	  Scenario: Verify that the user shoud be back to  Types of Binary Trees
	  Given The user is on the Tryeditor Types of Binary Trees page
	  When The user click on the Back arrow on top Binary Trees page 
	  Then The user should be redirected to Types of Binary Trees page   
	  
	  #Implementation in python
	  Scenario: Verify that the user is able to navigate to Implementation in python page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Implementation in python link
		  Then The user is directed to Implementation in python Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Implementation in python
	  Given The user is in the Implementation in python page
	  When The user clicks Try here button in Implementation in python
	  Then The user should be redirected to a page having a try Editor with a Run button  
	  
	  
 	Scenario Outline: Output Testing with different sets of invalid data in Implementation in python
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Implementation in python page
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	   
	  Scenario: Verify that the user shoud be back to  Implementation in python
		  Given The user is on the Tryeditor Implementation in python page
		  When The user click on the Back arrow on top Implementation in python page
		  Then The user should be redirected to Implementation in python page   
		 
	  #Binary Tree Traversals
	  Scenario: Verify that the user is able to navigate to Binary Tree Traversals page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Binary Tree Traversals link
		  Then The user is directed to Binary Tree Traversals Page  
		  
	 Scenario: Verify that user is able to navigate to TryEditor page for Binary Tree Traversals
	  Given The user is in the Binary Tree Traversals page
	  When The user clicks Try here button in Binary Tree Traversals
	  Then The user should be redirected to a page having a try Editor with a Run button  
	  
	  
 	Scenario Outline: Output Testing with different sets of invalid data in Binary Tree Traversals
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Binary Tree Traversals
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	    
	  Scenario: Verify that the user shoud be back to  Binary Tree Traversals
		  Given The user is on the Tryeditor Binary Tree Traversals
		  When The user click on the Back arrow on top Binary Tree Traversals 
		  Then The user should be redirected to Binary Tree Traversals page 
	  
	  #Implementation of Binary Trees
	  Scenario: Verify that the user is able to navigate to Implementation of Binary Trees page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Implementation of Binary Trees link
		  Then The user is directed to Implementation of Binary Trees Page  
		  
	 Scenario: Verify that user is able to navigate to TryEditor page for Implementation of Binary Trees
	  Given The user is in the Implementation of Binary Trees page
	  When The user clicks Try here button in Implementation of Binary Trees
	  Then The user should be redirected to a page having a try Editor with a Run button  
	  
	  
 	Scenario Outline: Output Testing with different sets of invalid data in Implementation of Binary Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2      | 
      | TryEditor  |     3      | 
      
  Scenario Outline: Output Testing with different sets of valid data in Implementation of Binary Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	   
	  Scenario: Verify that the user shoud be back to  Implementation of Binary Trees
	  Given The user is on the Tryeditor Implementation of Binary Trees
	  When The user click on the Back arrow on top Implementation of Binary Trees 
	  Then The user should be redirected to a Implementation of Binary Trees page 
	  
	  #Applications of Binary Trees
	  Scenario: Verify that the user is able to navigate to Applications of Binary Trees page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Applications of Binary Trees link
		  Then The user is directed to Applications of Binary Trees Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Applications of Binary Trees
		  Given The user is in the Applications of Binary Trees page
		  When The user clicks Try here button in Applications of Binary Trees
		  Then The user should be redirected to a page having a try Editor with a Run button  
		  
	Scenario Outline: Output Testing with different sets of invalid data in Applications of Binary Trees
	     Given The user is in the tryEditor page of Tree
	     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
	     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2 		 | 
      | TryEditor  |     3 		 | 
      
  Scenario Outline: Output Testing with different sets of valid data in Applications of Binary Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	    
	  Scenario: Verify that the user shoud be back to  Applications of Binary Trees
	  Given The user is on the Tryeditor Applications of Binary Trees
	  When The user click on the Back arrow on top Applications of Binary Trees 
	  Then The user should  redirected to  Applications of Binary Trees page 
	       
	  #Binary Search Trees
	  
	  Scenario: Verify that the user is able to navigate to Binary Search Trees page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Binary Search Trees link
		  Then The user is directed to Binary Search Trees Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Binary Search Trees
		  Given The user is in the Binary Search Trees page
		  When The user clicks Try here button in Binary Search Trees
		  Then The user should be redirected to a page having a try Editor with a Run button  
	  
	  
 	Scenario Outline: Output Testing with different sets of invalid data in Binary Search Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName | RowNumber |

      | TryEditor |     2		  | 
      | TryEditor |     3 		| 
      
  Scenario Outline: Output Testing with different sets of valid data in Binary Search Trees
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	    
	  Scenario: Verify that the user shoud be back to  Binary Search Trees
	  Given The user is on the Tryeditor Binary Search Trees
	  When The user click on the Back arrow on top Binary Search Trees 
	  Then The user should be redirected to the Binary Search Trees of tree page 
	  
	  #Implementation Of BST
	 
	 Scenario: Verify that the user is able to navigate to Implementation Of BST page
		  Given The user is in Tree DataStructure page
		  When  The user clicks the Implementation Of BST link
		  Then The user is directed to Implementation Of BST Page  
	  
	 Scenario: Verify that user is able to navigate to TryEditor page for Implementation Of BST
		  Given The user is in the Implementation Of BST page
		  When The user clicks Try here button in Implementation Of BST
		  Then The user should be redirected to a page having a try Editor with a Run button  
	  
	  
 	Scenario Outline: Output Testing with different sets of invalid data in Implementation Of BST
	     Given The user is in the tryEditor page of Tree
	     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
	     Then The user should able to see an error message in alert window of Tree
     
       Examples: 
      | SheetName  | RowNumber |

      | TryEditor  |     2     | 
      | TryEditor  |     3     | 
      
  Scenario Outline: Output Testing with different sets of valid data in Implementation Of BST
     Given The user is in the tryEditor page of Tree
     When For tree the user clicks the Run button after entering <RowNumber> from "<SheetName>"
     Then The user should able to see output in the console of Tree
     
       Examples: 
      | SheetName  | RowNumber |
      
      | TryEditor  |     4     |
	 
	  Scenario: Verify that the user shoud be back to  Implementation Of BST
	  Given The user is on the Tryeditor Implementation Of BST
	  When The user click on the Back arrow on top Implementation Of BST 
	  Then The user should be redirected a Implementation Of BST page
	  
	  Scenario: Verify that user is able to navigate to Practice Questions Page for Tree page
			Given The user is in the Tree page
	    When the user clicks the Practice Questions link
	    Then the user should be redirected to the Practice Questions page
   
  Scenario: Verify that the user can navigate back to the Tree page
    Given the user is in  practice questions page
    When the user clicks on the Back arrow at the top
    Then the user should be redirected to the Tree page
 
	  
	       