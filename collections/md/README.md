### Which of the answer choices make sense to implement with a lambda? (Choose all that apply.)
* A. Comparable interface
* B. Comparator interface
* C. remove method on a Collection
* D. removeAll method on a Collection
* E. removeIf method on a Collection
* You Answered Correctly!
    
Both Comparator and Comparable are functional interfaces.
However, Comparable is intended to be used on the object being compared,
making option B correct.The removeIf() method allows specifying
the lambda to check when removing elements, making option E correct.
Option C is incorrect because the remove() method takes an instance
of an object to look for in the Collection to remove.
Option D is incorrect because removeAll() takes a Collection of objects
to look for in the Collection to remove.


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
ArrayList does override equals() and defines it as the same elements in the same order,
making option F correct. The compiler does not know when an index is out of bounds
and thus can’t give you a compiler error, making option G correct.
The code will throw an exception at runtime, though, making option H the final incorrect answer.


### Which is not a true statement about an array?
*  A. An array expands automatically when it is full.
*  B. An array is allowed to contain duplicate values.
*  C. An array understands the concept of ordered elements.
*  D. An array uses a zero index to reference the first element.

##### Suppose we have list of type List<Integer>.
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

### Which of the following statements are correct?

* A. A List stores elements in a sorted order.
List just keeps elements in the order in which they are added. For sorting, you'll need some other interface such as a SortedSet.
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

#### Code that uses generic collection classes can interoperate with code that uses raw collections classes because of?

* A. type erasure
    Type erasure means that a compiled java class does not contain any of the generic information that is present in the java file.
    In other words, the compiler removes the generic information from a java class when it compile it into byte code. For example,
    List<String> list; and List list; are compiled to the same byte code. Therefore, at run time,
    it does not matter whether you've used generic classes or not and this allows both kinds of classes
    to interoperate because they are essentially the same class to the JVM.
    Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime overhead.
* B. reification
    This is just the opposite of type erasure. Here, all the type information is preserved in the byte code.
    In Java, arrays are reified. For example,
```java
    ArrayList[] alArray = new ArrayList[1];
    Collection[] cArray = alArray;
    cArray[0] = new HashSet();
```

    The above code will compile fine. But it will throw an java.lang.ArrayStoreException
    at run time because the byte code contains the information that cArray actually
    points to an array of ArrayLists and not of HashSets.

* C. just in time compilation
* D. byte code instrumentation

(correct A)







