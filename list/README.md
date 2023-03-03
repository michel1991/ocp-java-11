### Which of the answer choices make sense to implement with a lambda? (Choose all that apply.)
* A. Comparable interface
* B. Comparator interface
* C. remove method on a Collection
* D. removeAll method on a Collection
* E. removeIf method on a Collection
* You Answered Correctly!
    
Both Comparator and Comparable are functional interfaces.
However, Comparable is intended to be used on the object being compared, making option B correct.
The removeIf() method allows specifying the lambda to check when removing elements, making option E correct.
Option C is incorrect because the remove() method takes an instance of an object to look for in the Collection to remove.
Option D is incorrect because removeAll() takes a Collection of objects to look for in the Collection to remove.

### Which statements about decision structures are true? (Choose all that apply.)
* A. A for-each loop can be executed on any Collections Framework object.
* B. The body of a while loop is guaranteed to be executed at least once.
* C. The conditional expression of a for loop is evaluated before the first execution of the loop body.
* D. A switch statement with no matching case statement requires a default statement.
* E. The body of a do/while loop is guaranteed to be executed at least once.
* F. An if statement can have multiple corresponding else statements.

A for-each loop can be executed on any Collections object that implements java.lang.Iterable, such as List or Set, but not all Collections classes, such as Map, so option A is incorrect.
The body of a do/while loop is executed one or more times, while the body of a while loop is executed zero or more times, making option E correct and option B incorrect.
The conditional expression of for loops is evaluated at the start of the loop execution, meaning the for loop may execute zero or more times, making option C correct.
Option D is incorrect, as a default statement is not required in a switch statement.
In the case that no case statements match and there is no default statement, the application will exit the switch statement without executing any branches.
Finally, each if statement has at most one matching else statement, making option F incorrect.
You can chain multiple if and else statements together, but each else statement requires a new if statement.

# Suppose that you have a collection of products for sale in a database and you need to display those products. The products are not unique. Which of the following collections classes in the java.util package best suits your needs for this scenario?
*  A. Arrays
*  B. ArrayList
*  C. HashMap
*  D. HashSet
*  E. LinkedList

The answer needs to implement List because the scenario allows duplicates.
Since you need a List, you can eliminate options C and D immediately because HashMap is a Map and HashSet is a Set.
Option A, Arrays, is trying to distract you. It is a utility class rather than a Collection.
An array is not a collection. This leaves you with options B and E.
Option B is a better answer than option E because LinkedList is both a List and a Queue, and you just need a regular List.

### Which of the following are true? (Choose all that apply.)
*  A. An array has a fixed size.
*  B. An ArrayList has a fixed size.
*  C. An array is immutable.
*  D. An ArrayList is immutable.
*  E. Calling equals() on two equivalent arrays returns true.
*  F. Calling equals() on two equivalent ArrayList objects returns true.
*  G. If you call remove(0) using an empty ArrayList object, it will compile successfully.
*  H. If you call remove(0) using an empty ArrayList object, it will run successfully.

An array is not able to change size, making option A correct and option B incorrect.
Neither is immutable, making options C and D incorrect. The elements can change in value.
An array does not override equals(), so it uses object equality, making option E incorrect.
ArrayList does override equals() and defines it as the same elements in the same order, making option F correct.
The compiler does not know when an index is out of bounds and thus can’t give you a compiler error, making option G correct.
The code will throw an exception at runtime, though, making option H the final incorrect answer.

#### Suppose that you need to work with a collection of elements that need to be sorted in their natural order, and each element has a unique text id that you want to use to store and retrieve the record. Which of the following collections classes in the java.util package best suits your needs for this scenario?
*  A. ArrayList
*  B. HashMap
*  C. HashSet
*  D. TreeMap
*  E. TreeSet
*  F. None of the above

The answer needs to implement Map because you are dealing with key/value pairs per the unique id field.
You can eliminate options A, C, and E immediately since they are not a Map. ArrayList is a List.
HashSet and TreeSet are Sets. Now it is between HashMap and TreeMap. Since the question talks about ordering, you need the TreeMap.
Therefore, the answer is option D.

### Description
We are running a library. Patrons select books by name. They get at the back of the checkout line.
When they get to the front, they scan the book’s ISBN, a unique identification number.
The checkout system finds the book based on this number and marks the book as checked out.
Of these choices, which data structures best represent the line to check out the book and the book lookup to mark it as checked out,
respectively?

*  A. ArrayList, HashSet
*  B. ArrayList, TreeMap
*  C. ArrayList, TreeSet
*  D. LinkedList, HashSet
*  E. LinkedList, TreeMap
*  F. LinkedList, TreeSet

Notice how there is unnecessary information in this description.
The fact that patrons select books by name is irrelevant.
The checkout line is a perfect example of a Queue.
We need easy access to one end of the Queue for patrons to add themselves to the queue.
We also need easy access for patrons to get off the queue when it is their turn.
Since a LinkedList is a Queue, this narrows down the answer to options D, E, and F.
The book lookup by ISBN is a lookup by key.
We need a map for this.
A HashMap is probably better here, but it isn’t a choice.
So the answer is option E, which does include both a Queue and a Map.