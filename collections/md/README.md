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







