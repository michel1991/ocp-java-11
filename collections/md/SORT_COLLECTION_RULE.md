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