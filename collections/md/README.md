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

A for-each loop can be executed on any Collections object that implements java.lang.Iterable,
such as List or Set, but not all Collections classes, such as Map, so option A is incorrect.
The body of a do/while loop is executed one or more times, while the body
of a while loop is executed zero or more times, making option E correct and option B incorrect.
The conditional expression of for loops is evaluated at the start of the loop execution,
meaning the for loop may execute zero or more times, making option C correct.
Option D is incorrect, as a default statement is not required in a switch statement.
In the case that no case statements match and there is no default statement,
the application will exit the switch statement without executing any branches.
Finally, each if statement has at most one matching else statement, making option F incorrect.
You can chain multiple if and else statements together, but each else
statement requires a new if statement.



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



### Which is not a true statement about an array?
*  A. An array expands automatically when it is full.
*  B. An array is allowed to contain duplicate values.
*  C. An array understands the concept of ordered elements.
*  D. An array uses a zero index to reference the first element.

##### Suppose we have list of type List˂Integer˃.
##### Which method allows you to pass a List
##### and returns an immutable Set containing the same elements?
*  A. List.copyOf(list)
*  B. List.of(list)
*  C. Set.copyOf(list);
*  D. Set.of(list);
*  E. None of the above

All four of these return immutable collections.
Options B and D take a varargs rather than a List.
Option A returns a List, not a Set. Option C meets both our requirements.

##### How many of these allow inserting null values: ArrayList, LinkedList, HashSet, and TreeSet?
* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

TreeSet does not allow null values because it needs to compare the values.
While HashSet does call hashCode(), it knows to skip that call if the value is null.
ArrayList and LinkedList do not make method calls on their contents.
Three of the four allow inserting null values, making option D the answer.

##### Suppose we want to store JellyBean objects. Which of the following
##### require JellyBean to implement the Comparable interface
##### or create a Comparator to add them to the collection? (Choose two.)
* A. ArrayList
* B. HashMap
* C. HashSet
* D. SortedArray
* E. TreeMap
* F. TreeSet

TreeMap and TreeSet keep track of sort order when you insert elements.
TreeMap sorts the keys and TreeSet sorts the objects in the set.
This makes options E and F correct. Note that you have
the option of having JellyBean implement Comparable,
or you can pass a Comparator to the constructor of TreeMap or TreeSet.
Option D is trying to trick you as SortedArray
is not a class or interface in the collections framework.


