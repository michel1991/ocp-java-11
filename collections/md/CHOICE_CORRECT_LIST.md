##### Suppose that you have a collection of products for sale in a database and you need to display those products.
##### The products are not unique. Which of the following collections
##### classes in the java.util package best suits your needs for this scenario?
*  A. Arrays
*  B. ArrayList
*  C. HashMap
*  D. HashSet
*  E. LinkedList

The answer needs to implement List because the scenario allows duplicates.
Since you need a List, you can eliminate options C and D immediately
because HashMap is a Map and HashSet is a Set.
Option A, Arrays, is trying to distract you.
It is a utility class rather than a Collection.
An array is not a collection. This leaves you with options B and E.
Option B is a better answer than option E because
LinkedList is both a List and a Queue, and you just need a regular List.

###### Suppose that you need to work with a collection of elements that need to be sorted
###### in their natural order, and each element has a unique text id that you want
###### to use to store and retrieve the record. Which of the following
###### collections classes in the java.util package best suits your needs for this scenario?
*  A. ArrayList
*  B. HashMap
*  C. HashSet
*  D. TreeMap
*  E. TreeSet
*  F. None of the above

The answer needs to implement Map because you are dealing with key/value pairs per the unique id field.
You can eliminate options A, C, and E immediately since they are not a Map. ArrayList is a List.
HashSet and TreeSet are Sets. Now it is between HashMap and TreeMap.
Since the question talks about ordering, you need the TreeMap.
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