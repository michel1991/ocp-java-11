# Which of the answer choices make sense to implement with a lambda? (Choose all that apply.)
    A. Comparable interface
    B. Comparator interface
    C. remove method on a Collection
    D. removeAll method on a Collection
    E. removeIf method on a Collection
    You Answered Correctly!
    
Both Comparator and Comparable are functional interfaces.
However, Comparable is intended to be used on the object being compared, making option B correct.
The removeIf() method allows specifying the lambda to check when removing elements, making option E correct.
Option C is incorrect because the remove() method takes an instance of an object to look for in the Collection to remove.
Option D is incorrect because removeAll() takes a Collection of objects to look for in the Collection to remove.