#### You have a collection which contains objects of a class X.
#### When the collection is sorted using Collections.sort(collectionOfX);,
#### X's compareTo() method is used. Which of the following statements are correct about this class X?

* A. Class X implements Comparator interface.
* B. Class X implements Comparable interface.
* C. Class X neither implements Comparable nor Comparator. Object of a separate class that implements Comparator is used for sorting.
* D. The mechanism used in this situation allows the Objects of class X to be sorted in only one way (and the reverse of that way).
Since compareTo method is used for sorting, that means, Class \\\X\\\ implements \\\Comparable\\\ interface.
The collection is sorted based on the implementation of this method and the order
imposed by this method (and the reverse of that order) will be the only way this collection can be sorted
(because there can be only one compareTo method in the class).

On the other hand, if a a separate object of type Comparator is used,
the collection of X objects can be sorted in any way depending on what Comparator you use.

Remember that a collection can be sorted in two ways:

Collections.sort(myCollection); <--- In this case, class of objects contained in the collection must implement Comparable interface.

Collections.sort(myCollection, myComparator); <--- In this case, myComparator implements Comparator interface
and class of objects contained in the collection need not implement any interface or method.
The collection is sorted using myComparator.compare(obj1, obj2) method, where obj1 and obj2 are members of myCollection.

Correct(B, D)

