#### Which statements are correct? (Choose two.)
* A. A Comparable implementation is often implemented by a lambda.
* B. A Comparable object has a compare() method.
* C. The compare() and compareTo() methods have the same contract for the return value.
* D. It is possible to sort the same List using different Comparator implementations.
* E. Two objects that return true for equals() will always return 0 when passed to compareTo().

Option A is incorrect because Comparable is implemented in the class being compared.
To be useful, such a class must have instance variables to compare,
ruling out a lambda. By contrast, a Comparator is often implemented with a lambda.
Option B is incorrect because compareTo() is the method in Comparable.
Option C is correct because these methods have different parameters
but the same return type, with the same rules for ordering elements.
Option D is correct because a Comparator doesn’t
need to be implemented by the class being compared.
It can be passed to the sort() method as a parameter.
Option E is incorrect because comparators are not required to be consistent with the equals() method.
For example, two objects that are equivalent in terms of equals() may be sorted differently.