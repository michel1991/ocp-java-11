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

### Which of the following statements are correct?
* A. A List stores elements in a sorted order.
    List just keeps elements in the order in which they are added.
    For sorting, you'll need some other interface such as a SortedSet.

* B. A Set keeps the elements sorted and a List keeps the elements in the order they were added.
    A Set keeps unique objects without any order or sorting.
    A List keeps the elements in the order they were added. A List may have non-unique elements.

* C. A SortedSet keeps the elements in the order they were added.
    A SortedSet keeps unique elements in their natural order.

* D. An OrderedSet keeps the elements sorted.
    There is no interface like OrderedSet.

* E. An OrderedList keeps the elements ordered.
    There is no such interface. The List interface itself is meant for keeping the elements in the order they were added.

* F. A NavigableSet keeps the elements sorted.
    A NavigableSet is a SortedSet extended with navigation methods reporting closest matches
    for given search targets. Methods lower, floor, ceiling, and higher return elements respectively less than,
    less than or equal, greater than or equal, and greater than a given element, returning null if there is no such element.
    Since NavigableSet is a SortedSet, it keeps the elements sorted.
(correct F)