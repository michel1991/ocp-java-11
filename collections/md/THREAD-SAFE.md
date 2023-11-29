#### Which of the following collection implementations are thread-safe?

* A. ArrayList
* B. HashSet
* C. HashMap
* D. TreeSet
* E. None of the Above.

Of all the collection classes of the java.util package, only Vector and Hashtable are Thread-safe.
java.util.Collections class contains a synchronizedCollection method that creates thread-safe instances based on collections which are not.
For example:
Set s = Collections.synchronizedSet(new HashSet());

From Java 1.5 onwards, you can also use a new Concurrent library available in java.util.concurrent package,
which contains interfaces/classes such as ConcurrentMap/ConcurrentHashMap. Classes in this package
offer better performance than objects returned from Collections.synchronizedXXX methods.

(Correct is E)
